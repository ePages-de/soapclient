/**
 * Bind_Assignment_SOAPStub.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.3 Oct 05, 2005 (05:23:37 EDT) WSDL2Java emitter.
 */

package de.epages.WebServices.AssignmentService.Stub;

public class Bind_Assignment_SOAPStub extends org.apache.axis.client.Stub implements de.epages.WebServices.AssignmentService.Stub.Port_Assignment_PortType {
    private java.util.Vector cachedSerClasses = new java.util.Vector();
    private java.util.Vector cachedSerQNames = new java.util.Vector();
    private java.util.Vector cachedSerFactories = new java.util.Vector();
    private java.util.Vector cachedDeserFactories = new java.util.Vector();

    static org.apache.axis.description.OperationDesc [] _operations;

    static {
        _operations = new org.apache.axis.description.OperationDesc[5];
        _initOperationDesc1();
    }

    private static void _initOperationDesc1(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("assignProductToCatalog");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "Assignments"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn://epages.de/WebService/AssignmentService/2005/01", "type_AssignProductToCatalog_In"), de.epages.WebServices.AssignmentService.Stub.TAssignProductToCatalog_Input[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn://epages.de/WebService/AssignmentService/2005/01", "type_AssignProductToCatalog_Out"));
        oper.setReturnClass(de.epages.WebServices.AssignmentService.Stub.TAssignProductToCatalog_Return[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "Assignments"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[0] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("removeProductFromCatalog");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "Assignments"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn://epages.de/WebService/AssignmentService/2005/01", "type_RemoveProductFromCatalog_In"), de.epages.WebServices.AssignmentService.Stub.TRemoveProductFromCatalog_Input[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn://epages.de/WebService/AssignmentService/2005/01", "type_RemoveProductFromCatalog_Out"));
        oper.setReturnClass(de.epages.WebServices.AssignmentService.Stub.TRemoveProductFromCatalog_Return[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "Assignments"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[1] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("isProductAssignedToCatalog");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "Assignments"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn://epages.de/WebService/AssignmentService/2005/01", "type_IsProductAssignedToCatalog_In"), de.epages.WebServices.AssignmentService.Stub.TIsProductAssignedToCatalog_Input[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn://epages.de/WebService/AssignmentService/2005/01", "type_IsProductAssignedToCatalog_Out"));
        oper.setReturnClass(de.epages.WebServices.AssignmentService.Stub.TIsProductAssignedToCatalog_Return[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "Assignments"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[2] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getProductsAssignedToCatalog");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "Catalogs"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn://epages.de/WebService/AssignmentService/2005/01", "type_GetProductsAssignedToCatalog_In"), java.lang.String[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn://epages.de/WebService/AssignmentService/2005/01", "type_GetProductsAssignedToCatalog_Out"));
        oper.setReturnClass(de.epages.WebServices.AssignmentService.Stub.TGetProductsAssignedToCatalog_Return[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "Assignments"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[3] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getCatalogsAssignedToProduct");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "Products"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn://epages.de/WebService/AssignmentService/2005/01", "type_GetCatalogsAssignedToProduct_In"), java.lang.String[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn://epages.de/WebService/AssignmentService/2005/01", "type_GetCatalogsAssignedToProduct_Out"));
        oper.setReturnClass(de.epages.WebServices.AssignmentService.Stub.TGetCatalogsAssignedToProduct_Return[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "Assignments"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[4] = oper;

    }

    public Bind_Assignment_SOAPStub() throws org.apache.axis.AxisFault {
         this(null);
    }

    public Bind_Assignment_SOAPStub(java.net.URL endpointURL, javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
         this(service);
         super.cachedEndpoint = endpointURL;
    }

    public Bind_Assignment_SOAPStub(javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
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
            qName = new javax.xml.namespace.QName("urn://epages.de/WebService/AssignmentService/2005/01", "type_AssignProductToCatalog_In");
            cachedSerQNames.add(qName);
            cls = de.epages.WebServices.AssignmentService.Stub.TAssignProductToCatalog_Input[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn://epages.de/WebService/AssignmentTypes/2005/01", "TAssignProductToCatalog_Input");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn://epages.de/WebService/AssignmentService/2005/01", "type_AssignProductToCatalog_Out");
            cachedSerQNames.add(qName);
            cls = de.epages.WebServices.AssignmentService.Stub.TAssignProductToCatalog_Return[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn://epages.de/WebService/AssignmentTypes/2005/01", "TAssignProductToCatalog_Return");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn://epages.de/WebService/AssignmentService/2005/01", "type_GetCatalogsAssignedToProduct_In");
            cachedSerQNames.add(qName);
            cls = java.lang.String[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn://epages.de/WebService/AssignmentService/2005/01", "type_GetCatalogsAssignedToProduct_Out");
            cachedSerQNames.add(qName);
            cls = de.epages.WebServices.AssignmentService.Stub.TGetCatalogsAssignedToProduct_Return[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn://epages.de/WebService/AssignmentTypes/2005/01", "TGetCatalogsAssignedToProduct_Return");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn://epages.de/WebService/AssignmentService/2005/01", "type_GetProductsAssignedToCatalog_In");
            cachedSerQNames.add(qName);
            cls = java.lang.String[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn://epages.de/WebService/AssignmentService/2005/01", "type_GetProductsAssignedToCatalog_Out");
            cachedSerQNames.add(qName);
            cls = de.epages.WebServices.AssignmentService.Stub.TGetProductsAssignedToCatalog_Return[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn://epages.de/WebService/AssignmentTypes/2005/01", "TGetProductsAssignedToCatalog_Return");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn://epages.de/WebService/AssignmentService/2005/01", "type_IsProductAssignedToCatalog_In");
            cachedSerQNames.add(qName);
            cls = de.epages.WebServices.AssignmentService.Stub.TIsProductAssignedToCatalog_Input[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn://epages.de/WebService/AssignmentTypes/2005/01", "TIsProductAssignedToCatalog_Input");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn://epages.de/WebService/AssignmentService/2005/01", "type_IsProductAssignedToCatalog_Out");
            cachedSerQNames.add(qName);
            cls = de.epages.WebServices.AssignmentService.Stub.TIsProductAssignedToCatalog_Return[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn://epages.de/WebService/AssignmentTypes/2005/01", "TIsProductAssignedToCatalog_Return");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn://epages.de/WebService/AssignmentService/2005/01", "type_RemoveProductFromCatalog_In");
            cachedSerQNames.add(qName);
            cls = de.epages.WebServices.AssignmentService.Stub.TRemoveProductFromCatalog_Input[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn://epages.de/WebService/AssignmentTypes/2005/01", "TRemoveProductFromCatalog_Input");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn://epages.de/WebService/AssignmentService/2005/01", "type_RemoveProductFromCatalog_Out");
            cachedSerQNames.add(qName);
            cls = de.epages.WebServices.AssignmentService.Stub.TRemoveProductFromCatalog_Return[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn://epages.de/WebService/AssignmentTypes/2005/01", "TRemoveProductFromCatalog_Return");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn://epages.de/WebService/AssignmentTypes/2005/01", "ListOfAssignedCatalogs");
            cachedSerQNames.add(qName);
            cls = de.epages.WebServices.AssignmentService.Stub.TAssignedCatalog[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn://epages.de/WebService/AssignmentTypes/2005/01", "TAssignedCatalog");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn://epages.de/WebService/AssignmentTypes/2005/01", "ListOfAssignedProducts");
            cachedSerQNames.add(qName);
            cls = de.epages.WebServices.AssignmentService.Stub.TAssignedProduct[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn://epages.de/WebService/AssignmentTypes/2005/01", "TAssignedProduct");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn://epages.de/WebService/AssignmentTypes/2005/01", "TAssignedCatalog");
            cachedSerQNames.add(qName);
            cls = de.epages.WebServices.AssignmentService.Stub.TAssignedCatalog.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn://epages.de/WebService/AssignmentTypes/2005/01", "TAssignedProduct");
            cachedSerQNames.add(qName);
            cls = de.epages.WebServices.AssignmentService.Stub.TAssignedProduct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn://epages.de/WebService/AssignmentTypes/2005/01", "TAssignProductToCatalog_Input");
            cachedSerQNames.add(qName);
            cls = de.epages.WebServices.AssignmentService.Stub.TAssignProductToCatalog_Input.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn://epages.de/WebService/AssignmentTypes/2005/01", "TAssignProductToCatalog_Return");
            cachedSerQNames.add(qName);
            cls = de.epages.WebServices.AssignmentService.Stub.TAssignProductToCatalog_Return.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn://epages.de/WebService/AssignmentTypes/2005/01", "TGetCatalogsAssignedToProduct_Return");
            cachedSerQNames.add(qName);
            cls = de.epages.WebServices.AssignmentService.Stub.TGetCatalogsAssignedToProduct_Return.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn://epages.de/WebService/AssignmentTypes/2005/01", "TGetProductsAssignedToCatalog_Return");
            cachedSerQNames.add(qName);
            cls = de.epages.WebServices.AssignmentService.Stub.TGetProductsAssignedToCatalog_Return.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn://epages.de/WebService/AssignmentTypes/2005/01", "TIsProductAssignedToCatalog_Input");
            cachedSerQNames.add(qName);
            cls = de.epages.WebServices.AssignmentService.Stub.TIsProductAssignedToCatalog_Input.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn://epages.de/WebService/AssignmentTypes/2005/01", "TIsProductAssignedToCatalog_Return");
            cachedSerQNames.add(qName);
            cls = de.epages.WebServices.AssignmentService.Stub.TIsProductAssignedToCatalog_Return.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn://epages.de/WebService/AssignmentTypes/2005/01", "TRemoveProductFromCatalog_Input");
            cachedSerQNames.add(qName);
            cls = de.epages.WebServices.AssignmentService.Stub.TRemoveProductFromCatalog_Input.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn://epages.de/WebService/AssignmentTypes/2005/01", "TRemoveProductFromCatalog_Return");
            cachedSerQNames.add(qName);
            cls = de.epages.WebServices.AssignmentService.Stub.TRemoveProductFromCatalog_Return.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn://epages.de/WebService/EpagesTypes/2005/01", "TError");
            cachedSerQNames.add(qName);
            cls = de.epages.WebServices.AssignmentService.Stub.TError.class;
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

    public de.epages.WebServices.AssignmentService.Stub.TAssignProductToCatalog_Return[] assignProductToCatalog(de.epages.WebServices.AssignmentService.Stub.TAssignProductToCatalog_Input[] assignments) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[0]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn://epages.de/WebService/AssignmentService/2005/01#assignProductToCatalog");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn://epages.de/WebService/AssignmentService/2005/01", "assignProductToCatalog"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {assignments});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (de.epages.WebServices.AssignmentService.Stub.TAssignProductToCatalog_Return[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (de.epages.WebServices.AssignmentService.Stub.TAssignProductToCatalog_Return[]) org.apache.axis.utils.JavaUtils.convert(_resp, de.epages.WebServices.AssignmentService.Stub.TAssignProductToCatalog_Return[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public de.epages.WebServices.AssignmentService.Stub.TRemoveProductFromCatalog_Return[] removeProductFromCatalog(de.epages.WebServices.AssignmentService.Stub.TRemoveProductFromCatalog_Input[] assignments) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[1]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn://epages.de/WebService/AssignmentService/2005/01#removeProductFromCatalog");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn://epages.de/WebService/AssignmentService/2005/01", "removeProductFromCatalog"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {assignments});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (de.epages.WebServices.AssignmentService.Stub.TRemoveProductFromCatalog_Return[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (de.epages.WebServices.AssignmentService.Stub.TRemoveProductFromCatalog_Return[]) org.apache.axis.utils.JavaUtils.convert(_resp, de.epages.WebServices.AssignmentService.Stub.TRemoveProductFromCatalog_Return[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public de.epages.WebServices.AssignmentService.Stub.TIsProductAssignedToCatalog_Return[] isProductAssignedToCatalog(de.epages.WebServices.AssignmentService.Stub.TIsProductAssignedToCatalog_Input[] assignments) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[2]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn://epages.de/WebService/AssignmentService/2005/01#isProductAssignedToCatalog");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn://epages.de/WebService/AssignmentService/2005/01", "isProductAssignedToCatalog"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {assignments});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (de.epages.WebServices.AssignmentService.Stub.TIsProductAssignedToCatalog_Return[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (de.epages.WebServices.AssignmentService.Stub.TIsProductAssignedToCatalog_Return[]) org.apache.axis.utils.JavaUtils.convert(_resp, de.epages.WebServices.AssignmentService.Stub.TIsProductAssignedToCatalog_Return[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public de.epages.WebServices.AssignmentService.Stub.TGetProductsAssignedToCatalog_Return[] getProductsAssignedToCatalog(java.lang.String[] catalogs) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[3]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn://epages.de/WebService/AssignmentService/2005/01#getProductsAssignedToCatalog");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn://epages.de/WebService/AssignmentService/2005/01", "getProductsAssignedToCatalog"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {catalogs});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (de.epages.WebServices.AssignmentService.Stub.TGetProductsAssignedToCatalog_Return[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (de.epages.WebServices.AssignmentService.Stub.TGetProductsAssignedToCatalog_Return[]) org.apache.axis.utils.JavaUtils.convert(_resp, de.epages.WebServices.AssignmentService.Stub.TGetProductsAssignedToCatalog_Return[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public de.epages.WebServices.AssignmentService.Stub.TGetCatalogsAssignedToProduct_Return[] getCatalogsAssignedToProduct(java.lang.String[] products) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[4]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn://epages.de/WebService/AssignmentService/2005/01#getCatalogsAssignedToProduct");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn://epages.de/WebService/AssignmentService/2005/01", "getCatalogsAssignedToProduct"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {products});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (de.epages.WebServices.AssignmentService.Stub.TGetCatalogsAssignedToProduct_Return[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (de.epages.WebServices.AssignmentService.Stub.TGetCatalogsAssignedToProduct_Return[]) org.apache.axis.utils.JavaUtils.convert(_resp, de.epages.WebServices.AssignmentService.Stub.TGetCatalogsAssignedToProduct_Return[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

}
