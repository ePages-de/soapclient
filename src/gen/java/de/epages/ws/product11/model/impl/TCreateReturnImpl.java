/*
 * XML Type:  TCreate_Return
 * Namespace: urn://epages.de/WebService/ProductTypes/2013/01
 * Java type: de.epages.ws.product11.model.TCreateReturn
 *
 * Automatically generated - do not modify.
 */
package de.epages.ws.product11.model.impl;
/**
 * An XML TCreate_Return(@urn://epages.de/WebService/ProductTypes/2013/01).
 *
 * This is a complex type.
 */
public class TCreateReturnImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements de.epages.ws.product11.model.TCreateReturn
{
    
    public TCreateReturnImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ALIAS$0 = 
        new javax.xml.namespace.QName("", "Alias");
    private static final javax.xml.namespace.QName PATH$2 = 
        new javax.xml.namespace.QName("", "Path");
    private static final javax.xml.namespace.QName CREATED$4 = 
        new javax.xml.namespace.QName("", "created");
    private static final javax.xml.namespace.QName ERROR$6 = 
        new javax.xml.namespace.QName("", "Error");
    
    
    /**
     * Gets the "Alias" element
     */
    public java.lang.String getAlias()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ALIAS$0, 0);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ALIAS$0, 0);
            return target;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ALIAS$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ALIAS$0);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ALIAS$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(ALIAS$0);
            }
            target.set(alias);
        }
    }
    
    /**
     * Gets the "Path" element
     */
    public java.lang.String getPath()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PATH$2, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "Path" element
     */
    public org.apache.xmlbeans.XmlString xgetPath()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PATH$2, 0);
            return target;
        }
    }
    
    /**
     * True if has "Path" element
     */
    public boolean isSetPath()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PATH$2) != 0;
        }
    }
    
    /**
     * Sets the "Path" element
     */
    public void setPath(java.lang.String path)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PATH$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PATH$2);
            }
            target.setStringValue(path);
        }
    }
    
    /**
     * Sets (as xml) the "Path" element
     */
    public void xsetPath(org.apache.xmlbeans.XmlString path)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PATH$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(PATH$2);
            }
            target.set(path);
        }
    }
    
    /**
     * Unsets the "Path" element
     */
    public void unsetPath()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PATH$2, 0);
        }
    }
    
    /**
     * Gets the "created" element
     */
    public boolean getCreated()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CREATED$4, 0);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "created" element
     */
    public org.apache.xmlbeans.XmlBoolean xgetCreated()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(CREATED$4, 0);
            return target;
        }
    }
    
    /**
     * True if has "created" element
     */
    public boolean isSetCreated()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CREATED$4) != 0;
        }
    }
    
    /**
     * Sets the "created" element
     */
    public void setCreated(boolean created)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CREATED$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CREATED$4);
            }
            target.setBooleanValue(created);
        }
    }
    
    /**
     * Sets (as xml) the "created" element
     */
    public void xsetCreated(org.apache.xmlbeans.XmlBoolean created)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(CREATED$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(CREATED$4);
            }
            target.set(created);
        }
    }
    
    /**
     * Unsets the "created" element
     */
    public void unsetCreated()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CREATED$4, 0);
        }
    }
    
    /**
     * Gets the "Error" element
     */
    public de.epages.ws.common.model.TError getError()
    {
        synchronized (monitor())
        {
            check_orphaned();
            de.epages.ws.common.model.TError target = null;
            target = (de.epages.ws.common.model.TError)get_store().find_element_user(ERROR$6, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "Error" element
     */
    public boolean isSetError()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ERROR$6) != 0;
        }
    }
    
    /**
     * Sets the "Error" element
     */
    public void setError(de.epages.ws.common.model.TError error)
    {
        synchronized (monitor())
        {
            check_orphaned();
            de.epages.ws.common.model.TError target = null;
            target = (de.epages.ws.common.model.TError)get_store().find_element_user(ERROR$6, 0);
            if (target == null)
            {
                target = (de.epages.ws.common.model.TError)get_store().add_element_user(ERROR$6);
            }
            target.set(error);
        }
    }
    
    /**
     * Appends and returns a new empty "Error" element
     */
    public de.epages.ws.common.model.TError addNewError()
    {
        synchronized (monitor())
        {
            check_orphaned();
            de.epages.ws.common.model.TError target = null;
            target = (de.epages.ws.common.model.TError)get_store().add_element_user(ERROR$6);
            return target;
        }
    }
    
    /**
     * Unsets the "Error" element
     */
    public void unsetError()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ERROR$6, 0);
        }
    }
}
