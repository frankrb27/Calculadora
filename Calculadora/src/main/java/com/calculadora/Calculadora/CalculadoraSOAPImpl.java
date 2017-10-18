/**
 * CalculadoraSOAPImpl.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.calculadora.Calculadora;

public class CalculadoraSOAPImpl implements com.calculadora.Calculadora.Calculadora_PortType{
    public com.calculadora.Calculadora.SumaResponseBody suma(com.calculadora.Calculadora.SumaRequestBody parameters) throws java.rmi.RemoteException {
    	com.calculadora.Calculadora.SumaResponseBody soapResponse = new SumaResponseBody(parameters.getNum1() + parameters.getNum2());
    	return soapResponse;
    }

}
