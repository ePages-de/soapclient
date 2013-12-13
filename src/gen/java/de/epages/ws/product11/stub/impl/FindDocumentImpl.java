/*
 * An XML document type.
 * Localname: find
 * Namespace: urn://epages.de/WebService/ProductService/2013/01
 * Java type: de.epages.ws.product11.stub.FindDocument
 *
 * Automatically generated - do not modify.
 */
package de.epages.ws.product11.stub.impl;
/**
 * A document containing one find(@urn://epages.de/WebService/ProductService/2013/01) element.
 *
 * This is a complex type.
 */
public class FindDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements de.epages.ws.product11.stub.FindDocument
{
    
    public FindDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName FIND$0 = 
        new javax.xml.namespace.QName("urn://epages.de/WebService/ProductService/2013/01", "find");
    
    
    /**
     * Gets the "find" element
     */
    public de.epages.ws.product11.stub.FindDocument.Find getFind()
    {
        synchronized (monitor())
        {
            check_orphaned();
            de.epages.ws.product11.stub.FindDocument.Find target = null;
            target = (de.epages.ws.product11.stub.FindDocument.Find)get_store().find_element_user(FIND$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "find" element
     */
    public void setFind(de.epages.ws.product11.stub.FindDocument.Find find)
    {
        synchronized (monitor())
        {
            check_orphaned();
            de.epages.ws.product11.stub.FindDocument.Find target = null;
            target = (de.epages.ws.product11.stub.FindDocument.Find)get_store().find_element_user(FIND$0, 0);
            if (target == null)
            {
                target = (de.epages.ws.product11.stub.FindDocument.Find)get_store().add_element_user(FIND$0);
            }
            target.set(find);
        }
    }
    
    /**
     * Appends and returns a new empty "find" element
     */
    public de.epages.ws.product11.stub.FindDocument.Find addNewFind()
    {
        synchronized (monitor())
        {
            check_orphaned();
            de.epages.ws.product11.stub.FindDocument.Find target = null;
            target = (de.epages.ws.product11.stub.FindDocument.Find)get_store().add_element_user(FIND$0);
            return target;
        }
    }
    /**
     * An XML find(@urn://epages.de/WebService/ProductService/2013/01).
     *
     * This is a complex type.
     */
    public static class FindImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements de.epages.ws.product11.stub.FindDocument.Find
    {
        
        public FindImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName SEARCHPARAMETERS$0 = 
            new javax.xml.namespace.QName("", "SearchParameters");
        
        
        /**
         * Gets the "SearchParameters" element
         */
        public de.epages.ws.product11.stub.TFindInput getSearchParameters()
        {
            synchronized (monitor())
            {
                check_orphaned();
                de.epages.ws.product11.stub.TFindInput target = null;
                target = (de.epages.ws.product11.stub.TFindInput)get_store().find_element_user(SEARCHPARAMETERS$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * Tests for nil "SearchParameters" element
         */
        public boolean isNilSearchParameters()
        {
            synchronized (monitor())
            {
                check_orphaned();
                de.epages.ws.product11.stub.TFindInput target = null;
                target = (de.epages.ws.product11.stub.TFindInput)get_store().find_element_user(SEARCHPARAMETERS$0, 0);
                if (target == null) return false;
                return target.isNil();
            }
        }
        
        /**
         * Sets the "SearchParameters" element
         */
        public void setSearchParameters(de.epages.ws.product11.stub.TFindInput searchParameters)
        {
            synchronized (monitor())
            {
                check_orphaned();
                de.epages.ws.product11.stub.TFindInput target = null;
                target = (de.epages.ws.product11.stub.TFindInput)get_store().find_element_user(SEARCHPARAMETERS$0, 0);
                if (target == null)
                {
                    target = (de.epages.ws.product11.stub.TFindInput)get_store().add_element_user(SEARCHPARAMETERS$0);
                }
                target.set(searchParameters);
            }
        }
        
        /**
         * Appends and returns a new empty "SearchParameters" element
         */
        public de.epages.ws.product11.stub.TFindInput addNewSearchParameters()
        {
            synchronized (monitor())
            {
                check_orphaned();
                de.epages.ws.product11.stub.TFindInput target = null;
                target = (de.epages.ws.product11.stub.TFindInput)get_store().add_element_user(SEARCHPARAMETERS$0);
                return target;
            }
        }
        
        /**
         * Nils the "SearchParameters" element
         */
        public void setNilSearchParameters()
        {
            synchronized (monitor())
            {
                check_orphaned();
                de.epages.ws.product11.stub.TFindInput target = null;
                target = (de.epages.ws.product11.stub.TFindInput)get_store().find_element_user(SEARCHPARAMETERS$0, 0);
                if (target == null)
                {
                    target = (de.epages.ws.product11.stub.TFindInput)get_store().add_element_user(SEARCHPARAMETERS$0);
                }
                target.setNil();
            }
        }
    }
}
