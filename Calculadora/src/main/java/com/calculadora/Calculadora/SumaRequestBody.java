/**
 * SumaRequestBody.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.calculadora.Calculadora;

public class SumaRequestBody  implements java.io.Serializable {
    private double num1;

    private double num2;

    public SumaRequestBody() {
    }

    public SumaRequestBody(
           double num1,
           double num2) {
           this.num1 = num1;
           this.num2 = num2;
    }


    /**
     * Gets the num1 value for this SumaRequestBody.
     * 
     * @return num1
     */
    public double getNum1() {
        return num1;
    }


    /**
     * Sets the num1 value for this SumaRequestBody.
     * 
     * @param num1
     */
    public void setNum1(double num1) {
        this.num1 = num1;
    }


    /**
     * Gets the num2 value for this SumaRequestBody.
     * 
     * @return num2
     */
    public double getNum2() {
        return num2;
    }


    /**
     * Sets the num2 value for this SumaRequestBody.
     * 
     * @param num2
     */
    public void setNum2(double num2) {
        this.num2 = num2;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SumaRequestBody)) return false;
        SumaRequestBody other = (SumaRequestBody) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.num1 == other.getNum1() &&
            this.num2 == other.getNum2();
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
        _hashCode += new Double(getNum1()).hashCode();
        _hashCode += new Double(getNum2()).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SumaRequestBody.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://calculadora.com/Calculadora/", ">SumaRequestBody"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("num1");
        elemField.setXmlName(new javax.xml.namespace.QName("", "num1"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("num2");
        elemField.setXmlName(new javax.xml.namespace.QName("", "num2"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
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
