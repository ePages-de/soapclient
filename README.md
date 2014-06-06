# Demo clients for ePages 6 web services #

## Project links ##

- Company website: http://www.epages.com/
- Source code: https://github.com/ePages-de/soapclient/
- Issue tracker: https://github.com/ePages-de/soapclient/issues
- Release repository: https://bintray.com/epages/maven/epages-soapclient/

## Requirements ##

- epages 6.11.0+

## Running tests with Gradle ##

1. run ```./gradlew check``` (Linux) or ```gradlew.bat check``` (Windows) in project folder.
2. If epages6 is not installed locally, use the
   system property "wsHostName" to an epages6 installation (```-DwsHostName=somehost```)

## Development in Eclipse ##

1. Install "Gradle IDE" Eclipse plugin from Spring.
2. Run "File / Import... / Gradle Project"
3. Select location of soapclient source, and run "Build model"
4. Select soapclient and all subprojects and click Finish
5. If epages6 is not installed locally, use the
   system property "wsHostName" in launch configuration to point
   to an epages6 installation (```-DwsHostName=somehost```)

### The test cases use following configuration ###

- shop "DemoShop" with user "admin" with password "admin" and default content
- The feature "Program Interface for Web Services" must be enabled in the shop.
  Username and password can be set via command-line (java only!) using system
  properties ```-DwsUser=/Path/to/User``` and ```-DwsPassword=somePassword```.
- Mind that passing a different user, e.g. from a shop not equal to "DemoShop"
  is not supported by the C# client yet.
- Web service endpoint defaults to http://$wsHostName/epages/Store.soap and
  can be overwritten via system property
  ```-DwsUrl=http://someUrl/epages/Store.soap```. If epages6 is installed locally,
  there is a fallback to the SystemDomainName defined in $EPAGES_CONFIG/epages.conf

### Note ###

For backward compatibility this package also contains older versions of some
web service interfaces. New applications should use the latest version of each
web service, i.e. the one with the highest version number.

## Project Structure ##

- $clientLanguage/shop : Shop Webservices
- $clientLanguage/provider : Provider Webservices
- $clientLanguage/multistore : Multistore Webservices

## Avaiable clients ##

### Perl client ###

#### Requirements ####

- Perl 5.10+
- SOAP::Lite
- Test::More

#### Running test cases ####

Either run via gradle using ```gradle check``` in the subproject, or call ```perl runTests.pl``` directly.

### C# client ###

#### Requirements ####

- Micsosoft Visual C# 2008 Express Edition / Xamarin Studio 4.2
- the NUnit-Test-Framework

### Java client ###

- JDK 1.7.0 Standard Edition
  See http://java.oracle.com/j2se/

- Apache Axis Web Service Framework (version 1.4)
  See http://axis.apache.org/axis/

#### Using java soapclients as SDK ####

1. Include jCenter to your maven repository resolution (http://jcenter.bintray.com)
   For gradle this could look like:
```
repositories {
    maven { url 'http://jcenter.bintray.com' }
}
```

2. Add a dependency to epages-soapclients.
```
dependencies {
    // dependency for shop webservices
    compile 'de.epages:soapclient-shop:1.4.15'
    // dependency for provider webservices
    compile 'de.epages:soapclient-provider:1.4.15'
    // dependency for multistore webservices
    compile 'de.epages:soapclient-multistore:1.4.15'
}
```

#### Regenerating stub classes ####

1. run ```../../gradlew generate``` (Linux) or ```../../gradlew.cmd generate``` (Windows) in java/$x subproject folder.
2. If epages6 is not installed locally, use the
   gradle property "wsdlBaseUrl" to point to a WSDL directory or an epages6
   installation (```-PwsdlBaseUrl=http://somehost/WebRoot/WSDL/```)
3. You usually only want to regenerate stubs for a specific webservice, so pass
   the gradle property "onlyThisService" (```-PonlyThisService=ProductTypeService2```)

