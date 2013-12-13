/*
 * An XML document type.
 * Localname: updateResponse
 * Namespace: urn://epages.de/WebService/ProductService/2013/01
 * Java type: de.epages.ws.product11.stub.UpdateResponseDocument
 *
 * Automatically generated - do not modify.
 */
package de.epages.ws.product11.stub.impl;
/**
 * A document containing one updateResponse(@urn://epages.de/WebService/ProductService/2013/01) element.
 *
 * This is a complex type.
 */
public class UpdateResponseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements de.epages.ws.product11.stub.UpdateResponseDocument
{
    
    public UpdateResponseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName UPDATERESPONSE$0 = 
        new javax.xml.namespace.QName("urn://epages.de/WebService/ProductService/2013/01", "updateResponse");
    
    
    /**
     * Gets the "updateResponse" element
     */
    public de.epages.ws.product11.stub.UpdateResponseDocument.UpdateResponse getUpdateResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            de.epages.ws.product11.stub.UpdateResponseDocument.UpdateResponse target = null;
            target = (de.epages.ws.product11.stub.UpdateResponseDocument.UpdateResponse)get_store().find_element_user(UPDATERESPONSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "updateResponse" element
     */
    public void setUpdateResponse(de.epages.ws.product11.stub.UpdateResponseDocument.UpdateResponse updateResponse)
    {
        synchronized (monitor())
        {
            check_orphaned();
            de.epages.ws.product11.stub.UpdateResponseDocument.UpdateResponse target = null;
            target = (de.epages.ws.product11.stub.UpdateResponseDocument.UpdateResponse)get_store().find_element_user(UPDATERESPONSE$0, 0);
            if (target == null)
            {
                target = (de.epages.ws.product11.stub.UpdateResponseDocument.UpdateResponse)get_store().add_element_user(UPDATERESPONSE$0);
            }
            target.set(updateResponse);
        }
    }
    
    /**
     * Appends and returns a new empty "updateResponse" element
     */
    public de.epages.ws.product11.stub.UpdateResponseDocument.UpdateResponse addNewUpdateResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            de.epages.ws.product11.stub.UpdateResponseDocument.UpdateResponse target = null;
            target = (de.epages.ws.product11.stub.UpdateResponseDocument.UpdateResponse)get_store().add_element_user(UPDATERESPONSE$0);
            return target;
        }
    }
    /**
     * An XML updateResponse(@urn://epages.de/WebService/ProductService/2013/01).
     *
     * This is a complex type.
     */
    public static class UpdateResponseImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements de.epages.ws.product11.stub.UpdateResponseDocument.UpdateResponse
    {
        
        public UpdateResponseImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName PRODUCTS$0 = 
            new javax.xml.namespace.QName("", "Products");
        
        
        /**
         * Gets the "Products" element
         */
        public de.epages.ws.product11.stub.TypeUpdateOut getProducts()
        {
            synchronized (monitor())
            {
                check_orphaned();
                de.epages.ws.product11.stub.TypeUpdateOut target = null;
                target = (de.epages.ws.product11.stub.TypeUpdateOut)get_store().find_element_user(PRODUCTS$0, 0);
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
                de.epages.ws.product11.stub.TypeUpdateOut target = null;
                target = (de.epages.ws.product11.stub.TypeUpdateOut)get_store().find_element_user(PRODUCTS$0, 0);
                if (target == null) return false;
                return target.isNil();
            }
        }
        
        /**
         * Sets the "Products" element
         */
        public void setProducts(de.epages.ws.product11.stub.TypeUpdateOut products)
        {
            synchronized (monitor())
            {
                check_orphaned();
                de.epages.ws.product11.stub.TypeUpdateOut target = null;
                target = (de.epages.ws.product11.stub.TypeUpdateOut)get_store().find_element_user(PRODUCTS$0, 0);
                if (target == null)
                {
                    target = (de.epages.ws.product11.stub.TypeUpdateOut)get_store().add_element_user(PRODUCTS$0);
                }
                target.set(products);
            }
        }
        
        /**
         * Appends and returns a new empty "Products" element
         */
        public de.epages.ws.product11.stub.TypeUpdateOut addNewProducts()
        {
            synchronized (monitor())
            {
                check_orphaned();
                de.epages.ws.product11.stub.TypeUpdateOut target = null;
                target = (de.epages.ws.product11.stub.TypeUpdateOut)get_store().add_element_user(PRODUCTS$0);
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
                de.epages.ws.product11.stub.TypeUpdateOut target = null;
                target = (de.epages.ws.product11.stub.TypeUpdateOut)get_store().find_element_user(PRODUCTS$0, 0);
                if (target == null)
                {
                    target = (de.epages.ws.product11.stub.TypeUpdateOut)get_store().add_element_user(PRODUCTS$0);
                }
                target.setNil();
            }
        }
    }
}
