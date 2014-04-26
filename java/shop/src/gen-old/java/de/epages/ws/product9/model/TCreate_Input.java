/**
 * TCreate_Input.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package de.epages.ws.product9.model;


/**
 * input arguments of a single create() product call.
 *         a set of product specific attributes that will be used to
 * create a product.
 *         alias, tax class are mandatory.
 *         variation attributes are mandatory for creation of sub products.
 * all others are optional.
 */
public class TCreate_Input  implements java.io.Serializable {
    /* product alias */
    private java.lang.String alias;

    /* product's class (object path to a product type) */
    private java.lang.String _class;

    /* product's name */
    private de.epages.ws.common.model.TLocalizedValue[] name;

    /* product's description */
    private de.epages.ws.common.model.TLocalizedValue[] description;

    /* product's long description (formerly LongDescription) */
    private de.epages.ws.common.model.TLocalizedValue[] text;

    /* product's key words */
    private de.epages.ws.common.model.TLocalizedValue[] keywords;

    /* localizable page title shown in SF */
    private de.epages.ws.common.model.TLocalizedValue[] title;

    /* product's tax class (object path to a tax class) */
    private java.lang.String taxClass;

    private java.lang.Boolean isVisible;

    private java.lang.Boolean isNew;

    private java.lang.Boolean isDailyPrice;

    /* product's main unit (object path to a unit) */
    private java.lang.String orderUnit;

    /* product's main quantity (all prices are based on this amount
     * of OrderUnits) */
    private java.lang.Float priceQuantity;

    /* product's minimum order amount (minimum quantity in order) */
    private java.lang.Float minOrder;

    /* product's interval amount (quantity step in order) */
    private java.lang.Float intervalOrder;

    /* product's weight unit (object path to a unit) */
    private java.lang.String weightUnit;

    /* product's weight (in WeightUnit) */
    private java.lang.Float weight;

    /* product's reference unit (object path to a unit) */
    private java.lang.String refUnit;

    /* product's reference amount (in RefUnit) */
    private java.lang.Float refAmount;

    /* product's reference content amount (amount of RefUnit actually
     * in the product) */
    private java.lang.Float refContentAmount;

    /* product's stock level (in OrderUnit) */
    private java.lang.Float stockLevel;

    /* product's stock level alert (in OrderUnit) */
    private java.lang.Float stockLevelAlert;

    private java.lang.String manufacturer;

    private java.lang.String manufacturerSKU;

    /* product's delivery period as string */
    private java.lang.String deliveryPeriod;

    /* product's length (in millimeter) */
    private java.lang.Float length;

    /* product's width (in millimeter) */
    private java.lang.Float width;

    /* product's height (in millimeter) */
    private java.lang.Float height;

    /* Indicates that the product is for sale. */
    private java.lang.Boolean isAvailable;

    /* comment displayed if product is not available (see IsAvailable) */
    private de.epages.ws.common.model.TLocalizedValue[] availabilityComment;

    /* date when the product is going to be available/is for sale */
    private java.util.Calendar availabilityDate;

    /* short uri asunique part of short URL, affects the CanonicalURL */
    private de.epages.ws.common.model.TLocalizedValue[] URI;

    /* indicates that the product have download files */
    private boolean isDownloadProduct;

    /* temporal delimitation for download */
    private java.math.BigInteger maxDownloadTime;

    /* number possible downloads */
    private java.math.BigInteger maxDownloadCount;

    /* list of product download files */
    private de.epages.ws.product9.model.TDownload[] downloadProductMaps;

    /* object path to variation's super product (if this is a variation
     * (sub product)) */
    private java.lang.String superProduct;

    /* product's default sub product (if this is a product with variations
     * (super product)) */
    private java.lang.String defaultSubProduct;

    /* indicates, if this variation is the default one of the super
     * product (if this is a variation (sub product)) */
    private java.lang.Boolean isDefault;

    /* indicates, if own prices of sub product should be used (if
     * this is a variation (sub product)) */
    private java.lang.Boolean hasSubOwnPrices;

    /* if this is a variation (sub product): the actual attribute
     * keys and values of the variation
     *             (see epagestypes:ListOfAttributes) */
    private de.epages.ws.common.model.TAttribute[] variationAttributes;

    /* list of product prices (see producttypes:ListOfListOfProductPrices) */
    private de.epages.ws.product9.model.TProductPrice[] productPrices;

    /* list of manufacturer prices (see producttypes:ListOfListOfProductPrices) */
    private de.epages.ws.product9.model.TProductPrice[] manufacturerPrices;

    /* list of deposit prices (see producttypes:ListOfListOfProductPrices) */
    private de.epages.ws.product9.model.TProductPrice[] depositPrices;

    /* list of eco participation  prices (see producttypes:ListOfListOfProductPrices) */
    private de.epages.ws.product9.model.TProductPrice[] ecoParticipationPrices;

    /* list of prepayment prices (see producttypes:ListOfListOfProductPrices) */
    private de.epages.ws.product9.model.TProductPrice[] prepaymentPrices;

    /* type of prepayment (percent, fix) */
    private java.lang.String prepaymentType;

    /* percental value of prepayment */
    private java.lang.Float prepaymentValue;

    /* list of shipping methods (see producttypes:ListOfShippingMethods) */
    private de.epages.ws.product9.model.TShippingMethod[] shippingMethods;

    /* list of requested attributes (see epagestypes:ListOfAttributes) */
    private de.epages.ws.common.model.TAttribute[] attributes;

    public TCreate_Input() {
    }

    public TCreate_Input(
           java.lang.String alias,
           java.lang.String _class,
           de.epages.ws.common.model.TLocalizedValue[] name,
           de.epages.ws.common.model.TLocalizedValue[] description,
           de.epages.ws.common.model.TLocalizedValue[] text,
           de.epages.ws.common.model.TLocalizedValue[] keywords,
           de.epages.ws.common.model.TLocalizedValue[] title,
           java.lang.String taxClass,
           java.lang.Boolean isVisible,
           java.lang.Boolean isNew,
           java.lang.Boolean isDailyPrice,
           java.lang.String orderUnit,
           java.lang.Float priceQuantity,
           java.lang.Float minOrder,
           java.lang.Float intervalOrder,
           java.lang.String weightUnit,
           java.lang.Float weight,
           java.lang.String refUnit,
           java.lang.Float refAmount,
           java.lang.Float refContentAmount,
           java.lang.Float stockLevel,
           java.lang.Float stockLevelAlert,
           java.lang.String manufacturer,
           java.lang.String manufacturerSKU,
           java.lang.String deliveryPeriod,
           java.lang.Float length,
           java.lang.Float width,
           java.lang.Float height,
           java.lang.Boolean isAvailable,
           de.epages.ws.common.model.TLocalizedValue[] availabilityComment,
           java.util.Calendar availabilityDate,
           de.epages.ws.common.model.TLocalizedValue[] URI,
           boolean isDownloadProduct,
           java.math.BigInteger maxDownloadTime,
           java.math.BigInteger maxDownloadCount,
           de.epages.ws.product9.model.TDownload[] downloadProductMaps,
           java.lang.String superProduct,
           java.lang.String defaultSubProduct,
           java.lang.Boolean isDefault,
           java.lang.Boolean hasSubOwnPrices,
           de.epages.ws.common.model.TAttribute[] variationAttributes,
           de.epages.ws.product9.model.TProductPrice[] productPrices,
           de.epages.ws.product9.model.TProductPrice[] manufacturerPrices,
           de.epages.ws.product9.model.TProductPrice[] depositPrices,
           de.epages.ws.product9.model.TProductPrice[] ecoParticipationPrices,
           de.epages.ws.product9.model.TProductPrice[] prepaymentPrices,
           java.lang.String prepaymentType,
           java.lang.Float prepaymentValue,
           de.epages.ws.product9.model.TShippingMethod[] shippingMethods,
           de.epages.ws.common.model.TAttribute[] attributes) {
           this.alias = alias;
           this._class = _class;
           this.name = name;
           this.description = description;
           this.text = text;
           this.keywords = keywords;
           this.title = title;
           this.taxClass = taxClass;
           this.isVisible = isVisible;
           this.isNew = isNew;
           this.isDailyPrice = isDailyPrice;
           this.orderUnit = orderUnit;
           this.priceQuantity = priceQuantity;
           this.minOrder = minOrder;
           this.intervalOrder = intervalOrder;
           this.weightUnit = weightUnit;
           this.weight = weight;
           this.refUnit = refUnit;
           this.refAmount = refAmount;
           this.refContentAmount = refContentAmount;
           this.stockLevel = stockLevel;
           this.stockLevelAlert = stockLevelAlert;
           this.manufacturer = manufacturer;
           this.manufacturerSKU = manufacturerSKU;
           this.deliveryPeriod = deliveryPeriod;
           this.length = length;
           this.width = width;
           this.height = height;
           this.isAvailable = isAvailable;
           this.availabilityComment = availabilityComment;
           this.availabilityDate = availabilityDate;
           this.URI = URI;
           this.isDownloadProduct = isDownloadProduct;
           this.maxDownloadTime = maxDownloadTime;
           this.maxDownloadCount = maxDownloadCount;
           this.downloadProductMaps = downloadProductMaps;
           this.superProduct = superProduct;
           this.defaultSubProduct = defaultSubProduct;
           this.isDefault = isDefault;
           this.hasSubOwnPrices = hasSubOwnPrices;
           this.variationAttributes = variationAttributes;
           this.productPrices = productPrices;
           this.manufacturerPrices = manufacturerPrices;
           this.depositPrices = depositPrices;
           this.ecoParticipationPrices = ecoParticipationPrices;
           this.prepaymentPrices = prepaymentPrices;
           this.prepaymentType = prepaymentType;
           this.prepaymentValue = prepaymentValue;
           this.shippingMethods = shippingMethods;
           this.attributes = attributes;
    }


    /**
     * Gets the alias value for this TCreate_Input.
     * 
     * @return alias   * product alias
     */
    public java.lang.String getAlias() {
        return alias;
    }


    /**
     * Sets the alias value for this TCreate_Input.
     * 
     * @param alias   * product alias
     */
    public void setAlias(java.lang.String alias) {
        this.alias = alias;
    }


    /**
     * Gets the _class value for this TCreate_Input.
     * 
     * @return _class   * product's class (object path to a product type)
     */
    public java.lang.String get_class() {
        return _class;
    }


    /**
     * Sets the _class value for this TCreate_Input.
     * 
     * @param _class   * product's class (object path to a product type)
     */
    public void set_class(java.lang.String _class) {
        this._class = _class;
    }


    /**
     * Gets the name value for this TCreate_Input.
     * 
     * @return name   * product's name
     */
    public de.epages.ws.common.model.TLocalizedValue[] getName() {
        return name;
    }


    /**
     * Sets the name value for this TCreate_Input.
     * 
     * @param name   * product's name
     */
    public void setName(de.epages.ws.common.model.TLocalizedValue[] name) {
        this.name = name;
    }


    /**
     * Gets the description value for this TCreate_Input.
     * 
     * @return description   * product's description
     */
    public de.epages.ws.common.model.TLocalizedValue[] getDescription() {
        return description;
    }


    /**
     * Sets the description value for this TCreate_Input.
     * 
     * @param description   * product's description
     */
    public void setDescription(de.epages.ws.common.model.TLocalizedValue[] description) {
        this.description = description;
    }


    /**
     * Gets the text value for this TCreate_Input.
     * 
     * @return text   * product's long description (formerly LongDescription)
     */
    public de.epages.ws.common.model.TLocalizedValue[] getText() {
        return text;
    }


    /**
     * Sets the text value for this TCreate_Input.
     * 
     * @param text   * product's long description (formerly LongDescription)
     */
    public void setText(de.epages.ws.common.model.TLocalizedValue[] text) {
        this.text = text;
    }


    /**
     * Gets the keywords value for this TCreate_Input.
     * 
     * @return keywords   * product's key words
     */
    public de.epages.ws.common.model.TLocalizedValue[] getKeywords() {
        return keywords;
    }


    /**
     * Sets the keywords value for this TCreate_Input.
     * 
     * @param keywords   * product's key words
     */
    public void setKeywords(de.epages.ws.common.model.TLocalizedValue[] keywords) {
        this.keywords = keywords;
    }


    /**
     * Gets the title value for this TCreate_Input.
     * 
     * @return title   * localizable page title shown in SF
     */
    public de.epages.ws.common.model.TLocalizedValue[] getTitle() {
        return title;
    }


    /**
     * Sets the title value for this TCreate_Input.
     * 
     * @param title   * localizable page title shown in SF
     */
    public void setTitle(de.epages.ws.common.model.TLocalizedValue[] title) {
        this.title = title;
    }


    /**
     * Gets the taxClass value for this TCreate_Input.
     * 
     * @return taxClass   * product's tax class (object path to a tax class)
     */
    public java.lang.String getTaxClass() {
        return taxClass;
    }


    /**
     * Sets the taxClass value for this TCreate_Input.
     * 
     * @param taxClass   * product's tax class (object path to a tax class)
     */
    public void setTaxClass(java.lang.String taxClass) {
        this.taxClass = taxClass;
    }


    /**
     * Gets the isVisible value for this TCreate_Input.
     * 
     * @return isVisible
     */
    public java.lang.Boolean getIsVisible() {
        return isVisible;
    }


    /**
     * Sets the isVisible value for this TCreate_Input.
     * 
     * @param isVisible
     */
    public void setIsVisible(java.lang.Boolean isVisible) {
        this.isVisible = isVisible;
    }


    /**
     * Gets the isNew value for this TCreate_Input.
     * 
     * @return isNew
     */
    public java.lang.Boolean getIsNew() {
        return isNew;
    }


    /**
     * Sets the isNew value for this TCreate_Input.
     * 
     * @param isNew
     */
    public void setIsNew(java.lang.Boolean isNew) {
        this.isNew = isNew;
    }


    /**
     * Gets the isDailyPrice value for this TCreate_Input.
     * 
     * @return isDailyPrice
     */
    public java.lang.Boolean getIsDailyPrice() {
        return isDailyPrice;
    }


    /**
     * Sets the isDailyPrice value for this TCreate_Input.
     * 
     * @param isDailyPrice
     */
    public void setIsDailyPrice(java.lang.Boolean isDailyPrice) {
        this.isDailyPrice = isDailyPrice;
    }


    /**
     * Gets the orderUnit value for this TCreate_Input.
     * 
     * @return orderUnit   * product's main unit (object path to a unit)
     */
    public java.lang.String getOrderUnit() {
        return orderUnit;
    }


    /**
     * Sets the orderUnit value for this TCreate_Input.
     * 
     * @param orderUnit   * product's main unit (object path to a unit)
     */
    public void setOrderUnit(java.lang.String orderUnit) {
        this.orderUnit = orderUnit;
    }


    /**
     * Gets the priceQuantity value for this TCreate_Input.
     * 
     * @return priceQuantity   * product's main quantity (all prices are based on this amount
     * of OrderUnits)
     */
    public java.lang.Float getPriceQuantity() {
        return priceQuantity;
    }


    /**
     * Sets the priceQuantity value for this TCreate_Input.
     * 
     * @param priceQuantity   * product's main quantity (all prices are based on this amount
     * of OrderUnits)
     */
    public void setPriceQuantity(java.lang.Float priceQuantity) {
        this.priceQuantity = priceQuantity;
    }


    /**
     * Gets the minOrder value for this TCreate_Input.
     * 
     * @return minOrder   * product's minimum order amount (minimum quantity in order)
     */
    public java.lang.Float getMinOrder() {
        return minOrder;
    }


    /**
     * Sets the minOrder value for this TCreate_Input.
     * 
     * @param minOrder   * product's minimum order amount (minimum quantity in order)
     */
    public void setMinOrder(java.lang.Float minOrder) {
        this.minOrder = minOrder;
    }


    /**
     * Gets the intervalOrder value for this TCreate_Input.
     * 
     * @return intervalOrder   * product's interval amount (quantity step in order)
     */
    public java.lang.Float getIntervalOrder() {
        return intervalOrder;
    }


    /**
     * Sets the intervalOrder value for this TCreate_Input.
     * 
     * @param intervalOrder   * product's interval amount (quantity step in order)
     */
    public void setIntervalOrder(java.lang.Float intervalOrder) {
        this.intervalOrder = intervalOrder;
    }


    /**
     * Gets the weightUnit value for this TCreate_Input.
     * 
     * @return weightUnit   * product's weight unit (object path to a unit)
     */
    public java.lang.String getWeightUnit() {
        return weightUnit;
    }


    /**
     * Sets the weightUnit value for this TCreate_Input.
     * 
     * @param weightUnit   * product's weight unit (object path to a unit)
     */
    public void setWeightUnit(java.lang.String weightUnit) {
        this.weightUnit = weightUnit;
    }


    /**
     * Gets the weight value for this TCreate_Input.
     * 
     * @return weight   * product's weight (in WeightUnit)
     */
    public java.lang.Float getWeight() {
        return weight;
    }


    /**
     * Sets the weight value for this TCreate_Input.
     * 
     * @param weight   * product's weight (in WeightUnit)
     */
    public void setWeight(java.lang.Float weight) {
        this.weight = weight;
    }


    /**
     * Gets the refUnit value for this TCreate_Input.
     * 
     * @return refUnit   * product's reference unit (object path to a unit)
     */
    public java.lang.String getRefUnit() {
        return refUnit;
    }


    /**
     * Sets the refUnit value for this TCreate_Input.
     * 
     * @param refUnit   * product's reference unit (object path to a unit)
     */
    public void setRefUnit(java.lang.String refUnit) {
        this.refUnit = refUnit;
    }


    /**
     * Gets the refAmount value for this TCreate_Input.
     * 
     * @return refAmount   * product's reference amount (in RefUnit)
     */
    public java.lang.Float getRefAmount() {
        return refAmount;
    }


    /**
     * Sets the refAmount value for this TCreate_Input.
     * 
     * @param refAmount   * product's reference amount (in RefUnit)
     */
    public void setRefAmount(java.lang.Float refAmount) {
        this.refAmount = refAmount;
    }


    /**
     * Gets the refContentAmount value for this TCreate_Input.
     * 
     * @return refContentAmount   * product's reference content amount (amount of RefUnit actually
     * in the product)
     */
    public java.lang.Float getRefContentAmount() {
        return refContentAmount;
    }


    /**
     * Sets the refContentAmount value for this TCreate_Input.
     * 
     * @param refContentAmount   * product's reference content amount (amount of RefUnit actually
     * in the product)
     */
    public void setRefContentAmount(java.lang.Float refContentAmount) {
        this.refContentAmount = refContentAmount;
    }


    /**
     * Gets the stockLevel value for this TCreate_Input.
     * 
     * @return stockLevel   * product's stock level (in OrderUnit)
     */
    public java.lang.Float getStockLevel() {
        return stockLevel;
    }


    /**
     * Sets the stockLevel value for this TCreate_Input.
     * 
     * @param stockLevel   * product's stock level (in OrderUnit)
     */
    public void setStockLevel(java.lang.Float stockLevel) {
        this.stockLevel = stockLevel;
    }


    /**
     * Gets the stockLevelAlert value for this TCreate_Input.
     * 
     * @return stockLevelAlert   * product's stock level alert (in OrderUnit)
     */
    public java.lang.Float getStockLevelAlert() {
        return stockLevelAlert;
    }


    /**
     * Sets the stockLevelAlert value for this TCreate_Input.
     * 
     * @param stockLevelAlert   * product's stock level alert (in OrderUnit)
     */
    public void setStockLevelAlert(java.lang.Float stockLevelAlert) {
        this.stockLevelAlert = stockLevelAlert;
    }


    /**
     * Gets the manufacturer value for this TCreate_Input.
     * 
     * @return manufacturer
     */
    public java.lang.String getManufacturer() {
        return manufacturer;
    }


    /**
     * Sets the manufacturer value for this TCreate_Input.
     * 
     * @param manufacturer
     */
    public void setManufacturer(java.lang.String manufacturer) {
        this.manufacturer = manufacturer;
    }


    /**
     * Gets the manufacturerSKU value for this TCreate_Input.
     * 
     * @return manufacturerSKU
     */
    public java.lang.String getManufacturerSKU() {
        return manufacturerSKU;
    }


    /**
     * Sets the manufacturerSKU value for this TCreate_Input.
     * 
     * @param manufacturerSKU
     */
    public void setManufacturerSKU(java.lang.String manufacturerSKU) {
        this.manufacturerSKU = manufacturerSKU;
    }


    /**
     * Gets the deliveryPeriod value for this TCreate_Input.
     * 
     * @return deliveryPeriod   * product's delivery period as string
     */
    public java.lang.String getDeliveryPeriod() {
        return deliveryPeriod;
    }


    /**
     * Sets the deliveryPeriod value for this TCreate_Input.
     * 
     * @param deliveryPeriod   * product's delivery period as string
     */
    public void setDeliveryPeriod(java.lang.String deliveryPeriod) {
        this.deliveryPeriod = deliveryPeriod;
    }


    /**
     * Gets the length value for this TCreate_Input.
     * 
     * @return length   * product's length (in millimeter)
     */
    public java.lang.Float getLength() {
        return length;
    }


    /**
     * Sets the length value for this TCreate_Input.
     * 
     * @param length   * product's length (in millimeter)
     */
    public void setLength(java.lang.Float length) {
        this.length = length;
    }


    /**
     * Gets the width value for this TCreate_Input.
     * 
     * @return width   * product's width (in millimeter)
     */
    public java.lang.Float getWidth() {
        return width;
    }


    /**
     * Sets the width value for this TCreate_Input.
     * 
     * @param width   * product's width (in millimeter)
     */
    public void setWidth(java.lang.Float width) {
        this.width = width;
    }


    /**
     * Gets the height value for this TCreate_Input.
     * 
     * @return height   * product's height (in millimeter)
     */
    public java.lang.Float getHeight() {
        return height;
    }


    /**
     * Sets the height value for this TCreate_Input.
     * 
     * @param height   * product's height (in millimeter)
     */
    public void setHeight(java.lang.Float height) {
        this.height = height;
    }


    /**
     * Gets the isAvailable value for this TCreate_Input.
     * 
     * @return isAvailable   * Indicates that the product is for sale.
     */
    public java.lang.Boolean getIsAvailable() {
        return isAvailable;
    }


    /**
     * Sets the isAvailable value for this TCreate_Input.
     * 
     * @param isAvailable   * Indicates that the product is for sale.
     */
    public void setIsAvailable(java.lang.Boolean isAvailable) {
        this.isAvailable = isAvailable;
    }


    /**
     * Gets the availabilityComment value for this TCreate_Input.
     * 
     * @return availabilityComment   * comment displayed if product is not available (see IsAvailable)
     */
    public de.epages.ws.common.model.TLocalizedValue[] getAvailabilityComment() {
        return availabilityComment;
    }


    /**
     * Sets the availabilityComment value for this TCreate_Input.
     * 
     * @param availabilityComment   * comment displayed if product is not available (see IsAvailable)
     */
    public void setAvailabilityComment(de.epages.ws.common.model.TLocalizedValue[] availabilityComment) {
        this.availabilityComment = availabilityComment;
    }


    /**
     * Gets the availabilityDate value for this TCreate_Input.
     * 
     * @return availabilityDate   * date when the product is going to be available/is for sale
     */
    public java.util.Calendar getAvailabilityDate() {
        return availabilityDate;
    }


    /**
     * Sets the availabilityDate value for this TCreate_Input.
     * 
     * @param availabilityDate   * date when the product is going to be available/is for sale
     */
    public void setAvailabilityDate(java.util.Calendar availabilityDate) {
        this.availabilityDate = availabilityDate;
    }


    /**
     * Gets the URI value for this TCreate_Input.
     * 
     * @return URI   * short uri asunique part of short URL, affects the CanonicalURL
     */
    public de.epages.ws.common.model.TLocalizedValue[] getURI() {
        return URI;
    }


    /**
     * Sets the URI value for this TCreate_Input.
     * 
     * @param URI   * short uri asunique part of short URL, affects the CanonicalURL
     */
    public void setURI(de.epages.ws.common.model.TLocalizedValue[] URI) {
        this.URI = URI;
    }


    /**
     * Gets the isDownloadProduct value for this TCreate_Input.
     * 
     * @return isDownloadProduct   * indicates that the product have download files
     */
    public boolean isIsDownloadProduct() {
        return isDownloadProduct;
    }


    /**
     * Sets the isDownloadProduct value for this TCreate_Input.
     * 
     * @param isDownloadProduct   * indicates that the product have download files
     */
    public void setIsDownloadProduct(boolean isDownloadProduct) {
        this.isDownloadProduct = isDownloadProduct;
    }


    /**
     * Gets the maxDownloadTime value for this TCreate_Input.
     * 
     * @return maxDownloadTime   * temporal delimitation for download
     */
    public java.math.BigInteger getMaxDownloadTime() {
        return maxDownloadTime;
    }


    /**
     * Sets the maxDownloadTime value for this TCreate_Input.
     * 
     * @param maxDownloadTime   * temporal delimitation for download
     */
    public void setMaxDownloadTime(java.math.BigInteger maxDownloadTime) {
        this.maxDownloadTime = maxDownloadTime;
    }


    /**
     * Gets the maxDownloadCount value for this TCreate_Input.
     * 
     * @return maxDownloadCount   * number possible downloads
     */
    public java.math.BigInteger getMaxDownloadCount() {
        return maxDownloadCount;
    }


    /**
     * Sets the maxDownloadCount value for this TCreate_Input.
     * 
     * @param maxDownloadCount   * number possible downloads
     */
    public void setMaxDownloadCount(java.math.BigInteger maxDownloadCount) {
        this.maxDownloadCount = maxDownloadCount;
    }


    /**
     * Gets the downloadProductMaps value for this TCreate_Input.
     * 
     * @return downloadProductMaps   * list of product download files
     */
    public de.epages.ws.product9.model.TDownload[] getDownloadProductMaps() {
        return downloadProductMaps;
    }


    /**
     * Sets the downloadProductMaps value for this TCreate_Input.
     * 
     * @param downloadProductMaps   * list of product download files
     */
    public void setDownloadProductMaps(de.epages.ws.product9.model.TDownload[] downloadProductMaps) {
        this.downloadProductMaps = downloadProductMaps;
    }


    /**
     * Gets the superProduct value for this TCreate_Input.
     * 
     * @return superProduct   * object path to variation's super product (if this is a variation
     * (sub product))
     */
    public java.lang.String getSuperProduct() {
        return superProduct;
    }


    /**
     * Sets the superProduct value for this TCreate_Input.
     * 
     * @param superProduct   * object path to variation's super product (if this is a variation
     * (sub product))
     */
    public void setSuperProduct(java.lang.String superProduct) {
        this.superProduct = superProduct;
    }


    /**
     * Gets the defaultSubProduct value for this TCreate_Input.
     * 
     * @return defaultSubProduct   * product's default sub product (if this is a product with variations
     * (super product))
     */
    public java.lang.String getDefaultSubProduct() {
        return defaultSubProduct;
    }


    /**
     * Sets the defaultSubProduct value for this TCreate_Input.
     * 
     * @param defaultSubProduct   * product's default sub product (if this is a product with variations
     * (super product))
     */
    public void setDefaultSubProduct(java.lang.String defaultSubProduct) {
        this.defaultSubProduct = defaultSubProduct;
    }


    /**
     * Gets the isDefault value for this TCreate_Input.
     * 
     * @return isDefault   * indicates, if this variation is the default one of the super
     * product (if this is a variation (sub product))
     */
    public java.lang.Boolean getIsDefault() {
        return isDefault;
    }


    /**
     * Sets the isDefault value for this TCreate_Input.
     * 
     * @param isDefault   * indicates, if this variation is the default one of the super
     * product (if this is a variation (sub product))
     */
    public void setIsDefault(java.lang.Boolean isDefault) {
        this.isDefault = isDefault;
    }


    /**
     * Gets the hasSubOwnPrices value for this TCreate_Input.
     * 
     * @return hasSubOwnPrices   * indicates, if own prices of sub product should be used (if
     * this is a variation (sub product))
     */
    public java.lang.Boolean getHasSubOwnPrices() {
        return hasSubOwnPrices;
    }


    /**
     * Sets the hasSubOwnPrices value for this TCreate_Input.
     * 
     * @param hasSubOwnPrices   * indicates, if own prices of sub product should be used (if
     * this is a variation (sub product))
     */
    public void setHasSubOwnPrices(java.lang.Boolean hasSubOwnPrices) {
        this.hasSubOwnPrices = hasSubOwnPrices;
    }


    /**
     * Gets the variationAttributes value for this TCreate_Input.
     * 
     * @return variationAttributes   * if this is a variation (sub product): the actual attribute
     * keys and values of the variation
     *             (see epagestypes:ListOfAttributes)
     */
    public de.epages.ws.common.model.TAttribute[] getVariationAttributes() {
        return variationAttributes;
    }


    /**
     * Sets the variationAttributes value for this TCreate_Input.
     * 
     * @param variationAttributes   * if this is a variation (sub product): the actual attribute
     * keys and values of the variation
     *             (see epagestypes:ListOfAttributes)
     */
    public void setVariationAttributes(de.epages.ws.common.model.TAttribute[] variationAttributes) {
        this.variationAttributes = variationAttributes;
    }


    /**
     * Gets the productPrices value for this TCreate_Input.
     * 
     * @return productPrices   * list of product prices (see producttypes:ListOfListOfProductPrices)
     */
    public de.epages.ws.product9.model.TProductPrice[] getProductPrices() {
        return productPrices;
    }


    /**
     * Sets the productPrices value for this TCreate_Input.
     * 
     * @param productPrices   * list of product prices (see producttypes:ListOfListOfProductPrices)
     */
    public void setProductPrices(de.epages.ws.product9.model.TProductPrice[] productPrices) {
        this.productPrices = productPrices;
    }


    /**
     * Gets the manufacturerPrices value for this TCreate_Input.
     * 
     * @return manufacturerPrices   * list of manufacturer prices (see producttypes:ListOfListOfProductPrices)
     */
    public de.epages.ws.product9.model.TProductPrice[] getManufacturerPrices() {
        return manufacturerPrices;
    }


    /**
     * Sets the manufacturerPrices value for this TCreate_Input.
     * 
     * @param manufacturerPrices   * list of manufacturer prices (see producttypes:ListOfListOfProductPrices)
     */
    public void setManufacturerPrices(de.epages.ws.product9.model.TProductPrice[] manufacturerPrices) {
        this.manufacturerPrices = manufacturerPrices;
    }


    /**
     * Gets the depositPrices value for this TCreate_Input.
     * 
     * @return depositPrices   * list of deposit prices (see producttypes:ListOfListOfProductPrices)
     */
    public de.epages.ws.product9.model.TProductPrice[] getDepositPrices() {
        return depositPrices;
    }


    /**
     * Sets the depositPrices value for this TCreate_Input.
     * 
     * @param depositPrices   * list of deposit prices (see producttypes:ListOfListOfProductPrices)
     */
    public void setDepositPrices(de.epages.ws.product9.model.TProductPrice[] depositPrices) {
        this.depositPrices = depositPrices;
    }


    /**
     * Gets the ecoParticipationPrices value for this TCreate_Input.
     * 
     * @return ecoParticipationPrices   * list of eco participation  prices (see producttypes:ListOfListOfProductPrices)
     */
    public de.epages.ws.product9.model.TProductPrice[] getEcoParticipationPrices() {
        return ecoParticipationPrices;
    }


    /**
     * Sets the ecoParticipationPrices value for this TCreate_Input.
     * 
     * @param ecoParticipationPrices   * list of eco participation  prices (see producttypes:ListOfListOfProductPrices)
     */
    public void setEcoParticipationPrices(de.epages.ws.product9.model.TProductPrice[] ecoParticipationPrices) {
        this.ecoParticipationPrices = ecoParticipationPrices;
    }


    /**
     * Gets the prepaymentPrices value for this TCreate_Input.
     * 
     * @return prepaymentPrices   * list of prepayment prices (see producttypes:ListOfListOfProductPrices)
     */
    public de.epages.ws.product9.model.TProductPrice[] getPrepaymentPrices() {
        return prepaymentPrices;
    }


    /**
     * Sets the prepaymentPrices value for this TCreate_Input.
     * 
     * @param prepaymentPrices   * list of prepayment prices (see producttypes:ListOfListOfProductPrices)
     */
    public void setPrepaymentPrices(de.epages.ws.product9.model.TProductPrice[] prepaymentPrices) {
        this.prepaymentPrices = prepaymentPrices;
    }


    /**
     * Gets the prepaymentType value for this TCreate_Input.
     * 
     * @return prepaymentType   * type of prepayment (percent, fix)
     */
    public java.lang.String getPrepaymentType() {
        return prepaymentType;
    }


    /**
     * Sets the prepaymentType value for this TCreate_Input.
     * 
     * @param prepaymentType   * type of prepayment (percent, fix)
     */
    public void setPrepaymentType(java.lang.String prepaymentType) {
        this.prepaymentType = prepaymentType;
    }


    /**
     * Gets the prepaymentValue value for this TCreate_Input.
     * 
     * @return prepaymentValue   * percental value of prepayment
     */
    public java.lang.Float getPrepaymentValue() {
        return prepaymentValue;
    }


    /**
     * Sets the prepaymentValue value for this TCreate_Input.
     * 
     * @param prepaymentValue   * percental value of prepayment
     */
    public void setPrepaymentValue(java.lang.Float prepaymentValue) {
        this.prepaymentValue = prepaymentValue;
    }


    /**
     * Gets the shippingMethods value for this TCreate_Input.
     * 
     * @return shippingMethods   * list of shipping methods (see producttypes:ListOfShippingMethods)
     */
    public de.epages.ws.product9.model.TShippingMethod[] getShippingMethods() {
        return shippingMethods;
    }


    /**
     * Sets the shippingMethods value for this TCreate_Input.
     * 
     * @param shippingMethods   * list of shipping methods (see producttypes:ListOfShippingMethods)
     */
    public void setShippingMethods(de.epages.ws.product9.model.TShippingMethod[] shippingMethods) {
        this.shippingMethods = shippingMethods;
    }


    /**
     * Gets the attributes value for this TCreate_Input.
     * 
     * @return attributes   * list of requested attributes (see epagestypes:ListOfAttributes)
     */
    public de.epages.ws.common.model.TAttribute[] getAttributes() {
        return attributes;
    }


    /**
     * Sets the attributes value for this TCreate_Input.
     * 
     * @param attributes   * list of requested attributes (see epagestypes:ListOfAttributes)
     */
    public void setAttributes(de.epages.ws.common.model.TAttribute[] attributes) {
        this.attributes = attributes;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TCreate_Input)) return false;
        TCreate_Input other = (TCreate_Input) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.alias==null && other.getAlias()==null) || 
             (this.alias!=null &&
              this.alias.equals(other.getAlias()))) &&
            ((this._class==null && other.get_class()==null) || 
             (this._class!=null &&
              this._class.equals(other.get_class()))) &&
            ((this.name==null && other.getName()==null) || 
             (this.name!=null &&
              java.util.Arrays.equals(this.name, other.getName()))) &&
            ((this.description==null && other.getDescription()==null) || 
             (this.description!=null &&
              java.util.Arrays.equals(this.description, other.getDescription()))) &&
            ((this.text==null && other.getText()==null) || 
             (this.text!=null &&
              java.util.Arrays.equals(this.text, other.getText()))) &&
            ((this.keywords==null && other.getKeywords()==null) || 
             (this.keywords!=null &&
              java.util.Arrays.equals(this.keywords, other.getKeywords()))) &&
            ((this.title==null && other.getTitle()==null) || 
             (this.title!=null &&
              java.util.Arrays.equals(this.title, other.getTitle()))) &&
            ((this.taxClass==null && other.getTaxClass()==null) || 
             (this.taxClass!=null &&
              this.taxClass.equals(other.getTaxClass()))) &&
            ((this.isVisible==null && other.getIsVisible()==null) || 
             (this.isVisible!=null &&
              this.isVisible.equals(other.getIsVisible()))) &&
            ((this.isNew==null && other.getIsNew()==null) || 
             (this.isNew!=null &&
              this.isNew.equals(other.getIsNew()))) &&
            ((this.isDailyPrice==null && other.getIsDailyPrice()==null) || 
             (this.isDailyPrice!=null &&
              this.isDailyPrice.equals(other.getIsDailyPrice()))) &&
            ((this.orderUnit==null && other.getOrderUnit()==null) || 
             (this.orderUnit!=null &&
              this.orderUnit.equals(other.getOrderUnit()))) &&
            ((this.priceQuantity==null && other.getPriceQuantity()==null) || 
             (this.priceQuantity!=null &&
              this.priceQuantity.equals(other.getPriceQuantity()))) &&
            ((this.minOrder==null && other.getMinOrder()==null) || 
             (this.minOrder!=null &&
              this.minOrder.equals(other.getMinOrder()))) &&
            ((this.intervalOrder==null && other.getIntervalOrder()==null) || 
             (this.intervalOrder!=null &&
              this.intervalOrder.equals(other.getIntervalOrder()))) &&
            ((this.weightUnit==null && other.getWeightUnit()==null) || 
             (this.weightUnit!=null &&
              this.weightUnit.equals(other.getWeightUnit()))) &&
            ((this.weight==null && other.getWeight()==null) || 
             (this.weight!=null &&
              this.weight.equals(other.getWeight()))) &&
            ((this.refUnit==null && other.getRefUnit()==null) || 
             (this.refUnit!=null &&
              this.refUnit.equals(other.getRefUnit()))) &&
            ((this.refAmount==null && other.getRefAmount()==null) || 
             (this.refAmount!=null &&
              this.refAmount.equals(other.getRefAmount()))) &&
            ((this.refContentAmount==null && other.getRefContentAmount()==null) || 
             (this.refContentAmount!=null &&
              this.refContentAmount.equals(other.getRefContentAmount()))) &&
            ((this.stockLevel==null && other.getStockLevel()==null) || 
             (this.stockLevel!=null &&
              this.stockLevel.equals(other.getStockLevel()))) &&
            ((this.stockLevelAlert==null && other.getStockLevelAlert()==null) || 
             (this.stockLevelAlert!=null &&
              this.stockLevelAlert.equals(other.getStockLevelAlert()))) &&
            ((this.manufacturer==null && other.getManufacturer()==null) || 
             (this.manufacturer!=null &&
              this.manufacturer.equals(other.getManufacturer()))) &&
            ((this.manufacturerSKU==null && other.getManufacturerSKU()==null) || 
             (this.manufacturerSKU!=null &&
              this.manufacturerSKU.equals(other.getManufacturerSKU()))) &&
            ((this.deliveryPeriod==null && other.getDeliveryPeriod()==null) || 
             (this.deliveryPeriod!=null &&
              this.deliveryPeriod.equals(other.getDeliveryPeriod()))) &&
            ((this.length==null && other.getLength()==null) || 
             (this.length!=null &&
              this.length.equals(other.getLength()))) &&
            ((this.width==null && other.getWidth()==null) || 
             (this.width!=null &&
              this.width.equals(other.getWidth()))) &&
            ((this.height==null && other.getHeight()==null) || 
             (this.height!=null &&
              this.height.equals(other.getHeight()))) &&
            ((this.isAvailable==null && other.getIsAvailable()==null) || 
             (this.isAvailable!=null &&
              this.isAvailable.equals(other.getIsAvailable()))) &&
            ((this.availabilityComment==null && other.getAvailabilityComment()==null) || 
             (this.availabilityComment!=null &&
              java.util.Arrays.equals(this.availabilityComment, other.getAvailabilityComment()))) &&
            ((this.availabilityDate==null && other.getAvailabilityDate()==null) || 
             (this.availabilityDate!=null &&
              this.availabilityDate.equals(other.getAvailabilityDate()))) &&
            ((this.URI==null && other.getURI()==null) || 
             (this.URI!=null &&
              java.util.Arrays.equals(this.URI, other.getURI()))) &&
            this.isDownloadProduct == other.isIsDownloadProduct() &&
            ((this.maxDownloadTime==null && other.getMaxDownloadTime()==null) || 
             (this.maxDownloadTime!=null &&
              this.maxDownloadTime.equals(other.getMaxDownloadTime()))) &&
            ((this.maxDownloadCount==null && other.getMaxDownloadCount()==null) || 
             (this.maxDownloadCount!=null &&
              this.maxDownloadCount.equals(other.getMaxDownloadCount()))) &&
            ((this.downloadProductMaps==null && other.getDownloadProductMaps()==null) || 
             (this.downloadProductMaps!=null &&
              java.util.Arrays.equals(this.downloadProductMaps, other.getDownloadProductMaps()))) &&
            ((this.superProduct==null && other.getSuperProduct()==null) || 
             (this.superProduct!=null &&
              this.superProduct.equals(other.getSuperProduct()))) &&
            ((this.defaultSubProduct==null && other.getDefaultSubProduct()==null) || 
             (this.defaultSubProduct!=null &&
              this.defaultSubProduct.equals(other.getDefaultSubProduct()))) &&
            ((this.isDefault==null && other.getIsDefault()==null) || 
             (this.isDefault!=null &&
              this.isDefault.equals(other.getIsDefault()))) &&
            ((this.hasSubOwnPrices==null && other.getHasSubOwnPrices()==null) || 
             (this.hasSubOwnPrices!=null &&
              this.hasSubOwnPrices.equals(other.getHasSubOwnPrices()))) &&
            ((this.variationAttributes==null && other.getVariationAttributes()==null) || 
             (this.variationAttributes!=null &&
              java.util.Arrays.equals(this.variationAttributes, other.getVariationAttributes()))) &&
            ((this.productPrices==null && other.getProductPrices()==null) || 
             (this.productPrices!=null &&
              java.util.Arrays.equals(this.productPrices, other.getProductPrices()))) &&
            ((this.manufacturerPrices==null && other.getManufacturerPrices()==null) || 
             (this.manufacturerPrices!=null &&
              java.util.Arrays.equals(this.manufacturerPrices, other.getManufacturerPrices()))) &&
            ((this.depositPrices==null && other.getDepositPrices()==null) || 
             (this.depositPrices!=null &&
              java.util.Arrays.equals(this.depositPrices, other.getDepositPrices()))) &&
            ((this.ecoParticipationPrices==null && other.getEcoParticipationPrices()==null) || 
             (this.ecoParticipationPrices!=null &&
              java.util.Arrays.equals(this.ecoParticipationPrices, other.getEcoParticipationPrices()))) &&
            ((this.prepaymentPrices==null && other.getPrepaymentPrices()==null) || 
             (this.prepaymentPrices!=null &&
              java.util.Arrays.equals(this.prepaymentPrices, other.getPrepaymentPrices()))) &&
            ((this.prepaymentType==null && other.getPrepaymentType()==null) || 
             (this.prepaymentType!=null &&
              this.prepaymentType.equals(other.getPrepaymentType()))) &&
            ((this.prepaymentValue==null && other.getPrepaymentValue()==null) || 
             (this.prepaymentValue!=null &&
              this.prepaymentValue.equals(other.getPrepaymentValue()))) &&
            ((this.shippingMethods==null && other.getShippingMethods()==null) || 
             (this.shippingMethods!=null &&
              java.util.Arrays.equals(this.shippingMethods, other.getShippingMethods()))) &&
            ((this.attributes==null && other.getAttributes()==null) || 
             (this.attributes!=null &&
              java.util.Arrays.equals(this.attributes, other.getAttributes())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getAlias() != null) {
            _hashCode += getAlias().hashCode();
        }
        if (get_class() != null) {
            _hashCode += get_class().hashCode();
        }
        if (getName() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getName());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getName(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getDescription() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getDescription());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getDescription(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getText() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getText());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getText(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getKeywords() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getKeywords());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getKeywords(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getTitle() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getTitle());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getTitle(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getTaxClass() != null) {
            _hashCode += getTaxClass().hashCode();
        }
        if (getIsVisible() != null) {
            _hashCode += getIsVisible().hashCode();
        }
        if (getIsNew() != null) {
            _hashCode += getIsNew().hashCode();
        }
        if (getIsDailyPrice() != null) {
            _hashCode += getIsDailyPrice().hashCode();
        }
        if (getOrderUnit() != null) {
            _hashCode += getOrderUnit().hashCode();
        }
        if (getPriceQuantity() != null) {
            _hashCode += getPriceQuantity().hashCode();
        }
        if (getMinOrder() != null) {
            _hashCode += getMinOrder().hashCode();
        }
        if (getIntervalOrder() != null) {
            _hashCode += getIntervalOrder().hashCode();
        }
        if (getWeightUnit() != null) {
            _hashCode += getWeightUnit().hashCode();
        }
        if (getWeight() != null) {
            _hashCode += getWeight().hashCode();
        }
        if (getRefUnit() != null) {
            _hashCode += getRefUnit().hashCode();
        }
        if (getRefAmount() != null) {
            _hashCode += getRefAmount().hashCode();
        }
        if (getRefContentAmount() != null) {
            _hashCode += getRefContentAmount().hashCode();
        }
        if (getStockLevel() != null) {
            _hashCode += getStockLevel().hashCode();
        }
        if (getStockLevelAlert() != null) {
            _hashCode += getStockLevelAlert().hashCode();
        }
        if (getManufacturer() != null) {
            _hashCode += getManufacturer().hashCode();
        }
        if (getManufacturerSKU() != null) {
            _hashCode += getManufacturerSKU().hashCode();
        }
        if (getDeliveryPeriod() != null) {
            _hashCode += getDeliveryPeriod().hashCode();
        }
        if (getLength() != null) {
            _hashCode += getLength().hashCode();
        }
        if (getWidth() != null) {
            _hashCode += getWidth().hashCode();
        }
        if (getHeight() != null) {
            _hashCode += getHeight().hashCode();
        }
        if (getIsAvailable() != null) {
            _hashCode += getIsAvailable().hashCode();
        }
        if (getAvailabilityComment() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAvailabilityComment());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAvailabilityComment(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getAvailabilityDate() != null) {
            _hashCode += getAvailabilityDate().hashCode();
        }
        if (getURI() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getURI());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getURI(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        _hashCode += (isIsDownloadProduct() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getMaxDownloadTime() != null) {
            _hashCode += getMaxDownloadTime().hashCode();
        }
        if (getMaxDownloadCount() != null) {
            _hashCode += getMaxDownloadCount().hashCode();
        }
        if (getDownloadProductMaps() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getDownloadProductMaps());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getDownloadProductMaps(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getSuperProduct() != null) {
            _hashCode += getSuperProduct().hashCode();
        }
        if (getDefaultSubProduct() != null) {
            _hashCode += getDefaultSubProduct().hashCode();
        }
        if (getIsDefault() != null) {
            _hashCode += getIsDefault().hashCode();
        }
        if (getHasSubOwnPrices() != null) {
            _hashCode += getHasSubOwnPrices().hashCode();
        }
        if (getVariationAttributes() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getVariationAttributes());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getVariationAttributes(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getProductPrices() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getProductPrices());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getProductPrices(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getManufacturerPrices() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getManufacturerPrices());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getManufacturerPrices(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getDepositPrices() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getDepositPrices());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getDepositPrices(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getEcoParticipationPrices() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getEcoParticipationPrices());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getEcoParticipationPrices(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getPrepaymentPrices() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPrepaymentPrices());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPrepaymentPrices(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getPrepaymentType() != null) {
            _hashCode += getPrepaymentType().hashCode();
        }
        if (getPrepaymentValue() != null) {
            _hashCode += getPrepaymentValue().hashCode();
        }
        if (getShippingMethods() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getShippingMethods());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getShippingMethods(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getAttributes() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAttributes());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAttributes(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(TCreate_Input.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn://epages.de/WebService/ProductTypes/2011/10", "TCreate_Input"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("alias");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Alias"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("_class");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Class"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("name");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Name"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn://epages.de/WebService/EpagesTypes/2005/01", "TLocalizedValue"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("description");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Description"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn://epages.de/WebService/EpagesTypes/2005/01", "TLocalizedValue"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("text");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Text"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn://epages.de/WebService/EpagesTypes/2005/01", "TLocalizedValue"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("keywords");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Keywords"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn://epages.de/WebService/EpagesTypes/2005/01", "TLocalizedValue"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("title");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Title"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn://epages.de/WebService/EpagesTypes/2005/01", "TLocalizedValue"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("taxClass");
        elemField.setXmlName(new javax.xml.namespace.QName("", "TaxClass"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isVisible");
        elemField.setXmlName(new javax.xml.namespace.QName("", "IsVisible"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isNew");
        elemField.setXmlName(new javax.xml.namespace.QName("", "IsNew"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isDailyPrice");
        elemField.setXmlName(new javax.xml.namespace.QName("", "IsDailyPrice"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("orderUnit");
        elemField.setXmlName(new javax.xml.namespace.QName("", "OrderUnit"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("priceQuantity");
        elemField.setXmlName(new javax.xml.namespace.QName("", "PriceQuantity"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "float"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("minOrder");
        elemField.setXmlName(new javax.xml.namespace.QName("", "MinOrder"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "float"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("intervalOrder");
        elemField.setXmlName(new javax.xml.namespace.QName("", "IntervalOrder"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "float"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("weightUnit");
        elemField.setXmlName(new javax.xml.namespace.QName("", "WeightUnit"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("weight");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Weight"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "float"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("refUnit");
        elemField.setXmlName(new javax.xml.namespace.QName("", "RefUnit"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("refAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("", "RefAmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "float"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("refContentAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("", "RefContentAmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "float"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("stockLevel");
        elemField.setXmlName(new javax.xml.namespace.QName("", "StockLevel"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "float"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("stockLevelAlert");
        elemField.setXmlName(new javax.xml.namespace.QName("", "StockLevelAlert"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "float"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("manufacturer");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Manufacturer"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("manufacturerSKU");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ManufacturerSKU"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("deliveryPeriod");
        elemField.setXmlName(new javax.xml.namespace.QName("", "DeliveryPeriod"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("length");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Length"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "float"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("width");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Width"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "float"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("height");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Height"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "float"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isAvailable");
        elemField.setXmlName(new javax.xml.namespace.QName("", "IsAvailable"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("availabilityComment");
        elemField.setXmlName(new javax.xml.namespace.QName("", "AvailabilityComment"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn://epages.de/WebService/EpagesTypes/2005/01", "TLocalizedValue"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("availabilityDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "AvailabilityDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("URI");
        elemField.setXmlName(new javax.xml.namespace.QName("", "URI"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn://epages.de/WebService/EpagesTypes/2005/01", "TLocalizedValue"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isDownloadProduct");
        elemField.setXmlName(new javax.xml.namespace.QName("", "IsDownloadProduct"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("maxDownloadTime");
        elemField.setXmlName(new javax.xml.namespace.QName("", "MaxDownloadTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "integer"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("maxDownloadCount");
        elemField.setXmlName(new javax.xml.namespace.QName("", "MaxDownloadCount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "integer"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("downloadProductMaps");
        elemField.setXmlName(new javax.xml.namespace.QName("", "DownloadProductMaps"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn://epages.de/WebService/ProductTypes/2011/10", "TDownload"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("superProduct");
        elemField.setXmlName(new javax.xml.namespace.QName("", "SuperProduct"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("defaultSubProduct");
        elemField.setXmlName(new javax.xml.namespace.QName("", "DefaultSubProduct"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isDefault");
        elemField.setXmlName(new javax.xml.namespace.QName("", "IsDefault"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("hasSubOwnPrices");
        elemField.setXmlName(new javax.xml.namespace.QName("", "HasSubOwnPrices"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("variationAttributes");
        elemField.setXmlName(new javax.xml.namespace.QName("", "VariationAttributes"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn://epages.de/WebService/EpagesTypes/2005/01", "TAttribute"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("productPrices");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ProductPrices"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn://epages.de/WebService/ProductTypes/2011/10", "TProductPrice"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("manufacturerPrices");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ManufacturerPrices"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn://epages.de/WebService/ProductTypes/2011/10", "TProductPrice"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("depositPrices");
        elemField.setXmlName(new javax.xml.namespace.QName("", "DepositPrices"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn://epages.de/WebService/ProductTypes/2011/10", "TProductPrice"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ecoParticipationPrices");
        elemField.setXmlName(new javax.xml.namespace.QName("", "EcoParticipationPrices"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn://epages.de/WebService/ProductTypes/2011/10", "TProductPrice"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("prepaymentPrices");
        elemField.setXmlName(new javax.xml.namespace.QName("", "PrepaymentPrices"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn://epages.de/WebService/ProductTypes/2011/10", "TProductPrice"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("prepaymentType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "PrepaymentType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("prepaymentValue");
        elemField.setXmlName(new javax.xml.namespace.QName("", "PrepaymentValue"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "float"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("shippingMethods");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ShippingMethods"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn://epages.de/WebService/ProductTypes/2011/10", "TShippingMethod"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("attributes");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Attributes"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn://epages.de/WebService/EpagesTypes/2005/01", "TAttribute"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
