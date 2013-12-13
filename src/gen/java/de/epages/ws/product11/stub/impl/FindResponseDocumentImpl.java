/*
 * An XML document type.
 * Localname: findResponse
 * Namespace: urn://epages.de/WebService/ProductService/2013/01
 * Java type: de.epages.ws.product11.stub.FindResponseDocument
 *
 * Automatically generated - do not modify.
 */
package de.epages.ws.product11.stub.impl;
/**
 * A document containing one findResponse(@urn://epages.de/WebService/ProductService/2013/01) element.
 *
 * This is a complex type.
 */
public class FindResponseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements de.epages.ws.product11.stub.FindResponseDocument
{
    
    public FindResponseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName FINDRESPONSE$0 = 
        new javax.xml.namespace.QName("urn://epages.de/WebService/ProductService/2013/01", "findResponse");
    
    
    /**
     * Gets the "findResponse" element
     */
    public de.epages.ws.product11.stub.FindResponseDocument.FindResponse getFindResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            de.epages.ws.product11.stub.FindResponseDocument.FindResponse target = null;
            target = (de.epages.ws.product11.stub.FindResponseDocument.FindResponse)get_store().find_element_user(FINDRESPONSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "findResponse" element
     */
    public void setFindResponse(de.epages.ws.product11.stub.FindResponseDocument.FindResponse findResponse)
    {
        synchronized (monitor())
        {
            check_orphaned();
            de.epages.ws.product11.stub.FindResponseDocument.FindResponse target = null;
            target = (de.epages.ws.product11.stub.FindResponseDocument.FindResponse)get_store().find_element_user(FINDRESPONSE$0, 0);
            if (target == null)
            {
                target = (de.epages.ws.product11.stub.FindResponseDocument.FindResponse)get_store().add_element_user(FINDRESPONSE$0);
            }
            target.set(findResponse);
        }
    }
    
    /**
     * Appends and returns a new empty "findResponse" element
     */
    public de.epages.ws.product11.stub.FindResponseDocument.FindResponse addNewFindResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            de.epages.ws.product11.stub.FindResponseDocument.FindResponse target = null;
            target = (de.epages.ws.product11.stub.FindResponseDocument.FindResponse)get_store().add_element_user(FINDRESPONSE$0);
            return target;
        }
    }
    /**
     * An XML findResponse(@urn://epages.de/WebService/ProductService/2013/01).
     *
     * This is a complex type.
     */
    public static class FindResponseImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements de.epages.ws.product11.stub.FindResponseDocument.FindResponse
    {
        
        public FindResponseImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName PRODUCTS$0 = 
            new javax.xml.namespace.QName("", "Products");
        
        
        /**
         * Gets the "Products" element
         */
        public de.epages.ws.product11.stub.TypeFindOut getProducts()
        {
            synchronized (monitor())
            {
                check_orphaned();
                de.epages.ws.product11.stub.TypeFindOut target = null;
                target = (de.epages.ws.product11.stub.TypeFindOut)get_store().find_element_user(PRODUCTS$0, 0);
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
                de.epages.ws.product11.stub.TypeFindOut target = null;
                target = (de.epages.ws.product11.stub.TypeFindOut)get_store().find_element_user(PRODUCTS$0, 0);
                if (target == null) return false;
                return target.isNil();
            }
        }
        
        /**
         * Sets the "Products" element
         */
        public void setProducts(de.epages.ws.product11.stub.TypeFindOut products)
        {
            synchronized (monitor())
            {
                check_orphaned();
                de.epages.ws.product11.stub.TypeFindOut target = null;
                target = (de.epages.ws.product11.stub.TypeFindOut)get_store().find_element_user(PRODUCTS$0, 0);
                if (target == null)
                {
                    target = (de.epages.ws.product11.stub.TypeFindOut)get_store().add_element_user(PRODUCTS$0);
                }
                target.set(products);
            }
        }
        
        /**
         * Appends and returns a new empty "Products" element
         */
        public de.epages.ws.product11.stub.TypeFindOut addNewProducts()
        {
            synchronized (monitor())
            {
                check_orphaned();
                de.epages.ws.product11.stub.TypeFindOut target = null;
                target = (de.epages.ws.product11.stub.TypeFindOut)get_store().add_element_user(PRODUCTS$0);
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
                de.epages.ws.product11.stub.TypeFindOut target = null;
                target = (de.epages.ws.product11.stub.TypeFindOut)get_store().find_element_user(PRODUCTS$0, 0);
                if (target == null)
                {
                    target = (de.epages.ws.product11.stub.TypeFindOut)get_store().add_element_user(PRODUCTS$0);
                }
                target.setNil();
            }
        }
    }
}
