/*
 * XML Type:  TFind_Input
 * Namespace: urn://epages.de/WebService/ProductService/2013/01
 * Java type: de.epages.ws.product11.stub.TFindInput
 *
 * Automatically generated - do not modify.
 */
package de.epages.ws.product11.stub.impl;
/**
 * An XML TFind_Input(@urn://epages.de/WebService/ProductService/2013/01).
 *
 * This is a complex type.
 */
public class TFindInputImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements de.epages.ws.product11.stub.TFindInput
{
    
    public TFindInputImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName TEXT$0 = 
        new javax.xml.namespace.QName("", "Text");
    private static final javax.xml.namespace.QName LANGUAGECODE$2 = 
        new javax.xml.namespace.QName("", "LanguageCode");
    private static final javax.xml.namespace.QName ALIAS$4 = 
        new javax.xml.namespace.QName("", "Alias");
    private static final javax.xml.namespace.QName CLASS1$6 = 
        new javax.xml.namespace.QName("", "Class");
    
    
    /**
     * Gets the "Text" element
     */
    public java.lang.String getText()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TEXT$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "Text" element
     */
    public org.apache.xmlbeans.XmlString xgetText()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(TEXT$0, 0);
            return target;
        }
    }
    
    /**
     * True if has "Text" element
     */
    public boolean isSetText()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(TEXT$0) != 0;
        }
    }
    
    /**
     * Sets the "Text" element
     */
    public void setText(java.lang.String text)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TEXT$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TEXT$0);
            }
            target.setStringValue(text);
        }
    }
    
    /**
     * Sets (as xml) the "Text" element
     */
    public void xsetText(org.apache.xmlbeans.XmlString text)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(TEXT$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(TEXT$0);
            }
            target.set(text);
        }
    }
    
    /**
     * Unsets the "Text" element
     */
    public void unsetText()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(TEXT$0, 0);
        }
    }
    
    /**
     * Gets the "LanguageCode" element
     */
    public java.lang.String getLanguageCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LANGUAGECODE$2, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "LanguageCode" element
     */
    public org.apache.xmlbeans.XmlString xgetLanguageCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(LANGUAGECODE$2, 0);
            return target;
        }
    }
    
    /**
     * True if has "LanguageCode" element
     */
    public boolean isSetLanguageCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(LANGUAGECODE$2) != 0;
        }
    }
    
    /**
     * Sets the "LanguageCode" element
     */
    public void setLanguageCode(java.lang.String languageCode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LANGUAGECODE$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(LANGUAGECODE$2);
            }
            target.setStringValue(languageCode);
        }
    }
    
    /**
     * Sets (as xml) the "LanguageCode" element
     */
    public void xsetLanguageCode(org.apache.xmlbeans.XmlString languageCode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(LANGUAGECODE$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(LANGUAGECODE$2);
            }
            target.set(languageCode);
        }
    }
    
    /**
     * Unsets the "LanguageCode" element
     */
    public void unsetLanguageCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(LANGUAGECODE$2, 0);
        }
    }
    
    /**
     * Gets the "Alias" element
     */
    public java.lang.String getAlias()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ALIAS$4, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "Alias" element
     */
    public org.apache.xmlbeans.XmlString xgetAlias()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ALIAS$4, 0);
            return target;
        }
    }
    
    /**
     * True if has "Alias" element
     */
    public boolean isSetAlias()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ALIAS$4) != 0;
        }
    }
    
    /**
     * Sets the "Alias" element
     */
    public void setAlias(java.lang.String alias)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ALIAS$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ALIAS$4);
            }
            target.setStringValue(alias);
        }
    }
    
    /**
     * Sets (as xml) the "Alias" element
     */
    public void xsetAlias(org.apache.xmlbeans.XmlString alias)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ALIAS$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(ALIAS$4);
            }
            target.set(alias);
        }
    }
    
    /**
     * Unsets the "Alias" element
     */
    public void unsetAlias()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ALIAS$4, 0);
        }
    }
    
    /**
     * Gets the "Class" element
     */
    public java.lang.String getClass1()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CLASS1$6, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "Class" element
     */
    public org.apache.xmlbeans.XmlString xgetClass1()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CLASS1$6, 0);
            return target;
        }
    }
    
    /**
     * True if has "Class" element
     */
    public boolean isSetClass1()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CLASS1$6) != 0;
        }
    }
    
    /**
     * Sets the "Class" element
     */
    public void setClass1(java.lang.String class1)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CLASS1$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CLASS1$6);
            }
            target.setStringValue(class1);
        }
    }
    
    /**
     * Sets (as xml) the "Class" element
     */
    public void xsetClass1(org.apache.xmlbeans.XmlString class1)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CLASS1$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(CLASS1$6);
            }
            target.set(class1);
        }
    }
    
    /**
     * Unsets the "Class" element
     */
    public void unsetClass1()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CLASS1$6, 0);
        }
    }
}
