//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.09.26 at 01:06:48 AM BRT 
//


package br.inf.portalfiscal.cte;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Tipo Pedido de inutilzação de númeração de CT-e processado
 * 
 * <p>Java class for TProcInutCTe complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TProcInutCTe">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="inutCTe" type="{http://www.portalfiscal.inf.br/cte}TInutCTe"/>
 *         &lt;element name="retInutCTe" type="{http://www.portalfiscal.inf.br/cte}TRetInutCTe"/>
 *       &lt;/sequence>
 *       &lt;attribute name="versao" use="required" type="{http://www.portalfiscal.inf.br/cte}TVerInutCTe" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TProcInutCTe", propOrder = {
    "inutCTe",
    "retInutCTe"
})
public class TProcInutCTe {

    @XmlElement(required = true)
    protected TInutCTe inutCTe;
    @XmlElement(required = true)
    protected TRetInutCTe retInutCTe;
    @XmlAttribute(name = "versao", required = true)
    protected String versao;

    /**
     * Gets the value of the inutCTe property.
     * 
     * @return
     *     possible object is
     *     {@link TInutCTe }
     *     
     */
    public TInutCTe getInutCTe() {
        return inutCTe;
    }

    /**
     * Sets the value of the inutCTe property.
     * 
     * @param value
     *     allowed object is
     *     {@link TInutCTe }
     *     
     */
    public void setInutCTe(TInutCTe value) {
        this.inutCTe = value;
    }

    /**
     * Gets the value of the retInutCTe property.
     * 
     * @return
     *     possible object is
     *     {@link TRetInutCTe }
     *     
     */
    public TRetInutCTe getRetInutCTe() {
        return retInutCTe;
    }

    /**
     * Sets the value of the retInutCTe property.
     * 
     * @param value
     *     allowed object is
     *     {@link TRetInutCTe }
     *     
     */
    public void setRetInutCTe(TRetInutCTe value) {
        this.retInutCTe = value;
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
