package de.epages.WebServices.PaymentMethodService;

import de.epages.WebServices.PaymentMethodService.Stub.*;
import de.epages.WebServices.WebServiceTestConfiguration;
import org.junit.*;
import static org.junit.Assert.*;

import java.rmi.RemoteException;
import java.util.logging.Logger;

/**
 * A JUnit TestSuite to test epages PaymentMethod WebServices.
 */
public class PaymentMethodTestCase extends WebServiceTestConfiguration {
    private static Logger log = Logger.getLogger(PaymentMethodTestCase.class.getName());

    private Bind_PaymentMethod_SOAPStub paymentMethodService;

    /**
     * Sets all the required prerequisites for the tests. Will be called before the test are run.
     */
    @Before
    public void setUp() {
        PaymentMethodService serviceLocator = new PaymentMethodServiceLocator();
        log.info("address specified by wsdl: " + serviceLocator.getport_PaymentMethodAddress());
        log.info("using web service Url: " + WEBSERVICE_URL);

        try {
          paymentMethodService = new Bind_PaymentMethod_SOAPStub(WEBSERVICE_URL, serviceLocator);
        }
        catch (Exception e) {
          e.printStackTrace();
        }

        // setting user-path and password of the shop
        paymentMethodService.setUsername(WEBSERVICE_LOGIN);
        paymentMethodService.setPassword(WEBSERVICE_PASSWORD);
    }

    /**
     * Get a list of all payment methods
     */
    @Test
    public void testGetList() throws RemoteException {
        TGetList_Return[] PaymentMethods = paymentMethodService.getList();

        int count = PaymentMethods.length;
        log.info("Total payment methods: " + count);

        // make this test pass for normal DemoShop and MinDemo
        assertEquals( "first payment method","/Shops/DemoShop/PaymentMethods/CashInAdvance", PaymentMethods[0].getPath() );
        assertEquals( "second payment method","/Shops/DemoShop/PaymentMethods/Invoice", PaymentMethods[1].getPath() );
        assertEquals( "third payment method","/Shops/DemoShop/PaymentMethods/CashOnDelivery", PaymentMethods[2].getPath() );
        assertEquals( "fourth payment method","/Shops/DemoShop/PaymentMethods/Cash", PaymentMethods[3].getPath() );
        assertEquals( "fifth payment method","/Shops/DemoShop/PaymentMethods/DirectDebit", PaymentMethods[4].getPath() );
    }
}
