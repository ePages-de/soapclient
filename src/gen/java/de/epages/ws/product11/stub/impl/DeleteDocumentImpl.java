/*
 * An XML document type.
 * Localname: delete
 * Namespace: urn://epages.de/WebService/ProductService/2013/01
 * Java type: de.epages.ws.product11.stub.DeleteDocument
 *
 * Automatically generated - do not modify.
 */
package de.epages.ws.product11.stub.impl;
/**
 * A document containing one delete(@urn://epages.de/WebService/ProductService/2013/01) element.
 *
 * This is a complex type.
 */
public class DeleteDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements de.epages.ws.product11.stub.DeleteDocument
{
    
    public DeleteDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DELETE$0 = 
        new javax.xml.namespace.QName("urn://epages.de/WebService/ProductService/2013/01", "delete");
    
    
    /**
     * Gets the "delete" element
     */
    public de.epages.ws.product11.stub.DeleteDocument.Delete getDelete()
    {
        synchronized (monitor())
        {
            check_orphaned();
            de.epages.ws.product11.stub.DeleteDocument.Delete target = null;
            target = (de.epages.ws.product11.stub.DeleteDocument.Delete)get_store().find_element_user(DELETE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "delete" element
     */
    public void setDelete(de.epages.ws.product11.stub.DeleteDocument.Delete delete)
    {
        synchronized (monitor())
        {
            check_orphaned();
            de.epages.ws.product11.stub.DeleteDocument.Delete target = null;
            target = (de.epages.ws.product11.stub.DeleteDocument.Delete)get_store().find_element_user(DELETE$0, 0);
            if (target == null)
            {
                target = (de.epages.ws.product11.stub.DeleteDocument.Delete)get_store().add_element_user(DELETE$0);
            }
            target.set(delete);
        }
    }
    
    /**
     * Appends and returns a new empty "delete" element
     */
    public de.epages.ws.product11.stub.DeleteDocument.Delete addNewDelete()
    {
        synchronized (monitor())
        {
            check_orphaned();
            de.epages.ws.product11.stub.DeleteDocument.Delete target = null;
            target = (de.epages.ws.product11.stub.DeleteDocument.Delete)get_store().add_element_user(DELETE$0);
            return target;
        }
    }
    /**
     * An XML delete(@urn://epages.de/WebService/ProductService/2013/01).
     *
     * This is a complex type.
     */
    public static class DeleteImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements de.epages.ws.product11.stub.DeleteDocument.Delete
    {
        
        public DeleteImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName PRODUCTS$0 = 
            new javax.xml.namespace.QName("", "Products");
        
        
        /**
         * Gets the "Products" element
         */
        public de.epages.ws.product11.stub.TypeDeleteIn getProducts()
        {
            synchronized (monitor())
            {
                check_orphaned();
                de.epages.ws.product11.stub.TypeDeleteIn target = null;
                target = (de.epages.ws.product11.stub.TypeDeleteIn)get_store().find_element_user(PRODUCTS$0, 0);
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
                de.epages.ws.product11.stub.TypeDeleteIn target = null;
                target = (de.epages.ws.product11.stub.TypeDeleteIn)get_store().find_element_user(PRODUCTS$0, 0);
                if (target == null) return false;
                return target.isNil();
            }
        }
        
        /**
         * Sets the "Products" element
         */
        public void setProducts(de.epages.ws.product11.stub.TypeDeleteIn products)
        {
            synchronized (monitor())
            {
                check_orphaned();
                de.epages.ws.product11.stub.TypeDeleteIn target = null;
                target = (de.epages.ws.product11.stub.TypeDeleteIn)get_store().find_element_user(PRODUCTS$0, 0);
                if (target == null)
                {
                    target = (de.epages.ws.product11.stub.TypeDeleteIn)get_store().add_element_user(PRODUCTS$0);
                }
                target.set(products);
            }
        }
        
        /**
         * Appends and returns a new empty "Products" element
         */
        public de.epages.ws.product11.stub.TypeDeleteIn addNewProducts()
        {
            synchronized (monitor())
            {
                check_orphaned();
                de.epages.ws.product11.stub.TypeDeleteIn target = null;
                target = (de.epages.ws.product11.stub.TypeDeleteIn)get_store().add_element_user(PRODUCTS$0);
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
                de.epages.ws.product11.stub.TypeDeleteIn target = null;
                target = (de.epages.ws.product11.stub.TypeDeleteIn)get_store().find_element_user(PRODUCTS$0, 0);
                if (target == null)
                {
                    target = (de.epages.ws.product11.stub.TypeDeleteIn)get_store().add_element_user(PRODUCTS$0);
                }
                target.setNil();
            }
        }
    }
}
