/*
 * XML Type:  TProductPrice
 * Namespace: urn://epages.de/WebService/ProductTypes/2013/01
 * Java type: de.epages.ws.product11.model.TProductPrice
 *
 * Automatically generated - do not modify.
 */
package de.epages.ws.product11.model.impl;
/**
 * An XML TProductPrice(@urn://epages.de/WebService/ProductTypes/2013/01).
 *
 * This is a complex type.
 */
public class TProductPriceImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements de.epages.ws.product11.model.TProductPrice
{
    
    public TProductPriceImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName PRICE$0 = 
        new javax.xml.namespace.QName("", "Price");
    private static final javax.xml.namespace.QName CURRENCYID$2 = 
        new javax.xml.namespace.QName("", "CurrencyID");
    private static final javax.xml.namespace.QName TAXMODEL$4 = 
        new javax.xml.namespace.QName("", "TaxModel");
    
    
    /**
     * Gets the "Price" element
     */
    public float getPrice()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PRICE$0, 0);
            if (target == null)
            {
                return 0.0f;
            }
            return target.getFloatValue();
        }
    }
    
    /**
     * Gets (as xml) the "Price" element
     */
    public org.apache.xmlbeans.XmlFloat xgetPrice()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlFloat target = null;
            target = (org.apache.xmlbeans.XmlFloat)get_store().find_element_user(PRICE$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "Price" element
     */
    public void setPrice(float price)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PRICE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PRICE$0);
            }
            target.setFloatValue(price);
        }
    }
    
    /**
     * Sets (as xml) the "Price" element
     */
    public void xsetPrice(org.apache.xmlbeans.XmlFloat price)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlFloat target = null;
            target = (org.apache.xmlbeans.XmlFloat)get_store().find_element_user(PRICE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlFloat)get_store().add_element_user(PRICE$0);
            }
            target.set(price);
        }
    }
    
    /**
     * Gets the "CurrencyID" element
     */
    public java.lang.String getCurrencyID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CURRENCYID$2, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "CurrencyID" element
     */
    public org.apache.xmlbeans.XmlString xgetCurrencyID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CURRENCYID$2, 0);
            return target;
        }
    }
    
    /**
     * Sets the "CurrencyID" element
     */
    public void setCurrencyID(java.lang.String currencyID)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CURRENCYID$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CURRENCYID$2);
            }
            target.setStringValue(currencyID);
        }
    }
    
    /**
     * Sets (as xml) the "CurrencyID" element
     */
    public void xsetCurrencyID(org.apache.xmlbeans.XmlString currencyID)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CURRENCYID$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(CURRENCYID$2);
            }
            target.set(currencyID);
        }
    }
    
    /**
     * Gets the "TaxModel" element
     */
    public java.lang.String getTaxModel()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TAXMODEL$4, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "TaxModel" element
     */
    public org.apache.xmlbeans.XmlString xgetTaxModel()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(TAXMODEL$4, 0);
            return target;
        }
    }
    
    /**
     * Sets the "TaxModel" element
     */
    public void setTaxModel(java.lang.String taxModel)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TAXMODEL$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TAXMODEL$4);
            }
            target.setStringValue(taxModel);
        }
    }
    
    /**
     * Sets (as xml) the "TaxModel" element
     */
    public void xsetTaxModel(org.apache.xmlbeans.XmlString taxModel)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(TAXMODEL$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(TAXMODEL$4);
            }
            target.set(taxModel);
        }
    }
}
