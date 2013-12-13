/*
 * An XML document type.
 * Localname: exists
 * Namespace: urn://epages.de/WebService/ProductService/2013/01
 * Java type: de.epages.ws.product11.stub.ExistsDocument
 *
 * Automatically generated - do not modify.
 */
package de.epages.ws.product11.stub.impl;
/**
 * A document containing one exists(@urn://epages.de/WebService/ProductService/2013/01) element.
 *
 * This is a complex type.
 */
public class ExistsDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements de.epages.ws.product11.stub.ExistsDocument
{
    
    public ExistsDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName EXISTS$0 = 
        new javax.xml.namespace.QName("urn://epages.de/WebService/ProductService/2013/01", "exists");
    
    
    /**
     * Gets the "exists" element
     */
    public de.epages.ws.product11.stub.ExistsDocument.Exists getExists()
    {
        synchronized (monitor())
        {
            check_orphaned();
            de.epages.ws.product11.stub.ExistsDocument.Exists target = null;
            target = (de.epages.ws.product11.stub.ExistsDocument.Exists)get_store().find_element_user(EXISTS$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "exists" element
     */
    public void setExists(de.epages.ws.product11.stub.ExistsDocument.Exists exists)
    {
        synchronized (monitor())
        {
            check_orphaned();
            de.epages.ws.product11.stub.ExistsDocument.Exists target = null;
            target = (de.epages.ws.product11.stub.ExistsDocument.Exists)get_store().find_element_user(EXISTS$0, 0);
            if (target == null)
            {
                target = (de.epages.ws.product11.stub.ExistsDocument.Exists)get_store().add_element_user(EXISTS$0);
            }
            target.set(exists);
        }
    }
    
    /**
     * Appends and returns a new empty "exists" element
     */
    public de.epages.ws.product11.stub.ExistsDocument.Exists addNewExists()
    {
        synchronized (monitor())
        {
            check_orphaned();
            de.epages.ws.product11.stub.ExistsDocument.Exists target = null;
            target = (de.epages.ws.product11.stub.ExistsDocument.Exists)get_store().add_element_user(EXISTS$0);
            return target;
        }
    }
    /**
     * An XML exists(@urn://epages.de/WebService/ProductService/2013/01).
     *
     * This is a complex type.
     */
    public static class ExistsImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements de.epages.ws.product11.stub.ExistsDocument.Exists
    {
        
        public ExistsImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName PRODUCTS$0 = 
            new javax.xml.namespace.QName("", "Products");
        
        
        /**
         * Gets the "Products" element
         */
        public de.epages.ws.product11.stub.TypeExistsIn getProducts()
        {
            synchronized (monitor())
            {
                check_orphaned();
                de.epages.ws.product11.stub.TypeExistsIn target = null;
                target = (de.epages.ws.product11.stub.TypeExistsIn)get_store().find_element_user(PRODUCTS$0, 0);
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
                de.epages.ws.product11.stub.TypeExistsIn target = null;
                target = (de.epages.ws.product11.stub.TypeExistsIn)get_store().find_element_user(PRODUCTS$0, 0);
                if (target == null) return false;
                return target.isNil();
            }
        }
        
        /**
         * Sets the "Products" element
         */
        public void setProducts(de.epages.ws.product11.stub.TypeExistsIn products)
        {
            synchronized (monitor())
            {
                check_orphaned();
                de.epages.ws.product11.stub.TypeExistsIn target = null;
                target = (de.epages.ws.product11.stub.TypeExistsIn)get_store().find_element_user(PRODUCTS$0, 0);
                if (target == null)
                {
                    target = (de.epages.ws.product11.stub.TypeExistsIn)get_store().add_element_user(PRODUCTS$0);
                }
                target.set(products);
            }
        }
        
        /**
         * Appends and returns a new empty "Products" element
         */
        public de.epages.ws.product11.stub.TypeExistsIn addNewProducts()
        {
            synchronized (monitor())
            {
                check_orphaned();
                de.epages.ws.product11.stub.TypeExistsIn target = null;
                target = (de.epages.ws.product11.stub.TypeExistsIn)get_store().add_element_user(PRODUCTS$0);
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
                de.epages.ws.product11.stub.TypeExistsIn target = null;
                target = (de.epages.ws.product11.stub.TypeExistsIn)get_store().find_element_user(PRODUCTS$0, 0);
                if (target == null)
                {
                    target = (de.epages.ws.product11.stub.TypeExistsIn)get_store().add_element_user(PRODUCTS$0);
                }
                target.setNil();
            }
        }
    }
}
