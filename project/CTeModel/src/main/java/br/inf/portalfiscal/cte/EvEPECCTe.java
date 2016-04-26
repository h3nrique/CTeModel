//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.04.26 at 12:09:23 PM BRT 
//


package br.inf.portalfiscal.cte;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
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
 *               &lt;enumeration value="EPEC"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="xJust" type="{http://www.portalfiscal.inf.br/cte}TJust"/>
 *         &lt;element name="vICMS" type="{http://www.portalfiscal.inf.br/cte}TDec_1302"/>
 *         &lt;element name="vTPrest" type="{http://www.portalfiscal.inf.br/cte}TDec_1302"/>
 *         &lt;element name="vCarga" type="{http://www.portalfiscal.inf.br/cte}TDec_1302"/>
 *         &lt;element name="toma04">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="toma">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;whiteSpace value="preserve"/>
 *                         &lt;enumeration value="0"/>
 *                         &lt;enumeration value="1"/>
 *                         &lt;enumeration value="2"/>
 *                         &lt;enumeration value="3"/>
 *                         &lt;enumeration value="4"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="UF" type="{http://www.portalfiscal.inf.br/cte}TUf"/>
 *                   &lt;choice>
 *                     &lt;element name="CNPJ" type="{http://www.portalfiscal.inf.br/cte}TCnpjOpc"/>
 *                     &lt;element name="CPF" type="{http://www.portalfiscal.inf.br/cte}TCpf"/>
 *                   &lt;/choice>
 *                   &lt;element name="IE" type="{http://www.portalfiscal.inf.br/cte}TIeDest" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="modal" type="{http://www.portalfiscal.inf.br/cte}TModTransp"/>
 *         &lt;element name="UFIni" type="{http://www.portalfiscal.inf.br/cte}TUf"/>
 *         &lt;element name="UFFim" type="{http://www.portalfiscal.inf.br/cte}TUf"/>
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
    "xJust",
    "vicms",
    "vtPrest",
    "vCarga",
    "toma04",
    "modal",
    "ufIni",
    "ufFim"
})
@XmlRootElement(name = "evEPECCTe")
public class EvEPECCTe {

    @XmlElement(required = true)
    protected String descEvento;
    @XmlElement(required = true)
    protected String xJust;
    @XmlElement(name = "vICMS", required = true)
    protected String vicms;
    @XmlElement(name = "vTPrest", required = true)
    protected String vtPrest;
    @XmlElement(required = true)
    protected String vCarga;
    @XmlElement(required = true)
    protected EvEPECCTe.Toma04 toma04;
    @XmlElement(required = true)
    protected String modal;
    @XmlElement(name = "UFIni", required = true)
    @XmlSchemaType(name = "string")
    protected TUf ufIni;
    @XmlElement(name = "UFFim", required = true)
    @XmlSchemaType(name = "string")
    protected TUf ufFim;

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
     * Gets the value of the xJust property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getXJust() {
        return xJust;
    }

    /**
     * Sets the value of the xJust property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setXJust(String value) {
        this.xJust = value;
    }

    /**
     * Gets the value of the vicms property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVICMS() {
        return vicms;
    }

    /**
     * Sets the value of the vicms property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVICMS(String value) {
        this.vicms = value;
    }

    /**
     * Gets the value of the vtPrest property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVTPrest() {
        return vtPrest;
    }

    /**
     * Sets the value of the vtPrest property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVTPrest(String value) {
        this.vtPrest = value;
    }

    /**
     * Gets the value of the vCarga property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVCarga() {
        return vCarga;
    }

    /**
     * Sets the value of the vCarga property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVCarga(String value) {
        this.vCarga = value;
    }

    /**
     * Gets the value of the toma04 property.
     * 
     * @return
     *     possible object is
     *     {@link EvEPECCTe.Toma04 }
     *     
     */
    public EvEPECCTe.Toma04 getToma04() {
        return toma04;
    }

    /**
     * Sets the value of the toma04 property.
     * 
     * @param value
     *     allowed object is
     *     {@link EvEPECCTe.Toma04 }
     *     
     */
    public void setToma04(EvEPECCTe.Toma04 value) {
        this.toma04 = value;
    }

    /**
     * Gets the value of the modal property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getModal() {
        return modal;
    }

    /**
     * Sets the value of the modal property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setModal(String value) {
        this.modal = value;
    }

    /**
     * Gets the value of the ufIni property.
     * 
     * @return
     *     possible object is
     *     {@link TUf }
     *     
     */
    public TUf getUFIni() {
        return ufIni;
    }

    /**
     * Sets the value of the ufIni property.
     * 
     * @param value
     *     allowed object is
     *     {@link TUf }
     *     
     */
    public void setUFIni(TUf value) {
        this.ufIni = value;
    }

    /**
     * Gets the value of the ufFim property.
     * 
     * @return
     *     possible object is
     *     {@link TUf }
     *     
     */
    public TUf getUFFim() {
        return ufFim;
    }

    /**
     * Sets the value of the ufFim property.
     * 
     * @param value
     *     allowed object is
     *     {@link TUf }
     *     
     */
    public void setUFFim(TUf value) {
        this.ufFim = value;
    }


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
     *         &lt;element name="toma">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;whiteSpace value="preserve"/>
     *               &lt;enumeration value="0"/>
     *               &lt;enumeration value="1"/>
     *               &lt;enumeration value="2"/>
     *               &lt;enumeration value="3"/>
     *               &lt;enumeration value="4"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="UF" type="{http://www.portalfiscal.inf.br/cte}TUf"/>
     *         &lt;choice>
     *           &lt;element name="CNPJ" type="{http://www.portalfiscal.inf.br/cte}TCnpjOpc"/>
     *           &lt;element name="CPF" type="{http://www.portalfiscal.inf.br/cte}TCpf"/>
     *         &lt;/choice>
     *         &lt;element name="IE" type="{http://www.portalfiscal.inf.br/cte}TIeDest" minOccurs="0"/>
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
        "toma",
        "uf",
        "cnpj",
        "cpf",
        "ie"
    })
    public static class Toma04 {

        @XmlElement(required = true)
        protected String toma;
        @XmlElement(name = "UF", required = true)
        @XmlSchemaType(name = "string")
        protected TUf uf;
        @XmlElement(name = "CNPJ")
        protected String cnpj;
        @XmlElement(name = "CPF")
        protected String cpf;
        @XmlElement(name = "IE")
        protected String ie;

        /**
         * Gets the value of the toma property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getToma() {
            return toma;
        }

        /**
         * Sets the value of the toma property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setToma(String value) {
            this.toma = value;
        }

        /**
         * Gets the value of the uf property.
         * 
         * @return
         *     possible object is
         *     {@link TUf }
         *     
         */
        public TUf getUF() {
            return uf;
        }

        /**
         * Sets the value of the uf property.
         * 
         * @param value
         *     allowed object is
         *     {@link TUf }
         *     
         */
        public void setUF(TUf value) {
            this.uf = value;
        }

        /**
         * Gets the value of the cnpj property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCNPJ() {
            return cnpj;
        }

        /**
         * Sets the value of the cnpj property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCNPJ(String value) {
            this.cnpj = value;
        }

        /**
         * Gets the value of the cpf property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCPF() {
            return cpf;
        }

        /**
         * Sets the value of the cpf property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCPF(String value) {
            this.cpf = value;
        }

        /**
         * Gets the value of the ie property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getIE() {
            return ie;
        }

        /**
         * Sets the value of the ie property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setIE(String value) {
            this.ie = value;
        }

    }

}
