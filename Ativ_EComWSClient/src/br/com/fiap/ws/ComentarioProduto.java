/**
 * ComentarioProduto.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.com.fiap.ws;

public class ComentarioProduto  implements java.io.Serializable {
    private java.lang.String assunto;

    private java.lang.Integer avaliacao;

    private java.lang.String comentarioProduto;

    private java.util.Calendar data;

    private java.lang.Integer id;

    private java.lang.String titulo;

    public ComentarioProduto() {
    }

    public ComentarioProduto(
           java.lang.String assunto,
           java.lang.Integer avaliacao,
           java.lang.String comentarioProduto,
           java.util.Calendar data,
           java.lang.Integer id,
           java.lang.String titulo) {
           this.assunto = assunto;
           this.avaliacao = avaliacao;
           this.comentarioProduto = comentarioProduto;
           this.data = data;
           this.id = id;
           this.titulo = titulo;
    }


    /**
     * Gets the assunto value for this ComentarioProduto.
     * 
     * @return assunto
     */
    public java.lang.String getAssunto() {
        return assunto;
    }


    /**
     * Sets the assunto value for this ComentarioProduto.
     * 
     * @param assunto
     */
    public void setAssunto(java.lang.String assunto) {
        this.assunto = assunto;
    }


    /**
     * Gets the avaliacao value for this ComentarioProduto.
     * 
     * @return avaliacao
     */
    public java.lang.Integer getAvaliacao() {
        return avaliacao;
    }


    /**
     * Sets the avaliacao value for this ComentarioProduto.
     * 
     * @param avaliacao
     */
    public void setAvaliacao(java.lang.Integer avaliacao) {
        this.avaliacao = avaliacao;
    }


    /**
     * Gets the comentarioProduto value for this ComentarioProduto.
     * 
     * @return comentarioProduto
     */
    public java.lang.String getComentarioProduto() {
        return comentarioProduto;
    }


    /**
     * Sets the comentarioProduto value for this ComentarioProduto.
     * 
     * @param comentarioProduto
     */
    public void setComentarioProduto(java.lang.String comentarioProduto) {
        this.comentarioProduto = comentarioProduto;
    }


    /**
     * Gets the data value for this ComentarioProduto.
     * 
     * @return data
     */
    public java.util.Calendar getData() {
        return data;
    }


    /**
     * Sets the data value for this ComentarioProduto.
     * 
     * @param data
     */
    public void setData(java.util.Calendar data) {
        this.data = data;
    }


    /**
     * Gets the id value for this ComentarioProduto.
     * 
     * @return id
     */
    public java.lang.Integer getId() {
        return id;
    }


    /**
     * Sets the id value for this ComentarioProduto.
     * 
     * @param id
     */
    public void setId(java.lang.Integer id) {
        this.id = id;
    }


    /**
     * Gets the titulo value for this ComentarioProduto.
     * 
     * @return titulo
     */
    public java.lang.String getTitulo() {
        return titulo;
    }


    /**
     * Sets the titulo value for this ComentarioProduto.
     * 
     * @param titulo
     */
    public void setTitulo(java.lang.String titulo) {
        this.titulo = titulo;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ComentarioProduto)) return false;
        ComentarioProduto other = (ComentarioProduto) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.assunto==null && other.getAssunto()==null) || 
             (this.assunto!=null &&
              this.assunto.equals(other.getAssunto()))) &&
            ((this.avaliacao==null && other.getAvaliacao()==null) || 
             (this.avaliacao!=null &&
              this.avaliacao.equals(other.getAvaliacao()))) &&
            ((this.comentarioProduto==null && other.getComentarioProduto()==null) || 
             (this.comentarioProduto!=null &&
              this.comentarioProduto.equals(other.getComentarioProduto()))) &&
            ((this.data==null && other.getData()==null) || 
             (this.data!=null &&
              this.data.equals(other.getData()))) &&
            ((this.id==null && other.getId()==null) || 
             (this.id!=null &&
              this.id.equals(other.getId()))) &&
            ((this.titulo==null && other.getTitulo()==null) || 
             (this.titulo!=null &&
              this.titulo.equals(other.getTitulo())));
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
        if (getAssunto() != null) {
            _hashCode += getAssunto().hashCode();
        }
        if (getAvaliacao() != null) {
            _hashCode += getAvaliacao().hashCode();
        }
        if (getComentarioProduto() != null) {
            _hashCode += getComentarioProduto().hashCode();
        }
        if (getData() != null) {
            _hashCode += getData().hashCode();
        }
        if (getId() != null) {
            _hashCode += getId().hashCode();
        }
        if (getTitulo() != null) {
            _hashCode += getTitulo().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ComentarioProduto.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ws.fiap.com.br/", "comentarioProduto"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("assunto");
        elemField.setXmlName(new javax.xml.namespace.QName("", "assunto"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("avaliacao");
        elemField.setXmlName(new javax.xml.namespace.QName("", "avaliacao"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("comentarioProduto");
        elemField.setXmlName(new javax.xml.namespace.QName("", "comentarioProduto"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("data");
        elemField.setXmlName(new javax.xml.namespace.QName("", "data"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("id");
        elemField.setXmlName(new javax.xml.namespace.QName("", "id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("titulo");
        elemField.setXmlName(new javax.xml.namespace.QName("", "titulo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
