/*
 * An XML document type.
 * Localname: getInfo
 * Namespace: urn://epages.de/WebService/ProductService/2013/01
 * Java type: de.epages.ws.product11.stub.GetInfoDocument
 *
 * Automatically generated - do not modify.
 */
package de.epages.ws.product11.stub.impl;
/**
 * A document containing one getInfo(@urn://epages.de/WebService/ProductService/2013/01) element.
 *
 * This is a complex type.
 */
public class GetInfoDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements de.epages.ws.product11.stub.GetInfoDocument
{
    
    public GetInfoDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GETINFO$0 = 
        new javax.xml.namespace.QName("urn://epages.de/WebService/ProductService/2013/01", "getInfo");
    
    
    /**
     * Gets the "getInfo" element
     */
    public de.epages.ws.product11.stub.GetInfoDocument.GetInfo getGetInfo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            de.epages.ws.product11.stub.GetInfoDocument.GetInfo target = null;
            target = (de.epages.ws.product11.stub.GetInfoDocument.GetInfo)get_store().find_element_user(GETINFO$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "getInfo" element
     */
    public void setGetInfo(de.epages.ws.product11.stub.GetInfoDocument.GetInfo getInfo)
    {
        synchronized (monitor())
        {
            check_orphaned();
            de.epages.ws.product11.stub.GetInfoDocument.GetInfo target = null;
            target = (de.epages.ws.product11.stub.GetInfoDocument.GetInfo)get_store().find_element_user(GETINFO$0, 0);
            if (target == null)
            {
                target = (de.epages.ws.product11.stub.GetInfoDocument.GetInfo)get_store().add_element_user(GETINFO$0);
            }
            target.set(getInfo);
        }
    }
    
    /**
     * Appends and returns a new empty "getInfo" element
     */
    public de.epages.ws.product11.stub.GetInfoDocument.GetInfo addNewGetInfo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            de.epages.ws.product11.stub.GetInfoDocument.GetInfo target = null;
            target = (de.epages.ws.product11.stub.GetInfoDocument.GetInfo)get_store().add_element_user(GETINFO$0);
            return target;
        }
    }
    /**
     * An XML getInfo(@urn://epages.de/WebService/ProductService/2013/01).
     *
     * This is a complex type.
     */
    public static class GetInfoImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements de.epages.ws.product11.stub.GetInfoDocument.GetInfo
    {
        
        public GetInfoImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName PRODUCTS$0 = 
            new javax.xml.namespace.QName("", "Products");
        private static final javax.xml.namespace.QName ATTRIBUTES$2 = 
            new javax.xml.namespace.QName("", "Attributes");
        private static final javax.xml.namespace.QName LANGUAGECODES$4 = 
            new javax.xml.namespace.QName("", "LanguageCodes");
        
        
        /**
         * Gets the "Products" element
         */
        public de.epages.ws.product11.stub.TypeGetInfoIn getProducts()
        {
            synchronized (monitor())
            {
                check_orphaned();
                de.epages.ws.product11.stub.TypeGetInfoIn target = null;
                target = (de.epages.ws.product11.stub.TypeGetInfoIn)get_store().find_element_user(PRODUCTS$0, 0);
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
                de.epages.ws.product11.stub.TypeGetInfoIn target = null;
                target = (de.epages.ws.product11.stub.TypeGetInfoIn)get_store().find_element_user(PRODUCTS$0, 0);
                if (target == null) return false;
                return target.isNil();
            }
        }
        
        /**
         * Sets the "Products" element
         */
        public void setProducts(de.epages.ws.product11.stub.TypeGetInfoIn products)
        {
            synchronized (monitor())
            {
                check_orphaned();
                de.epages.ws.product11.stub.TypeGetInfoIn target = null;
                target = (de.epages.ws.product11.stub.TypeGetInfoIn)get_store().find_element_user(PRODUCTS$0, 0);
                if (target == null)
                {
                    target = (de.epages.ws.product11.stub.TypeGetInfoIn)get_store().add_element_user(PRODUCTS$0);
                }
                target.set(products);
            }
        }
        
        /**
         * Appends and returns a new empty "Products" element
         */
        public de.epages.ws.product11.stub.TypeGetInfoIn addNewProducts()
        {
            synchronized (monitor())
            {
                check_orphaned();
                de.epages.ws.product11.stub.TypeGetInfoIn target = null;
                target = (de.epages.ws.product11.stub.TypeGetInfoIn)get_store().add_element_user(PRODUCTS$0);
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
                de.epages.ws.product11.stub.TypeGetInfoIn target = null;
                target = (de.epages.ws.product11.stub.TypeGetInfoIn)get_store().find_element_user(PRODUCTS$0, 0);
                if (target == null)
                {
                    target = (de.epages.ws.product11.stub.TypeGetInfoIn)get_store().add_element_user(PRODUCTS$0);
                }
                target.setNil();
            }
        }
        
        /**
         * Gets the "Attributes" element
         */
        public de.epages.ws.product11.stub.TypeAttributeNamesIn getAttributes()
        {
            synchronized (monitor())
            {
                check_orphaned();
                de.epages.ws.product11.stub.TypeAttributeNamesIn target = null;
                target = (de.epages.ws.product11.stub.TypeAttributeNamesIn)get_store().find_element_user(ATTRIBUTES$2, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * Tests for nil "Attributes" element
         */
        public boolean isNilAttributes()
        {
            synchronized (monitor())
            {
                check_orphaned();
                de.epages.ws.product11.stub.TypeAttributeNamesIn target = null;
                target = (de.epages.ws.product11.stub.TypeAttributeNamesIn)get_store().find_element_user(ATTRIBUTES$2, 0);
                if (target == null) return false;
                return target.isNil();
            }
        }
        
        /**
         * Sets the "Attributes" element
         */
        public void setAttributes(de.epages.ws.product11.stub.TypeAttributeNamesIn attributes)
        {
            synchronized (monitor())
            {
                check_orphaned();
                de.epages.ws.product11.stub.TypeAttributeNamesIn target = null;
                target = (de.epages.ws.product11.stub.TypeAttributeNamesIn)get_store().find_element_user(ATTRIBUTES$2, 0);
                if (target == null)
                {
                    target = (de.epages.ws.product11.stub.TypeAttributeNamesIn)get_store().add_element_user(ATTRIBUTES$2);
                }
                target.set(attributes);
            }
        }
        
        /**
         * Appends and returns a new empty "Attributes" element
         */
        public de.epages.ws.product11.stub.TypeAttributeNamesIn addNewAttributes()
        {
            synchronized (monitor())
            {
                check_orphaned();
                de.epages.ws.product11.stub.TypeAttributeNamesIn target = null;
                target = (de.epages.ws.product11.stub.TypeAttributeNamesIn)get_store().add_element_user(ATTRIBUTES$2);
                return target;
            }
        }
        
        /**
         * Nils the "Attributes" element
         */
        public void setNilAttributes()
        {
            synchronized (monitor())
            {
                check_orphaned();
                de.epages.ws.product11.stub.TypeAttributeNamesIn target = null;
                target = (de.epages.ws.product11.stub.TypeAttributeNamesIn)get_store().find_element_user(ATTRIBUTES$2, 0);
                if (target == null)
                {
                    target = (de.epages.ws.product11.stub.TypeAttributeNamesIn)get_store().add_element_user(ATTRIBUTES$2);
                }
                target.setNil();
            }
        }
        
        /**
         * Gets the "LanguageCodes" element
         */
        public de.epages.ws.product11.stub.TypeLanguageCodesIn getLanguageCodes()
        {
            synchronized (monitor())
            {
                check_orphaned();
                de.epages.ws.product11.stub.TypeLanguageCodesIn target = null;
                target = (de.epages.ws.product11.stub.TypeLanguageCodesIn)get_store().find_element_user(LANGUAGECODES$4, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * Tests for nil "LanguageCodes" element
         */
        public boolean isNilLanguageCodes()
        {
            synchronized (monitor())
            {
                check_orphaned();
                de.epages.ws.product11.stub.TypeLanguageCodesIn target = null;
                target = (de.epages.ws.product11.stub.TypeLanguageCodesIn)get_store().find_element_user(LANGUAGECODES$4, 0);
                if (target == null) return false;
                return target.isNil();
            }
        }
        
        /**
         * Sets the "LanguageCodes" element
         */
        public void setLanguageCodes(de.epages.ws.product11.stub.TypeLanguageCodesIn languageCodes)
        {
            synchronized (monitor())
            {
                check_orphaned();
                de.epages.ws.product11.stub.TypeLanguageCodesIn target = null;
                target = (de.epages.ws.product11.stub.TypeLanguageCodesIn)get_store().find_element_user(LANGUAGECODES$4, 0);
                if (target == null)
                {
                    target = (de.epages.ws.product11.stub.TypeLanguageCodesIn)get_store().add_element_user(LANGUAGECODES$4);
                }
                target.set(languageCodes);
            }
        }
        
        /**
         * Appends and returns a new empty "LanguageCodes" element
         */
        public de.epages.ws.product11.stub.TypeLanguageCodesIn addNewLanguageCodes()
        {
            synchronized (monitor())
            {
                check_orphaned();
                de.epages.ws.product11.stub.TypeLanguageCodesIn target = null;
                target = (de.epages.ws.product11.stub.TypeLanguageCodesIn)get_store().add_element_user(LANGUAGECODES$4);
                return target;
            }
        }
        
        /**
         * Nils the "LanguageCodes" element
         */
        public void setNilLanguageCodes()
        {
            synchronized (monitor())
            {
                check_orphaned();
                de.epages.ws.product11.stub.TypeLanguageCodesIn target = null;
                target = (de.epages.ws.product11.stub.TypeLanguageCodesIn)get_store().find_element_user(LANGUAGECODES$4, 0);
                if (target == null)
                {
                    target = (de.epages.ws.product11.stub.TypeLanguageCodesIn)get_store().add_element_user(LANGUAGECODES$4);
                }
                target.setNil();
            }
        }
    }
}
