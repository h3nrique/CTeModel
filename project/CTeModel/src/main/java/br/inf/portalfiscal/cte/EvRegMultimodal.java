//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.04.26 at 10:09:15 AM BRT 
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
 *               &lt;enumeration value="Registro Multimodal"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="xRegistro">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;minLength value="15"/>
 *               &lt;maxLength value="1000"/>
 *               &lt;whiteSpace value="preserve"/>
 *               &lt;pattern value="[!-ÿ]{1}[ -ÿ]{0,}[!-ÿ]{1}|[!-ÿ]{1}"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="nDoc" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;minLength value="1"/>
 *               &lt;maxLength value="44"/>
 *               &lt;whiteSpace value="preserve"/>
 *               &lt;pattern value="[0-9]{1,44}"/>
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
    "xRegistro",
    "nDoc"
})
@XmlRootElement(name = "evRegMultimodal")
public class EvRegMultimodal {

    @XmlElement(required = true)
    protected String descEvento;
    @XmlElement(required = true)
    protected String xRegistro;
    protected String nDoc;

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
     * Gets the value of the xRegistro property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getXRegistro() {
        return xRegistro;
    }

    /**
     * Sets the value of the xRegistro property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setXRegistro(String value) {
        this.xRegistro = value;
    }

    /**
     * Gets the value of the nDoc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNDoc() {
        return nDoc;
    }

    /**
     * Sets the value of the nDoc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNDoc(String value) {
        this.nDoc = value;
    }

}
