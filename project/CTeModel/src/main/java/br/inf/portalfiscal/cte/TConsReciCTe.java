//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.09.25 at 11:59:50 PM BRT 
//


package br.inf.portalfiscal.cte;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Tipo Pedido de Consulta do Recibo do Lote de CT-e
 * 
 * <p>Java class for TConsReciCTe complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TConsReciCTe">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="tpAmb" type="{http://www.portalfiscal.inf.br/cte}TAmb"/>
 *         &lt;element name="nRec" type="{http://www.portalfiscal.inf.br/cte}TRec"/>
 *       &lt;/sequence>
 *       &lt;attribute name="versao" use="required" type="{http://www.portalfiscal.inf.br/cte}TVerConsReciCTe" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TConsReciCTe", propOrder = {
    "tpAmb",
    "nRec"
})
public class TConsReciCTe {

    @XmlElement(required = true)
    protected String tpAmb;
    @XmlElement(required = true)
    protected String nRec;
    @XmlAttribute(name = "versao", required = true)
    protected String versao;

    /**
     * Gets the value of the tpAmb property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTpAmb() {
        return tpAmb;
    }

    /**
     * Sets the value of the tpAmb property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTpAmb(String value) {
        this.tpAmb = value;
    }

    /**
     * Gets the value of the nRec property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNRec() {
        return nRec;
    }

    /**
     * Sets the value of the nRec property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNRec(String value) {
        this.nRec = value;
    }

    /**
     * Gets the value of the versao property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVersao() {
        return versao;
    }

    /**
     * Sets the value of the versao property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVersao(String value) {
        this.versao = value;
    }

}
