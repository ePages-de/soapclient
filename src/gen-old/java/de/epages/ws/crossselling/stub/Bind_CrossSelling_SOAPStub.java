/**
 * Bind_CrossSelling_SOAPStub.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package de.epages.ws.crossselling.stub;

public class Bind_CrossSelling_SOAPStub extends org.apache.axis.client.Stub implements de.epages.ws.crossselling.stub.Port_CrossSelling {
    private java.util.Vector cachedSerClasses = new java.util.Vector();
    private java.util.Vector cachedSerQNames = new java.util.Vector();
    private java.util.Vector cachedSerFactories = new java.util.Vector();
    private java.util.Vector cachedDeserFactories = new java.util.Vector();

    static org.apache.axis.description.OperationDesc [] _operations;

    static {
        _operations = new org.apache.axis.description.OperationDesc[4];
        _initOperationDesc1();
    }

    private static void _initOperationDesc1(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("insert");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "CrossSellings"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn://epages.de/WebService/CrossSellingService/2006/05", "type_InsertCrossSelling_In"), de.epages.ws.crossselling.model.TInsertCrossSelling_Input[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn://epages.de/WebService/CrossSellingService/2006/05", "type_InsertCrossSelling_Out"));
        oper.setReturnClass(de.epages.ws.crossselling.model.TInsertCrossSelling_Return[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "CrossSellings"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[0] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("delete");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "CrossSellings"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn://epages.de/WebService/CrossSellingService/2006/05", "type_DeleteCrossSelling_In"), de.epages.ws.crossselling.model.TDeleteCrossSelling_Input[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn://epages.de/WebService/CrossSellingService/2006/05", "type_DeleteCrossSelling_Out"));
        oper.setReturnClass(de.epages.ws.crossselling.model.TDeleteCrossSelling_Return[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "CrossSellings"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[1] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("exists");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "CrossSellings"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn://epages.de/WebService/CrossSellingService/2006/05", "type_ExistsCrossSelling_In"), de.epages.ws.crossselling.model.TExistsCrossSelling_Input[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn://epages.de/WebService/CrossSellingService/2006/05", "type_ExistsCrossSelling_Out"));
        oper.setReturnClass(de.epages.ws.crossselling.model.TExistsCrossSelling_Return[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "CrossSellings"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[2] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("get");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "CrossSellings"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn://epages.de/WebService/CrossSellingService/2006/05", "type_GetCrossSelling_In"), de.epages.ws.crossselling.model.TGetCrossSelling_Input[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn://epages.de/WebService/CrossSellingService/2006/05", "type_GetCrossSelling_Out"));
        oper.setReturnClass(de.epages.ws.crossselling.model.TGetCrossSelling_Return[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "CrossSellings"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[3] = oper;

    }

    public Bind_CrossSelling_SOAPStub() throws org.apache.axis.AxisFault {
         this(null);
    }

    public Bind_CrossSelling_SOAPStub(java.net.URL endpointURL, javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
         this(service);
         super.cachedEndpoint = endpointURL;
    }

    public Bind_CrossSelling_SOAPStub(javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
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
            qName = new javax.xml.namespace.QName("urn://epages.de/WebService/CrossSellingService/2006/05", "type_DeleteCrossSelling_In");
            cachedSerQNames.add(qName);
            cls = de.epages.ws.crossselling.model.TDeleteCrossSelling_Input[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn://epages.de/WebService/CrossSellingTypes/2006/05", "TDeleteCrossSelling_Input");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn://epages.de/WebService/CrossSellingService/2006/05", "type_DeleteCrossSelling_Out");
            cachedSerQNames.add(qName);
            cls = de.epages.ws.crossselling.model.TDeleteCrossSelling_Return[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn://epages.de/WebService/CrossSellingTypes/2006/05", "TDeleteCrossSelling_Return");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn://epages.de/WebService/CrossSellingService/2006/05", "type_ExistsCrossSelling_In");
            cachedSerQNames.add(qName);
            cls = de.epages.ws.crossselling.model.TExistsCrossSelling_Input[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn://epages.de/WebService/CrossSellingTypes/2006/05", "TExistsCrossSelling_Input");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn://epages.de/WebService/CrossSellingService/2006/05", "type_ExistsCrossSelling_Out");
            cachedSerQNames.add(qName);
            cls = de.epages.ws.crossselling.model.TExistsCrossSelling_Return[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn://epages.de/WebService/CrossSellingTypes/2006/05", "TExistsCrossSelling_Return");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn://epages.de/WebService/CrossSellingService/2006/05", "type_GetCrossSelling_In");
            cachedSerQNames.add(qName);
            cls = de.epages.ws.crossselling.model.TGetCrossSelling_Input[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn://epages.de/WebService/CrossSellingTypes/2006/05", "TGetCrossSelling_Input");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn://epages.de/WebService/CrossSellingService/2006/05", "type_GetCrossSelling_Out");
            cachedSerQNames.add(qName);
            cls = de.epages.ws.crossselling.model.TGetCrossSelling_Return[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn://epages.de/WebService/CrossSellingTypes/2006/05", "TGetCrossSelling_Return");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn://epages.de/WebService/CrossSellingService/2006/05", "type_InsertCrossSelling_In");
            cachedSerQNames.add(qName);
            cls = de.epages.ws.crossselling.model.TInsertCrossSelling_Input[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn://epages.de/WebService/CrossSellingTypes/2006/05", "TInsertCrossSelling_Input");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn://epages.de/WebService/CrossSellingService/2006/05", "type_InsertCrossSelling_Out");
            cachedSerQNames.add(qName);
            cls = de.epages.ws.crossselling.model.TInsertCrossSelling_Return[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn://epages.de/WebService/CrossSellingTypes/2006/05", "TInsertCrossSelling_Return");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn://epages.de/WebService/CrossSellingTypes/2006/05", "TDeleteCrossSelling_Input");
            cachedSerQNames.add(qName);
            cls = de.epages.ws.crossselling.model.TDeleteCrossSelling_Input.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn://epages.de/WebService/CrossSellingTypes/2006/05", "TDeleteCrossSelling_Return");
            cachedSerQNames.add(qName);
            cls = de.epages.ws.crossselling.model.TDeleteCrossSelling_Return.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn://epages.de/WebService/CrossSellingTypes/2006/05", "TExistsCrossSelling_Input");
            cachedSerQNames.add(qName);
            cls = de.epages.ws.crossselling.model.TExistsCrossSelling_Input.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn://epages.de/WebService/CrossSellingTypes/2006/05", "TExistsCrossSelling_Return");
            cachedSerQNames.add(qName);
            cls = de.epages.ws.crossselling.model.TExistsCrossSelling_Return.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn://epages.de/WebService/CrossSellingTypes/2006/05", "TGetCrossSelling_Input");
            cachedSerQNames.add(qName);
            cls = de.epages.ws.crossselling.model.TGetCrossSelling_Input.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn://epages.de/WebService/CrossSellingTypes/2006/05", "TGetCrossSelling_Return");
            cachedSerQNames.add(qName);
            cls = de.epages.ws.crossselling.model.TGetCrossSelling_Return.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn://epages.de/WebService/CrossSellingTypes/2006/05", "TInsertCrossSelling_Input");
            cachedSerQNames.add(qName);
            cls = de.epages.ws.crossselling.model.TInsertCrossSelling_Input.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn://epages.de/WebService/CrossSellingTypes/2006/05", "TInsertCrossSelling_Return");
            cachedSerQNames.add(qName);
            cls = de.epages.ws.crossselling.model.TInsertCrossSelling_Return.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn://epages.de/WebService/EpagesTypes/2005/01", "TError");
            cachedSerQNames.add(qName);
            cls = de.epages.ws.common.model.TError.class;
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

    public de.epages.ws.crossselling.model.TInsertCrossSelling_Return[] insert(de.epages.ws.crossselling.model.TInsertCrossSelling_Input[] crossSellings) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[0]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn://epages.de/WebService/CrossSellingService/2006/05#insert");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn://epages.de/WebService/CrossSellingService/2006/05", "insert"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {crossSellings});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (de.epages.ws.crossselling.model.TInsertCrossSelling_Return[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (de.epages.ws.crossselling.model.TInsertCrossSelling_Return[]) org.apache.axis.utils.JavaUtils.convert(_resp, de.epages.ws.crossselling.model.TInsertCrossSelling_Return[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public de.epages.ws.crossselling.model.TDeleteCrossSelling_Return[] delete(de.epages.ws.crossselling.model.TDeleteCrossSelling_Input[] crossSellings) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[1]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn://epages.de/WebService/CrossSellingService/2006/05#delete");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn://epages.de/WebService/CrossSellingService/2006/05", "delete"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {crossSellings});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (de.epages.ws.crossselling.model.TDeleteCrossSelling_Return[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (de.epages.ws.crossselling.model.TDeleteCrossSelling_Return[]) org.apache.axis.utils.JavaUtils.convert(_resp, de.epages.ws.crossselling.model.TDeleteCrossSelling_Return[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public de.epages.ws.crossselling.model.TExistsCrossSelling_Return[] exists(de.epages.ws.crossselling.model.TExistsCrossSelling_Input[] crossSellings) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[2]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn://epages.de/WebService/CrossSellingService/2006/05#exists");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn://epages.de/WebService/CrossSellingService/2006/05", "exists"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {crossSellings});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (de.epages.ws.crossselling.model.TExistsCrossSelling_Return[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (de.epages.ws.crossselling.model.TExistsCrossSelling_Return[]) org.apache.axis.utils.JavaUtils.convert(_resp, de.epages.ws.crossselling.model.TExistsCrossSelling_Return[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public de.epages.ws.crossselling.model.TGetCrossSelling_Return[] get(de.epages.ws.crossselling.model.TGetCrossSelling_Input[] crossSellings) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[3]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn://epages.de/WebService/CrossSellingService/2006/05#get");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn://epages.de/WebService/CrossSellingService/2006/05", "get"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {crossSellings});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (de.epages.ws.crossselling.model.TGetCrossSelling_Return[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (de.epages.ws.crossselling.model.TGetCrossSelling_Return[]) org.apache.axis.utils.JavaUtils.convert(_resp, de.epages.ws.crossselling.model.TGetCrossSelling_Return[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

}
