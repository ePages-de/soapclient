/**
 * Bind_Product_SOAPStub.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package de.epages.webservice.product11.stub;

public class Bind_Product_SOAPStub extends org.apache.axis.client.Stub implements de.epages.webservice.product11.stub.Port_Product {
    private java.util.Vector cachedSerClasses = new java.util.Vector();
    private java.util.Vector cachedSerQNames = new java.util.Vector();
    private java.util.Vector cachedSerFactories = new java.util.Vector();
    private java.util.Vector cachedDeserFactories = new java.util.Vector();

    static org.apache.axis.description.OperationDesc [] _operations;

    static {
        _operations = new org.apache.axis.description.OperationDesc[6];
        _initOperationDesc1();
    }

    private static void _initOperationDesc1(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getInfo");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "Products"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn://epages.de/WebService/ProductService/2013/01", "type_GetInfo_In"), java.lang.String[].class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "Attributes"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn://epages.de/WebService/ProductService/2013/01", "type_AttributeNames_In"), java.lang.String[].class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "LanguageCodes"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn://epages.de/WebService/ProductService/2013/01", "type_LanguageCodes_In"), java.lang.String[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn://epages.de/WebService/ProductService/2013/01", "type_GetInfo_Out"));
        oper.setReturnClass(de.epages.webservice.product9.model.TGetInfo_Return[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "Products"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[0] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("exists");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "Products"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn://epages.de/WebService/ProductService/2013/01", "type_Exists_In"), java.lang.String[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn://epages.de/WebService/ProductService/2013/01", "type_Exists_Out"));
        oper.setReturnClass(de.epages.webservice.product9.model.TExists_Return[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "Products"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[1] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("delete");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "Products"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn://epages.de/WebService/ProductService/2013/01", "type_Delete_In"), java.lang.String[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn://epages.de/WebService/ProductService/2013/01", "type_Delete_Out"));
        oper.setReturnClass(de.epages.webservice.product9.model.TDelete_Return[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "Products"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[2] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("update");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "Products"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn://epages.de/WebService/ProductService/2013/01", "type_Update_In"), de.epages.webservice.product9.model.TUpdate_Input[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn://epages.de/WebService/ProductService/2013/01", "type_Update_Out"));
        oper.setReturnClass(de.epages.webservice.product9.model.TUpdate_Return[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "Products"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[3] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("create");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "Products"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn://epages.de/WebService/ProductService/2013/01", "type_Create_In"), de.epages.webservice.product9.model.TCreate_Input[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn://epages.de/WebService/ProductService/2013/01", "type_Create_Out"));
        oper.setReturnClass(de.epages.webservice.product9.model.TCreate_Return[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "Products"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[4] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("find");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "SearchParameters"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn://epages.de/WebService/ProductService/2013/01", "TFind_Input"), de.epages.webservice.product11.stub.TFind_Input.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn://epages.de/WebService/ProductService/2013/01", "type_Find_Out"));
        oper.setReturnClass(java.lang.String[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "Products"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[5] = oper;

    }

    public Bind_Product_SOAPStub() throws org.apache.axis.AxisFault {
         this(null);
    }

    public Bind_Product_SOAPStub(java.net.URL endpointURL, javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
         this(service);
         super.cachedEndpoint = endpointURL;
    }

    public Bind_Product_SOAPStub(javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
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
            qName = new javax.xml.namespace.QName("urn://epages.de/WebService/EpagesTypes/2013/01", "ListOfAttributes");
            cachedSerQNames.add(qName);
            cls = de.epages.webservice.common2.model.TAttribute[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn://epages.de/WebService/EpagesTypes/2013/01", "TAttribute");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn://epages.de/WebService/EpagesTypes/2013/01", "ListOfLocalizedValues");
            cachedSerQNames.add(qName);
            cls = de.epages.webservice.common2.model.TLocalizedValue[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn://epages.de/WebService/EpagesTypes/2013/01", "TLocalizedValue");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn://epages.de/WebService/EpagesTypes/2013/01", "TAttribute");
            cachedSerQNames.add(qName);
            cls = de.epages.webservice.common2.model.TAttribute.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn://epages.de/WebService/EpagesTypes/2013/01", "TError");
            cachedSerQNames.add(qName);
            cls = de.epages.webservice.common2.model.TError.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn://epages.de/WebService/EpagesTypes/2013/01", "TLocalizedValue");
            cachedSerQNames.add(qName);
            cls = de.epages.webservice.common2.model.TLocalizedValue.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn://epages.de/WebService/ProductService/2013/01", "TFind_Input");
            cachedSerQNames.add(qName);
            cls = de.epages.webservice.product11.stub.TFind_Input.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn://epages.de/WebService/ProductService/2013/01", "type_AttributeNames_In");
            cachedSerQNames.add(qName);
            cls = java.lang.String[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn://epages.de/WebService/ProductService/2013/01", "type_Create_In");
            cachedSerQNames.add(qName);
            cls = de.epages.webservice.product9.model.TCreate_Input[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn://epages.de/WebService/ProductTypes/2013/01", "TCreate_Input");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn://epages.de/WebService/ProductService/2013/01", "type_Create_Out");
            cachedSerQNames.add(qName);
            cls = de.epages.webservice.product9.model.TCreate_Return[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn://epages.de/WebService/ProductTypes/2013/01", "TCreate_Return");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn://epages.de/WebService/ProductService/2013/01", "type_Delete_In");
            cachedSerQNames.add(qName);
            cls = java.lang.String[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn://epages.de/WebService/ProductService/2013/01", "type_Delete_Out");
            cachedSerQNames.add(qName);
            cls = de.epages.webservice.product9.model.TDelete_Return[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn://epages.de/WebService/ProductTypes/2013/01", "TDelete_Return");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn://epages.de/WebService/ProductService/2013/01", "type_Exists_In");
            cachedSerQNames.add(qName);
            cls = java.lang.String[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn://epages.de/WebService/ProductService/2013/01", "type_Exists_Out");
            cachedSerQNames.add(qName);
            cls = de.epages.webservice.product9.model.TExists_Return[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn://epages.de/WebService/ProductTypes/2013/01", "TExists_Return");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn://epages.de/WebService/ProductService/2013/01", "type_Find_Out");
            cachedSerQNames.add(qName);
            cls = java.lang.String[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn://epages.de/WebService/ProductService/2013/01", "type_GetInfo_In");
            cachedSerQNames.add(qName);
            cls = java.lang.String[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn://epages.de/WebService/ProductService/2013/01", "type_GetInfo_Out");
            cachedSerQNames.add(qName);
            cls = de.epages.webservice.product9.model.TGetInfo_Return[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn://epages.de/WebService/ProductTypes/2013/01", "TGetInfo_Return");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn://epages.de/WebService/ProductService/2013/01", "type_LanguageCodes_In");
            cachedSerQNames.add(qName);
            cls = java.lang.String[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn://epages.de/WebService/ProductService/2013/01", "type_Update_In");
            cachedSerQNames.add(qName);
            cls = de.epages.webservice.product9.model.TUpdate_Input[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn://epages.de/WebService/ProductTypes/2013/01", "TUpdate_Input");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn://epages.de/WebService/ProductService/2013/01", "type_Update_Out");
            cachedSerQNames.add(qName);
            cls = de.epages.webservice.product9.model.TUpdate_Return[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn://epages.de/WebService/ProductTypes/2013/01", "TUpdate_Return");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn://epages.de/WebService/ProductTypes/2013/01", "ListOfDownloads");
            cachedSerQNames.add(qName);
            cls = de.epages.webservice.product9.model.TDownload[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn://epages.de/WebService/ProductTypes/2013/01", "TDownload");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn://epages.de/WebService/ProductTypes/2013/01", "ListOfProductPrices");
            cachedSerQNames.add(qName);
            cls = de.epages.webservice.product9.model.TProductPrice[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn://epages.de/WebService/ProductTypes/2013/01", "TProductPrice");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn://epages.de/WebService/ProductTypes/2013/01", "ListOfShippingMethods");
            cachedSerQNames.add(qName);
            cls = de.epages.webservice.product9.model.TShippingMethod[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn://epages.de/WebService/ProductTypes/2013/01", "TShippingMethod");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn://epages.de/WebService/ProductTypes/2013/01", "ListOfSubProducts");
            cachedSerQNames.add(qName);
            cls = java.lang.String[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn://epages.de/WebService/ProductTypes/2013/01", "TCreate_Input");
            cachedSerQNames.add(qName);
            cls = de.epages.webservice.product9.model.TCreate_Input.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn://epages.de/WebService/ProductTypes/2013/01", "TCreate_Return");
            cachedSerQNames.add(qName);
            cls = de.epages.webservice.product9.model.TCreate_Return.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn://epages.de/WebService/ProductTypes/2013/01", "TDelete_Return");
            cachedSerQNames.add(qName);
            cls = de.epages.webservice.product9.model.TDelete_Return.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn://epages.de/WebService/ProductTypes/2013/01", "TDownload");
            cachedSerQNames.add(qName);
            cls = de.epages.webservice.product9.model.TDownload.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn://epages.de/WebService/ProductTypes/2013/01", "TExists_Return");
            cachedSerQNames.add(qName);
            cls = de.epages.webservice.product9.model.TExists_Return.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn://epages.de/WebService/ProductTypes/2013/01", "TGetInfo_Return");
            cachedSerQNames.add(qName);
            cls = de.epages.webservice.product9.model.TGetInfo_Return.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn://epages.de/WebService/ProductTypes/2013/01", "TProductPrice");
            cachedSerQNames.add(qName);
            cls = de.epages.webservice.product9.model.TProductPrice.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn://epages.de/WebService/ProductTypes/2013/01", "TShippingMethod");
            cachedSerQNames.add(qName);
            cls = de.epages.webservice.product9.model.TShippingMethod.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn://epages.de/WebService/ProductTypes/2013/01", "TUpdate_Input");
            cachedSerQNames.add(qName);
            cls = de.epages.webservice.product9.model.TUpdate_Input.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn://epages.de/WebService/ProductTypes/2013/01", "TUpdate_Return");
            cachedSerQNames.add(qName);
            cls = de.epages.webservice.product9.model.TUpdate_Return.class;
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

    public de.epages.webservice.product9.model.TGetInfo_Return[] getInfo(java.lang.String[] products, java.lang.String[] attributes, java.lang.String[] languageCodes) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[0]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn://epages.de/WebService/ProductService/2013/01#getInfo");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn://epages.de/WebService/ProductService/2013/01", "getInfo"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {products, attributes, languageCodes});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (de.epages.webservice.product9.model.TGetInfo_Return[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (de.epages.webservice.product9.model.TGetInfo_Return[]) org.apache.axis.utils.JavaUtils.convert(_resp, de.epages.webservice.product9.model.TGetInfo_Return[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public de.epages.webservice.product9.model.TExists_Return[] exists(java.lang.String[] products) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[1]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn://epages.de/WebService/ProductService/2013/01#exists");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn://epages.de/WebService/ProductService/2013/01", "exists"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {products});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (de.epages.webservice.product9.model.TExists_Return[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (de.epages.webservice.product9.model.TExists_Return[]) org.apache.axis.utils.JavaUtils.convert(_resp, de.epages.webservice.product9.model.TExists_Return[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public de.epages.webservice.product9.model.TDelete_Return[] delete(java.lang.String[] products) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[2]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn://epages.de/WebService/ProductService/2013/01#delete");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn://epages.de/WebService/ProductService/2013/01", "delete"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {products});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (de.epages.webservice.product9.model.TDelete_Return[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (de.epages.webservice.product9.model.TDelete_Return[]) org.apache.axis.utils.JavaUtils.convert(_resp, de.epages.webservice.product9.model.TDelete_Return[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public de.epages.webservice.product9.model.TUpdate_Return[] update(de.epages.webservice.product9.model.TUpdate_Input[] products) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[3]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn://epages.de/WebService/ProductService/2013/01#update");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn://epages.de/WebService/ProductService/2013/01", "update"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {products});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (de.epages.webservice.product9.model.TUpdate_Return[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (de.epages.webservice.product9.model.TUpdate_Return[]) org.apache.axis.utils.JavaUtils.convert(_resp, de.epages.webservice.product9.model.TUpdate_Return[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public de.epages.webservice.product9.model.TCreate_Return[] create(de.epages.webservice.product9.model.TCreate_Input[] products) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[4]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn://epages.de/WebService/ProductService/2013/01#create");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn://epages.de/WebService/ProductService/2013/01", "create"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {products});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (de.epages.webservice.product9.model.TCreate_Return[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (de.epages.webservice.product9.model.TCreate_Return[]) org.apache.axis.utils.JavaUtils.convert(_resp, de.epages.webservice.product9.model.TCreate_Return[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public java.lang.String[] find(de.epages.webservice.product11.stub.TFind_Input searchParameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[5]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn://epages.de/WebService/ProductService/2013/01#find");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn://epages.de/WebService/ProductService/2013/01", "find"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {searchParameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (java.lang.String[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (java.lang.String[]) org.apache.axis.utils.JavaUtils.convert(_resp, java.lang.String[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

}
