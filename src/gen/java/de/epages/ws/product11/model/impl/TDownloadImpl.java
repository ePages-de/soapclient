/*
 * XML Type:  TDownload
 * Namespace: urn://epages.de/WebService/ProductTypes/2013/01
 * Java type: de.epages.ws.product11.model.TDownload
 *
 * Automatically generated - do not modify.
 */
package de.epages.ws.product11.model.impl;
/**
 * An XML TDownload(@urn://epages.de/WebService/ProductTypes/2013/01).
 *
 * This is a complex type.
 */
public class TDownloadImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements de.epages.ws.product11.model.TDownload
{
    
    public TDownloadImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName TARGETURL$0 = 
        new javax.xml.namespace.QName("", "TargetUrl");
    private static final javax.xml.namespace.QName FILENAME$2 = 
        new javax.xml.namespace.QName("", "FileName");
    private static final javax.xml.namespace.QName FILESIZE$4 = 
        new javax.xml.namespace.QName("", "FileSize");
    private static final javax.xml.namespace.QName FILECONTENT$6 = 
        new javax.xml.namespace.QName("", "FileContent");
    private static final javax.xml.namespace.QName ISEXTERNAL$8 = 
        new javax.xml.namespace.QName("", "IsExternal");
    private static final javax.xml.namespace.QName POSITION$10 = 
        new javax.xml.namespace.QName("", "Position");
    
    
    /**
     * Gets the "TargetUrl" element
     */
    public java.lang.String getTargetUrl()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TARGETURL$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "TargetUrl" element
     */
    public org.apache.xmlbeans.XmlString xgetTargetUrl()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(TARGETURL$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "TargetUrl" element
     */
    public void setTargetUrl(java.lang.String targetUrl)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TARGETURL$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TARGETURL$0);
            }
            target.setStringValue(targetUrl);
        }
    }
    
    /**
     * Sets (as xml) the "TargetUrl" element
     */
    public void xsetTargetUrl(org.apache.xmlbeans.XmlString targetUrl)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(TARGETURL$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(TARGETURL$0);
            }
            target.set(targetUrl);
        }
    }
    
    /**
     * Gets the "FileName" element
     */
    public java.lang.String getFileName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FILENAME$2, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "FileName" element
     */
    public org.apache.xmlbeans.XmlString xgetFileName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(FILENAME$2, 0);
            return target;
        }
    }
    
    /**
     * Sets the "FileName" element
     */
    public void setFileName(java.lang.String fileName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FILENAME$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(FILENAME$2);
            }
            target.setStringValue(fileName);
        }
    }
    
    /**
     * Sets (as xml) the "FileName" element
     */
    public void xsetFileName(org.apache.xmlbeans.XmlString fileName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(FILENAME$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(FILENAME$2);
            }
            target.set(fileName);
        }
    }
    
    /**
     * Gets the "FileSize" element
     */
    public float getFileSize()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FILESIZE$4, 0);
            if (target == null)
            {
                return 0.0f;
            }
            return target.getFloatValue();
        }
    }
    
    /**
     * Gets (as xml) the "FileSize" element
     */
    public org.apache.xmlbeans.XmlFloat xgetFileSize()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlFloat target = null;
            target = (org.apache.xmlbeans.XmlFloat)get_store().find_element_user(FILESIZE$4, 0);
            return target;
        }
    }
    
    /**
     * Sets the "FileSize" element
     */
    public void setFileSize(float fileSize)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FILESIZE$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(FILESIZE$4);
            }
            target.setFloatValue(fileSize);
        }
    }
    
    /**
     * Sets (as xml) the "FileSize" element
     */
    public void xsetFileSize(org.apache.xmlbeans.XmlFloat fileSize)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlFloat target = null;
            target = (org.apache.xmlbeans.XmlFloat)get_store().find_element_user(FILESIZE$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlFloat)get_store().add_element_user(FILESIZE$4);
            }
            target.set(fileSize);
        }
    }
    
    /**
     * Gets the "FileContent" element
     */
    public byte[] getFileContent()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FILECONTENT$6, 0);
            if (target == null)
            {
                return null;
            }
            return target.getByteArrayValue();
        }
    }
    
    /**
     * Gets (as xml) the "FileContent" element
     */
    public org.apache.xmlbeans.XmlBase64Binary xgetFileContent()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBase64Binary target = null;
            target = (org.apache.xmlbeans.XmlBase64Binary)get_store().find_element_user(FILECONTENT$6, 0);
            return target;
        }
    }
    
    /**
     * True if has "FileContent" element
     */
    public boolean isSetFileContent()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(FILECONTENT$6) != 0;
        }
    }
    
    /**
     * Sets the "FileContent" element
     */
    public void setFileContent(byte[] fileContent)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FILECONTENT$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(FILECONTENT$6);
            }
            target.setByteArrayValue(fileContent);
        }
    }
    
    /**
     * Sets (as xml) the "FileContent" element
     */
    public void xsetFileContent(org.apache.xmlbeans.XmlBase64Binary fileContent)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBase64Binary target = null;
            target = (org.apache.xmlbeans.XmlBase64Binary)get_store().find_element_user(FILECONTENT$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBase64Binary)get_store().add_element_user(FILECONTENT$6);
            }
            target.set(fileContent);
        }
    }
    
    /**
     * Unsets the "FileContent" element
     */
    public void unsetFileContent()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(FILECONTENT$6, 0);
        }
    }
    
    /**
     * Gets the "IsExternal" element
     */
    public boolean getIsExternal()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ISEXTERNAL$8, 0);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "IsExternal" element
     */
    public org.apache.xmlbeans.XmlBoolean xgetIsExternal()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(ISEXTERNAL$8, 0);
            return target;
        }
    }
    
    /**
     * Sets the "IsExternal" element
     */
    public void setIsExternal(boolean isExternal)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ISEXTERNAL$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ISEXTERNAL$8);
            }
            target.setBooleanValue(isExternal);
        }
    }
    
    /**
     * Sets (as xml) the "IsExternal" element
     */
    public void xsetIsExternal(org.apache.xmlbeans.XmlBoolean isExternal)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(ISEXTERNAL$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(ISEXTERNAL$8);
            }
            target.set(isExternal);
        }
    }
    
    /**
     * Gets the "Position" element
     */
    public java.math.BigInteger getPosition()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(POSITION$10, 0);
            if (target == null)
            {
                return null;
            }
            return target.getBigIntegerValue();
        }
    }
    
    /**
     * Gets (as xml) the "Position" element
     */
    public org.apache.xmlbeans.XmlInteger xgetPosition()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInteger target = null;
            target = (org.apache.xmlbeans.XmlInteger)get_store().find_element_user(POSITION$10, 0);
            return target;
        }
    }
    
    /**
     * True if has "Position" element
     */
    public boolean isSetPosition()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(POSITION$10) != 0;
        }
    }
    
    /**
     * Sets the "Position" element
     */
    public void setPosition(java.math.BigInteger position)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(POSITION$10, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(POSITION$10);
            }
            target.setBigIntegerValue(position);
        }
    }
    
    /**
     * Sets (as xml) the "Position" element
     */
    public void xsetPosition(org.apache.xmlbeans.XmlInteger position)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInteger target = null;
            target = (org.apache.xmlbeans.XmlInteger)get_store().find_element_user(POSITION$10, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInteger)get_store().add_element_user(POSITION$10);
            }
            target.set(position);
        }
    }
    
    /**
     * Unsets the "Position" element
     */
    public void unsetPosition()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(POSITION$10, 0);
        }
    }
}
