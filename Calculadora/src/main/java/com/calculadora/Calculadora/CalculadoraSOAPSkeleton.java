/**
 * CalculadoraSOAPSkeleton.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.calculadora.Calculadora;

public class CalculadoraSOAPSkeleton implements com.calculadora.Calculadora.Calculadora_PortType, org.apache.axis.wsdl.Skeleton {
    private com.calculadora.Calculadora.Calculadora_PortType impl;
    private static java.util.Map _myOperations = new java.util.Hashtable();
    private static java.util.Collection _myOperationsList = new java.util.ArrayList();

    /**
    * Returns List of OperationDesc objects with this name
    */
    public static java.util.List getOperationDescByName(java.lang.String methodName) {
        return (java.util.List)_myOperations.get(methodName);
    }

    /**
    * Returns Collection of OperationDescs
    */
    public static java.util.Collection getOperationDescs() {
        return _myOperationsList;
    }

    static {
        org.apache.axis.description.OperationDesc _oper;
        org.apache.axis.description.FaultDesc _fault;
        org.apache.axis.description.ParameterDesc [] _params;
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://calculadora.com/Calculadora/", "SumaRequestBody"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://calculadora.com/Calculadora/", ">SumaRequestBody"), com.calculadora.Calculadora.SumaRequestBody.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("suma", _params, new javax.xml.namespace.QName("http://calculadora.com/Calculadora/", "SumaResponseBody"));
        _oper.setReturnType(new javax.xml.namespace.QName("http://calculadora.com/Calculadora/", ">SumaResponseBody"));
        _oper.setElementQName(new javax.xml.namespace.QName("", "suma"));
        _oper.setSoapAction("http://calculadora.com/Calculadora/suma");
        _myOperationsList.add(_oper);
        if (_myOperations.get("suma") == null) {
            _myOperations.put("suma", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("suma")).add(_oper);
    }

    public CalculadoraSOAPSkeleton() {
        this.impl = new com.calculadora.Calculadora.CalculadoraSOAPImpl();
    }

    public CalculadoraSOAPSkeleton(com.calculadora.Calculadora.Calculadora_PortType impl) {
        this.impl = impl;
    }
    public com.calculadora.Calculadora.SumaResponseBody suma(com.calculadora.Calculadora.SumaRequestBody parameters) throws java.rmi.RemoteException
    {
        com.calculadora.Calculadora.SumaResponseBody ret = impl.suma(parameters);
        return ret;
    }

}
