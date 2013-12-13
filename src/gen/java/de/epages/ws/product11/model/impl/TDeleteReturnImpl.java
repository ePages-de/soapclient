/*
 * XML Type:  TDelete_Return
 * Namespace: urn://epages.de/WebService/ProductTypes/2013/01
 * Java type: de.epages.ws.product11.model.TDeleteReturn
 *
 * Automatically generated - do not modify.
 */
package de.epages.ws.product11.model.impl;
/**
 * An XML TDelete_Return(@urn://epages.de/WebService/ProductTypes/2013/01).
 *
 * This is a complex type.
 */
public class TDeleteReturnImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements de.epages.ws.product11.model.TDeleteReturn
{
    
    public TDeleteReturnImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName PATH$0 = 
        new javax.xml.namespace.QName("", "Path");
    private static final javax.xml.namespace.QName DELETED$2 = 
        new javax.xml.namespace.QName("", "deleted");
    private static final javax.xml.namespace.QName ERROR$4 = 
        new javax.xml.namespace.QName("", "Error");
    
    
    /**
     * Gets the "Path" element
     */
    public java.lang.String getPath()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PATH$0, 0);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PATH$0, 0);
            return target;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PATH$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PATH$0);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PATH$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(PATH$0);
            }
            target.set(path);
        }
    }
    
    /**
     * Gets the "deleted" element
     */
    public boolean getDeleted()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DELETED$2, 0);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "deleted" element
     */
    public org.apache.xmlbeans.XmlBoolean xgetDeleted()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(DELETED$2, 0);
            return target;
        }
    }
    
    /**
     * True if has "deleted" element
     */
    public boolean isSetDeleted()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DELETED$2) != 0;
        }
    }
    
    /**
     * Sets the "deleted" element
     */
    public void setDeleted(boolean deleted)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DELETED$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DELETED$2);
            }
            target.setBooleanValue(deleted);
        }
    }
    
    /**
     * Sets (as xml) the "deleted" element
     */
    public void xsetDeleted(org.apache.xmlbeans.XmlBoolean deleted)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(DELETED$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(DELETED$2);
            }
            target.set(deleted);
        }
    }
    
    /**
     * Unsets the "deleted" element
     */
    public void unsetDeleted()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DELETED$2, 0);
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
            target = (de.epages.ws.common.model.TError)get_store().find_element_user(ERROR$4, 0);
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
            return get_store().count_elements(ERROR$4) != 0;
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
            target = (de.epages.ws.common.model.TError)get_store().find_element_user(ERROR$4, 0);
            if (target == null)
            {
                target = (de.epages.ws.common.model.TError)get_store().add_element_user(ERROR$4);
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
            target = (de.epages.ws.common.model.TError)get_store().add_element_user(ERROR$4);
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
            get_store().remove_element(ERROR$4, 0);
        }
    }
}
