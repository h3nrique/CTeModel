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
import javax.xml.bind.annotation.XmlType;


/**
 * Tipo Dados do Imposto
 * 
 * <p>Java class for TImp complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TImp">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element name="ICMS00">
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
 *         &lt;element name="ICMS20">
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
 *         &lt;element name="ICMS45">
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
 *         &lt;element name="ICMS60">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="CST">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;whiteSpace value="preserve"/>
 *                         &lt;enumeration value="60"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="vBCSTRet" type="{http://www.portalfiscal.inf.br/cte}TDec_1302"/>
 *                   &lt;element name="vICMSSTRet" type="{http://www.portalfiscal.inf.br/cte}TDec_1302"/>
 *                   &lt;element name="pICMSSTRet" type="{http://www.portalfiscal.inf.br/cte}TDec_0302"/>
 *                   &lt;element name="vCred" type="{http://www.portalfiscal.inf.br/cte}TDec_1302" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="ICMS90">
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
 *         &lt;element name="ICMSOutraUF">
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
 *                   &lt;element name="pRedBCOutraUF" type="{http://www.portalfiscal.inf.br/cte}TDec_0302Opc" minOccurs="0"/>
 *                   &lt;element name="vBCOutraUF" type="{http://www.portalfiscal.inf.br/cte}TDec_1302"/>
 *                   &lt;element name="pICMSOutraUF" type="{http://www.portalfiscal.inf.br/cte}TDec_0302"/>
 *                   &lt;element name="vICMSOutraUF" type="{http://www.portalfiscal.inf.br/cte}TDec_1302"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="ICMSSN">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="indSN">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;whiteSpace value="preserve"/>
 *                         &lt;enumeration value="1"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
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
@XmlType(name = "TImp", propOrder = {
    "icms00",
    "icms20",
    "icms45",
    "icms60",
    "icms90",
    "icmsOutraUF",
    "icmssn"
})
public class TImp {

    @XmlElement(name = "ICMS00")
    protected TImp.ICMS00 icms00;
    @XmlElement(name = "ICMS20")
    protected TImp.ICMS20 icms20;
    @XmlElement(name = "ICMS45")
    protected TImp.ICMS45 icms45;
    @XmlElement(name = "ICMS60")
    protected TImp.ICMS60 icms60;
    @XmlElement(name = "ICMS90")
    protected TImp.ICMS90 icms90;
    @XmlElement(name = "ICMSOutraUF")
    protected TImp.ICMSOutraUF icmsOutraUF;
    @XmlElement(name = "ICMSSN")
    protected TImp.ICMSSN icmssn;

    /**
     * Gets the value of the icms00 property.
     * 
     * @return
     *     possible object is
     *     {@link TImp.ICMS00 }
     *     
     */
    public TImp.ICMS00 getICMS00() {
        return icms00;
    }

    /**
     * Sets the value of the icms00 property.
     * 
     * @param value
     *     allowed object is
     *     {@link TImp.ICMS00 }
     *     
     */
    public void setICMS00(TImp.ICMS00 value) {
        this.icms00 = value;
    }

    /**
     * Gets the value of the icms20 property.
     * 
     * @return
     *     possible object is
     *     {@link TImp.ICMS20 }
     *     
     */
    public TImp.ICMS20 getICMS20() {
        return icms20;
    }

    /**
     * Sets the value of the icms20 property.
     * 
     * @param value
     *     allowed object is
     *     {@link TImp.ICMS20 }
     *     
     */
    public void setICMS20(TImp.ICMS20 value) {
        this.icms20 = value;
    }

    /**
     * Gets the value of the icms45 property.
     * 
     * @return
     *     possible object is
     *     {@link TImp.ICMS45 }
     *     
     */
    public TImp.ICMS45 getICMS45() {
        return icms45;
    }

    /**
     * Sets the value of the icms45 property.
     * 
     * @param value
     *     allowed object is
     *     {@link TImp.ICMS45 }
     *     
     */
    public void setICMS45(TImp.ICMS45 value) {
        this.icms45 = value;
    }

    /**
     * Gets the value of the icms60 property.
     * 
     * @return
     *     possible object is
     *     {@link TImp.ICMS60 }
     *     
     */
    public TImp.ICMS60 getICMS60() {
        return icms60;
    }

    /**
     * Sets the value of the icms60 property.
     * 
     * @param value
     *     allowed object is
     *     {@link TImp.ICMS60 }
     *     
     */
    public void setICMS60(TImp.ICMS60 value) {
        this.icms60 = value;
    }

    /**
     * Gets the value of the icms90 property.
     * 
     * @return
     *     possible object is
     *     {@link TImp.ICMS90 }
     *     
     */
    public TImp.ICMS90 getICMS90() {
        return icms90;
    }

    /**
     * Sets the value of the icms90 property.
     * 
     * @param value
     *     allowed object is
     *     {@link TImp.ICMS90 }
     *     
     */
    public void setICMS90(TImp.ICMS90 value) {
        this.icms90 = value;
    }

    /**
     * Gets the value of the icmsOutraUF property.
     * 
     * @return
     *     possible object is
     *     {@link TImp.ICMSOutraUF }
     *     
     */
    public TImp.ICMSOutraUF getICMSOutraUF() {
        return icmsOutraUF;
    }

    /**
     * Sets the value of the icmsOutraUF property.
     * 
     * @param value
     *     allowed object is
     *     {@link TImp.ICMSOutraUF }
     *     
     */
    public void setICMSOutraUF(TImp.ICMSOutraUF value) {
        this.icmsOutraUF = value;
    }

    /**
     * Gets the value of the icmssn property.
     * 
     * @return
     *     possible object is
     *     {@link TImp.ICMSSN }
     *     
     */
    public TImp.ICMSSN getICMSSN() {
        return icmssn;
    }

    /**
     * Sets the value of the icmssn property.
     * 
     * @param value
     *     allowed object is
     *     {@link TImp.ICMSSN }
     *     
     */
    public void setICMSSN(TImp.ICMSSN value) {
        this.icmssn = value;
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
    public static class ICMS00 {

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
    public static class ICMS20 {

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
    public static class ICMS45 {

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
     *               &lt;enumeration value="60"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="vBCSTRet" type="{http://www.portalfiscal.inf.br/cte}TDec_1302"/>
     *         &lt;element name="vICMSSTRet" type="{http://www.portalfiscal.inf.br/cte}TDec_1302"/>
     *         &lt;element name="pICMSSTRet" type="{http://www.portalfiscal.inf.br/cte}TDec_0302"/>
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
        "vbcstRet",
        "vicmsstRet",
        "picmsstRet",
        "vCred"
    })
    public static class ICMS60 {

        @XmlElement(name = "CST", required = true)
        protected String cst;
        @XmlElement(name = "vBCSTRet", required = true)
        protected String vbcstRet;
        @XmlElement(name = "vICMSSTRet", required = true)
        protected String vicmsstRet;
        @XmlElement(name = "pICMSSTRet", required = true)
        protected String picmsstRet;
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
         * Gets the value of the vbcstRet property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getVBCSTRet() {
            return vbcstRet;
        }

        /**
         * Sets the value of the vbcstRet property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setVBCSTRet(String value) {
            this.vbcstRet = value;
        }

        /**
         * Gets the value of the vicmsstRet property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getVICMSSTRet() {
            return vicmsstRet;
        }

        /**
         * Sets the value of the vicmsstRet property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setVICMSSTRet(String value) {
            this.vicmsstRet = value;
        }

        /**
         * Gets the value of the picmsstRet property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPICMSSTRet() {
            return picmsstRet;
        }

        /**
         * Sets the value of the picmsstRet property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPICMSSTRet(String value) {
            this.picmsstRet = value;
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
    public static class ICMS90 {

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
     *         &lt;element name="pRedBCOutraUF" type="{http://www.portalfiscal.inf.br/cte}TDec_0302Opc" minOccurs="0"/>
     *         &lt;element name="vBCOutraUF" type="{http://www.portalfiscal.inf.br/cte}TDec_1302"/>
     *         &lt;element name="pICMSOutraUF" type="{http://www.portalfiscal.inf.br/cte}TDec_0302"/>
     *         &lt;element name="vICMSOutraUF" type="{http://www.portalfiscal.inf.br/cte}TDec_1302"/>
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
        "pRedBCOutraUF",
        "vbcOutraUF",
        "picmsOutraUF",
        "vicmsOutraUF"
    })
    public static class ICMSOutraUF {

        @XmlElement(name = "CST", required = true)
        protected String cst;
        protected String pRedBCOutraUF;
        @XmlElement(name = "vBCOutraUF", required = true)
        protected String vbcOutraUF;
        @XmlElement(name = "pICMSOutraUF", required = true)
        protected String picmsOutraUF;
        @XmlElement(name = "vICMSOutraUF", required = true)
        protected String vicmsOutraUF;

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
         * Gets the value of the pRedBCOutraUF property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPRedBCOutraUF() {
            return pRedBCOutraUF;
        }

        /**
         * Sets the value of the pRedBCOutraUF property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPRedBCOutraUF(String value) {
            this.pRedBCOutraUF = value;
        }

        /**
         * Gets the value of the vbcOutraUF property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getVBCOutraUF() {
            return vbcOutraUF;
        }

        /**
         * Sets the value of the vbcOutraUF property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setVBCOutraUF(String value) {
            this.vbcOutraUF = value;
        }

        /**
         * Gets the value of the picmsOutraUF property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPICMSOutraUF() {
            return picmsOutraUF;
        }

        /**
         * Sets the value of the picmsOutraUF property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPICMSOutraUF(String value) {
            this.picmsOutraUF = value;
        }

        /**
         * Gets the value of the vicmsOutraUF property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getVICMSOutraUF() {
            return vicmsOutraUF;
        }

        /**
         * Sets the value of the vicmsOutraUF property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setVICMSOutraUF(String value) {
            this.vicmsOutraUF = value;
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
     *         &lt;element name="indSN">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;whiteSpace value="preserve"/>
     *               &lt;enumeration value="1"/>
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
        "indSN"
    })
    public static class ICMSSN {

        @XmlElement(required = true)
        protected String indSN;

        /**
         * Gets the value of the indSN property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getIndSN() {
            return indSN;
        }

        /**
         * Sets the value of the indSN property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setIndSN(String value) {
            this.indSN = value;
        }

    }

}
