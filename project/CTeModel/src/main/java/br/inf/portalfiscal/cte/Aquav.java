//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.09.26 at 12:07:10 AM BRT 
//


package br.inf.portalfiscal.cte;

import java.util.ArrayList;
import java.util.List;
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
 *         &lt;element name="vPrest" type="{http://www.portalfiscal.inf.br/cte}TDec_1302"/>
 *         &lt;element name="vAFRMM" type="{http://www.portalfiscal.inf.br/cte}TDec_1302"/>
 *         &lt;element name="nBooking" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.portalfiscal.inf.br/cte}TString">
 *               &lt;maxLength value="10"/>
 *               &lt;minLength value="1"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="nCtrl" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.portalfiscal.inf.br/cte}TString">
 *               &lt;maxLength value="10"/>
 *               &lt;minLength value="1"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="xNavio">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.portalfiscal.inf.br/cte}TString">
 *               &lt;maxLength value="60"/>
 *               &lt;minLength value="1"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="balsa" maxOccurs="3" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="xBalsa">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.portalfiscal.inf.br/cte}TString">
 *                         &lt;minLength value="1"/>
 *                         &lt;maxLength value="60"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="nViag" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;whiteSpace value="preserve"/>
 *               &lt;pattern value="[1-9]{1}[0-9]{0,9}"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="direc">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;whiteSpace value="preserve"/>
 *               &lt;enumeration value="N"/>
 *               &lt;enumeration value="S"/>
 *               &lt;enumeration value="L"/>
 *               &lt;enumeration value="O"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="prtEmb" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.portalfiscal.inf.br/cte}TString">
 *               &lt;minLength value="1"/>
 *               &lt;maxLength value="60"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="prtTrans" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.portalfiscal.inf.br/cte}TString">
 *               &lt;minLength value="1"/>
 *               &lt;maxLength value="60"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="prtDest" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.portalfiscal.inf.br/cte}TString">
 *               &lt;minLength value="1"/>
 *               &lt;maxLength value="60"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="tpNav" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;whiteSpace value="preserve"/>
 *               &lt;enumeration value="0"/>
 *               &lt;enumeration value="1"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="irin">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;whiteSpace value="preserve"/>
 *               &lt;maxLength value="10"/>
 *               &lt;minLength value="1"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="lacre" maxOccurs="3" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="nLacre">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.portalfiscal.inf.br/cte}TString">
 *                         &lt;minLength value="1"/>
 *                         &lt;maxLength value="20"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
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
    "vPrest",
    "vafrmm",
    "nBooking",
    "nCtrl",
    "xNavio",
    "balsa",
    "nViag",
    "direc",
    "prtEmb",
    "prtTrans",
    "prtDest",
    "tpNav",
    "irin",
    "lacre"
})
@XmlRootElement(name = "aquav")
public class Aquav {

    @XmlElement(required = true)
    protected String vPrest;
    @XmlElement(name = "vAFRMM", required = true)
    protected String vafrmm;
    protected String nBooking;
    protected String nCtrl;
    @XmlElement(required = true)
    protected String xNavio;
    protected List<Aquav.Balsa> balsa;
    protected String nViag;
    @XmlElement(required = true)
    protected String direc;
    protected String prtEmb;
    protected String prtTrans;
    protected String prtDest;
    protected String tpNav;
    @XmlElement(required = true)
    protected String irin;
    protected List<Aquav.Lacre> lacre;

    /**
     * Gets the value of the vPrest property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVPrest() {
        return vPrest;
    }

    /**
     * Sets the value of the vPrest property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVPrest(String value) {
        this.vPrest = value;
    }

    /**
     * Gets the value of the vafrmm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVAFRMM() {
        return vafrmm;
    }

    /**
     * Sets the value of the vafrmm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVAFRMM(String value) {
        this.vafrmm = value;
    }

    /**
     * Gets the value of the nBooking property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNBooking() {
        return nBooking;
    }

    /**
     * Sets the value of the nBooking property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNBooking(String value) {
        this.nBooking = value;
    }

    /**
     * Gets the value of the nCtrl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNCtrl() {
        return nCtrl;
    }

    /**
     * Sets the value of the nCtrl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNCtrl(String value) {
        this.nCtrl = value;
    }

    /**
     * Gets the value of the xNavio property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getXNavio() {
        return xNavio;
    }

    /**
     * Sets the value of the xNavio property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setXNavio(String value) {
        this.xNavio = value;
    }

    /**
     * Gets the value of the balsa property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the balsa property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBalsa().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Aquav.Balsa }
     * 
     * 
     */
    public List<Aquav.Balsa> getBalsa() {
        if (balsa == null) {
            balsa = new ArrayList<Aquav.Balsa>();
        }
        return this.balsa;
    }

    /**
     * Gets the value of the nViag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNViag() {
        return nViag;
    }

    /**
     * Sets the value of the nViag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNViag(String value) {
        this.nViag = value;
    }

    /**
     * Gets the value of the direc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDirec() {
        return direc;
    }

    /**
     * Sets the value of the direc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDirec(String value) {
        this.direc = value;
    }

    /**
     * Gets the value of the prtEmb property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrtEmb() {
        return prtEmb;
    }

    /**
     * Sets the value of the prtEmb property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrtEmb(String value) {
        this.prtEmb = value;
    }

    /**
     * Gets the value of the prtTrans property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrtTrans() {
        return prtTrans;
    }

    /**
     * Sets the value of the prtTrans property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrtTrans(String value) {
        this.prtTrans = value;
    }

    /**
     * Gets the value of the prtDest property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrtDest() {
        return prtDest;
    }

    /**
     * Sets the value of the prtDest property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrtDest(String value) {
        this.prtDest = value;
    }

    /**
     * Gets the value of the tpNav property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTpNav() {
        return tpNav;
    }

    /**
     * Sets the value of the tpNav property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTpNav(String value) {
        this.tpNav = value;
    }

    /**
     * Gets the value of the irin property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIrin() {
        return irin;
    }

    /**
     * Sets the value of the irin property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIrin(String value) {
        this.irin = value;
    }

    /**
     * Gets the value of the lacre property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the lacre property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLacre().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Aquav.Lacre }
     * 
     * 
     */
    public List<Aquav.Lacre> getLacre() {
        if (lacre == null) {
            lacre = new ArrayList<Aquav.Lacre>();
        }
        return this.lacre;
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
     *         &lt;element name="xBalsa">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.portalfiscal.inf.br/cte}TString">
     *               &lt;minLength value="1"/>
     *               &lt;maxLength value="60"/>
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
        "xBalsa"
    })
    public static class Balsa {

        @XmlElement(required = true)
        protected String xBalsa;

        /**
         * Gets the value of the xBalsa property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getXBalsa() {
            return xBalsa;
        }

        /**
         * Sets the value of the xBalsa property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setXBalsa(String value) {
            this.xBalsa = value;
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
     *         &lt;element name="nLacre">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.portalfiscal.inf.br/cte}TString">
     *               &lt;minLength value="1"/>
     *               &lt;maxLength value="20"/>
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
        "nLacre"
    })
    public static class Lacre {

        @XmlElement(required = true)
        protected String nLacre;

        /**
         * Gets the value of the nLacre property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getNLacre() {
            return nLacre;
        }

        /**
         * Sets the value of the nLacre property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setNLacre(String value) {
            this.nLacre = value;
        }

    }

}
