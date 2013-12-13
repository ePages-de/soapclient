/*
 * An XML document type.
 * Localname: update
 * Namespace: urn://epages.de/WebService/ProductService/2013/01
 * Java type: de.epages.ws.product11.stub.UpdateDocument
 *
 * Automatically generated - do not modify.
 */
package de.epages.ws.product11.stub.impl;
/**
 * A document containing one update(@urn://epages.de/WebService/ProductService/2013/01) element.
 *
 * This is a complex type.
 */
public class UpdateDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements de.epages.ws.product11.stub.UpdateDocument
{
    
    public UpdateDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName UPDATE$0 = 
        new javax.xml.namespace.QName("urn://epages.de/WebService/ProductService/2013/01", "update");
    
    
    /**
     * Gets the "update" element
     */
    public de.epages.ws.product11.stub.UpdateDocument.Update getUpdate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            de.epages.ws.product11.stub.UpdateDocument.Update target = null;
            target = (de.epages.ws.product11.stub.UpdateDocument.Update)get_store().find_element_user(UPDATE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "update" element
     */
    public void setUpdate(de.epages.ws.product11.stub.UpdateDocument.Update update)
    {
        synchronized (monitor())
        {
            check_orphaned();
            de.epages.ws.product11.stub.UpdateDocument.Update target = null;
            target = (de.epages.ws.product11.stub.UpdateDocument.Update)get_store().find_element_user(UPDATE$0, 0);
            if (target == null)
            {
                target = (de.epages.ws.product11.stub.UpdateDocument.Update)get_store().add_element_user(UPDATE$0);
            }
            target.set(update);
        }
    }
    
    /**
     * Appends and returns a new empty "update" element
     */
    public de.epages.ws.product11.stub.UpdateDocument.Update addNewUpdate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            de.epages.ws.product11.stub.UpdateDocument.Update target = null;
            target = (de.epages.ws.product11.stub.UpdateDocument.Update)get_store().add_element_user(UPDATE$0);
            return target;
        }
    }
    /**
     * An XML update(@urn://epages.de/WebService/ProductService/2013/01).
     *
     * This is a complex type.
     */
    public static class UpdateImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements de.epages.ws.product11.stub.UpdateDocument.Update
    {
        
        public UpdateImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName PRODUCTS$0 = 
            new javax.xml.namespace.QName("", "Products");
        
        
        /**
         * Gets the "Products" element
         */
        public de.epages.ws.product11.stub.TypeUpdateIn getProducts()
        {
            synchronized (monitor())
            {
                check_orphaned();
                de.epages.ws.product11.stub.TypeUpdateIn target = null;
                target = (de.epages.ws.product11.stub.TypeUpdateIn)get_store().find_element_user(PRODUCTS$0, 0);
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
                de.epages.ws.product11.stub.TypeUpdateIn target = null;
                target = (de.epages.ws.product11.stub.TypeUpdateIn)get_store().find_element_user(PRODUCTS$0, 0);
                if (target == null) return false;
                return target.isNil();
            }
        }
        
        /**
         * Sets the "Products" element
         */
        public void setProducts(de.epages.ws.product11.stub.TypeUpdateIn products)
        {
            synchronized (monitor())
            {
                check_orphaned();
                de.epages.ws.product11.stub.TypeUpdateIn target = null;
                target = (de.epages.ws.product11.stub.TypeUpdateIn)get_store().find_element_user(PRODUCTS$0, 0);
                if (target == null)
                {
                    target = (de.epages.ws.product11.stub.TypeUpdateIn)get_store().add_element_user(PRODUCTS$0);
                }
                target.set(products);
            }
        }
        
        /**
         * Appends and returns a new empty "Products" element
         */
        public de.epages.ws.product11.stub.TypeUpdateIn addNewProducts()
        {
            synchronized (monitor())
            {
                check_orphaned();
                de.epages.ws.product11.stub.TypeUpdateIn target = null;
                target = (de.epages.ws.product11.stub.TypeUpdateIn)get_store().add_element_user(PRODUCTS$0);
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
                de.epages.ws.product11.stub.TypeUpdateIn target = null;
                target = (de.epages.ws.product11.stub.TypeUpdateIn)get_store().find_element_user(PRODUCTS$0, 0);
                if (target == null)
                {
                    target = (de.epages.ws.product11.stub.TypeUpdateIn)get_store().add_element_user(PRODUCTS$0);
                }
                target.setNil();
            }
        }
    }
}
