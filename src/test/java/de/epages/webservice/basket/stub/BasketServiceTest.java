/**
 * BasketServiceTest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:33:49 IST)
 */
package de.epages.webservice.basket.stub;

import org.apache.axis2.AxisFault;
import org.junit.Before;

/*
 *  BasketServiceTest Junit test case
 */

public class BasketServiceTest extends junit.framework.TestCase {

    BasketServiceStub stub;

    @Before
    public void setUp() throws AxisFault {
        stub = new BasketServiceStub("http://otrosien/epages/DemoShop.soap");
    }

    /**
     * Auto generated test method
     */
    public void testaddProductLineItem() throws java.lang.Exception {

        AddProductLineItemDocument addProductLineItem32 = (AddProductLineItemDocument) getTestObject(AddProductLineItemDocument.class);
        // TODO : Fill in the addProductLineItem32 here

        assertNotNull(stub.addProductLineItem(addProductLineItem32));

    }

    /**
     * Auto generated test method
     */
    public void testStartaddProductLineItem() throws java.lang.Exception {

        AddProductLineItemDocument addProductLineItem32 = (AddProductLineItemDocument) getTestObject(AddProductLineItemDocument.class);
        // TODO : Fill in the addProductLineItem32 here

        stub.startaddProductLineItem(addProductLineItem32, new tempCallbackN65548());

    }

    private class tempCallbackN65548 extends BasketServiceCallbackHandler {
        public tempCallbackN65548() {
            super(null);
        }

        public void receiveResultaddProductLineItem(AddProductLineItemResponseDocument result) {

        }

        public void receiveErroraddProductLineItem(java.lang.Exception e) {
            fail();
        }

    }

    /**
     * Auto generated test method
     */
    public void testdelete() throws java.lang.Exception {

// the
                                                         // default
                                                         // implementation
                                                         // should
                                                         // point
                                                         // to
                                                         // the
                                                         // right
                                                         // endpoint

        DeleteDocument delete34 = (DeleteDocument) getTestObject(DeleteDocument.class);
        // TODO : Fill in the delete34 here

        assertNotNull(stub.delete(delete34));

    }

    /**
     * Auto generated test method
     */
    public void testStartdelete() throws java.lang.Exception {

        DeleteDocument delete34 = (DeleteDocument) getTestObject(DeleteDocument.class);
        // TODO : Fill in the delete34 here

        stub.startdelete(delete34, new tempCallbackN65589());

    }

    private class tempCallbackN65589 extends BasketServiceCallbackHandler {
        public tempCallbackN65589() {
            super(null);
        }

        public void receiveResultdelete(DeleteResponseDocument result) {

        }

        public void receiveErrordelete(java.lang.Exception e) {
            fail();
        }

    }

    /**
     * Auto generated test method
     */
    public void testexists() throws java.lang.Exception {

// the
                                                         // default
                                                         // implementation
                                                         // should
                                                         // point
                                                         // to
                                                         // the
                                                         // right
                                                         // endpoint

        ExistsDocument exists36 = (ExistsDocument) getTestObject(ExistsDocument.class);
        // TODO : Fill in the exists36 here

        assertNotNull(stub.exists(exists36));

    }

    /**
     * Auto generated test method
     */
    public void testStartexists() throws java.lang.Exception {

        ExistsDocument exists36 = (ExistsDocument) getTestObject(ExistsDocument.class);
        // TODO : Fill in the exists36 here

        stub.startexists(exists36, new tempCallbackN65630());

    }

    private class tempCallbackN65630 extends BasketServiceCallbackHandler {
        public tempCallbackN65630() {
            super(null);
        }

        public void receiveResultexists(ExistsResponseDocument result) {

        }

        public void receiveErrorexists(java.lang.Exception e) {
            fail();
        }

    }

    /**
     * Auto generated test method
     */
    public void testupdateLineItem() throws java.lang.Exception {

// the
                                                         // default
                                                         // implementation
                                                         // should
                                                         // point
                                                         // to
                                                         // the
                                                         // right
                                                         // endpoint

        UpdateLineItemDocument updateLineItem38 = (UpdateLineItemDocument) getTestObject(UpdateLineItemDocument.class);
        // TODO : Fill in the updateLineItem38 here

        assertNotNull(stub.updateLineItem(updateLineItem38));

    }

    /**
     * Auto generated test method
     */
    public void testStartupdateLineItem() throws java.lang.Exception {

        UpdateLineItemDocument updateLineItem38 = (UpdateLineItemDocument) getTestObject(UpdateLineItemDocument.class);
        // TODO : Fill in the updateLineItem38 here

        stub.startupdateLineItem(updateLineItem38, new tempCallbackN65671());

    }

    private class tempCallbackN65671 extends BasketServiceCallbackHandler {
        public tempCallbackN65671() {
            super(null);
        }

        public void receiveResultupdateLineItem(UpdateLineItemResponseDocument result) {

        }

        public void receiveErrorupdateLineItem(java.lang.Exception e) {
            fail();
        }

    }

    /**
     * Auto generated test method
     */
    public void testcreate() throws java.lang.Exception {

// the
                                                         // default
                                                         // implementation
                                                         // should
                                                         // point
                                                         // to
                                                         // the
                                                         // right
                                                         // endpoint

        CreateDocument create40 = (CreateDocument) getTestObject(CreateDocument.class);
        // TODO : Fill in the create40 here

        assertNotNull(stub.create(create40));

    }

    /**
     * Auto generated test method
     */
    public void testStartcreate() throws java.lang.Exception {

        CreateDocument create40 = (CreateDocument) getTestObject(CreateDocument.class);
        // TODO : Fill in the create40 here

        stub.startcreate(create40, new tempCallbackN65712());

    }

    private class tempCallbackN65712 extends BasketServiceCallbackHandler {
        public tempCallbackN65712() {
            super(null);
        }

        public void receiveResultcreate(CreateResponseDocument result) {

        }

        public void receiveErrorcreate(java.lang.Exception e) {
            fail();
        }

    }

    /**
     * Auto generated test method
     */
    public void testupdate() throws java.lang.Exception {

// the
                                                         // default
                                                         // implementation
                                                         // should
                                                         // point
                                                         // to
                                                         // the
                                                         // right
                                                         // endpoint

        UpdateDocument update42 = (UpdateDocument) getTestObject(UpdateDocument.class);
        // TODO : Fill in the update42 here

        assertNotNull(stub.update(update42));

    }

    /**
     * Auto generated test method
     */
    public void testStartupdate() throws java.lang.Exception {

        UpdateDocument update42 = (UpdateDocument) getTestObject(UpdateDocument.class);
        // TODO : Fill in the update42 here

        stub.startupdate(update42, new tempCallbackN65753());

    }

    private class tempCallbackN65753 extends BasketServiceCallbackHandler {
        public tempCallbackN65753() {
            super(null);
        }

        public void receiveResultupdate(UpdateResponseDocument result) {

        }

        public void receiveErrorupdate(java.lang.Exception e) {
            fail();
        }

    }

    /**
     * Auto generated test method
     */
    public void testdeleteLineItem() throws java.lang.Exception {

// the
                                                         // default
                                                         // implementation
                                                         // should
                                                         // point
                                                         // to
                                                         // the
                                                         // right
                                                         // endpoint

        DeleteLineItemDocument deleteLineItem44 = (DeleteLineItemDocument) getTestObject(DeleteLineItemDocument.class);
        // TODO : Fill in the deleteLineItem44 here

        assertNotNull(stub.deleteLineItem(deleteLineItem44));

    }

    /**
     * Auto generated test method
     */
    public void testStartdeleteLineItem() throws java.lang.Exception {

        DeleteLineItemDocument deleteLineItem44 = (DeleteLineItemDocument) getTestObject(DeleteLineItemDocument.class);
        // TODO : Fill in the deleteLineItem44 here

        stub.startdeleteLineItem(deleteLineItem44, new tempCallbackN65794());

    }

    private class tempCallbackN65794 extends BasketServiceCallbackHandler {
        public tempCallbackN65794() {
            super(null);
        }

        public void receiveResultdeleteLineItem(DeleteLineItemResponseDocument result) {

        }

        public void receiveErrordeleteLineItem(java.lang.Exception e) {
            fail();
        }

    }

    /**
     * Auto generated test method
     */
    public void testgetInfo() throws java.lang.Exception {

// the
                                                         // default
                                                         // implementation
                                                         // should
                                                         // point
                                                         // to
                                                         // the
                                                         // right
                                                         // endpoint

        GetInfoDocument getInfo46 = (GetInfoDocument) getTestObject(GetInfoDocument.class);
        // TODO : Fill in the getInfo46 here

        assertNotNull(stub.getInfo(getInfo46));

    }

    /**
     * Auto generated test method
     */
    public void testStartgetInfo() throws java.lang.Exception {

        GetInfoDocument getInfo46 = (GetInfoDocument) getTestObject(GetInfoDocument.class);
        // TODO : Fill in the getInfo46 here

        stub.startgetInfo(getInfo46, new tempCallbackN65835());

    }

    private class tempCallbackN65835 extends BasketServiceCallbackHandler {
        public tempCallbackN65835() {
            super(null);
        }

        public void receiveResultgetInfo(GetInfoResponseDocument result) {

        }

        public void receiveErrorgetInfo(java.lang.Exception e) {
            fail();
        }

    }

    // Create the desired XmlObject and provide it as the test object
    public org.apache.xmlbeans.XmlObject getTestObject(java.lang.Class type) throws java.lang.Exception {
        java.lang.reflect.Method creatorMethod = null;
        if (org.apache.xmlbeans.XmlObject.class.isAssignableFrom(type)) {
            Class[] declaredClasses = type.getDeclaredClasses();
            for (int i = 0; i < declaredClasses.length; i++) {
                Class declaredClass = declaredClasses[i];
                if (declaredClass.getName().endsWith("$Factory")) {
                    creatorMethod = declaredClass.getMethod("newInstance", null);
                    break;
                }

            }
        }
        if (creatorMethod != null) {
            return (org.apache.xmlbeans.XmlObject) creatorMethod.invoke(null, null);
        } else {
            throw new java.lang.Exception("Creator not found!");
        }

    }

}
