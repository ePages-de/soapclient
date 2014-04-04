use utf8;
use strict;
use Test::More tests => 72;
use WebServiceClient;
use WebServiceConfiguration qw( WEBSERVICE_URL WEBSERVICE_USER WEBSERVICE_SHOP_PATH WEBSERVICE_SHOP_NAME);
use WebServiceTools qw( TAttributes hAttributes );

# Create a SOAP::Lite client object
my $UserService = WebServiceClient
    ->uri( 'urn://epages.de/WebService/UserService/2011/03' )
    ->proxy( WEBSERVICE_URL )
    ->userinfo( WEBSERVICE_USER )
    ->xmlschema('2001');

# Sets all the required prerequisites for the tests. Will be called before the test are run.
my $options = {
    'Alias'     => 'perl_test-1',
    'Path'      => 'Users/',
    'Password'  => 'epages',
    'Name_in'   => 'Klaus Klaussen',
    'Name_up'   => 'Hans Hanssen',
    'Address_in' => {
        'Alias'     => 'Adresse1',
        'EMail'     => 'test@epages.de',
        'FirstName' => 'Klaus',
        'LastName'  => 'Klaussen',
        'Street'    => SOAP::Data->type('string')->value('Musterstraße 2'),
        'Street2'   => 'Ortsteil Niederfingeln',
        'CodePorte' => '13a',
        'Birthday'  => '1976-09-25T11:22:33',
        'Phone'     => '123456',
        'Fax'       => '987654',
    },
    'Address2' => {
        'Alias'     => 'zweite Adresse',
        'EMail'     => 'perl_test-1@epages.de',
        'FirstName' => 'Klaus2',
        'LastName'  => 'Klaussen2',
        'Street'    => SOAP::Data->type('string')->value('Anderestraß2 2'),
        'Street2'   => 'Ortsteil Niederfingeln',
        'CodePorte' => '13b',
        'Birthday'  => '1976-09-25T11:22:33',
    },
    'Address3' => {
        'Alias'     => 'Adresse Nummero III',
        'EMail'     => 'perl_test-1@epages.de',
        'FirstName' => 'Klaus3',
        'LastName'  => 'Klaussen3',
        'Street'    => SOAP::Data->type('string')->value('Anderestraß3 3'),
        'Street2'   => 'Ortsteil Niederfingeln',
        'Birthday'  => '1976-09-25T11:22:33',
    },
    'Address_up' => {
        'FirstName' => 'Paula',
        'LastName'  => 'Hanssen',
        'Street'    => SOAP::Data->type('string')->value('Musterstraße 2b'),
        'Street2'   => 'Ortsteil Oberfingeln',
        'CodePorte' => '13u',
        'Fax'       => undef,
    },
    'AddressAttributes' => {
        'JobTitle'  => 'best Job',
        'Salutation'=> 'Dr.',
    },
    'Attributes_in' => {
        'ChallengePhrase'   => 'my challenge phrase',
    },
    'Attributes_up' => {
        'ChallengePhrase'   => 'my updated challenge phrase',
    },
};
$options->{'FullPath'} = $options->{'Path'}.$options->{'Alias'};

my $user_in = {
    'Alias'             => $options->{'Alias'},
    'Password'          => $options->{'Password'},
    'Name'              => $options->{'Name_in'},
    'BillingAddress'    => $options->{'Address_in'},
    'ShippingAddress'   => $options->{'Address_in'},
    'ShippingAddresses' => [
        {'ShippingAddress' => $options->{'Address_in'}},
        {'ShippingAddress' => $options->{'Address2'}},
        {'ShippingAddress' => $options->{'Address3'}},
    ],
    'Attributes'        => TAttributes($options->{'Attributes_in'}),
    'EMail' => $options->{'Address_in'}->{'EMail'},
};

my $user_update = {
    'Path'              => $options->{'FullPath'},
    'Name'              => $options->{'Name_up'},
    'BillingAddress'    => $options->{'Address_up'},
    'Attributes'        => TAttributes($options->{'Attributes_up'}),
};
$user_update->{'BillingAddress'}->{'Attributes'} = TAttributes($options->{'AddressAttributes'});

my $user_update2 = {
    'Path'              => $options->{'FullPath'},
    'Name'              => $options->{'Name_up'},
};

# Create a User and check if the creation was successful
sub testCreate {

    my $ahResults = $UserService->create( [$user_in] )->result;
    ok( scalar @$ahResults == 1, 'create result count' );

    my $hResult = $ahResults->[0];
    ok( !$hResult->{'Error'}, 'create: no error' );
    diag "Error: $hResult->{'Error'}\n" if $hResult->{'Error'};

    ok( $hResult->{'Alias'} eq $user_in->{'Alias'}, 'user alias' );
    ok( $hResult->{'created'} == 1, 'created?' );
}

# this test change the $user_in, use it only at end of test suite
sub testCreateWithoutPW {
    delete $user_in->{'Password'};
    $user_in->{'EMail'}='test@epages.de';
    testCreate();
}

# Update a User and check if the update was successful
sub testUpdate {

    my $ahResults = $UserService->update( [$user_update] )->result;
    ok( scalar @$ahResults == 1, 'udpate result count' );

    my $hResult = $ahResults->[0];
    ok( !$hResult->{'Error'}, 'update: no error' );
    diag "Error: $hResult->{'Error'}\n" if $hResult->{'Error'};

    ok( $hResult->{'Path'} eq $user_update->{'Path'}, 'user path' );
    ok( $hResult->{'updated'} == 1, 'updated?' );
}

# Retrieve information about an User. Check if the returned data are equal to
# the data of create or update call
sub testGetInfo {
    my ($alreadyUpdated) = @_;
    my $ext = $alreadyUpdated ? '_up' : '_in';

    my $ahResults = $UserService->getInfo( [$options->{'FullPath'}], ['ChallengePhrase'], ['JobTitle','Path'] )->result;
    ok( scalar @$ahResults == 1, 'getInfo result count' );

    my $hResult = $ahResults->[0];
    ok( !$hResult->{'Error'}, 'getInfo: no error' );
    diag "Error: $hResult->{'Error'}\n" if $hResult->{'Error'};

    ok( $hResult->{'Path'} eq WEBSERVICE_SHOP_PATH.$options->{'FullPath'}, 'user path' );

    #--- check billing address
    my $bill  = $hResult->{'BillingAddress'};

    #--- phone have not updated (not given)
    ok( $bill->{'Phone'} eq $user_in->{'BillingAddress'}->{'Phone'}, 'phone' );

    #--- email have not updated (empty string)
    ok( $bill->{'EMail'} eq $user_in->{'BillingAddress'}->{'EMail'}, 'email' );

    #--- all other address attributes should changed
    my $bill2 = $options->{"Address$ext"}; #use Address_up if updated, Address_in otherwise
    ok( $bill->{'FirstName'}    eq $bill2->{'FirstName'},   'first name' );
    ok( $bill->{'LastName'}     eq $bill2->{'LastName'},    'last name' );
    ok( $bill->{'Street'}       eq $bill2->{'Street'}->value, 'street' );
    ok( $bill->{'Street2'}      eq $bill2->{'Street2'},     'street2' );
    ok( $bill->{'CodePorte'}    eq $bill2->{'CodePorte'},   'code porte' );

    #--- check address path
    my $hBillAttributes = hAttributes($bill->{'Attributes'});
    ok(  $hBillAttributes->{'Path'} =~ /Addresses/, 'address path' );

    #--- fax have deleted by update
    ok( !$bill2->{'Phone'}, 'deleted fax' ) if $alreadyUpdated;

    #--- check changed attributes
    my $hAttributes = hAttributes($hResult->{'Attributes'});
    ok( $hAttributes->{'ChallengePhrase'} eq $options->{"Attributes$ext"}->{'ChallengePhrase'}, 'challenge phrase' );

    # sent and returned password are not the same ... returned password is already crypted
    ok( $hResult->{'Password'} ne $user_in->{'Password'}, 'password' );
}

sub deleteIfExists {
    my $ahResults = $UserService->exists( [$options->{'FullPath'}] )->result;
    die $ahResults->[0]->{'Error'}->{'Message'} if $ahResults->[0]->{'Error'};

    if ( $ahResults->[0]->{'exists'} ) {
        $ahResults = $UserService->delete( [$options->{'FullPath'}] )->result;
        die $ahResults->[0]->{'Error'}->{'Message'} if $ahResults->[0]->{'Error'};
    }
}

# Delete a User and check if no error occured.
sub testDelete {

    my $ahResults = $UserService->delete( [$options->{'FullPath'}] )->result;
    ok( scalar @$ahResults == 1, 'delete result count' );

    my $hResult = $ahResults->[0];
    ok( !$hResult->{'Error'}, 'delete: no error' );
    diag "Error: $hResult->{'Error'}\n" if $hResult->{'Error'};

    ok( $hResult->{'Path'} eq $options->{'FullPath'}, 'user path' );
    ok( $hResult->{'deleted'} == 1, 'deleted?' );
}

# Test if a User exists or not
sub testExists {
    my ($exists) = @_;

    my $ahResults = $UserService->exists( [$options->{'FullPath'}] )->result;
    ok( scalar @$ahResults == 1, 'exists result count' );

    my $hResult = $ahResults->[0];
    ok( !$hResult->{'Error'}, 'exists: no error' );
    diag "Error: $hResult->{'Error'}\n" if $hResult->{'Error'};

    ok( $hResult->{'Path'} eq $options->{'FullPath'}, 'user path' );
    ok( $hResult->{'exists'} == $exists, 'exists?' );
}

# Update a User and check if the update was successful
sub testUpdate_onlyName {

    my $ahResults = $UserService->update( [$user_update2] )->result;
    ok( scalar @$ahResults == 1, 'udpate result count' );

    my $hResult = $ahResults->[0];
    ok( !$hResult->{'Error'}, 'update2: no error' );
    diag "Error: $hResult->{'Error'}\n" if $hResult->{'Error'};

    ok( $hResult->{'Path'} eq $user_update->{'Path'}, 'user path' );
    ok( $hResult->{'updated'} == 1, 'updated?' );

    #check name
    $ahResults = $UserService->getInfo( [$options->{'FullPath'}], [], [] )->result;
    ok( scalar @$ahResults == 1, 'getInfo updated2 result count' );

    $hResult = $ahResults->[0];
    ok( !$hResult->{'Error'}, 'getInfo updated2: no error' );
    diag "Error: $hResult->{'Error'}\n" if $hResult->{'Error'};

    ok( $hResult->{'Name'} eq $options->{'Name_up'}, 'updated2 user name' );

}

# Test if a user is found by Name
sub testFind {

    my $aResults = $UserService->find( {'Name'=>'Klaus'} )->result;
    ok( scalar @$aResults == 1, 'find result count' );

    ok( $aResults->[0] eq WEBSERVICE_SHOP_PATH.$options->{'FullPath'}, 'user path' );
}

# Test if a User exists or not
sub testSendPassword {

    my $MailFrom = _getShopAttribute('MailFrom');
    _setShopAttribute('MailFrom','test@epages.de') unless $MailFrom;

    my $ahResults = $UserService->sendPassword( [$options->{'FullPath'}] )->result;
    ok( scalar @$ahResults == 1, 'sendPassword result count' );

    my $hResult = $ahResults->[0];
    ok( !$hResult->{'Error'}, 'sendPassword: no error' );
    diag "Error: $hResult->{'Error'}\n" if $hResult->{'Error'};

    ok( $hResult->{'Path'} eq $options->{'FullPath'}, 'sendPassword: user path' );
    ok( $hResult->{'sent'}, 'sent?' );

    _setShopAttribute('MailFrom','') unless $MailFrom;
}

sub _getShopAttribute {
    my($Key)=@_;
    my $Value;
    my $aAttributes;
    eval { ## no critic "RequireExistsError"
        my $WS_URL = WEBSERVICE_URL; $WS_URL =~ s/Store/Site/;
        $aAttributes = WebServiceClient
        ->proxy( $WS_URL )->xmlschema( '2001' )
        ->uri( 'urn://epages.de/WebService/ShopConfigService/2009/09' )
        ->userinfo( '/Providers/Distributor/Users/admin:admin' )
        ->getInfo({'Alias'=>WEBSERVICE_SHOP_NAME,'Attributes'=>[$Key]})->result->{'Attributes'};
    };
    foreach my $Attribute (@$aAttributes) {
        $Value = $Attribute->{'Value'} if $Attribute->{'Name'} eq $Key;
    }
    return $Value;
}

sub _setShopAttribute {
    my($Key,$Value)=@_;
    eval { ## no critic "RequireExistsError"
        my $WS_URL = WEBSERVICE_URL; $WS_URL =~ s/Store/Site/;
        WebServiceClient->proxy( $WS_URL )->xmlschema( '2001' )
        ->uri( 'urn://epages.de/WebService/ShopConfigService/2009/09' )
        ->userinfo( '/Providers/Distributor/Users/admin:admin' )
        ->update({'Alias'=>WEBSERVICE_SHOP_NAME,'Attributes'=>[{'Name'=>$Key,'Value'=>$Value}]});
    };
}

#sub _getMerchantEMail {
#    my $EMail;
#    eval {
#        my $WS_URL = WEBSERVICE_URL; $WS_URL =~ s/Store/Site/;
#        $EMail = WebServiceClient
#        ->proxy( $WS_URL )->xmlschema( '2001' )
#        ->uri( 'urn://epages.de/WebService/SimpleProvisioningService/2009/10' )
#        ->userinfo( '/Providers/Distributor/Users/admin:admin' )
#        ->getInfo({'Alias'=>WEBSERVICE_SHOP_NAME})->result->{'MerchantEMail'};
#    };
#    return $EMail;
#}
#
#sub _setMerchantEMail {
#    my $EMail = shift;
#    eval {
#        my $WS_URL = WEBSERVICE_URL; $WS_URL =~ s/Store/Site/;
#        WebServiceClient->proxy( $WS_URL )->xmlschema( '2001' )
#        ->uri( 'urn://epages.de/WebService/SimpleProvisioningService/2009/10' )
#        ->userinfo( '/Providers/Distributor/Users/admin:admin' )
#        ->update({'Alias'=>WEBSERVICE_SHOP_NAME,'MerchantEMail'=>$EMail});
#    };
#}

# run test suite
deleteIfExists();
testCreate();
testExists(1);
testFind();
testGetInfo(0);
testUpdate();
testGetInfo(1);
testSendPassword();
testUpdate_onlyName();
testDelete();
testExists(0);
testCreateWithoutPW();
testDelete();
testExists(0);
