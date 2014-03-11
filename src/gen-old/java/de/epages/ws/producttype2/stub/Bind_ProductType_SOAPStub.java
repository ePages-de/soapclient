/**
 * Bind_ProductType_SOAPStub.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package de.epages.ws.producttype2.stub;

public class Bind_ProductType_SOAPStub extends org.apache.axis.client.Stub implements de.epages.ws.producttype2.stub.Port_ProductType {
    private java.util.Vector cachedSerClasses = new java.util.Vector();
    private java.util.Vector cachedSerQNames = new java.util.Vector();
    private java.util.Vector cachedSerFactories = new java.util.Vector();
    private java.util.Vector cachedDeserFactories = new java.util.Vector();

    static org.apache.axis.description.OperationDesc [] _operations;

    static {
        _operations = new org.apache.axis.description.OperationDesc[19];
        _initOperationDesc1();
        _initOperationDesc2();
    }

    private static void _initOperationDesc1(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getBaseProductType");
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        oper.setReturnClass(java.lang.String.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "BaseProductType"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[0] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getInfo");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "ProductTypes"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn://epages.de/WebService/ProductTypeService2/2007/11", "type_GetInfo_In"), java.lang.String[].class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "Attributes"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn://epages.de/WebService/ProductTypeService2/2007/11", "type_AttributeNames_In"), java.lang.String[].class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "LanguageCodes"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn://epages.de/WebService/ProductTypeService2/2007/11", "type_LanguageCodes_In"), java.lang.String[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn://epages.de/WebService/ProductTypeService2/2007/11", "type_GetInfo_Out"));
        oper.setReturnClass(de.epages.ws.producttype2.model.TGetInfo_Return[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "ProductTypes"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[1] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getAllInfo");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "Attributes"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn://epages.de/WebService/ProductTypeService2/2007/11", "type_AttributeNames_In"), java.lang.String[].class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "LanguageCodes"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn://epages.de/WebService/ProductTypeService2/2007/11", "type_LanguageCodes_In"), java.lang.String[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn://epages.de/WebService/ProductTypeService2/2007/11", "type_GetInfo_Out"));
        oper.setReturnClass(de.epages.ws.producttype2.model.TGetInfo_Return[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "ProductTypes"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[2] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("exists");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "ProductTypes"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn://epages.de/WebService/ProductTypeService2/2007/11", "type_Exists_In"), java.lang.String[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn://epages.de/WebService/ProductTypeService2/2007/11", "type_Exists_Out"));
        oper.setReturnClass(de.epages.ws.producttype2.model.TExists_Return[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "ProductTypes"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[3] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("delete");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "ProductTypes"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn://epages.de/WebService/ProductTypeService2/2007/11", "type_Delete_In"), java.lang.String[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn://epages.de/WebService/ProductTypeService2/2007/11", "type_Delete_Out"));
        oper.setReturnClass(de.epages.ws.producttype2.model.TDelete_Return[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "ProductTypes"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[4] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("update");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "ProductTypes"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn://epages.de/WebService/ProductTypeService2/2007/11", "type_Update_In"), de.epages.ws.producttype2.model.TUpdate_Input[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn://epages.de/WebService/ProductTypeService2/2007/11", "type_Update_Out"));
        oper.setReturnClass(de.epages.ws.producttype2.model.TUpdate_Return[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "ProductTypes"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[5] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("create");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "ProductTypes"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn://epages.de/WebService/ProductTypeService2/2007/11", "type_Create_In"), de.epages.ws.producttype2.model.TCreate_Input[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn://epages.de/WebService/ProductTypeService2/2007/11", "type_Create_Out"));
        oper.setReturnClass(de.epages.ws.producttype2.model.TCreate_Return[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "ProductTypes"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[6] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getProductAttributeInfo");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "ProductType"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "ProductAttributes"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn://epages.de/WebService/ProductTypeService2/2007/11", "type_ProductAttributeNames_In"), java.lang.String[].class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "LanguageCodes"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn://epages.de/WebService/ProductTypeService2/2007/11", "type_LanguageCodes_In"), java.lang.String[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn://epages.de/WebService/ProductTypeService2/2007/11", "type_GetProductAttributeInfo_Out"));
        oper.setReturnClass(de.epages.ws.producttype2.model.TGetProductAttributeInfo_Return[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "ProductAttributes"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[7] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getAllProductAttributesInfo");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "ProductType"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "LanguageCodes"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn://epages.de/WebService/ProductTypeService2/2007/11", "type_LanguageCodes_In"), java.lang.String[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn://epages.de/WebService/ProductTypeService2/2007/11", "type_GetProductAttributeInfo_Out"));
        oper.setReturnClass(de.epages.ws.producttype2.model.TGetProductAttributeInfo_Return[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "ProductAttributes"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[8] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("existsProductAttribute");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "ProductType"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "ProductAttributes"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn://epages.de/WebService/ProductTypeService2/2007/11", "type_ProductAttributeNames_In"), java.lang.String[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn://epages.de/WebService/ProductTypeService2/2007/11", "type_ExistsProductAttribute_Out"));
        oper.setReturnClass(de.epages.ws.producttype2.model.TExistsProductAttribute_Return[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "ProductAttributes"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[9] = oper;

    }

    private static void _initOperationDesc2(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("deleteProductAttribute");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "ProductType"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "ProductAttributes"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn://epages.de/WebService/ProductTypeService2/2007/11", "type_ProductAttributeNames_In"), java.lang.String[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn://epages.de/WebService/ProductTypeService2/2007/11", "type_DeleteProductAttribute_Out"));
        oper.setReturnClass(de.epages.ws.producttype2.model.TDeleteProductAttribute_Return[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "ProductAttributes"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[10] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("updateProductAttribute");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "ProductType"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "ProductAttributes"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn://epages.de/WebService/ProductTypeService2/2007/11", "type_UpdateProductAttribute_In"), de.epages.ws.producttype2.model.TUpdateProductAttribute_Input[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn://epages.de/WebService/ProductTypeService2/2007/11", "type_UpdateProductAttribute_Out"));
        oper.setReturnClass(de.epages.ws.producttype2.model.TUpdateProductAttribute_Return[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "ProductAttributes"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[11] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("createProductAttribute");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "ProductType"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "ProductAttributes"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn://epages.de/WebService/ProductTypeService2/2007/11", "type_CreateProductAttribute_In"), de.epages.ws.producttype2.model.TCreateProductAttribute_Input[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn://epages.de/WebService/ProductTypeService2/2007/11", "type_CreateProductAttribute_Out"));
        oper.setReturnClass(de.epages.ws.producttype2.model.TCreateProductAttribute_Return[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "ProductAttributes"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[12] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getPreDefAttributeInfo");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "ProductAttribute"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "PreDefAttributes"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn://epages.de/WebService/ProductTypeService2/2007/11", "type_PreDefAttributeNames_In"), java.lang.String[].class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "LanguageCodes"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn://epages.de/WebService/ProductTypeService2/2007/11", "type_LanguageCodes_In"), java.lang.String[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn://epages.de/WebService/ProductTypeService2/2007/11", "type_GetPreDefAttributeInfo_Out"));
        oper.setReturnClass(de.epages.ws.producttype2.model.TGetPreDefAttributeInfo_Return[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "PreDefAttributes"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[13] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getAllPreDefAttributesInfo");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "ProductAttribute"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "LanguageCodes"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn://epages.de/WebService/ProductTypeService2/2007/11", "type_LanguageCodes_In"), java.lang.String[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn://epages.de/WebService/ProductTypeService2/2007/11", "type_GetPreDefAttributeInfo_Out"));
        oper.setReturnClass(de.epages.ws.producttype2.model.TGetPreDefAttributeInfo_Return[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "PreDefAttributes"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[14] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("existsPreDefAttribute");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "ProductAttribute"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "PreDefAttributes"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn://epages.de/WebService/ProductTypeService2/2007/11", "type_PreDefAttributeNames_In"), java.lang.String[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn://epages.de/WebService/ProductTypeService2/2007/11", "type_ExistsPreDefAttribute_Out"));
        oper.setReturnClass(de.epages.ws.producttype2.model.TExistsPreDefAttribute_Return[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "PreDefAttributes"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[15] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("deletePreDefAttribute");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "ProductAttribute"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "PreDefAttributes"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn://epages.de/WebService/ProductTypeService2/2007/11", "type_PreDefAttributeNames_In"), java.lang.String[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn://epages.de/WebService/ProductTypeService2/2007/11", "type_DeletePreDefAttribute_Out"));
        oper.setReturnClass(de.epages.ws.producttype2.model.TDeletePreDefAttribute_Return[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "PreDefAttributes"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[16] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("updatePreDefAttribute");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "ProductAttribute"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "PreDefAttributes"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn://epages.de/WebService/ProductTypeService2/2007/11", "type_UpdatePreDefAttribute_In"), de.epages.ws.producttype2.model.TUpdatePreDefAttribute_Input[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn://epages.de/WebService/ProductTypeService2/2007/11", "type_UpdatePreDefAttribute_Out"));
        oper.setReturnClass(de.epages.ws.producttype2.model.TUpdatePreDefAttribute_Return[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "PreDefAttributes"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[17] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("createPreDefAttribute");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "ProductAttribute"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "PreDefAttributes"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn://epages.de/WebService/ProductTypeService2/2007/11", "type_CreatePreDefAttribute_In"), de.epages.ws.producttype2.model.TCreatePreDefAttribute_Input[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn://epages.de/WebService/ProductTypeService2/2007/11", "type_CreatePreDefAttribute_Out"));
        oper.setReturnClass(de.epages.ws.producttype2.model.TCreatePreDefAttribute_Return[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "PreDefAttributes"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[18] = oper;

    }

    public Bind_ProductType_SOAPStub() throws org.apache.axis.AxisFault {
         this(null);
    }

    public Bind_ProductType_SOAPStub(java.net.URL endpointURL, javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
         this(service);
         super.cachedEndpoint = endpointURL;
    }

    public Bind_ProductType_SOAPStub(javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
        if (service == null) {
            super.service = new org.apache.axis.client.Service();
        } else {
            super.service = service;
        }
        ((org.apache.axis.client.Service)super.service).setTypeMappingVersion("1.2");
            java.lang.Class cls;
            javax.xml.namespace.QName qName;
            javax.xml.namespace.QName qName2;
            java.lang.Class beansf = org.apache.axis.encoding.ser.BeanSerializerFactory.class;
            java.lang.Class beandf = org.apache.axis.encoding.ser.BeanDeserializerFactory.class;
            java.lang.Class enumsf = org.apache.axis.encoding.ser.EnumSerializerFactory.class;
            java.lang.Class enumdf = org.apache.axis.encoding.ser.EnumDeserializerFactory.class;
            java.lang.Class arraysf = org.apache.axis.encoding.ser.ArraySerializerFactory.class;
            java.lang.Class arraydf = org.apache.axis.encoding.ser.ArrayDeserializerFactory.class;
            java.lang.Class simplesf = org.apache.axis.encoding.ser.SimpleSerializerFactory.class;
            java.lang.Class simpledf = org.apache.axis.encoding.ser.SimpleDeserializerFactory.class;
            java.lang.Class simplelistsf = org.apache.axis.encoding.ser.SimpleListSerializerFactory.class;
            java.lang.Class simplelistdf = org.apache.axis.encoding.ser.SimpleListDeserializerFactory.class;
            qName = new javax.xml.namespace.QName("urn://epages.de/WebService/EpagesTypes/2005/01", "ListOfAttributes");
            cachedSerQNames.add(qName);
            cls = de.epages.ws.common.model.TAttribute[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn://epages.de/WebService/EpagesTypes/2005/01", "TAttribute");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn://epages.de/WebService/EpagesTypes/2005/01", "ListOfLocalizedValues");
            cachedSerQNames.add(qName);
            cls = de.epages.ws.common.model.TLocalizedValue[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn://epages.de/WebService/EpagesTypes/2005/01", "TLocalizedValue");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn://epages.de/WebService/EpagesTypes/2005/01", "TAttribute");
            cachedSerQNames.add(qName);
            cls = de.epages.ws.common.model.TAttribute.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn://epages.de/WebService/EpagesTypes/2005/01", "TError");
            cachedSerQNames.add(qName);
            cls = de.epages.ws.common.model.TError.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn://epages.de/WebService/EpagesTypes/2005/01", "TLocalizedValue");
            cachedSerQNames.add(qName);
            cls = de.epages.ws.common.model.TLocalizedValue.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn://epages.de/WebService/ProductTypeService2/2007/11", "type_AttributeNames_In");
            cachedSerQNames.add(qName);
            cls = java.lang.String[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn://epages.de/WebService/ProductTypeService2/2007/11", "type_Create_In");
            cachedSerQNames.add(qName);
            cls = de.epages.ws.producttype2.model.TCreate_Input[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn://epages.de/WebService/ProductTypeTypes2/2007/11", "TCreate_Input");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn://epages.de/WebService/ProductTypeService2/2007/11", "type_Create_Out");
            cachedSerQNames.add(qName);
            cls = de.epages.ws.producttype2.model.TCreate_Return[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn://epages.de/WebService/ProductTypeTypes2/2007/11", "TCreate_Return");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn://epages.de/WebService/ProductTypeService2/2007/11", "type_CreatePreDefAttribute_In");
            cachedSerQNames.add(qName);
            cls = de.epages.ws.producttype2.model.TCreatePreDefAttribute_Input[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn://epages.de/WebService/ProductTypeTypes2/2007/11", "TCreatePreDefAttribute_Input");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn://epages.de/WebService/ProductTypeService2/2007/11", "type_CreatePreDefAttribute_Out");
            cachedSerQNames.add(qName);
            cls = de.epages.ws.producttype2.model.TCreatePreDefAttribute_Return[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn://epages.de/WebService/ProductTypeTypes2/2007/11", "TCreatePreDefAttribute_Return");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn://epages.de/WebService/ProductTypeService2/2007/11", "type_CreateProductAttribute_In");
            cachedSerQNames.add(qName);
            cls = de.epages.ws.producttype2.model.TCreateProductAttribute_Input[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn://epages.de/WebService/ProductTypeTypes2/2007/11", "TCreateProductAttribute_Input");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn://epages.de/WebService/ProductTypeService2/2007/11", "type_CreateProductAttribute_Out");
            cachedSerQNames.add(qName);
            cls = de.epages.ws.producttype2.model.TCreateProductAttribute_Return[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn://epages.de/WebService/ProductTypeTypes2/2007/11", "TCreateProductAttribute_Return");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn://epages.de/WebService/ProductTypeService2/2007/11", "type_Delete_In");
            cachedSerQNames.add(qName);
            cls = java.lang.String[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn://epages.de/WebService/ProductTypeService2/2007/11", "type_Delete_Out");
            cachedSerQNames.add(qName);
            cls = de.epages.ws.producttype2.model.TDelete_Return[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn://epages.de/WebService/ProductTypeTypes2/2007/11", "TDelete_Return");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn://epages.de/WebService/ProductTypeService2/2007/11", "type_DeletePreDefAttribute_Out");
            cachedSerQNames.add(qName);
            cls = de.epages.ws.producttype2.model.TDeletePreDefAttribute_Return[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn://epages.de/WebService/ProductTypeTypes2/2007/11", "TDeletePreDefAttribute_Return");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn://epages.de/WebService/ProductTypeService2/2007/11", "type_DeleteProductAttribute_Out");
            cachedSerQNames.add(qName);
            cls = de.epages.ws.producttype2.model.TDeleteProductAttribute_Return[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn://epages.de/WebService/ProductTypeTypes2/2007/11", "TDeleteProductAttribute_Return");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn://epages.de/WebService/ProductTypeService2/2007/11", "type_Exists_In");
            cachedSerQNames.add(qName);
            cls = java.lang.String[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn://epages.de/WebService/ProductTypeService2/2007/11", "type_Exists_Out");
            cachedSerQNames.add(qName);
            cls = de.epages.ws.producttype2.model.TExists_Return[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn://epages.de/WebService/ProductTypeTypes2/2007/11", "TExists_Return");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn://epages.de/WebService/ProductTypeService2/2007/11", "type_ExistsPreDefAttribute_Out");
            cachedSerQNames.add(qName);
            cls = de.epages.ws.producttype2.model.TExistsPreDefAttribute_Return[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn://epages.de/WebService/ProductTypeTypes2/2007/11", "TExistsPreDefAttribute_Return");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn://epages.de/WebService/ProductTypeService2/2007/11", "type_ExistsProductAttribute_Out");
            cachedSerQNames.add(qName);
            cls = de.epages.ws.producttype2.model.TExistsProductAttribute_Return[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn://epages.de/WebService/ProductTypeTypes2/2007/11", "TExistsProductAttribute_Return");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn://epages.de/WebService/ProductTypeService2/2007/11", "type_GetInfo_In");
            cachedSerQNames.add(qName);
            cls = java.lang.String[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn://epages.de/WebService/ProductTypeService2/2007/11", "type_GetInfo_Out");
            cachedSerQNames.add(qName);
            cls = de.epages.ws.producttype2.model.TGetInfo_Return[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn://epages.de/WebService/ProductTypeTypes2/2007/11", "TGetInfo_Return");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn://epages.de/WebService/ProductTypeService2/2007/11", "type_GetPreDefAttributeInfo_Out");
            cachedSerQNames.add(qName);
            cls = de.epages.ws.producttype2.model.TGetPreDefAttributeInfo_Return[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn://epages.de/WebService/ProductTypeTypes2/2007/11", "TGetPreDefAttributeInfo_Return");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn://epages.de/WebService/ProductTypeService2/2007/11", "type_GetProductAttributeInfo_Out");
            cachedSerQNames.add(qName);
            cls = de.epages.ws.producttype2.model.TGetProductAttributeInfo_Return[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn://epages.de/WebService/ProductTypeTypes2/2007/11", "TGetProductAttributeInfo_Return");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn://epages.de/WebService/ProductTypeService2/2007/11", "type_LanguageCodes_In");
            cachedSerQNames.add(qName);
            cls = java.lang.String[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn://epages.de/WebService/ProductTypeService2/2007/11", "type_PreDefAttributeNames_In");
            cachedSerQNames.add(qName);
            cls = java.lang.String[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn://epages.de/WebService/ProductTypeService2/2007/11", "type_ProductAttributeNames_In");
            cachedSerQNames.add(qName);
            cls = java.lang.String[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn://epages.de/WebService/ProductTypeService2/2007/11", "type_Update_In");
            cachedSerQNames.add(qName);
            cls = de.epages.ws.producttype2.model.TUpdate_Input[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn://epages.de/WebService/ProductTypeTypes2/2007/11", "TUpdate_Input");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn://epages.de/WebService/ProductTypeService2/2007/11", "type_Update_Out");
            cachedSerQNames.add(qName);
            cls = de.epages.ws.producttype2.model.TUpdate_Return[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn://epages.de/WebService/ProductTypeTypes2/2007/11", "TUpdate_Return");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn://epages.de/WebService/ProductTypeService2/2007/11", "type_UpdatePreDefAttribute_In");
            cachedSerQNames.add(qName);
            cls = de.epages.ws.producttype2.model.TUpdatePreDefAttribute_Input[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn://epages.de/WebService/ProductTypeTypes2/2007/11", "TUpdatePreDefAttribute_Input");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn://epages.de/WebService/ProductTypeService2/2007/11", "type_UpdatePreDefAttribute_Out");
            cachedSerQNames.add(qName);
            cls = de.epages.ws.producttype2.model.TUpdatePreDefAttribute_Return[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn://epages.de/WebService/ProductTypeTypes2/2007/11", "TUpdatePreDefAttribute_Return");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn://epages.de/WebService/ProductTypeService2/2007/11", "type_UpdateProductAttribute_In");
            cachedSerQNames.add(qName);
            cls = de.epages.ws.producttype2.model.TUpdateProductAttribute_Input[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn://epages.de/WebService/ProductTypeTypes2/2007/11", "TUpdateProductAttribute_Input");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn://epages.de/WebService/ProductTypeService2/2007/11", "type_UpdateProductAttribute_Out");
            cachedSerQNames.add(qName);
            cls = de.epages.ws.producttype2.model.TUpdateProductAttribute_Return[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn://epages.de/WebService/ProductTypeTypes2/2007/11", "TUpdateProductAttribute_Return");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn://epages.de/WebService/ProductTypeTypes2/2007/11", "TCreate_Input");
            cachedSerQNames.add(qName);
            cls = de.epages.ws.producttype2.model.TCreate_Input.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn://epages.de/WebService/ProductTypeTypes2/2007/11", "TCreate_Return");
            cachedSerQNames.add(qName);
            cls = de.epages.ws.producttype2.model.TCreate_Return.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn://epages.de/WebService/ProductTypeTypes2/2007/11", "TCreatePreDefAttribute_Input");
            cachedSerQNames.add(qName);
            cls = de.epages.ws.producttype2.model.TCreatePreDefAttribute_Input.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn://epages.de/WebService/ProductTypeTypes2/2007/11", "TCreatePreDefAttribute_Return");
            cachedSerQNames.add(qName);
            cls = de.epages.ws.producttype2.model.TCreatePreDefAttribute_Return.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn://epages.de/WebService/ProductTypeTypes2/2007/11", "TCreateProductAttribute_Input");
            cachedSerQNames.add(qName);
            cls = de.epages.ws.producttype2.model.TCreateProductAttribute_Input.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn://epages.de/WebService/ProductTypeTypes2/2007/11", "TCreateProductAttribute_Return");
            cachedSerQNames.add(qName);
            cls = de.epages.ws.producttype2.model.TCreateProductAttribute_Return.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn://epages.de/WebService/ProductTypeTypes2/2007/11", "TDelete_Return");
            cachedSerQNames.add(qName);
            cls = de.epages.ws.producttype2.model.TDelete_Return.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn://epages.de/WebService/ProductTypeTypes2/2007/11", "TDeletePreDefAttribute_Return");
            cachedSerQNames.add(qName);
            cls = de.epages.ws.producttype2.model.TDeletePreDefAttribute_Return.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn://epages.de/WebService/ProductTypeTypes2/2007/11", "TDeleteProductAttribute_Return");
            cachedSerQNames.add(qName);
            cls = de.epages.ws.producttype2.model.TDeleteProductAttribute_Return.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn://epages.de/WebService/ProductTypeTypes2/2007/11", "TExists_Return");
            cachedSerQNames.add(qName);
            cls = de.epages.ws.producttype2.model.TExists_Return.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn://epages.de/WebService/ProductTypeTypes2/2007/11", "TExistsPreDefAttribute_Return");
            cachedSerQNames.add(qName);
            cls = de.epages.ws.producttype2.model.TExistsPreDefAttribute_Return.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn://epages.de/WebService/ProductTypeTypes2/2007/11", "TExistsProductAttribute_Return");
            cachedSerQNames.add(qName);
            cls = de.epages.ws.producttype2.model.TExistsProductAttribute_Return.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn://epages.de/WebService/ProductTypeTypes2/2007/11", "TGetInfo_Return");
            cachedSerQNames.add(qName);
            cls = de.epages.ws.producttype2.model.TGetInfo_Return.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn://epages.de/WebService/ProductTypeTypes2/2007/11", "TGetPreDefAttributeInfo_Return");
            cachedSerQNames.add(qName);
            cls = de.epages.ws.producttype2.model.TGetPreDefAttributeInfo_Return.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn://epages.de/WebService/ProductTypeTypes2/2007/11", "TGetProductAttributeInfo_Return");
            cachedSerQNames.add(qName);
            cls = de.epages.ws.producttype2.model.TGetProductAttributeInfo_Return.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn://epages.de/WebService/ProductTypeTypes2/2007/11", "TUpdate_Input");
            cachedSerQNames.add(qName);
            cls = de.epages.ws.producttype2.model.TUpdate_Input.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn://epages.de/WebService/ProductTypeTypes2/2007/11", "TUpdate_Return");
            cachedSerQNames.add(qName);
            cls = de.epages.ws.producttype2.model.TUpdate_Return.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn://epages.de/WebService/ProductTypeTypes2/2007/11", "TUpdatePreDefAttribute_Input");
            cachedSerQNames.add(qName);
            cls = de.epages.ws.producttype2.model.TUpdatePreDefAttribute_Input.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn://epages.de/WebService/ProductTypeTypes2/2007/11", "TUpdatePreDefAttribute_Return");
            cachedSerQNames.add(qName);
            cls = de.epages.ws.producttype2.model.TUpdatePreDefAttribute_Return.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn://epages.de/WebService/ProductTypeTypes2/2007/11", "TUpdateProductAttribute_Input");
            cachedSerQNames.add(qName);
            cls = de.epages.ws.producttype2.model.TUpdateProductAttribute_Input.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn://epages.de/WebService/ProductTypeTypes2/2007/11", "TUpdateProductAttribute_Return");
            cachedSerQNames.add(qName);
            cls = de.epages.ws.producttype2.model.TUpdateProductAttribute_Return.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

    }

    protected org.apache.axis.client.Call createCall() throws java.rmi.RemoteException {
        try {
            org.apache.axis.client.Call _call = super._createCall();
            if (super.maintainSessionSet) {
                _call.setMaintainSession(super.maintainSession);
            }
            if (super.cachedUsername != null) {
                _call.setUsername(super.cachedUsername);
            }
            if (super.cachedPassword != null) {
                _call.setPassword(super.cachedPassword);
            }
            if (super.cachedEndpoint != null) {
                _call.setTargetEndpointAddress(super.cachedEndpoint);
            }
            if (super.cachedTimeout != null) {
                _call.setTimeout(super.cachedTimeout);
            }
            if (super.cachedPortName != null) {
                _call.setPortName(super.cachedPortName);
            }
            java.util.Enumeration keys = super.cachedProperties.keys();
            while (keys.hasMoreElements()) {
                java.lang.String key = (java.lang.String) keys.nextElement();
                _call.setProperty(key, super.cachedProperties.get(key));
            }
            // All the type mapping information is registered
            // when the first call is made.
            // The type mapping information is actually registered in
            // the TypeMappingRegistry of the service, which
            // is the reason why registration is only needed for the first call.
            synchronized (this) {
                if (firstCall()) {
                    // must set encoding style before registering serializers
                    _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
                    _call.setEncodingStyle(org.apache.axis.Constants.URI_SOAP11_ENC);
                    for (int i = 0; i < cachedSerFactories.size(); ++i) {
                        java.lang.Class cls = (java.lang.Class) cachedSerClasses.get(i);
                        javax.xml.namespace.QName qName =
                                (javax.xml.namespace.QName) cachedSerQNames.get(i);
                        java.lang.Object x = cachedSerFactories.get(i);
                        if (x instanceof Class) {
                            java.lang.Class sf = (java.lang.Class)
                                 cachedSerFactories.get(i);
                            java.lang.Class df = (java.lang.Class)
                                 cachedDeserFactories.get(i);
                            _call.registerTypeMapping(cls, qName, sf, df, false);
                        }
                        else if (x instanceof javax.xml.rpc.encoding.SerializerFactory) {
                            org.apache.axis.encoding.SerializerFactory sf = (org.apache.axis.encoding.SerializerFactory)
                                 cachedSerFactories.get(i);
                            org.apache.axis.encoding.DeserializerFactory df = (org.apache.axis.encoding.DeserializerFactory)
                                 cachedDeserFactories.get(i);
                            _call.registerTypeMapping(cls, qName, sf, df, false);
                        }
                    }
                }
            }
            return _call;
        }
        catch (java.lang.Throwable _t) {
            throw new org.apache.axis.AxisFault("Failure trying to get the Call object", _t);
        }
    }

    public java.lang.String getBaseProductType() throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[0]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn://epages.de/WebService/ProductTypeService2/2007/11#getBaseProductType");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn://epages.de/WebService/ProductTypeService2/2007/11", "getBaseProductType"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (java.lang.String) _resp;
            } catch (java.lang.Exception _exception) {
                return (java.lang.String) org.apache.axis.utils.JavaUtils.convert(_resp, java.lang.String.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public de.epages.ws.producttype2.model.TGetInfo_Return[] getInfo(java.lang.String[] productTypes, java.lang.String[] attributes, java.lang.String[] languageCodes) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[1]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn://epages.de/WebService/ProductTypeService2/2007/11#getInfo");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn://epages.de/WebService/ProductTypeService2/2007/11", "getInfo"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {productTypes, attributes, languageCodes});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (de.epages.ws.producttype2.model.TGetInfo_Return[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (de.epages.ws.producttype2.model.TGetInfo_Return[]) org.apache.axis.utils.JavaUtils.convert(_resp, de.epages.ws.producttype2.model.TGetInfo_Return[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public de.epages.ws.producttype2.model.TGetInfo_Return[] getAllInfo(java.lang.String[] attributes, java.lang.String[] languageCodes) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[2]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn://epages.de/WebService/ProductTypeService2/2007/11#getAllInfo");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn://epages.de/WebService/ProductTypeService2/2007/11", "getAllInfo"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {attributes, languageCodes});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (de.epages.ws.producttype2.model.TGetInfo_Return[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (de.epages.ws.producttype2.model.TGetInfo_Return[]) org.apache.axis.utils.JavaUtils.convert(_resp, de.epages.ws.producttype2.model.TGetInfo_Return[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public de.epages.ws.producttype2.model.TExists_Return[] exists(java.lang.String[] productTypes) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[3]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn://epages.de/WebService/ProductTypeService2/2007/11#exists");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn://epages.de/WebService/ProductTypeService2/2007/11", "exists"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {productTypes});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (de.epages.ws.producttype2.model.TExists_Return[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (de.epages.ws.producttype2.model.TExists_Return[]) org.apache.axis.utils.JavaUtils.convert(_resp, de.epages.ws.producttype2.model.TExists_Return[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public de.epages.ws.producttype2.model.TDelete_Return[] delete(java.lang.String[] productTypes) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[4]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn://epages.de/WebService/ProductTypeService2/2007/11#delete");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn://epages.de/WebService/ProductTypeService2/2007/11", "delete"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {productTypes});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (de.epages.ws.producttype2.model.TDelete_Return[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (de.epages.ws.producttype2.model.TDelete_Return[]) org.apache.axis.utils.JavaUtils.convert(_resp, de.epages.ws.producttype2.model.TDelete_Return[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public de.epages.ws.producttype2.model.TUpdate_Return[] update(de.epages.ws.producttype2.model.TUpdate_Input[] productTypes) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[5]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn://epages.de/WebService/ProductTypeService2/2007/11#update");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn://epages.de/WebService/ProductTypeService2/2007/11", "update"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {productTypes});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (de.epages.ws.producttype2.model.TUpdate_Return[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (de.epages.ws.producttype2.model.TUpdate_Return[]) org.apache.axis.utils.JavaUtils.convert(_resp, de.epages.ws.producttype2.model.TUpdate_Return[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public de.epages.ws.producttype2.model.TCreate_Return[] create(de.epages.ws.producttype2.model.TCreate_Input[] productTypes) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[6]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn://epages.de/WebService/ProductTypeService2/2007/11#create");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn://epages.de/WebService/ProductTypeService2/2007/11", "create"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {productTypes});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (de.epages.ws.producttype2.model.TCreate_Return[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (de.epages.ws.producttype2.model.TCreate_Return[]) org.apache.axis.utils.JavaUtils.convert(_resp, de.epages.ws.producttype2.model.TCreate_Return[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public de.epages.ws.producttype2.model.TGetProductAttributeInfo_Return[] getProductAttributeInfo(java.lang.String productType, java.lang.String[] productAttributes, java.lang.String[] languageCodes) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[7]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn://epages.de/WebService/ProductTypeService2/2007/11#getProductAttributeInfo");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn://epages.de/WebService/ProductTypeService2/2007/11", "getProductAttributeInfo"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {productType, productAttributes, languageCodes});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (de.epages.ws.producttype2.model.TGetProductAttributeInfo_Return[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (de.epages.ws.producttype2.model.TGetProductAttributeInfo_Return[]) org.apache.axis.utils.JavaUtils.convert(_resp, de.epages.ws.producttype2.model.TGetProductAttributeInfo_Return[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public de.epages.ws.producttype2.model.TGetProductAttributeInfo_Return[] getAllProductAttributesInfo(java.lang.String productType, java.lang.String[] languageCodes) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[8]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn://epages.de/WebService/ProductTypeService2/2007/11#getAllProductAttributesInfo");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn://epages.de/WebService/ProductTypeService2/2007/11", "getAllProductAttributesInfo"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {productType, languageCodes});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (de.epages.ws.producttype2.model.TGetProductAttributeInfo_Return[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (de.epages.ws.producttype2.model.TGetProductAttributeInfo_Return[]) org.apache.axis.utils.JavaUtils.convert(_resp, de.epages.ws.producttype2.model.TGetProductAttributeInfo_Return[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public de.epages.ws.producttype2.model.TExistsProductAttribute_Return[] existsProductAttribute(java.lang.String productType, java.lang.String[] productAttributes) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[9]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn://epages.de/WebService/ProductTypeService2/2007/11#existsProductAttribute");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn://epages.de/WebService/ProductTypeService2/2007/11", "existsProductAttribute"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {productType, productAttributes});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (de.epages.ws.producttype2.model.TExistsProductAttribute_Return[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (de.epages.ws.producttype2.model.TExistsProductAttribute_Return[]) org.apache.axis.utils.JavaUtils.convert(_resp, de.epages.ws.producttype2.model.TExistsProductAttribute_Return[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public de.epages.ws.producttype2.model.TDeleteProductAttribute_Return[] deleteProductAttribute(java.lang.String productType, java.lang.String[] productAttributes) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[10]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn://epages.de/WebService/ProductTypeService2/2007/11#deleteProductAttribute");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn://epages.de/WebService/ProductTypeService2/2007/11", "deleteProductAttribute"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {productType, productAttributes});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (de.epages.ws.producttype2.model.TDeleteProductAttribute_Return[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (de.epages.ws.producttype2.model.TDeleteProductAttribute_Return[]) org.apache.axis.utils.JavaUtils.convert(_resp, de.epages.ws.producttype2.model.TDeleteProductAttribute_Return[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public de.epages.ws.producttype2.model.TUpdateProductAttribute_Return[] updateProductAttribute(java.lang.String productType, de.epages.ws.producttype2.model.TUpdateProductAttribute_Input[] productAttributes) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[11]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn://epages.de/WebService/ProductTypeService2/2007/11#updateProductAttribute");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn://epages.de/WebService/ProductTypeService2/2007/11", "updateProductAttribute"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {productType, productAttributes});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (de.epages.ws.producttype2.model.TUpdateProductAttribute_Return[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (de.epages.ws.producttype2.model.TUpdateProductAttribute_Return[]) org.apache.axis.utils.JavaUtils.convert(_resp, de.epages.ws.producttype2.model.TUpdateProductAttribute_Return[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public de.epages.ws.producttype2.model.TCreateProductAttribute_Return[] createProductAttribute(java.lang.String productType, de.epages.ws.producttype2.model.TCreateProductAttribute_Input[] productAttributes) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[12]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn://epages.de/WebService/ProductTypeService2/2007/11#createProductAttribute");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn://epages.de/WebService/ProductTypeService2/2007/11", "createProductAttribute"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {productType, productAttributes});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (de.epages.ws.producttype2.model.TCreateProductAttribute_Return[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (de.epages.ws.producttype2.model.TCreateProductAttribute_Return[]) org.apache.axis.utils.JavaUtils.convert(_resp, de.epages.ws.producttype2.model.TCreateProductAttribute_Return[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public de.epages.ws.producttype2.model.TGetPreDefAttributeInfo_Return[] getPreDefAttributeInfo(java.lang.String productAttribute, java.lang.String[] preDefAttributes, java.lang.String[] languageCodes) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[13]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn://epages.de/WebService/ProductTypeService2/2007/11#getPreDefAttributeInfo");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn://epages.de/WebService/ProductTypeService2/2007/11", "getPreDefAttributeInfo"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {productAttribute, preDefAttributes, languageCodes});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (de.epages.ws.producttype2.model.TGetPreDefAttributeInfo_Return[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (de.epages.ws.producttype2.model.TGetPreDefAttributeInfo_Return[]) org.apache.axis.utils.JavaUtils.convert(_resp, de.epages.ws.producttype2.model.TGetPreDefAttributeInfo_Return[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public de.epages.ws.producttype2.model.TGetPreDefAttributeInfo_Return[] getAllPreDefAttributesInfo(java.lang.String productAttribute, java.lang.String[] languageCodes) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[14]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn://epages.de/WebService/ProductTypeService2/2007/11#getAllPreDefAttributesInfo");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn://epages.de/WebService/ProductTypeService2/2007/11", "getAllPreDefAttributesInfo"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {productAttribute, languageCodes});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (de.epages.ws.producttype2.model.TGetPreDefAttributeInfo_Return[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (de.epages.ws.producttype2.model.TGetPreDefAttributeInfo_Return[]) org.apache.axis.utils.JavaUtils.convert(_resp, de.epages.ws.producttype2.model.TGetPreDefAttributeInfo_Return[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public de.epages.ws.producttype2.model.TExistsPreDefAttribute_Return[] existsPreDefAttribute(java.lang.String productAttribute, java.lang.String[] preDefAttributes) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[15]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn://epages.de/WebService/ProductTypeService2/2007/11#existsPreDefAttribute");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn://epages.de/WebService/ProductTypeService2/2007/11", "existsPreDefAttribute"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {productAttribute, preDefAttributes});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (de.epages.ws.producttype2.model.TExistsPreDefAttribute_Return[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (de.epages.ws.producttype2.model.TExistsPreDefAttribute_Return[]) org.apache.axis.utils.JavaUtils.convert(_resp, de.epages.ws.producttype2.model.TExistsPreDefAttribute_Return[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public de.epages.ws.producttype2.model.TDeletePreDefAttribute_Return[] deletePreDefAttribute(java.lang.String productAttribute, java.lang.String[] preDefAttributes) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[16]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn://epages.de/WebService/ProductTypeService2/2007/11#deletePreDefAttribute");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn://epages.de/WebService/ProductTypeService2/2007/11", "deletePreDefAttribute"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {productAttribute, preDefAttributes});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (de.epages.ws.producttype2.model.TDeletePreDefAttribute_Return[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (de.epages.ws.producttype2.model.TDeletePreDefAttribute_Return[]) org.apache.axis.utils.JavaUtils.convert(_resp, de.epages.ws.producttype2.model.TDeletePreDefAttribute_Return[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public de.epages.ws.producttype2.model.TUpdatePreDefAttribute_Return[] updatePreDefAttribute(java.lang.String productAttribute, de.epages.ws.producttype2.model.TUpdatePreDefAttribute_Input[] preDefAttributes) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[17]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn://epages.de/WebService/ProductTypeService2/2007/11#updatePreDefAttribute");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn://epages.de/WebService/ProductTypeService2/2007/11", "updatePreDefAttribute"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {productAttribute, preDefAttributes});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (de.epages.ws.producttype2.model.TUpdatePreDefAttribute_Return[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (de.epages.ws.producttype2.model.TUpdatePreDefAttribute_Return[]) org.apache.axis.utils.JavaUtils.convert(_resp, de.epages.ws.producttype2.model.TUpdatePreDefAttribute_Return[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public de.epages.ws.producttype2.model.TCreatePreDefAttribute_Return[] createPreDefAttribute(java.lang.String productAttribute, de.epages.ws.producttype2.model.TCreatePreDefAttribute_Input[] preDefAttributes) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[18]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn://epages.de/WebService/ProductTypeService2/2007/11#createPreDefAttribute");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn://epages.de/WebService/ProductTypeService2/2007/11", "createPreDefAttribute"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {productAttribute, preDefAttributes});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (de.epages.ws.producttype2.model.TCreatePreDefAttribute_Return[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (de.epages.ws.producttype2.model.TCreatePreDefAttribute_Return[]) org.apache.axis.utils.JavaUtils.convert(_resp, de.epages.ws.producttype2.model.TCreatePreDefAttribute_Return[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

}
