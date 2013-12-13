/*
 * An XML document type.
 * Localname: createResponse
 * Namespace: urn://epages.de/WebService/ProductService/2013/01
 * Java type: de.epages.ws.product11.stub.CreateResponseDocument
 *
 * Automatically generated - do not modify.
 */
package de.epages.ws.product11.stub.impl;
/**
 * A document containing one createResponse(@urn://epages.de/WebService/ProductService/2013/01) element.
 *
 * This is a complex type.
 */
public class CreateResponseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements de.epages.ws.product11.stub.CreateResponseDocument
{
    
    public CreateResponseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CREATERESPONSE$0 = 
        new javax.xml.namespace.QName("urn://epages.de/WebService/ProductService/2013/01", "createResponse");
    
    
    /**
     * Gets the "createResponse" element
     */
    public de.epages.ws.product11.stub.CreateResponseDocument.CreateResponse getCreateResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            de.epages.ws.product11.stub.CreateResponseDocument.CreateResponse target = null;
            target = (de.epages.ws.product11.stub.CreateResponseDocument.CreateResponse)get_store().find_element_user(CREATERESPONSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "createResponse" element
     */
    public void setCreateResponse(de.epages.ws.product11.stub.CreateResponseDocument.CreateResponse createResponse)
    {
        synchronized (monitor())
        {
            check_orphaned();
            de.epages.ws.product11.stub.CreateResponseDocument.CreateResponse target = null;
            target = (de.epages.ws.product11.stub.CreateResponseDocument.CreateResponse)get_store().find_element_user(CREATERESPONSE$0, 0);
            if (target == null)
            {
                target = (de.epages.ws.product11.stub.CreateResponseDocument.CreateResponse)get_store().add_element_user(CREATERESPONSE$0);
            }
            target.set(createResponse);
        }
    }
    
    /**
     * Appends and returns a new empty "createResponse" element
     */
    public de.epages.ws.product11.stub.CreateResponseDocument.CreateResponse addNewCreateResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            de.epages.ws.product11.stub.CreateResponseDocument.CreateResponse target = null;
            target = (de.epages.ws.product11.stub.CreateResponseDocument.CreateResponse)get_store().add_element_user(CREATERESPONSE$0);
            return target;
        }
    }
    /**
     * An XML createResponse(@urn://epages.de/WebService/ProductService/2013/01).
     *
     * This is a complex type.
     */
    public static class CreateResponseImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements de.epages.ws.product11.stub.CreateResponseDocument.CreateResponse
    {
        
        public CreateResponseImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName PRODUCTS$0 = 
            new javax.xml.namespace.QName("", "Products");
        
        
        /**
         * Gets the "Products" element
         */
        public de.epages.ws.product11.stub.TypeCreateOut getProducts()
        {
            synchronized (monitor())
            {
                check_orphaned();
                de.epages.ws.product11.stub.TypeCreateOut target = null;
                target = (de.epages.ws.product11.stub.TypeCreateOut)get_store().find_element_user(PRODUCTS$0, 0);
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
                de.epages.ws.product11.stub.TypeCreateOut target = null;
                target = (de.epages.ws.product11.stub.TypeCreateOut)get_store().find_element_user(PRODUCTS$0, 0);
                if (target == null) return false;
                return target.isNil();
            }
        }
        
        /**
         * Sets the "Products" element
         */
        public void setProducts(de.epages.ws.product11.stub.TypeCreateOut products)
        {
            synchronized (monitor())
            {
                check_orphaned();
                de.epages.ws.product11.stub.TypeCreateOut target = null;
                target = (de.epages.ws.product11.stub.TypeCreateOut)get_store().find_element_user(PRODUCTS$0, 0);
                if (target == null)
                {
                    target = (de.epages.ws.product11.stub.TypeCreateOut)get_store().add_element_user(PRODUCTS$0);
                }
                target.set(products);
            }
        }
        
        /**
         * Appends and returns a new empty "Products" element
         */
        public de.epages.ws.product11.stub.TypeCreateOut addNewProducts()
        {
            synchronized (monitor())
            {
                check_orphaned();
                de.epages.ws.product11.stub.TypeCreateOut target = null;
                target = (de.epages.ws.product11.stub.TypeCreateOut)get_store().add_element_user(PRODUCTS$0);
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
                de.epages.ws.product11.stub.TypeCreateOut target = null;
                target = (de.epages.ws.product11.stub.TypeCreateOut)get_store().find_element_user(PRODUCTS$0, 0);
                if (target == null)
                {
                    target = (de.epages.ws.product11.stub.TypeCreateOut)get_store().add_element_user(PRODUCTS$0);
                }
                target.setNil();
            }
        }
    }
}
