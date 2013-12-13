/*
 * An XML document type.
 * Localname: existsResponse
 * Namespace: urn://epages.de/WebService/ProductService/2013/01
 * Java type: de.epages.ws.product11.stub.ExistsResponseDocument
 *
 * Automatically generated - do not modify.
 */
package de.epages.ws.product11.stub.impl;
/**
 * A document containing one existsResponse(@urn://epages.de/WebService/ProductService/2013/01) element.
 *
 * This is a complex type.
 */
public class ExistsResponseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements de.epages.ws.product11.stub.ExistsResponseDocument
{
    
    public ExistsResponseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName EXISTSRESPONSE$0 = 
        new javax.xml.namespace.QName("urn://epages.de/WebService/ProductService/2013/01", "existsResponse");
    
    
    /**
     * Gets the "existsResponse" element
     */
    public de.epages.ws.product11.stub.ExistsResponseDocument.ExistsResponse getExistsResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            de.epages.ws.product11.stub.ExistsResponseDocument.ExistsResponse target = null;
            target = (de.epages.ws.product11.stub.ExistsResponseDocument.ExistsResponse)get_store().find_element_user(EXISTSRESPONSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "existsResponse" element
     */
    public void setExistsResponse(de.epages.ws.product11.stub.ExistsResponseDocument.ExistsResponse existsResponse)
    {
        synchronized (monitor())
        {
            check_orphaned();
            de.epages.ws.product11.stub.ExistsResponseDocument.ExistsResponse target = null;
            target = (de.epages.ws.product11.stub.ExistsResponseDocument.ExistsResponse)get_store().find_element_user(EXISTSRESPONSE$0, 0);
            if (target == null)
            {
                target = (de.epages.ws.product11.stub.ExistsResponseDocument.ExistsResponse)get_store().add_element_user(EXISTSRESPONSE$0);
            }
            target.set(existsResponse);
        }
    }
    
    /**
     * Appends and returns a new empty "existsResponse" element
     */
    public de.epages.ws.product11.stub.ExistsResponseDocument.ExistsResponse addNewExistsResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            de.epages.ws.product11.stub.ExistsResponseDocument.ExistsResponse target = null;
            target = (de.epages.ws.product11.stub.ExistsResponseDocument.ExistsResponse)get_store().add_element_user(EXISTSRESPONSE$0);
            return target;
        }
    }
    /**
     * An XML existsResponse(@urn://epages.de/WebService/ProductService/2013/01).
     *
     * This is a complex type.
     */
    public static class ExistsResponseImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements de.epages.ws.product11.stub.ExistsResponseDocument.ExistsResponse
    {
        
        public ExistsResponseImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName PRODUCTS$0 = 
            new javax.xml.namespace.QName("", "Products");
        
        
        /**
         * Gets the "Products" element
         */
        public de.epages.ws.product11.stub.TypeExistsOut getProducts()
        {
            synchronized (monitor())
            {
                check_orphaned();
                de.epages.ws.product11.stub.TypeExistsOut target = null;
                target = (de.epages.ws.product11.stub.TypeExistsOut)get_store().find_element_user(PRODUCTS$0, 0);
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
                de.epages.ws.product11.stub.TypeExistsOut target = null;
                target = (de.epages.ws.product11.stub.TypeExistsOut)get_store().find_element_user(PRODUCTS$0, 0);
                if (target == null) return false;
                return target.isNil();
            }
        }
        
        /**
         * Sets the "Products" element
         */
        public void setProducts(de.epages.ws.product11.stub.TypeExistsOut products)
        {
            synchronized (monitor())
            {
                check_orphaned();
                de.epages.ws.product11.stub.TypeExistsOut target = null;
                target = (de.epages.ws.product11.stub.TypeExistsOut)get_store().find_element_user(PRODUCTS$0, 0);
                if (target == null)
                {
                    target = (de.epages.ws.product11.stub.TypeExistsOut)get_store().add_element_user(PRODUCTS$0);
                }
                target.set(products);
            }
        }
        
        /**
         * Appends and returns a new empty "Products" element
         */
        public de.epages.ws.product11.stub.TypeExistsOut addNewProducts()
        {
            synchronized (monitor())
            {
                check_orphaned();
                de.epages.ws.product11.stub.TypeExistsOut target = null;
                target = (de.epages.ws.product11.stub.TypeExistsOut)get_store().add_element_user(PRODUCTS$0);
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
                de.epages.ws.product11.stub.TypeExistsOut target = null;
                target = (de.epages.ws.product11.stub.TypeExistsOut)get_store().find_element_user(PRODUCTS$0, 0);
                if (target == null)
                {
                    target = (de.epages.ws.product11.stub.TypeExistsOut)get_store().add_element_user(PRODUCTS$0);
                }
                target.setNil();
            }
        }
    }
}
