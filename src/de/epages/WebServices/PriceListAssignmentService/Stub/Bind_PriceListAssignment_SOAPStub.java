/**
 * Bind_PriceListAssignment_SOAPStub.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.3 Oct 05, 2005 (05:23:37 EDT) WSDL2Java emitter.
 */

package de.epages.WebServices.PriceListAssignmentService.Stub;

public class Bind_PriceListAssignment_SOAPStub extends org.apache.axis.client.Stub implements de.epages.WebServices.PriceListAssignmentService.Stub.Port_PriceListAssignment_PortType {
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
        oper.setName("getScalePrices");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "Products"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn://epages.de/WebService/PriceListAssignmentService/2005/01", "type_GetScalePrices_In"), java.lang.String[].class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "PriceLists"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn://epages.de/WebService/PriceListAssignmentService/2005/01", "type_PriceLists_In"), java.lang.String[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn://epages.de/WebService/PriceListAssignmentService/2005/01", "type_GetScalePrices_Out"));
        oper.setReturnClass(de.epages.WebServices.PriceListAssignmentService.Stub.TGetScalePrices_Return[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "Products"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[0] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("setScalePrices");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "Products"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn://epages.de/WebService/PriceListAssignmentService/2005/01", "type_SetScalePrices_In"), de.epages.WebServices.PriceListAssignmentService.Stub.TSetScalePrices_Input[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn://epages.de/WebService/PriceListAssignmentService/2005/01", "type_SetScalePrices_Out"));
        oper.setReturnClass(de.epages.WebServices.PriceListAssignmentService.Stub.TSetScalePrices_Return[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "Products"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[1] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getQuantityDiscounts");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "Products"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn://epages.de/WebService/PriceListAssignmentService/2005/01", "type_GetQuantityDiscounts_In"), java.lang.String[].class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "PriceLists"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn://epages.de/WebService/PriceListAssignmentService/2005/01", "type_PriceLists_In"), java.lang.String[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn://epages.de/WebService/PriceListAssignmentService/2005/01", "type_GetQuantityDiscounts_Out"));
        oper.setReturnClass(de.epages.WebServices.PriceListAssignmentService.Stub.TGetQuantityDiscounts_Return[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "Products"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[2] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("setQuantityDiscounts");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "Products"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn://epages.de/WebService/PriceListAssignmentService/2005/01", "type_SetQuantityDiscounts_In"), de.epages.WebServices.PriceListAssignmentService.Stub.TSetQuantityDiscounts_Input[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn://epages.de/WebService/PriceListAssignmentService/2005/01", "type_SetQuantityDiscounts_Out"));
        oper.setReturnClass(de.epages.WebServices.PriceListAssignmentService.Stub.TSetQuantityDiscounts_Return[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "Products"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[3] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getValueDiscounts");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "Products"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn://epages.de/WebService/PriceListAssignmentService/2005/01", "type_GetValueDiscounts_In"), java.lang.String[].class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "PriceLists"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn://epages.de/WebService/PriceListAssignmentService/2005/01", "type_PriceLists_In"), java.lang.String[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn://epages.de/WebService/PriceListAssignmentService/2005/01", "type_GetValueDiscounts_Out"));
        oper.setReturnClass(de.epages.WebServices.PriceListAssignmentService.Stub.TGetValueDiscounts_Return[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "Products"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[4] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("setValueDiscounts");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "Products"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn://epages.de/WebService/PriceListAssignmentService/2005/01", "type_SetValueDiscounts_In"), de.epages.WebServices.PriceListAssignmentService.Stub.TSetValueDiscounts_Input[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn://epages.de/WebService/PriceListAssignmentService/2005/01", "type_SetValueDiscounts_Out"));
        oper.setReturnClass(de.epages.WebServices.PriceListAssignmentService.Stub.TSetValueDiscounts_Return[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "Products"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[5] = oper;

    }

    public Bind_PriceListAssignment_SOAPStub() throws org.apache.axis.AxisFault {
         this(null);
    }

    public Bind_PriceListAssignment_SOAPStub(java.net.URL endpointURL, javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
         this(service);
         super.cachedEndpoint = endpointURL;
    }

    public Bind_PriceListAssignment_SOAPStub(javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
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
            qName = new javax.xml.namespace.QName("urn://epages.de/WebService/EpagesTypes/2005/01", "TError");
            cachedSerQNames.add(qName);
            cls = de.epages.WebServices.PriceListAssignmentService.Stub.TError.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn://epages.de/WebService/PriceListAssignmentService/2005/01", "type_GetQuantityDiscounts_In");
            cachedSerQNames.add(qName);
            cls = java.lang.String[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn://epages.de/WebService/PriceListAssignmentService/2005/01", "type_GetQuantityDiscounts_Out");
            cachedSerQNames.add(qName);
            cls = de.epages.WebServices.PriceListAssignmentService.Stub.TGetQuantityDiscounts_Return[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn://epages.de/WebService/PriceListAssignmentTypes/2005/01", "TGetQuantityDiscounts_Return");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn://epages.de/WebService/PriceListAssignmentService/2005/01", "type_GetScalePrices_In");
            cachedSerQNames.add(qName);
            cls = java.lang.String[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn://epages.de/WebService/PriceListAssignmentService/2005/01", "type_GetScalePrices_Out");
            cachedSerQNames.add(qName);
            cls = de.epages.WebServices.PriceListAssignmentService.Stub.TGetScalePrices_Return[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn://epages.de/WebService/PriceListAssignmentTypes/2005/01", "TGetScalePrices_Return");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn://epages.de/WebService/PriceListAssignmentService/2005/01", "type_GetValueDiscounts_In");
            cachedSerQNames.add(qName);
            cls = java.lang.String[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn://epages.de/WebService/PriceListAssignmentService/2005/01", "type_GetValueDiscounts_Out");
            cachedSerQNames.add(qName);
            cls = de.epages.WebServices.PriceListAssignmentService.Stub.TGetValueDiscounts_Return[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn://epages.de/WebService/PriceListAssignmentTypes/2005/01", "TGetValueDiscounts_Return");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn://epages.de/WebService/PriceListAssignmentService/2005/01", "type_PriceLists_In");
            cachedSerQNames.add(qName);
            cls = java.lang.String[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn://epages.de/WebService/PriceListAssignmentService/2005/01", "type_SetQuantityDiscounts_In");
            cachedSerQNames.add(qName);
            cls = de.epages.WebServices.PriceListAssignmentService.Stub.TSetQuantityDiscounts_Input[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn://epages.de/WebService/PriceListAssignmentTypes/2005/01", "TSetQuantityDiscounts_Input");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn://epages.de/WebService/PriceListAssignmentService/2005/01", "type_SetQuantityDiscounts_Out");
            cachedSerQNames.add(qName);
            cls = de.epages.WebServices.PriceListAssignmentService.Stub.TSetQuantityDiscounts_Return[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn://epages.de/WebService/PriceListAssignmentTypes/2005/01", "TSetQuantityDiscounts_Return");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn://epages.de/WebService/PriceListAssignmentService/2005/01", "type_SetScalePrices_In");
            cachedSerQNames.add(qName);
            cls = de.epages.WebServices.PriceListAssignmentService.Stub.TSetScalePrices_Input[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn://epages.de/WebService/PriceListAssignmentTypes/2005/01", "TSetScalePrices_Input");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn://epages.de/WebService/PriceListAssignmentService/2005/01", "type_SetScalePrices_Out");
            cachedSerQNames.add(qName);
            cls = de.epages.WebServices.PriceListAssignmentService.Stub.TSetScalePrices_Return[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn://epages.de/WebService/PriceListAssignmentTypes/2005/01", "TSetScalePrices_Return");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn://epages.de/WebService/PriceListAssignmentService/2005/01", "type_SetValueDiscounts_In");
            cachedSerQNames.add(qName);
            cls = de.epages.WebServices.PriceListAssignmentService.Stub.TSetValueDiscounts_Input[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn://epages.de/WebService/PriceListAssignmentTypes/2005/01", "TSetValueDiscounts_Input");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn://epages.de/WebService/PriceListAssignmentService/2005/01", "type_SetValueDiscounts_Out");
            cachedSerQNames.add(qName);
            cls = de.epages.WebServices.PriceListAssignmentService.Stub.TSetValueDiscounts_Return[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn://epages.de/WebService/PriceListAssignmentTypes/2005/01", "TSetValueDiscounts_Return");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn://epages.de/WebService/PriceListAssignmentTypes/2005/01", "ListOfPriceListQuantityDiscount");
            cachedSerQNames.add(qName);
            cls = de.epages.WebServices.PriceListAssignmentService.Stub.TPriceListQuantityDiscount[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn://epages.de/WebService/PriceListAssignmentTypes/2005/01", "TPriceListQuantityDiscount");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn://epages.de/WebService/PriceListAssignmentTypes/2005/01", "ListOfPriceListScalePrice");
            cachedSerQNames.add(qName);
            cls = de.epages.WebServices.PriceListAssignmentService.Stub.TPriceListScalePrice[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn://epages.de/WebService/PriceListAssignmentTypes/2005/01", "TPriceListScalePrice");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn://epages.de/WebService/PriceListAssignmentTypes/2005/01", "ListOfPriceListValueDiscount");
            cachedSerQNames.add(qName);
            cls = de.epages.WebServices.PriceListAssignmentService.Stub.TPriceListValueDiscount[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn://epages.de/WebService/PriceListAssignmentTypes/2005/01", "TPriceListValueDiscount");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn://epages.de/WebService/PriceListAssignmentTypes/2005/01", "ListOfQuantityDiscounts");
            cachedSerQNames.add(qName);
            cls = de.epages.WebServices.PriceListAssignmentService.Stub.TQuantityDiscount[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn://epages.de/WebService/PriceListAssignmentTypes/2005/01", "TQuantityDiscount");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn://epages.de/WebService/PriceListAssignmentTypes/2005/01", "ListOfScalePrices");
            cachedSerQNames.add(qName);
            cls = de.epages.WebServices.PriceListAssignmentService.Stub.TScalePrice[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn://epages.de/WebService/PriceListAssignmentTypes/2005/01", "TScalePrice");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn://epages.de/WebService/PriceListAssignmentTypes/2005/01", "ListOfValueDiscounts");
            cachedSerQNames.add(qName);
            cls = de.epages.WebServices.PriceListAssignmentService.Stub.TValueDiscount[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn://epages.de/WebService/PriceListAssignmentTypes/2005/01", "TValueDiscount");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn://epages.de/WebService/PriceListAssignmentTypes/2005/01", "TGetQuantityDiscounts_Return");
            cachedSerQNames.add(qName);
            cls = de.epages.WebServices.PriceListAssignmentService.Stub.TGetQuantityDiscounts_Return.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn://epages.de/WebService/PriceListAssignmentTypes/2005/01", "TGetScalePrices_Return");
            cachedSerQNames.add(qName);
            cls = de.epages.WebServices.PriceListAssignmentService.Stub.TGetScalePrices_Return.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn://epages.de/WebService/PriceListAssignmentTypes/2005/01", "TGetValueDiscounts_Return");
            cachedSerQNames.add(qName);
            cls = de.epages.WebServices.PriceListAssignmentService.Stub.TGetValueDiscounts_Return.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn://epages.de/WebService/PriceListAssignmentTypes/2005/01", "TPriceListQuantityDiscount");
            cachedSerQNames.add(qName);
            cls = de.epages.WebServices.PriceListAssignmentService.Stub.TPriceListQuantityDiscount.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn://epages.de/WebService/PriceListAssignmentTypes/2005/01", "TPriceListScalePrice");
            cachedSerQNames.add(qName);
            cls = de.epages.WebServices.PriceListAssignmentService.Stub.TPriceListScalePrice.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn://epages.de/WebService/PriceListAssignmentTypes/2005/01", "TPriceListValueDiscount");
            cachedSerQNames.add(qName);
            cls = de.epages.WebServices.PriceListAssignmentService.Stub.TPriceListValueDiscount.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn://epages.de/WebService/PriceListAssignmentTypes/2005/01", "TQuantityDiscount");
            cachedSerQNames.add(qName);
            cls = de.epages.WebServices.PriceListAssignmentService.Stub.TQuantityDiscount.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn://epages.de/WebService/PriceListAssignmentTypes/2005/01", "TScalePrice");
            cachedSerQNames.add(qName);
            cls = de.epages.WebServices.PriceListAssignmentService.Stub.TScalePrice.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn://epages.de/WebService/PriceListAssignmentTypes/2005/01", "TSetQuantityDiscounts_Input");
            cachedSerQNames.add(qName);
            cls = de.epages.WebServices.PriceListAssignmentService.Stub.TSetQuantityDiscounts_Input.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn://epages.de/WebService/PriceListAssignmentTypes/2005/01", "TSetQuantityDiscounts_Return");
            cachedSerQNames.add(qName);
            cls = de.epages.WebServices.PriceListAssignmentService.Stub.TSetQuantityDiscounts_Return.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn://epages.de/WebService/PriceListAssignmentTypes/2005/01", "TSetScalePrices_Input");
            cachedSerQNames.add(qName);
            cls = de.epages.WebServices.PriceListAssignmentService.Stub.TSetScalePrices_Input.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn://epages.de/WebService/PriceListAssignmentTypes/2005/01", "TSetScalePrices_Return");
            cachedSerQNames.add(qName);
            cls = de.epages.WebServices.PriceListAssignmentService.Stub.TSetScalePrices_Return.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn://epages.de/WebService/PriceListAssignmentTypes/2005/01", "TSetValueDiscounts_Input");
            cachedSerQNames.add(qName);
            cls = de.epages.WebServices.PriceListAssignmentService.Stub.TSetValueDiscounts_Input.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn://epages.de/WebService/PriceListAssignmentTypes/2005/01", "TSetValueDiscounts_Return");
            cachedSerQNames.add(qName);
            cls = de.epages.WebServices.PriceListAssignmentService.Stub.TSetValueDiscounts_Return.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn://epages.de/WebService/PriceListAssignmentTypes/2005/01", "TValueDiscount");
            cachedSerQNames.add(qName);
            cls = de.epages.WebServices.PriceListAssignmentService.Stub.TValueDiscount.class;
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

    public de.epages.WebServices.PriceListAssignmentService.Stub.TGetScalePrices_Return[] getScalePrices(java.lang.String[] products, java.lang.String[] priceLists) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[0]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn://epages.de/WebService/PriceListAssignmentService/2005/01#getScalePrices");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn://epages.de/WebService/PriceListAssignmentService/2005/01", "getScalePrices"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {products, priceLists});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (de.epages.WebServices.PriceListAssignmentService.Stub.TGetScalePrices_Return[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (de.epages.WebServices.PriceListAssignmentService.Stub.TGetScalePrices_Return[]) org.apache.axis.utils.JavaUtils.convert(_resp, de.epages.WebServices.PriceListAssignmentService.Stub.TGetScalePrices_Return[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public de.epages.WebServices.PriceListAssignmentService.Stub.TSetScalePrices_Return[] setScalePrices(de.epages.WebServices.PriceListAssignmentService.Stub.TSetScalePrices_Input[] products) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[1]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn://epages.de/WebService/PriceListAssignmentService/2005/01#setScalePrices");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn://epages.de/WebService/PriceListAssignmentService/2005/01", "setScalePrices"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {products});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (de.epages.WebServices.PriceListAssignmentService.Stub.TSetScalePrices_Return[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (de.epages.WebServices.PriceListAssignmentService.Stub.TSetScalePrices_Return[]) org.apache.axis.utils.JavaUtils.convert(_resp, de.epages.WebServices.PriceListAssignmentService.Stub.TSetScalePrices_Return[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public de.epages.WebServices.PriceListAssignmentService.Stub.TGetQuantityDiscounts_Return[] getQuantityDiscounts(java.lang.String[] products, java.lang.String[] priceLists) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[2]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn://epages.de/WebService/PriceListAssignmentService/2005/01#getQuantityDiscounts");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn://epages.de/WebService/PriceListAssignmentService/2005/01", "getQuantityDiscounts"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {products, priceLists});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (de.epages.WebServices.PriceListAssignmentService.Stub.TGetQuantityDiscounts_Return[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (de.epages.WebServices.PriceListAssignmentService.Stub.TGetQuantityDiscounts_Return[]) org.apache.axis.utils.JavaUtils.convert(_resp, de.epages.WebServices.PriceListAssignmentService.Stub.TGetQuantityDiscounts_Return[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public de.epages.WebServices.PriceListAssignmentService.Stub.TSetQuantityDiscounts_Return[] setQuantityDiscounts(de.epages.WebServices.PriceListAssignmentService.Stub.TSetQuantityDiscounts_Input[] products) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[3]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn://epages.de/WebService/PriceListAssignmentService/2005/01#setQuantityDiscounts");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn://epages.de/WebService/PriceListAssignmentService/2005/01", "setQuantityDiscounts"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {products});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (de.epages.WebServices.PriceListAssignmentService.Stub.TSetQuantityDiscounts_Return[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (de.epages.WebServices.PriceListAssignmentService.Stub.TSetQuantityDiscounts_Return[]) org.apache.axis.utils.JavaUtils.convert(_resp, de.epages.WebServices.PriceListAssignmentService.Stub.TSetQuantityDiscounts_Return[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public de.epages.WebServices.PriceListAssignmentService.Stub.TGetValueDiscounts_Return[] getValueDiscounts(java.lang.String[] products, java.lang.String[] priceLists) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[4]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn://epages.de/WebService/PriceListAssignmentService/2005/01#getValueDiscounts");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn://epages.de/WebService/PriceListAssignmentService/2005/01", "getValueDiscounts"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {products, priceLists});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (de.epages.WebServices.PriceListAssignmentService.Stub.TGetValueDiscounts_Return[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (de.epages.WebServices.PriceListAssignmentService.Stub.TGetValueDiscounts_Return[]) org.apache.axis.utils.JavaUtils.convert(_resp, de.epages.WebServices.PriceListAssignmentService.Stub.TGetValueDiscounts_Return[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public de.epages.WebServices.PriceListAssignmentService.Stub.TSetValueDiscounts_Return[] setValueDiscounts(de.epages.WebServices.PriceListAssignmentService.Stub.TSetValueDiscounts_Input[] products) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[5]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn://epages.de/WebService/PriceListAssignmentService/2005/01#setValueDiscounts");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn://epages.de/WebService/PriceListAssignmentService/2005/01", "setValueDiscounts"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {products});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (de.epages.WebServices.PriceListAssignmentService.Stub.TSetValueDiscounts_Return[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (de.epages.WebServices.PriceListAssignmentService.Stub.TSetValueDiscounts_Return[]) org.apache.axis.utils.JavaUtils.convert(_resp, de.epages.WebServices.PriceListAssignmentService.Stub.TSetValueDiscounts_Return[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

}
