/*
 * XML Type:  TCreate_Input
 * Namespace: urn://epages.de/WebService/ProductTypes/2013/01
 * Java type: de.epages.ws.product11.model.TCreateInput
 *
 * Automatically generated - do not modify.
 */
package de.epages.ws.product11.model;


/**
 * An XML TCreate_Input(@urn://epages.de/WebService/ProductTypes/2013/01).
 *
 * This is a complex type.
 */
public interface TCreateInput extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(TCreateInput.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s5C6BD768D9DEE5CC9F063BA9099B8004").resolveHandle("tcreateinput0cc3type");
    
    /**
     * Gets the "Alias" element
     */
    java.lang.String getAlias();
    
    /**
     * Gets (as xml) the "Alias" element
     */
    org.apache.xmlbeans.XmlString xgetAlias();
    
    /**
     * Sets the "Alias" element
     */
    void setAlias(java.lang.String alias);
    
    /**
     * Sets (as xml) the "Alias" element
     */
    void xsetAlias(org.apache.xmlbeans.XmlString alias);
    
    /**
     * Gets the "Class" element
     */
    java.lang.String getClass1();
    
    /**
     * Gets (as xml) the "Class" element
     */
    org.apache.xmlbeans.XmlString xgetClass1();
    
    /**
     * True if has "Class" element
     */
    boolean isSetClass1();
    
    /**
     * Sets the "Class" element
     */
    void setClass1(java.lang.String class1);
    
    /**
     * Sets (as xml) the "Class" element
     */
    void xsetClass1(org.apache.xmlbeans.XmlString class1);
    
    /**
     * Unsets the "Class" element
     */
    void unsetClass1();
    
    /**
     * Gets the "Name" element
     */
    de.epages.ws.common.model.ListOfLocalizedValues getName();
    
    /**
     * True if has "Name" element
     */
    boolean isSetName();
    
    /**
     * Sets the "Name" element
     */
    void setName(de.epages.ws.common.model.ListOfLocalizedValues name);
    
    /**
     * Appends and returns a new empty "Name" element
     */
    de.epages.ws.common.model.ListOfLocalizedValues addNewName();
    
    /**
     * Unsets the "Name" element
     */
    void unsetName();
    
    /**
     * Gets the "Description" element
     */
    de.epages.ws.common.model.ListOfLocalizedValues getDescription();
    
    /**
     * True if has "Description" element
     */
    boolean isSetDescription();
    
    /**
     * Sets the "Description" element
     */
    void setDescription(de.epages.ws.common.model.ListOfLocalizedValues description);
    
    /**
     * Appends and returns a new empty "Description" element
     */
    de.epages.ws.common.model.ListOfLocalizedValues addNewDescription();
    
    /**
     * Unsets the "Description" element
     */
    void unsetDescription();
    
    /**
     * Gets the "Text" element
     */
    de.epages.ws.common.model.ListOfLocalizedValues getText();
    
    /**
     * True if has "Text" element
     */
    boolean isSetText();
    
    /**
     * Sets the "Text" element
     */
    void setText(de.epages.ws.common.model.ListOfLocalizedValues text);
    
    /**
     * Appends and returns a new empty "Text" element
     */
    de.epages.ws.common.model.ListOfLocalizedValues addNewText();
    
    /**
     * Unsets the "Text" element
     */
    void unsetText();
    
    /**
     * Gets the "Keywords" element
     */
    de.epages.ws.common.model.ListOfLocalizedValues getKeywords();
    
    /**
     * True if has "Keywords" element
     */
    boolean isSetKeywords();
    
    /**
     * Sets the "Keywords" element
     */
    void setKeywords(de.epages.ws.common.model.ListOfLocalizedValues keywords);
    
    /**
     * Appends and returns a new empty "Keywords" element
     */
    de.epages.ws.common.model.ListOfLocalizedValues addNewKeywords();
    
    /**
     * Unsets the "Keywords" element
     */
    void unsetKeywords();
    
    /**
     * Gets the "MainCharacteristics" element
     */
    de.epages.ws.common.model.ListOfLocalizedValues getMainCharacteristics();
    
    /**
     * True if has "MainCharacteristics" element
     */
    boolean isSetMainCharacteristics();
    
    /**
     * Sets the "MainCharacteristics" element
     */
    void setMainCharacteristics(de.epages.ws.common.model.ListOfLocalizedValues mainCharacteristics);
    
    /**
     * Appends and returns a new empty "MainCharacteristics" element
     */
    de.epages.ws.common.model.ListOfLocalizedValues addNewMainCharacteristics();
    
    /**
     * Unsets the "MainCharacteristics" element
     */
    void unsetMainCharacteristics();
    
    /**
     * Gets the "Title" element
     */
    de.epages.ws.common.model.ListOfLocalizedValues getTitle();
    
    /**
     * True if has "Title" element
     */
    boolean isSetTitle();
    
    /**
     * Sets the "Title" element
     */
    void setTitle(de.epages.ws.common.model.ListOfLocalizedValues title);
    
    /**
     * Appends and returns a new empty "Title" element
     */
    de.epages.ws.common.model.ListOfLocalizedValues addNewTitle();
    
    /**
     * Unsets the "Title" element
     */
    void unsetTitle();
    
    /**
     * Gets the "TaxClass" element
     */
    java.lang.String getTaxClass();
    
    /**
     * Gets (as xml) the "TaxClass" element
     */
    org.apache.xmlbeans.XmlString xgetTaxClass();
    
    /**
     * Sets the "TaxClass" element
     */
    void setTaxClass(java.lang.String taxClass);
    
    /**
     * Sets (as xml) the "TaxClass" element
     */
    void xsetTaxClass(org.apache.xmlbeans.XmlString taxClass);
    
    /**
     * Gets the "IsVisible" element
     */
    boolean getIsVisible();
    
    /**
     * Gets (as xml) the "IsVisible" element
     */
    org.apache.xmlbeans.XmlBoolean xgetIsVisible();
    
    /**
     * True if has "IsVisible" element
     */
    boolean isSetIsVisible();
    
    /**
     * Sets the "IsVisible" element
     */
    void setIsVisible(boolean isVisible);
    
    /**
     * Sets (as xml) the "IsVisible" element
     */
    void xsetIsVisible(org.apache.xmlbeans.XmlBoolean isVisible);
    
    /**
     * Unsets the "IsVisible" element
     */
    void unsetIsVisible();
    
    /**
     * Gets the "IsNew" element
     */
    boolean getIsNew();
    
    /**
     * Gets (as xml) the "IsNew" element
     */
    org.apache.xmlbeans.XmlBoolean xgetIsNew();
    
    /**
     * True if has "IsNew" element
     */
    boolean isSetIsNew();
    
    /**
     * Sets the "IsNew" element
     */
    void setIsNew(boolean isNew);
    
    /**
     * Sets (as xml) the "IsNew" element
     */
    void xsetIsNew(org.apache.xmlbeans.XmlBoolean isNew);
    
    /**
     * Unsets the "IsNew" element
     */
    void unsetIsNew();
    
    /**
     * Gets the "IsDailyPrice" element
     */
    boolean getIsDailyPrice();
    
    /**
     * Gets (as xml) the "IsDailyPrice" element
     */
    org.apache.xmlbeans.XmlBoolean xgetIsDailyPrice();
    
    /**
     * True if has "IsDailyPrice" element
     */
    boolean isSetIsDailyPrice();
    
    /**
     * Sets the "IsDailyPrice" element
     */
    void setIsDailyPrice(boolean isDailyPrice);
    
    /**
     * Sets (as xml) the "IsDailyPrice" element
     */
    void xsetIsDailyPrice(org.apache.xmlbeans.XmlBoolean isDailyPrice);
    
    /**
     * Unsets the "IsDailyPrice" element
     */
    void unsetIsDailyPrice();
    
    /**
     * Gets the "OrderUnit" element
     */
    java.lang.String getOrderUnit();
    
    /**
     * Gets (as xml) the "OrderUnit" element
     */
    org.apache.xmlbeans.XmlString xgetOrderUnit();
    
    /**
     * True if has "OrderUnit" element
     */
    boolean isSetOrderUnit();
    
    /**
     * Sets the "OrderUnit" element
     */
    void setOrderUnit(java.lang.String orderUnit);
    
    /**
     * Sets (as xml) the "OrderUnit" element
     */
    void xsetOrderUnit(org.apache.xmlbeans.XmlString orderUnit);
    
    /**
     * Unsets the "OrderUnit" element
     */
    void unsetOrderUnit();
    
    /**
     * Gets the "PriceQuantity" element
     */
    float getPriceQuantity();
    
    /**
     * Gets (as xml) the "PriceQuantity" element
     */
    org.apache.xmlbeans.XmlFloat xgetPriceQuantity();
    
    /**
     * True if has "PriceQuantity" element
     */
    boolean isSetPriceQuantity();
    
    /**
     * Sets the "PriceQuantity" element
     */
    void setPriceQuantity(float priceQuantity);
    
    /**
     * Sets (as xml) the "PriceQuantity" element
     */
    void xsetPriceQuantity(org.apache.xmlbeans.XmlFloat priceQuantity);
    
    /**
     * Unsets the "PriceQuantity" element
     */
    void unsetPriceQuantity();
    
    /**
     * Gets the "MinOrder" element
     */
    float getMinOrder();
    
    /**
     * Gets (as xml) the "MinOrder" element
     */
    org.apache.xmlbeans.XmlFloat xgetMinOrder();
    
    /**
     * True if has "MinOrder" element
     */
    boolean isSetMinOrder();
    
    /**
     * Sets the "MinOrder" element
     */
    void setMinOrder(float minOrder);
    
    /**
     * Sets (as xml) the "MinOrder" element
     */
    void xsetMinOrder(org.apache.xmlbeans.XmlFloat minOrder);
    
    /**
     * Unsets the "MinOrder" element
     */
    void unsetMinOrder();
    
    /**
     * Gets the "IntervalOrder" element
     */
    float getIntervalOrder();
    
    /**
     * Gets (as xml) the "IntervalOrder" element
     */
    org.apache.xmlbeans.XmlFloat xgetIntervalOrder();
    
    /**
     * True if has "IntervalOrder" element
     */
    boolean isSetIntervalOrder();
    
    /**
     * Sets the "IntervalOrder" element
     */
    void setIntervalOrder(float intervalOrder);
    
    /**
     * Sets (as xml) the "IntervalOrder" element
     */
    void xsetIntervalOrder(org.apache.xmlbeans.XmlFloat intervalOrder);
    
    /**
     * Unsets the "IntervalOrder" element
     */
    void unsetIntervalOrder();
    
    /**
     * Gets the "WeightUnit" element
     */
    java.lang.String getWeightUnit();
    
    /**
     * Gets (as xml) the "WeightUnit" element
     */
    org.apache.xmlbeans.XmlString xgetWeightUnit();
    
    /**
     * True if has "WeightUnit" element
     */
    boolean isSetWeightUnit();
    
    /**
     * Sets the "WeightUnit" element
     */
    void setWeightUnit(java.lang.String weightUnit);
    
    /**
     * Sets (as xml) the "WeightUnit" element
     */
    void xsetWeightUnit(org.apache.xmlbeans.XmlString weightUnit);
    
    /**
     * Unsets the "WeightUnit" element
     */
    void unsetWeightUnit();
    
    /**
     * Gets the "Weight" element
     */
    float getWeight();
    
    /**
     * Gets (as xml) the "Weight" element
     */
    org.apache.xmlbeans.XmlFloat xgetWeight();
    
    /**
     * True if has "Weight" element
     */
    boolean isSetWeight();
    
    /**
     * Sets the "Weight" element
     */
    void setWeight(float weight);
    
    /**
     * Sets (as xml) the "Weight" element
     */
    void xsetWeight(org.apache.xmlbeans.XmlFloat weight);
    
    /**
     * Unsets the "Weight" element
     */
    void unsetWeight();
    
    /**
     * Gets the "RefUnit" element
     */
    java.lang.String getRefUnit();
    
    /**
     * Gets (as xml) the "RefUnit" element
     */
    org.apache.xmlbeans.XmlString xgetRefUnit();
    
    /**
     * True if has "RefUnit" element
     */
    boolean isSetRefUnit();
    
    /**
     * Sets the "RefUnit" element
     */
    void setRefUnit(java.lang.String refUnit);
    
    /**
     * Sets (as xml) the "RefUnit" element
     */
    void xsetRefUnit(org.apache.xmlbeans.XmlString refUnit);
    
    /**
     * Unsets the "RefUnit" element
     */
    void unsetRefUnit();
    
    /**
     * Gets the "RefAmount" element
     */
    float getRefAmount();
    
    /**
     * Gets (as xml) the "RefAmount" element
     */
    org.apache.xmlbeans.XmlFloat xgetRefAmount();
    
    /**
     * True if has "RefAmount" element
     */
    boolean isSetRefAmount();
    
    /**
     * Sets the "RefAmount" element
     */
    void setRefAmount(float refAmount);
    
    /**
     * Sets (as xml) the "RefAmount" element
     */
    void xsetRefAmount(org.apache.xmlbeans.XmlFloat refAmount);
    
    /**
     * Unsets the "RefAmount" element
     */
    void unsetRefAmount();
    
    /**
     * Gets the "RefContentAmount" element
     */
    float getRefContentAmount();
    
    /**
     * Gets (as xml) the "RefContentAmount" element
     */
    org.apache.xmlbeans.XmlFloat xgetRefContentAmount();
    
    /**
     * True if has "RefContentAmount" element
     */
    boolean isSetRefContentAmount();
    
    /**
     * Sets the "RefContentAmount" element
     */
    void setRefContentAmount(float refContentAmount);
    
    /**
     * Sets (as xml) the "RefContentAmount" element
     */
    void xsetRefContentAmount(org.apache.xmlbeans.XmlFloat refContentAmount);
    
    /**
     * Unsets the "RefContentAmount" element
     */
    void unsetRefContentAmount();
    
    /**
     * Gets the "StockLevel" element
     */
    float getStockLevel();
    
    /**
     * Gets (as xml) the "StockLevel" element
     */
    org.apache.xmlbeans.XmlFloat xgetStockLevel();
    
    /**
     * True if has "StockLevel" element
     */
    boolean isSetStockLevel();
    
    /**
     * Sets the "StockLevel" element
     */
    void setStockLevel(float stockLevel);
    
    /**
     * Sets (as xml) the "StockLevel" element
     */
    void xsetStockLevel(org.apache.xmlbeans.XmlFloat stockLevel);
    
    /**
     * Unsets the "StockLevel" element
     */
    void unsetStockLevel();
    
    /**
     * Gets the "StockLevelAlert" element
     */
    float getStockLevelAlert();
    
    /**
     * Gets (as xml) the "StockLevelAlert" element
     */
    org.apache.xmlbeans.XmlFloat xgetStockLevelAlert();
    
    /**
     * True if has "StockLevelAlert" element
     */
    boolean isSetStockLevelAlert();
    
    /**
     * Sets the "StockLevelAlert" element
     */
    void setStockLevelAlert(float stockLevelAlert);
    
    /**
     * Sets (as xml) the "StockLevelAlert" element
     */
    void xsetStockLevelAlert(org.apache.xmlbeans.XmlFloat stockLevelAlert);
    
    /**
     * Unsets the "StockLevelAlert" element
     */
    void unsetStockLevelAlert();
    
    /**
     * Gets the "Manufacturer" element
     */
    java.lang.String getManufacturer();
    
    /**
     * Gets (as xml) the "Manufacturer" element
     */
    org.apache.xmlbeans.XmlString xgetManufacturer();
    
    /**
     * True if has "Manufacturer" element
     */
    boolean isSetManufacturer();
    
    /**
     * Sets the "Manufacturer" element
     */
    void setManufacturer(java.lang.String manufacturer);
    
    /**
     * Sets (as xml) the "Manufacturer" element
     */
    void xsetManufacturer(org.apache.xmlbeans.XmlString manufacturer);
    
    /**
     * Unsets the "Manufacturer" element
     */
    void unsetManufacturer();
    
    /**
     * Gets the "ManufacturerSKU" element
     */
    java.lang.String getManufacturerSKU();
    
    /**
     * Gets (as xml) the "ManufacturerSKU" element
     */
    org.apache.xmlbeans.XmlString xgetManufacturerSKU();
    
    /**
     * True if has "ManufacturerSKU" element
     */
    boolean isSetManufacturerSKU();
    
    /**
     * Sets the "ManufacturerSKU" element
     */
    void setManufacturerSKU(java.lang.String manufacturerSKU);
    
    /**
     * Sets (as xml) the "ManufacturerSKU" element
     */
    void xsetManufacturerSKU(org.apache.xmlbeans.XmlString manufacturerSKU);
    
    /**
     * Unsets the "ManufacturerSKU" element
     */
    void unsetManufacturerSKU();
    
    /**
     * Gets the "DeliveryPeriod" element
     */
    java.lang.String getDeliveryPeriod();
    
    /**
     * Gets (as xml) the "DeliveryPeriod" element
     */
    org.apache.xmlbeans.XmlString xgetDeliveryPeriod();
    
    /**
     * True if has "DeliveryPeriod" element
     */
    boolean isSetDeliveryPeriod();
    
    /**
     * Sets the "DeliveryPeriod" element
     */
    void setDeliveryPeriod(java.lang.String deliveryPeriod);
    
    /**
     * Sets (as xml) the "DeliveryPeriod" element
     */
    void xsetDeliveryPeriod(org.apache.xmlbeans.XmlString deliveryPeriod);
    
    /**
     * Unsets the "DeliveryPeriod" element
     */
    void unsetDeliveryPeriod();
    
    /**
     * Gets the "Length" element
     */
    float getLength();
    
    /**
     * Gets (as xml) the "Length" element
     */
    org.apache.xmlbeans.XmlFloat xgetLength();
    
    /**
     * True if has "Length" element
     */
    boolean isSetLength();
    
    /**
     * Sets the "Length" element
     */
    void setLength(float length);
    
    /**
     * Sets (as xml) the "Length" element
     */
    void xsetLength(org.apache.xmlbeans.XmlFloat length);
    
    /**
     * Unsets the "Length" element
     */
    void unsetLength();
    
    /**
     * Gets the "Width" element
     */
    float getWidth();
    
    /**
     * Gets (as xml) the "Width" element
     */
    org.apache.xmlbeans.XmlFloat xgetWidth();
    
    /**
     * True if has "Width" element
     */
    boolean isSetWidth();
    
    /**
     * Sets the "Width" element
     */
    void setWidth(float width);
    
    /**
     * Sets (as xml) the "Width" element
     */
    void xsetWidth(org.apache.xmlbeans.XmlFloat width);
    
    /**
     * Unsets the "Width" element
     */
    void unsetWidth();
    
    /**
     * Gets the "Height" element
     */
    float getHeight();
    
    /**
     * Gets (as xml) the "Height" element
     */
    org.apache.xmlbeans.XmlFloat xgetHeight();
    
    /**
     * True if has "Height" element
     */
    boolean isSetHeight();
    
    /**
     * Sets the "Height" element
     */
    void setHeight(float height);
    
    /**
     * Sets (as xml) the "Height" element
     */
    void xsetHeight(org.apache.xmlbeans.XmlFloat height);
    
    /**
     * Unsets the "Height" element
     */
    void unsetHeight();
    
    /**
     * Gets the "IsAvailable" element
     */
    boolean getIsAvailable();
    
    /**
     * Gets (as xml) the "IsAvailable" element
     */
    org.apache.xmlbeans.XmlBoolean xgetIsAvailable();
    
    /**
     * True if has "IsAvailable" element
     */
    boolean isSetIsAvailable();
    
    /**
     * Sets the "IsAvailable" element
     */
    void setIsAvailable(boolean isAvailable);
    
    /**
     * Sets (as xml) the "IsAvailable" element
     */
    void xsetIsAvailable(org.apache.xmlbeans.XmlBoolean isAvailable);
    
    /**
     * Unsets the "IsAvailable" element
     */
    void unsetIsAvailable();
    
    /**
     * Gets the "AvailabilityComment" element
     */
    de.epages.ws.common.model.ListOfLocalizedValues getAvailabilityComment();
    
    /**
     * True if has "AvailabilityComment" element
     */
    boolean isSetAvailabilityComment();
    
    /**
     * Sets the "AvailabilityComment" element
     */
    void setAvailabilityComment(de.epages.ws.common.model.ListOfLocalizedValues availabilityComment);
    
    /**
     * Appends and returns a new empty "AvailabilityComment" element
     */
    de.epages.ws.common.model.ListOfLocalizedValues addNewAvailabilityComment();
    
    /**
     * Unsets the "AvailabilityComment" element
     */
    void unsetAvailabilityComment();
    
    /**
     * Gets the "AvailabilityDate" element
     */
    java.util.Calendar getAvailabilityDate();
    
    /**
     * Gets (as xml) the "AvailabilityDate" element
     */
    org.apache.xmlbeans.XmlDateTime xgetAvailabilityDate();
    
    /**
     * True if has "AvailabilityDate" element
     */
    boolean isSetAvailabilityDate();
    
    /**
     * Sets the "AvailabilityDate" element
     */
    void setAvailabilityDate(java.util.Calendar availabilityDate);
    
    /**
     * Sets (as xml) the "AvailabilityDate" element
     */
    void xsetAvailabilityDate(org.apache.xmlbeans.XmlDateTime availabilityDate);
    
    /**
     * Unsets the "AvailabilityDate" element
     */
    void unsetAvailabilityDate();
    
    /**
     * Gets the "URI" element
     */
    de.epages.ws.common.model.ListOfLocalizedValues getURI();
    
    /**
     * True if has "URI" element
     */
    boolean isSetURI();
    
    /**
     * Sets the "URI" element
     */
    void setURI(de.epages.ws.common.model.ListOfLocalizedValues uri);
    
    /**
     * Appends and returns a new empty "URI" element
     */
    de.epages.ws.common.model.ListOfLocalizedValues addNewURI();
    
    /**
     * Unsets the "URI" element
     */
    void unsetURI();
    
    /**
     * Gets the "IsDownloadProduct" element
     */
    boolean getIsDownloadProduct();
    
    /**
     * Gets (as xml) the "IsDownloadProduct" element
     */
    org.apache.xmlbeans.XmlBoolean xgetIsDownloadProduct();
    
    /**
     * Sets the "IsDownloadProduct" element
     */
    void setIsDownloadProduct(boolean isDownloadProduct);
    
    /**
     * Sets (as xml) the "IsDownloadProduct" element
     */
    void xsetIsDownloadProduct(org.apache.xmlbeans.XmlBoolean isDownloadProduct);
    
    /**
     * Gets the "MaxDownloadTime" element
     */
    java.math.BigInteger getMaxDownloadTime();
    
    /**
     * Gets (as xml) the "MaxDownloadTime" element
     */
    org.apache.xmlbeans.XmlInteger xgetMaxDownloadTime();
    
    /**
     * True if has "MaxDownloadTime" element
     */
    boolean isSetMaxDownloadTime();
    
    /**
     * Sets the "MaxDownloadTime" element
     */
    void setMaxDownloadTime(java.math.BigInteger maxDownloadTime);
    
    /**
     * Sets (as xml) the "MaxDownloadTime" element
     */
    void xsetMaxDownloadTime(org.apache.xmlbeans.XmlInteger maxDownloadTime);
    
    /**
     * Unsets the "MaxDownloadTime" element
     */
    void unsetMaxDownloadTime();
    
    /**
     * Gets the "MaxDownloadCount" element
     */
    java.math.BigInteger getMaxDownloadCount();
    
    /**
     * Gets (as xml) the "MaxDownloadCount" element
     */
    org.apache.xmlbeans.XmlInteger xgetMaxDownloadCount();
    
    /**
     * True if has "MaxDownloadCount" element
     */
    boolean isSetMaxDownloadCount();
    
    /**
     * Sets the "MaxDownloadCount" element
     */
    void setMaxDownloadCount(java.math.BigInteger maxDownloadCount);
    
    /**
     * Sets (as xml) the "MaxDownloadCount" element
     */
    void xsetMaxDownloadCount(org.apache.xmlbeans.XmlInteger maxDownloadCount);
    
    /**
     * Unsets the "MaxDownloadCount" element
     */
    void unsetMaxDownloadCount();
    
    /**
     * Gets the "DownloadProductMaps" element
     */
    de.epages.ws.product11.model.ListOfDownloads getDownloadProductMaps();
    
    /**
     * True if has "DownloadProductMaps" element
     */
    boolean isSetDownloadProductMaps();
    
    /**
     * Sets the "DownloadProductMaps" element
     */
    void setDownloadProductMaps(de.epages.ws.product11.model.ListOfDownloads downloadProductMaps);
    
    /**
     * Appends and returns a new empty "DownloadProductMaps" element
     */
    de.epages.ws.product11.model.ListOfDownloads addNewDownloadProductMaps();
    
    /**
     * Unsets the "DownloadProductMaps" element
     */
    void unsetDownloadProductMaps();
    
    /**
     * Gets the "SuperProduct" element
     */
    java.lang.String getSuperProduct();
    
    /**
     * Gets (as xml) the "SuperProduct" element
     */
    org.apache.xmlbeans.XmlString xgetSuperProduct();
    
    /**
     * True if has "SuperProduct" element
     */
    boolean isSetSuperProduct();
    
    /**
     * Sets the "SuperProduct" element
     */
    void setSuperProduct(java.lang.String superProduct);
    
    /**
     * Sets (as xml) the "SuperProduct" element
     */
    void xsetSuperProduct(org.apache.xmlbeans.XmlString superProduct);
    
    /**
     * Unsets the "SuperProduct" element
     */
    void unsetSuperProduct();
    
    /**
     * Gets the "DefaultSubProduct" element
     */
    java.lang.String getDefaultSubProduct();
    
    /**
     * Gets (as xml) the "DefaultSubProduct" element
     */
    org.apache.xmlbeans.XmlString xgetDefaultSubProduct();
    
    /**
     * True if has "DefaultSubProduct" element
     */
    boolean isSetDefaultSubProduct();
    
    /**
     * Sets the "DefaultSubProduct" element
     */
    void setDefaultSubProduct(java.lang.String defaultSubProduct);
    
    /**
     * Sets (as xml) the "DefaultSubProduct" element
     */
    void xsetDefaultSubProduct(org.apache.xmlbeans.XmlString defaultSubProduct);
    
    /**
     * Unsets the "DefaultSubProduct" element
     */
    void unsetDefaultSubProduct();
    
    /**
     * Gets the "IsDefault" element
     */
    boolean getIsDefault();
    
    /**
     * Gets (as xml) the "IsDefault" element
     */
    org.apache.xmlbeans.XmlBoolean xgetIsDefault();
    
    /**
     * True if has "IsDefault" element
     */
    boolean isSetIsDefault();
    
    /**
     * Sets the "IsDefault" element
     */
    void setIsDefault(boolean isDefault);
    
    /**
     * Sets (as xml) the "IsDefault" element
     */
    void xsetIsDefault(org.apache.xmlbeans.XmlBoolean isDefault);
    
    /**
     * Unsets the "IsDefault" element
     */
    void unsetIsDefault();
    
    /**
     * Gets the "HasSubOwnPrices" element
     */
    boolean getHasSubOwnPrices();
    
    /**
     * Gets (as xml) the "HasSubOwnPrices" element
     */
    org.apache.xmlbeans.XmlBoolean xgetHasSubOwnPrices();
    
    /**
     * True if has "HasSubOwnPrices" element
     */
    boolean isSetHasSubOwnPrices();
    
    /**
     * Sets the "HasSubOwnPrices" element
     */
    void setHasSubOwnPrices(boolean hasSubOwnPrices);
    
    /**
     * Sets (as xml) the "HasSubOwnPrices" element
     */
    void xsetHasSubOwnPrices(org.apache.xmlbeans.XmlBoolean hasSubOwnPrices);
    
    /**
     * Unsets the "HasSubOwnPrices" element
     */
    void unsetHasSubOwnPrices();
    
    /**
     * Gets the "VariationAttributes" element
     */
    de.epages.ws.common.model.ListOfAttributes getVariationAttributes();
    
    /**
     * True if has "VariationAttributes" element
     */
    boolean isSetVariationAttributes();
    
    /**
     * Sets the "VariationAttributes" element
     */
    void setVariationAttributes(de.epages.ws.common.model.ListOfAttributes variationAttributes);
    
    /**
     * Appends and returns a new empty "VariationAttributes" element
     */
    de.epages.ws.common.model.ListOfAttributes addNewVariationAttributes();
    
    /**
     * Unsets the "VariationAttributes" element
     */
    void unsetVariationAttributes();
    
    /**
     * Gets the "ProductPrices" element
     */
    de.epages.ws.product11.model.ListOfProductPrices getProductPrices();
    
    /**
     * True if has "ProductPrices" element
     */
    boolean isSetProductPrices();
    
    /**
     * Sets the "ProductPrices" element
     */
    void setProductPrices(de.epages.ws.product11.model.ListOfProductPrices productPrices);
    
    /**
     * Appends and returns a new empty "ProductPrices" element
     */
    de.epages.ws.product11.model.ListOfProductPrices addNewProductPrices();
    
    /**
     * Unsets the "ProductPrices" element
     */
    void unsetProductPrices();
    
    /**
     * Gets the "ManufacturerPrices" element
     */
    de.epages.ws.product11.model.ListOfProductPrices getManufacturerPrices();
    
    /**
     * True if has "ManufacturerPrices" element
     */
    boolean isSetManufacturerPrices();
    
    /**
     * Sets the "ManufacturerPrices" element
     */
    void setManufacturerPrices(de.epages.ws.product11.model.ListOfProductPrices manufacturerPrices);
    
    /**
     * Appends and returns a new empty "ManufacturerPrices" element
     */
    de.epages.ws.product11.model.ListOfProductPrices addNewManufacturerPrices();
    
    /**
     * Unsets the "ManufacturerPrices" element
     */
    void unsetManufacturerPrices();
    
    /**
     * Gets the "DepositPrices" element
     */
    de.epages.ws.product11.model.ListOfProductPrices getDepositPrices();
    
    /**
     * True if has "DepositPrices" element
     */
    boolean isSetDepositPrices();
    
    /**
     * Sets the "DepositPrices" element
     */
    void setDepositPrices(de.epages.ws.product11.model.ListOfProductPrices depositPrices);
    
    /**
     * Appends and returns a new empty "DepositPrices" element
     */
    de.epages.ws.product11.model.ListOfProductPrices addNewDepositPrices();
    
    /**
     * Unsets the "DepositPrices" element
     */
    void unsetDepositPrices();
    
    /**
     * Gets the "EcoParticipationPrices" element
     */
    de.epages.ws.product11.model.ListOfProductPrices getEcoParticipationPrices();
    
    /**
     * True if has "EcoParticipationPrices" element
     */
    boolean isSetEcoParticipationPrices();
    
    /**
     * Sets the "EcoParticipationPrices" element
     */
    void setEcoParticipationPrices(de.epages.ws.product11.model.ListOfProductPrices ecoParticipationPrices);
    
    /**
     * Appends and returns a new empty "EcoParticipationPrices" element
     */
    de.epages.ws.product11.model.ListOfProductPrices addNewEcoParticipationPrices();
    
    /**
     * Unsets the "EcoParticipationPrices" element
     */
    void unsetEcoParticipationPrices();
    
    /**
     * Gets the "PrepaymentPrices" element
     */
    de.epages.ws.product11.model.ListOfProductPrices getPrepaymentPrices();
    
    /**
     * True if has "PrepaymentPrices" element
     */
    boolean isSetPrepaymentPrices();
    
    /**
     * Sets the "PrepaymentPrices" element
     */
    void setPrepaymentPrices(de.epages.ws.product11.model.ListOfProductPrices prepaymentPrices);
    
    /**
     * Appends and returns a new empty "PrepaymentPrices" element
     */
    de.epages.ws.product11.model.ListOfProductPrices addNewPrepaymentPrices();
    
    /**
     * Unsets the "PrepaymentPrices" element
     */
    void unsetPrepaymentPrices();
    
    /**
     * Gets the "PrepaymentType" element
     */
    java.lang.String getPrepaymentType();
    
    /**
     * Gets (as xml) the "PrepaymentType" element
     */
    org.apache.xmlbeans.XmlString xgetPrepaymentType();
    
    /**
     * True if has "PrepaymentType" element
     */
    boolean isSetPrepaymentType();
    
    /**
     * Sets the "PrepaymentType" element
     */
    void setPrepaymentType(java.lang.String prepaymentType);
    
    /**
     * Sets (as xml) the "PrepaymentType" element
     */
    void xsetPrepaymentType(org.apache.xmlbeans.XmlString prepaymentType);
    
    /**
     * Unsets the "PrepaymentType" element
     */
    void unsetPrepaymentType();
    
    /**
     * Gets the "PrepaymentValue" element
     */
    float getPrepaymentValue();
    
    /**
     * Gets (as xml) the "PrepaymentValue" element
     */
    org.apache.xmlbeans.XmlFloat xgetPrepaymentValue();
    
    /**
     * True if has "PrepaymentValue" element
     */
    boolean isSetPrepaymentValue();
    
    /**
     * Sets the "PrepaymentValue" element
     */
    void setPrepaymentValue(float prepaymentValue);
    
    /**
     * Sets (as xml) the "PrepaymentValue" element
     */
    void xsetPrepaymentValue(org.apache.xmlbeans.XmlFloat prepaymentValue);
    
    /**
     * Unsets the "PrepaymentValue" element
     */
    void unsetPrepaymentValue();
    
    /**
     * Gets the "ShippingMethods" element
     */
    de.epages.ws.product11.model.ListOfShippingMethods getShippingMethods();
    
    /**
     * True if has "ShippingMethods" element
     */
    boolean isSetShippingMethods();
    
    /**
     * Sets the "ShippingMethods" element
     */
    void setShippingMethods(de.epages.ws.product11.model.ListOfShippingMethods shippingMethods);
    
    /**
     * Appends and returns a new empty "ShippingMethods" element
     */
    de.epages.ws.product11.model.ListOfShippingMethods addNewShippingMethods();
    
    /**
     * Unsets the "ShippingMethods" element
     */
    void unsetShippingMethods();
    
    /**
     * Gets the "Attributes" element
     */
    de.epages.ws.product11.model.ListOfAttributes getAttributes();
    
    /**
     * True if has "Attributes" element
     */
    boolean isSetAttributes();
    
    /**
     * Sets the "Attributes" element
     */
    void setAttributes(de.epages.ws.product11.model.ListOfAttributes attributes);
    
    /**
     * Appends and returns a new empty "Attributes" element
     */
    de.epages.ws.product11.model.ListOfAttributes addNewAttributes();
    
    /**
     * Unsets the "Attributes" element
     */
    void unsetAttributes();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static de.epages.ws.product11.model.TCreateInput newInstance() {
          return (de.epages.ws.product11.model.TCreateInput) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static de.epages.ws.product11.model.TCreateInput newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (de.epages.ws.product11.model.TCreateInput) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static de.epages.ws.product11.model.TCreateInput parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (de.epages.ws.product11.model.TCreateInput) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static de.epages.ws.product11.model.TCreateInput parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (de.epages.ws.product11.model.TCreateInput) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static de.epages.ws.product11.model.TCreateInput parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (de.epages.ws.product11.model.TCreateInput) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static de.epages.ws.product11.model.TCreateInput parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (de.epages.ws.product11.model.TCreateInput) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static de.epages.ws.product11.model.TCreateInput parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (de.epages.ws.product11.model.TCreateInput) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static de.epages.ws.product11.model.TCreateInput parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (de.epages.ws.product11.model.TCreateInput) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static de.epages.ws.product11.model.TCreateInput parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (de.epages.ws.product11.model.TCreateInput) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static de.epages.ws.product11.model.TCreateInput parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (de.epages.ws.product11.model.TCreateInput) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static de.epages.ws.product11.model.TCreateInput parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (de.epages.ws.product11.model.TCreateInput) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static de.epages.ws.product11.model.TCreateInput parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (de.epages.ws.product11.model.TCreateInput) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static de.epages.ws.product11.model.TCreateInput parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (de.epages.ws.product11.model.TCreateInput) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static de.epages.ws.product11.model.TCreateInput parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (de.epages.ws.product11.model.TCreateInput) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static de.epages.ws.product11.model.TCreateInput parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (de.epages.ws.product11.model.TCreateInput) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static de.epages.ws.product11.model.TCreateInput parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (de.epages.ws.product11.model.TCreateInput) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static de.epages.ws.product11.model.TCreateInput parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (de.epages.ws.product11.model.TCreateInput) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static de.epages.ws.product11.model.TCreateInput parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (de.epages.ws.product11.model.TCreateInput) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
