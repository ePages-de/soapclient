/*
 * An XML document type.
 * Localname: deleteResponse
 * Namespace: urn://epages.de/WebService/ProductService/2013/01
 * Java type: de.epages.ws.product11.stub.DeleteResponseDocument
 *
 * Automatically generated - do not modify.
 */
package de.epages.ws.product11.stub.impl;
/**
 * A document containing one deleteResponse(@urn://epages.de/WebService/ProductService/2013/01) element.
 *
 * This is a complex type.
 */
public class DeleteResponseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements de.epages.ws.product11.stub.DeleteResponseDocument
{
    
    public DeleteResponseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DELETERESPONSE$0 = 
        new javax.xml.namespace.QName("urn://epages.de/WebService/ProductService/2013/01", "deleteResponse");
    
    
    /**
     * Gets the "deleteResponse" element
     */
    public de.epages.ws.product11.stub.DeleteResponseDocument.DeleteResponse getDeleteResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            de.epages.ws.product11.stub.DeleteResponseDocument.DeleteResponse target = null;
            target = (de.epages.ws.product11.stub.DeleteResponseDocument.DeleteResponse)get_store().find_element_user(DELETERESPONSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "deleteResponse" element
     */
    public void setDeleteResponse(de.epages.ws.product11.stub.DeleteResponseDocument.DeleteResponse deleteResponse)
    {
        synchronized (monitor())
        {
            check_orphaned();
            de.epages.ws.product11.stub.DeleteResponseDocument.DeleteResponse target = null;
            target = (de.epages.ws.product11.stub.DeleteResponseDocument.DeleteResponse)get_store().find_element_user(DELETERESPONSE$0, 0);
            if (target == null)
            {
                target = (de.epages.ws.product11.stub.DeleteResponseDocument.DeleteResponse)get_store().add_element_user(DELETERESPONSE$0);
            }
            target.set(deleteResponse);
        }
    }
    
    /**
     * Appends and returns a new empty "deleteResponse" element
     */
    public de.epages.ws.product11.stub.DeleteResponseDocument.DeleteResponse addNewDeleteResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            de.epages.ws.product11.stub.DeleteResponseDocument.DeleteResponse target = null;
            target = (de.epages.ws.product11.stub.DeleteResponseDocument.DeleteResponse)get_store().add_element_user(DELETERESPONSE$0);
            return target;
        }
    }
    /**
     * An XML deleteResponse(@urn://epages.de/WebService/ProductService/2013/01).
     *
     * This is a complex type.
     */
    public static class DeleteResponseImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements de.epages.ws.product11.stub.DeleteResponseDocument.DeleteResponse
    {
        
        public DeleteResponseImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName PRODUCTS$0 = 
            new javax.xml.namespace.QName("", "Products");
        
        
        /**
         * Gets the "Products" element
         */
        public de.epages.ws.product11.stub.TypeDeleteOut getProducts()
        {
            synchronized (monitor())
            {
                check_orphaned();
                de.epages.ws.product11.stub.TypeDeleteOut target = null;
                target = (de.epages.ws.product11.stub.TypeDeleteOut)get_store().find_element_user(PRODUCTS$0, 0);
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
                de.epages.ws.product11.stub.TypeDeleteOut target = null;
                target = (de.epages.ws.product11.stub.TypeDeleteOut)get_store().find_element_user(PRODUCTS$0, 0);
                if (target == null) return false;
                return target.isNil();
            }
        }
        
        /**
         * Sets the "Products" element
         */
        public void setProducts(de.epages.ws.product11.stub.TypeDeleteOut products)
        {
            synchronized (monitor())
            {
                check_orphaned();
                de.epages.ws.product11.stub.TypeDeleteOut target = null;
                target = (de.epages.ws.product11.stub.TypeDeleteOut)get_store().find_element_user(PRODUCTS$0, 0);
                if (target == null)
                {
                    target = (de.epages.ws.product11.stub.TypeDeleteOut)get_store().add_element_user(PRODUCTS$0);
                }
                target.set(products);
            }
        }
        
        /**
         * Appends and returns a new empty "Products" element
         */
        public de.epages.ws.product11.stub.TypeDeleteOut addNewProducts()
        {
            synchronized (monitor())
            {
                check_orphaned();
                de.epages.ws.product11.stub.TypeDeleteOut target = null;
                target = (de.epages.ws.product11.stub.TypeDeleteOut)get_store().add_element_user(PRODUCTS$0);
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
                de.epages.ws.product11.stub.TypeDeleteOut target = null;
                target = (de.epages.ws.product11.stub.TypeDeleteOut)get_store().find_element_user(PRODUCTS$0, 0);
                if (target == null)
                {
                    target = (de.epages.ws.product11.stub.TypeDeleteOut)get_store().add_element_user(PRODUCTS$0);
                }
                target.setNil();
            }
        }
    }
}
