/*
 * An XML document type.
 * Localname: create
 * Namespace: urn://epages.de/WebService/ProductService/2013/01
 * Java type: de.epages.ws.product11.stub.CreateDocument
 *
 * Automatically generated - do not modify.
 */
package de.epages.ws.product11.stub.impl;
/**
 * A document containing one create(@urn://epages.de/WebService/ProductService/2013/01) element.
 *
 * This is a complex type.
 */
public class CreateDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements de.epages.ws.product11.stub.CreateDocument
{
    
    public CreateDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CREATE$0 = 
        new javax.xml.namespace.QName("urn://epages.de/WebService/ProductService/2013/01", "create");
    
    
    /**
     * Gets the "create" element
     */
    public de.epages.ws.product11.stub.CreateDocument.Create getCreate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            de.epages.ws.product11.stub.CreateDocument.Create target = null;
            target = (de.epages.ws.product11.stub.CreateDocument.Create)get_store().find_element_user(CREATE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "create" element
     */
    public void setCreate(de.epages.ws.product11.stub.CreateDocument.Create create)
    {
        synchronized (monitor())
        {
            check_orphaned();
            de.epages.ws.product11.stub.CreateDocument.Create target = null;
            target = (de.epages.ws.product11.stub.CreateDocument.Create)get_store().find_element_user(CREATE$0, 0);
            if (target == null)
            {
                target = (de.epages.ws.product11.stub.CreateDocument.Create)get_store().add_element_user(CREATE$0);
            }
            target.set(create);
        }
    }
    
    /**
     * Appends and returns a new empty "create" element
     */
    public de.epages.ws.product11.stub.CreateDocument.Create addNewCreate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            de.epages.ws.product11.stub.CreateDocument.Create target = null;
            target = (de.epages.ws.product11.stub.CreateDocument.Create)get_store().add_element_user(CREATE$0);
            return target;
        }
    }
    /**
     * An XML create(@urn://epages.de/WebService/ProductService/2013/01).
     *
     * This is a complex type.
     */
    public static class CreateImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements de.epages.ws.product11.stub.CreateDocument.Create
    {
        
        public CreateImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName PRODUCTS$0 = 
            new javax.xml.namespace.QName("", "Products");
        
        
        /**
         * Gets the "Products" element
         */
        public de.epages.ws.product11.stub.TypeCreateIn getProducts()
        {
            synchronized (monitor())
            {
                check_orphaned();
                de.epages.ws.product11.stub.TypeCreateIn target = null;
                target = (de.epages.ws.product11.stub.TypeCreateIn)get_store().find_element_user(PRODUCTS$0, 0);
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
                de.epages.ws.product11.stub.TypeCreateIn target = null;
                target = (de.epages.ws.product11.stub.TypeCreateIn)get_store().find_element_user(PRODUCTS$0, 0);
                if (target == null) return false;
                return target.isNil();
            }
        }
        
        /**
         * Sets the "Products" element
         */
        public void setProducts(de.epages.ws.product11.stub.TypeCreateIn products)
        {
            synchronized (monitor())
            {
                check_orphaned();
                de.epages.ws.product11.stub.TypeCreateIn target = null;
                target = (de.epages.ws.product11.stub.TypeCreateIn)get_store().find_element_user(PRODUCTS$0, 0);
                if (target == null)
                {
                    target = (de.epages.ws.product11.stub.TypeCreateIn)get_store().add_element_user(PRODUCTS$0);
                }
                target.set(products);
            }
        }
        
        /**
         * Appends and returns a new empty "Products" element
         */
        public de.epages.ws.product11.stub.TypeCreateIn addNewProducts()
        {
            synchronized (monitor())
            {
                check_orphaned();
                de.epages.ws.product11.stub.TypeCreateIn target = null;
                target = (de.epages.ws.product11.stub.TypeCreateIn)get_store().add_element_user(PRODUCTS$0);
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
                de.epages.ws.product11.stub.TypeCreateIn target = null;
                target = (de.epages.ws.product11.stub.TypeCreateIn)get_store().find_element_user(PRODUCTS$0, 0);
                if (target == null)
                {
                    target = (de.epages.ws.product11.stub.TypeCreateIn)get_store().add_element_user(PRODUCTS$0);
                }
                target.setNil();
            }
        }
    }
}
