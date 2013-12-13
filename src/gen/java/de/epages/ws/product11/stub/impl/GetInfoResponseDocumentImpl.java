/*
 * An XML document type.
 * Localname: getInfoResponse
 * Namespace: urn://epages.de/WebService/ProductService/2013/01
 * Java type: de.epages.ws.product11.stub.GetInfoResponseDocument
 *
 * Automatically generated - do not modify.
 */
package de.epages.ws.product11.stub.impl;
/**
 * A document containing one getInfoResponse(@urn://epages.de/WebService/ProductService/2013/01) element.
 *
 * This is a complex type.
 */
public class GetInfoResponseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements de.epages.ws.product11.stub.GetInfoResponseDocument
{
    
    public GetInfoResponseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GETINFORESPONSE$0 = 
        new javax.xml.namespace.QName("urn://epages.de/WebService/ProductService/2013/01", "getInfoResponse");
    
    
    /**
     * Gets the "getInfoResponse" element
     */
    public de.epages.ws.product11.stub.GetInfoResponseDocument.GetInfoResponse getGetInfoResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            de.epages.ws.product11.stub.GetInfoResponseDocument.GetInfoResponse target = null;
            target = (de.epages.ws.product11.stub.GetInfoResponseDocument.GetInfoResponse)get_store().find_element_user(GETINFORESPONSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "getInfoResponse" element
     */
    public void setGetInfoResponse(de.epages.ws.product11.stub.GetInfoResponseDocument.GetInfoResponse getInfoResponse)
    {
        synchronized (monitor())
        {
            check_orphaned();
            de.epages.ws.product11.stub.GetInfoResponseDocument.GetInfoResponse target = null;
            target = (de.epages.ws.product11.stub.GetInfoResponseDocument.GetInfoResponse)get_store().find_element_user(GETINFORESPONSE$0, 0);
            if (target == null)
            {
                target = (de.epages.ws.product11.stub.GetInfoResponseDocument.GetInfoResponse)get_store().add_element_user(GETINFORESPONSE$0);
            }
            target.set(getInfoResponse);
        }
    }
    
    /**
     * Appends and returns a new empty "getInfoResponse" element
     */
    public de.epages.ws.product11.stub.GetInfoResponseDocument.GetInfoResponse addNewGetInfoResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            de.epages.ws.product11.stub.GetInfoResponseDocument.GetInfoResponse target = null;
            target = (de.epages.ws.product11.stub.GetInfoResponseDocument.GetInfoResponse)get_store().add_element_user(GETINFORESPONSE$0);
            return target;
        }
    }
    /**
     * An XML getInfoResponse(@urn://epages.de/WebService/ProductService/2013/01).
     *
     * This is a complex type.
     */
    public static class GetInfoResponseImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements de.epages.ws.product11.stub.GetInfoResponseDocument.GetInfoResponse
    {
        
        public GetInfoResponseImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName PRODUCTS$0 = 
            new javax.xml.namespace.QName("", "Products");
        
        
        /**
         * Gets the "Products" element
         */
        public de.epages.ws.product11.stub.TypeGetInfoOut getProducts()
        {
            synchronized (monitor())
            {
                check_orphaned();
                de.epages.ws.product11.stub.TypeGetInfoOut target = null;
                target = (de.epages.ws.product11.stub.TypeGetInfoOut)get_store().find_element_user(PRODUCTS$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * Tests for nil "Products" element
         */
        public boolean isNilProducts()
        {
            synchronized (monitor())
            {
                check_orphaned();
                de.epages.ws.product11.stub.TypeGetInfoOut target = null;
                target = (de.epages.ws.product11.stub.TypeGetInfoOut)get_store().find_element_user(PRODUCTS$0, 0);
                if (target == null) return false;
                return target.isNil();
            }
        }
        
        /**
         * Sets the "Products" element
         */
        public void setProducts(de.epages.ws.product11.stub.TypeGetInfoOut products)
        {
            synchronized (monitor())
            {
                check_orphaned();
                de.epages.ws.product11.stub.TypeGetInfoOut target = null;
                target = (de.epages.ws.product11.stub.TypeGetInfoOut)get_store().find_element_user(PRODUCTS$0, 0);
                if (target == null)
                {
                    target = (de.epages.ws.product11.stub.TypeGetInfoOut)get_store().add_element_user(PRODUCTS$0);
                }
                target.set(products);
            }
        }
        
        /**
         * Appends and returns a new empty "Products" element
         */
        public de.epages.ws.product11.stub.TypeGetInfoOut addNewProducts()
        {
            synchronized (monitor())
            {
                check_orphaned();
                de.epages.ws.product11.stub.TypeGetInfoOut target = null;
                target = (de.epages.ws.product11.stub.TypeGetInfoOut)get_store().add_element_user(PRODUCTS$0);
                return target;
            }
        }
        
        /**
         * Nils the "Products" element
         */
        public void setNilProducts()
        {
            synchronized (monitor())
            {
                check_orphaned();
                de.epages.ws.product11.stub.TypeGetInfoOut target = null;
                target = (de.epages.ws.product11.stub.TypeGetInfoOut)get_store().find_element_user(PRODUCTS$0, 0);
                if (target == null)
                {
                    target = (de.epages.ws.product11.stub.TypeGetInfoOut)get_store().add_element_user(PRODUCTS$0);
                }
                target.setNil();
            }
        }
    }
}
