//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.09.18 at 08:33:49 PM BRT 
//


package br.inf.portalfiscal.cte;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="descEvento">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;whiteSpace value="preserve"/>
 *               &lt;enumeration value="Prestação do Serviço em Desacordo"/>
 *               &lt;enumeration value="Prestacao do Servico em Desacordo"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="indDesacordoOper">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="1"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="xObs">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;minLength value="15"/>
 *               &lt;maxLength value="255"/>
 *               &lt;whiteSpace value="preserve"/>
 *               &lt;pattern value="[!-ÿ]{1}[ -ÿ]{0,}[!-ÿ]{1}|[!-ÿ]{1}"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "descEvento",
    "indDesacordoOper",
    "xObs"
})
@XmlRootElement(name = "evPrestDesacordo")
public class EvPrestDesacordo {

    @XmlElement(required = true)
    protected String descEvento;
    @XmlElement(required = true)
    protected String indDesacordoOper;
    @XmlElement(required = true)
    protected String xObs;

    /**
     * Gets the value of the descEvento property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescEvento() {
        return descEvento;
    }

    /**
     * Sets the value of the descEvento property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescEvento(String value) {
        this.descEvento = value;
    }

    /**
     * Gets the value of the indDesacordoOper property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIndDesacordoOper() {
        return indDesacordoOper;
    }

    /**
     * Sets the value of the indDesacordoOper property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIndDesacordoOper(String value) {
        this.indDesacordoOper = value;
    }

    /**
     * Gets the value of the xObs property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getXObs() {
        return xObs;
    }

    /**
     * Sets the value of the xObs property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setXObs(String value) {
        this.xObs = value;
    }

}
