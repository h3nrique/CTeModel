//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.04.26 at 10:09:15 AM BRT 
//


package br.inf.portalfiscal.cte;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Tipo Pedido de Cancelamento de CT-e processado
 * 
 * <p>Java class for TProcCancCTe complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TProcCancCTe">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="cancCTe" type="{http://www.portalfiscal.inf.br/cte}TCancCTe"/>
 *         &lt;element name="retCancCTe" type="{http://www.portalfiscal.inf.br/cte}TRetCancCTe"/>
 *       &lt;/sequence>
 *       &lt;attribute name="versao" use="required" type="{http://www.portalfiscal.inf.br/cte}TVerCancCTe" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TProcCancCTe", propOrder = {
    "cancCTe",
    "retCancCTe"
})
public class TProcCancCTe {

    @XmlElement(required = true)
    protected TCancCTe cancCTe;
    @XmlElement(required = true)
    protected TRetCancCTe retCancCTe;
    @XmlAttribute(name = "versao", required = true)
    protected String versao;

    /**
     * Gets the value of the cancCTe property.
     * 
     * @return
     *     possible object is
     *     {@link TCancCTe }
     *     
     */
    public TCancCTe getCancCTe() {
        return cancCTe;
    }

    /**
     * Sets the value of the cancCTe property.
     * 
     * @param value
     *     allowed object is
     *     {@link TCancCTe }
     *     
     */
    public void setCancCTe(TCancCTe value) {
        this.cancCTe = value;
    }

    /**
     * Gets the value of the retCancCTe property.
     * 
     * @return
     *     possible object is
     *     {@link TRetCancCTe }
     *     
     */
    public TRetCancCTe getRetCancCTe() {
        return retCancCTe;
    }

    /**
     * Sets the value of the retCancCTe property.
     * 
     * @param value
     *     allowed object is
     *     {@link TRetCancCTe }
     *     
     */
    public void setRetCancCTe(TRetCancCTe value) {
        this.retCancCTe = value;
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
