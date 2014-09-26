//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.09.25 at 11:36:19 PM BRT 
//


package br.inf.portalfiscal.cte;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Tipo Dados do CST (Código de Situação Tributária)
 * 
 * <p>Java class for TCST complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TCST">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element name="CST00">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="CST">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;whiteSpace value="preserve"/>
 *                         &lt;enumeration value="00"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="vBC" type="{http://www.portalfiscal.inf.br/cte}TDec_1302"/>
 *                   &lt;element name="pICMS" type="{http://www.portalfiscal.inf.br/cte}TDec_0302"/>
 *                   &lt;element name="vICMS" type="{http://www.portalfiscal.inf.br/cte}TDec_1302"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="CST20">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="CST">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;whiteSpace value="preserve"/>
 *                         &lt;enumeration value="20"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="pRedBC" type="{http://www.portalfiscal.inf.br/cte}TDec_0302Opc"/>
 *                   &lt;element name="vBC" type="{http://www.portalfiscal.inf.br/cte}TDec_1302"/>
 *                   &lt;element name="pICMS" type="{http://www.portalfiscal.inf.br/cte}TDec_0302"/>
 *                   &lt;element name="vICMS" type="{http://www.portalfiscal.inf.br/cte}TDec_1302"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="CST45">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="CST">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;whiteSpace value="preserve"/>
 *                         &lt;enumeration value="40"/>
 *                         &lt;enumeration value="41"/>
 *                         &lt;enumeration value="51"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="CST80">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="CST">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;whiteSpace value="preserve"/>
 *                         &lt;enumeration value="90"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="vBC" type="{http://www.portalfiscal.inf.br/cte}TDec_1302"/>
 *                   &lt;element name="pICMS" type="{http://www.portalfiscal.inf.br/cte}TDec_0302"/>
 *                   &lt;element name="vICMS" type="{http://www.portalfiscal.inf.br/cte}TDec_1302"/>
 *                   &lt;element name="vCred" type="{http://www.portalfiscal.inf.br/cte}TDec_1302" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="CST81">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="CST">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;whiteSpace value="preserve"/>
 *                         &lt;enumeration value="90"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="pRedBC" type="{http://www.portalfiscal.inf.br/cte}TDec_0302Opc" minOccurs="0"/>
 *                   &lt;element name="vBC" type="{http://www.portalfiscal.inf.br/cte}TDec_1302"/>
 *                   &lt;element name="pICMS" type="{http://www.portalfiscal.inf.br/cte}TDec_0302"/>
 *                   &lt;element name="vICMS" type="{http://www.portalfiscal.inf.br/cte}TDec_1302"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="CST90">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="CST">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;whiteSpace value="preserve"/>
 *                         &lt;enumeration value="90"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="pRedBC" type="{http://www.portalfiscal.inf.br/cte}TDec_0302Opc" minOccurs="0"/>
 *                   &lt;element name="vBC" type="{http://www.portalfiscal.inf.br/cte}TDec_1302"/>
 *                   &lt;element name="pICMS" type="{http://www.portalfiscal.inf.br/cte}TDec_0302"/>
 *                   &lt;element name="vICMS" type="{http://www.portalfiscal.inf.br/cte}TDec_1302"/>
 *                   &lt;element name="vCred" type="{http://www.portalfiscal.inf.br/cte}TDec_1302" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TCST", propOrder = {
    "cst00",
    "cst20",
    "cst45",
    "cst80",
    "cst81",
    "cst90"
})
public class TCST {

    @XmlElement(name = "CST00")
    protected TCST.CST00 cst00;
    @XmlElement(name = "CST20")
    protected TCST.CST20 cst20;
    @XmlElement(name = "CST45")
    protected TCST.CST45 cst45;
    @XmlElement(name = "CST80")
    protected TCST.CST80 cst80;
    @XmlElement(name = "CST81")
    protected TCST.CST81 cst81;
    @XmlElement(name = "CST90")
    protected TCST.CST90 cst90;

    /**
     * Gets the value of the cst00 property.
     * 
     * @return
     *     possible object is
     *     {@link TCST.CST00 }
     *     
     */
    public TCST.CST00 getCST00() {
        return cst00;
    }

    /**
     * Sets the value of the cst00 property.
     * 
     * @param value
     *     allowed object is
     *     {@link TCST.CST00 }
     *     
     */
    public void setCST00(TCST.CST00 value) {
        this.cst00 = value;
    }

    /**
     * Gets the value of the cst20 property.
     * 
     * @return
     *     possible object is
     *     {@link TCST.CST20 }
     *     
     */
    public TCST.CST20 getCST20() {
        return cst20;
    }

    /**
     * Sets the value of the cst20 property.
     * 
     * @param value
     *     allowed object is
     *     {@link TCST.CST20 }
     *     
     */
    public void setCST20(TCST.CST20 value) {
        this.cst20 = value;
    }

    /**
     * Gets the value of the cst45 property.
     * 
     * @return
     *     possible object is
     *     {@link TCST.CST45 }
     *     
     */
    public TCST.CST45 getCST45() {
        return cst45;
    }

    /**
     * Sets the value of the cst45 property.
     * 
     * @param value
     *     allowed object is
     *     {@link TCST.CST45 }
     *     
     */
    public void setCST45(TCST.CST45 value) {
        this.cst45 = value;
    }

    /**
     * Gets the value of the cst80 property.
     * 
     * @return
     *     possible object is
     *     {@link TCST.CST80 }
     *     
     */
    public TCST.CST80 getCST80() {
        return cst80;
    }

    /**
     * Sets the value of the cst80 property.
     * 
     * @param value
     *     allowed object is
     *     {@link TCST.CST80 }
     *     
     */
    public void setCST80(TCST.CST80 value) {
        this.cst80 = value;
    }

    /**
     * Gets the value of the cst81 property.
     * 
     * @return
     *     possible object is
     *     {@link TCST.CST81 }
     *     
     */
    public TCST.CST81 getCST81() {
        return cst81;
    }

    /**
     * Sets the value of the cst81 property.
     * 
     * @param value
     *     allowed object is
     *     {@link TCST.CST81 }
     *     
     */
    public void setCST81(TCST.CST81 value) {
        this.cst81 = value;
    }

    /**
     * Gets the value of the cst90 property.
     * 
     * @return
     *     possible object is
     *     {@link TCST.CST90 }
     *     
     */
    public TCST.CST90 getCST90() {
        return cst90;
    }

    /**
     * Sets the value of the cst90 property.
     * 
     * @param value
     *     allowed object is
     *     {@link TCST.CST90 }
     *     
     */
    public void setCST90(TCST.CST90 value) {
        this.cst90 = value;
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
     *         &lt;element name="CST">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;whiteSpace value="preserve"/>
     *               &lt;enumeration value="00"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="vBC" type="{http://www.portalfiscal.inf.br/cte}TDec_1302"/>
     *         &lt;element name="pICMS" type="{http://www.portalfiscal.inf.br/cte}TDec_0302"/>
     *         &lt;element name="vICMS" type="{http://www.portalfiscal.inf.br/cte}TDec_1302"/>
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
        "cst",
        "vbc",
        "picms",
        "vicms"
    })
    public static class CST00 {

        @XmlElement(name = "CST", required = true)
        protected String cst;
        @XmlElement(name = "vBC", required = true)
        protected String vbc;
        @XmlElement(name = "pICMS", required = true)
        protected String picms;
        @XmlElement(name = "vICMS", required = true)
        protected String vicms;

        /**
         * Gets the value of the cst property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCST() {
            return cst;
        }

        /**
         * Sets the value of the cst property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCST(String value) {
            this.cst = value;
        }

        /**
         * Gets the value of the vbc property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getVBC() {
            return vbc;
        }

        /**
         * Sets the value of the vbc property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setVBC(String value) {
            this.vbc = value;
        }

        /**
         * Gets the value of the picms property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPICMS() {
            return picms;
        }

        /**
         * Sets the value of the picms property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPICMS(String value) {
            this.picms = value;
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
     *         &lt;element name="CST">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;whiteSpace value="preserve"/>
     *               &lt;enumeration value="20"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="pRedBC" type="{http://www.portalfiscal.inf.br/cte}TDec_0302Opc"/>
     *         &lt;element name="vBC" type="{http://www.portalfiscal.inf.br/cte}TDec_1302"/>
     *         &lt;element name="pICMS" type="{http://www.portalfiscal.inf.br/cte}TDec_0302"/>
     *         &lt;element name="vICMS" type="{http://www.portalfiscal.inf.br/cte}TDec_1302"/>
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
        "cst",
        "pRedBC",
        "vbc",
        "picms",
        "vicms"
    })
    public static class CST20 {

        @XmlElement(name = "CST", required = true)
        protected String cst;
        @XmlElement(required = true)
        protected String pRedBC;
        @XmlElement(name = "vBC", required = true)
        protected String vbc;
        @XmlElement(name = "pICMS", required = true)
        protected String picms;
        @XmlElement(name = "vICMS", required = true)
        protected String vicms;

        /**
         * Gets the value of the cst property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCST() {
            return cst;
        }

        /**
         * Sets the value of the cst property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCST(String value) {
            this.cst = value;
        }

        /**
         * Gets the value of the pRedBC property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPRedBC() {
            return pRedBC;
        }

        /**
         * Sets the value of the pRedBC property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPRedBC(String value) {
            this.pRedBC = value;
        }

        /**
         * Gets the value of the vbc property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getVBC() {
            return vbc;
        }

        /**
         * Sets the value of the vbc property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setVBC(String value) {
            this.vbc = value;
        }

        /**
         * Gets the value of the picms property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPICMS() {
            return picms;
        }

        /**
         * Sets the value of the picms property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPICMS(String value) {
            this.picms = value;
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
     *         &lt;element name="CST">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;whiteSpace value="preserve"/>
     *               &lt;enumeration value="40"/>
     *               &lt;enumeration value="41"/>
     *               &lt;enumeration value="51"/>
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
        "cst"
    })
    public static class CST45 {

        @XmlElement(name = "CST", required = true)
        protected String cst;

        /**
         * Gets the value of the cst property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCST() {
            return cst;
        }

        /**
         * Sets the value of the cst property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCST(String value) {
            this.cst = value;
        }

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
     *         &lt;element name="CST">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;whiteSpace value="preserve"/>
     *               &lt;enumeration value="90"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="vBC" type="{http://www.portalfiscal.inf.br/cte}TDec_1302"/>
     *         &lt;element name="pICMS" type="{http://www.portalfiscal.inf.br/cte}TDec_0302"/>
     *         &lt;element name="vICMS" type="{http://www.portalfiscal.inf.br/cte}TDec_1302"/>
     *         &lt;element name="vCred" type="{http://www.portalfiscal.inf.br/cte}TDec_1302" minOccurs="0"/>
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
        "cst",
        "vbc",
        "picms",
        "vicms",
        "vCred"
    })
    public static class CST80 {

        @XmlElement(name = "CST", required = true)
        protected String cst;
        @XmlElement(name = "vBC", required = true)
        protected String vbc;
        @XmlElement(name = "pICMS", required = true)
        protected String picms;
        @XmlElement(name = "vICMS", required = true)
        protected String vicms;
        protected String vCred;

        /**
         * Gets the value of the cst property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCST() {
            return cst;
        }

        /**
         * Sets the value of the cst property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCST(String value) {
            this.cst = value;
        }

        /**
         * Gets the value of the vbc property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getVBC() {
            return vbc;
        }

        /**
         * Sets the value of the vbc property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setVBC(String value) {
            this.vbc = value;
        }

        /**
         * Gets the value of the picms property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPICMS() {
            return picms;
        }

        /**
         * Sets the value of the picms property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPICMS(String value) {
            this.picms = value;
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
         * Gets the value of the vCred property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getVCred() {
            return vCred;
        }

        /**
         * Sets the value of the vCred property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setVCred(String value) {
            this.vCred = value;
        }

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
     *         &lt;element name="CST">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;whiteSpace value="preserve"/>
     *               &lt;enumeration value="90"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="pRedBC" type="{http://www.portalfiscal.inf.br/cte}TDec_0302Opc" minOccurs="0"/>
     *         &lt;element name="vBC" type="{http://www.portalfiscal.inf.br/cte}TDec_1302"/>
     *         &lt;element name="pICMS" type="{http://www.portalfiscal.inf.br/cte}TDec_0302"/>
     *         &lt;element name="vICMS" type="{http://www.portalfiscal.inf.br/cte}TDec_1302"/>
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
        "cst",
        "pRedBC",
        "vbc",
        "picms",
        "vicms"
    })
    public static class CST81 {

        @XmlElement(name = "CST", required = true)
        protected String cst;
        protected String pRedBC;
        @XmlElement(name = "vBC", required = true)
        protected String vbc;
        @XmlElement(name = "pICMS", required = true)
        protected String picms;
        @XmlElement(name = "vICMS", required = true)
        protected String vicms;

        /**
         * Gets the value of the cst property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCST() {
            return cst;
        }

        /**
         * Sets the value of the cst property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCST(String value) {
            this.cst = value;
        }

        /**
         * Gets the value of the pRedBC property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPRedBC() {
            return pRedBC;
        }

        /**
         * Sets the value of the pRedBC property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPRedBC(String value) {
            this.pRedBC = value;
        }

        /**
         * Gets the value of the vbc property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getVBC() {
            return vbc;
        }

        /**
         * Sets the value of the vbc property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setVBC(String value) {
            this.vbc = value;
        }

        /**
         * Gets the value of the picms property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPICMS() {
            return picms;
        }

        /**
         * Sets the value of the picms property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPICMS(String value) {
            this.picms = value;
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
     *         &lt;element name="CST">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;whiteSpace value="preserve"/>
     *               &lt;enumeration value="90"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="pRedBC" type="{http://www.portalfiscal.inf.br/cte}TDec_0302Opc" minOccurs="0"/>
     *         &lt;element name="vBC" type="{http://www.portalfiscal.inf.br/cte}TDec_1302"/>
     *         &lt;element name="pICMS" type="{http://www.portalfiscal.inf.br/cte}TDec_0302"/>
     *         &lt;element name="vICMS" type="{http://www.portalfiscal.inf.br/cte}TDec_1302"/>
     *         &lt;element name="vCred" type="{http://www.portalfiscal.inf.br/cte}TDec_1302" minOccurs="0"/>
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
        "cst",
        "pRedBC",
        "vbc",
        "picms",
        "vicms",
        "vCred"
    })
    public static class CST90 {

        @XmlElement(name = "CST", required = true)
        protected String cst;
        protected String pRedBC;
        @XmlElement(name = "vBC", required = true)
        protected String vbc;
        @XmlElement(name = "pICMS", required = true)
        protected String picms;
        @XmlElement(name = "vICMS", required = true)
        protected String vicms;
        protected String vCred;

        /**
         * Gets the value of the cst property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCST() {
            return cst;
        }

        /**
         * Sets the value of the cst property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCST(String value) {
            this.cst = value;
        }

        /**
         * Gets the value of the pRedBC property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPRedBC() {
            return pRedBC;
        }

        /**
         * Sets the value of the pRedBC property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPRedBC(String value) {
            this.pRedBC = value;
        }

        /**
         * Gets the value of the vbc property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getVBC() {
            return vbc;
        }

        /**
         * Sets the value of the vbc property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setVBC(String value) {
            this.vbc = value;
        }

        /**
         * Gets the value of the picms property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPICMS() {
            return picms;
        }

        /**
         * Sets the value of the picms property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPICMS(String value) {
            this.picms = value;
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
         * Gets the value of the vCred property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getVCred() {
            return vCred;
        }

        /**
         * Sets the value of the vCred property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setVCred(String value) {
            this.vCred = value;
        }

    }

}
