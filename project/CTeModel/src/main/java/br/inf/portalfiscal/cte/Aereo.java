//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.09.18 at 08:43:30 PM BRT 
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
 *         &lt;element name="nMinu" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;whiteSpace value="preserve"/>
 *               &lt;pattern value="[0-9]{9}"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="nOCA" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;whiteSpace value="preserve"/>
 *               &lt;pattern value="[0-9]{11}"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="dPrevAereo" type="{http://www.portalfiscal.inf.br/cte}TData"/>
 *         &lt;element name="natCarga">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="xDime" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.portalfiscal.inf.br/cte}TString">
 *                         &lt;minLength value="5"/>
 *                         &lt;maxLength value="14"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="cInfManu" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;whiteSpace value="preserve"/>
 *                         &lt;enumeration value="01"/>
 *                         &lt;enumeration value="02"/>
 *                         &lt;enumeration value="03"/>
 *                         &lt;enumeration value="04"/>
 *                         &lt;enumeration value="05"/>
 *                         &lt;enumeration value="06"/>
 *                         &lt;enumeration value="07"/>
 *                         &lt;enumeration value="08"/>
 *                         &lt;enumeration value="09"/>
 *                         &lt;enumeration value="10"/>
 *                         &lt;enumeration value="11"/>
 *                         &lt;enumeration value="12"/>
 *                         &lt;enumeration value="13"/>
 *                         &lt;enumeration value="14"/>
 *                         &lt;enumeration value="15"/>
 *                         &lt;enumeration value="99"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="tarifa">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="CL">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;length value="1"/>
 *                         &lt;whiteSpace value="preserve"/>
 *                         &lt;pattern value="M"/>
 *                         &lt;pattern value="G"/>
 *                         &lt;pattern value="E"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="cTar" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.portalfiscal.inf.br/cte}TString">
 *                         &lt;minLength value="1"/>
 *                         &lt;maxLength value="4"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="vTar" type="{http://www.portalfiscal.inf.br/cte}TDec_1302"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="peri" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="nONU">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;whiteSpace value="preserve"/>
 *                         &lt;pattern value="[0-9]{4}|ND"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="qTotEmb">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.portalfiscal.inf.br/cte}TString">
 *                         &lt;minLength value="1"/>
 *                         &lt;maxLength value="20"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="infTotAP">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="qTotProd" type="{http://www.portalfiscal.inf.br/cte}TDec_1104"/>
 *                             &lt;element name="uniAP">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.portalfiscal.inf.br/cte}TString">
 *                                   &lt;minLength value="1"/>
 *                                   &lt;maxLength value="1"/>
 *                                   &lt;enumeration value="1"/>
 *                                   &lt;enumeration value="2"/>
 *                                   &lt;enumeration value="3"/>
 *                                   &lt;enumeration value="4"/>
 *                                   &lt;enumeration value="5"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
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
    "nMinu",
    "noca",
    "dPrevAereo",
    "natCarga",
    "tarifa",
    "peri"
})
@XmlRootElement(name = "aereo")
public class Aereo {

    protected String nMinu;
    @XmlElement(name = "nOCA")
    protected String noca;
    @XmlElement(required = true)
    protected String dPrevAereo;
    @XmlElement(required = true)
    protected Aereo.NatCarga natCarga;
    @XmlElement(required = true)
    protected Aereo.Tarifa tarifa;
    protected List<Aereo.Peri> peri;

    /**
     * Gets the value of the nMinu property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNMinu() {
        return nMinu;
    }

    /**
     * Sets the value of the nMinu property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNMinu(String value) {
        this.nMinu = value;
    }

    /**
     * Gets the value of the noca property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNOCA() {
        return noca;
    }

    /**
     * Sets the value of the noca property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNOCA(String value) {
        this.noca = value;
    }

    /**
     * Gets the value of the dPrevAereo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDPrevAereo() {
        return dPrevAereo;
    }

    /**
     * Sets the value of the dPrevAereo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDPrevAereo(String value) {
        this.dPrevAereo = value;
    }

    /**
     * Gets the value of the natCarga property.
     * 
     * @return
     *     possible object is
     *     {@link Aereo.NatCarga }
     *     
     */
    public Aereo.NatCarga getNatCarga() {
        return natCarga;
    }

    /**
     * Sets the value of the natCarga property.
     * 
     * @param value
     *     allowed object is
     *     {@link Aereo.NatCarga }
     *     
     */
    public void setNatCarga(Aereo.NatCarga value) {
        this.natCarga = value;
    }

    /**
     * Gets the value of the tarifa property.
     * 
     * @return
     *     possible object is
     *     {@link Aereo.Tarifa }
     *     
     */
    public Aereo.Tarifa getTarifa() {
        return tarifa;
    }

    /**
     * Sets the value of the tarifa property.
     * 
     * @param value
     *     allowed object is
     *     {@link Aereo.Tarifa }
     *     
     */
    public void setTarifa(Aereo.Tarifa value) {
        this.tarifa = value;
    }

    /**
     * Gets the value of the peri property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the peri property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPeri().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Aereo.Peri }
     * 
     * 
     */
    public List<Aereo.Peri> getPeri() {
        if (peri == null) {
            peri = new ArrayList<Aereo.Peri>();
        }
        return this.peri;
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
     *         &lt;element name="xDime" minOccurs="0">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.portalfiscal.inf.br/cte}TString">
     *               &lt;minLength value="5"/>
     *               &lt;maxLength value="14"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="cInfManu" maxOccurs="unbounded" minOccurs="0">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;whiteSpace value="preserve"/>
     *               &lt;enumeration value="01"/>
     *               &lt;enumeration value="02"/>
     *               &lt;enumeration value="03"/>
     *               &lt;enumeration value="04"/>
     *               &lt;enumeration value="05"/>
     *               &lt;enumeration value="06"/>
     *               &lt;enumeration value="07"/>
     *               &lt;enumeration value="08"/>
     *               &lt;enumeration value="09"/>
     *               &lt;enumeration value="10"/>
     *               &lt;enumeration value="11"/>
     *               &lt;enumeration value="12"/>
     *               &lt;enumeration value="13"/>
     *               &lt;enumeration value="14"/>
     *               &lt;enumeration value="15"/>
     *               &lt;enumeration value="99"/>
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
        "xDime",
        "cInfManu"
    })
    public static class NatCarga {

        protected String xDime;
        protected List<String> cInfManu;

        /**
         * Gets the value of the xDime property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getXDime() {
            return xDime;
        }

        /**
         * Sets the value of the xDime property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setXDime(String value) {
            this.xDime = value;
        }

        /**
         * Gets the value of the cInfManu property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the cInfManu property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getCInfManu().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        public List<String> getCInfManu() {
            if (cInfManu == null) {
                cInfManu = new ArrayList<String>();
            }
            return this.cInfManu;
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
     *         &lt;element name="nONU">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;whiteSpace value="preserve"/>
     *               &lt;pattern value="[0-9]{4}|ND"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="qTotEmb">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.portalfiscal.inf.br/cte}TString">
     *               &lt;minLength value="1"/>
     *               &lt;maxLength value="20"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="infTotAP">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="qTotProd" type="{http://www.portalfiscal.inf.br/cte}TDec_1104"/>
     *                   &lt;element name="uniAP">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.portalfiscal.inf.br/cte}TString">
     *                         &lt;minLength value="1"/>
     *                         &lt;maxLength value="1"/>
     *                         &lt;enumeration value="1"/>
     *                         &lt;enumeration value="2"/>
     *                         &lt;enumeration value="3"/>
     *                         &lt;enumeration value="4"/>
     *                         &lt;enumeration value="5"/>
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
        "nonu",
        "qTotEmb",
        "infTotAP"
    })
    public static class Peri {

        @XmlElement(name = "nONU", required = true)
        protected String nonu;
        @XmlElement(required = true)
        protected String qTotEmb;
        @XmlElement(required = true)
        protected Aereo.Peri.InfTotAP infTotAP;

        /**
         * Gets the value of the nonu property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getNONU() {
            return nonu;
        }

        /**
         * Sets the value of the nonu property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setNONU(String value) {
            this.nonu = value;
        }

        /**
         * Gets the value of the qTotEmb property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getQTotEmb() {
            return qTotEmb;
        }

        /**
         * Sets the value of the qTotEmb property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setQTotEmb(String value) {
            this.qTotEmb = value;
        }

        /**
         * Gets the value of the infTotAP property.
         * 
         * @return
         *     possible object is
         *     {@link Aereo.Peri.InfTotAP }
         *     
         */
        public Aereo.Peri.InfTotAP getInfTotAP() {
            return infTotAP;
        }

        /**
         * Sets the value of the infTotAP property.
         * 
         * @param value
         *     allowed object is
         *     {@link Aereo.Peri.InfTotAP }
         *     
         */
        public void setInfTotAP(Aereo.Peri.InfTotAP value) {
            this.infTotAP = value;
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
         *         &lt;element name="qTotProd" type="{http://www.portalfiscal.inf.br/cte}TDec_1104"/>
         *         &lt;element name="uniAP">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.portalfiscal.inf.br/cte}TString">
         *               &lt;minLength value="1"/>
         *               &lt;maxLength value="1"/>
         *               &lt;enumeration value="1"/>
         *               &lt;enumeration value="2"/>
         *               &lt;enumeration value="3"/>
         *               &lt;enumeration value="4"/>
         *               &lt;enumeration value="5"/>
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
            "qTotProd",
            "uniAP"
        })
        public static class InfTotAP {

            @XmlElement(required = true)
            protected String qTotProd;
            @XmlElement(required = true)
            protected String uniAP;

            /**
             * Gets the value of the qTotProd property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getQTotProd() {
                return qTotProd;
            }

            /**
             * Sets the value of the qTotProd property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setQTotProd(String value) {
                this.qTotProd = value;
            }

            /**
             * Gets the value of the uniAP property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getUniAP() {
                return uniAP;
            }

            /**
             * Sets the value of the uniAP property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setUniAP(String value) {
                this.uniAP = value;
            }

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
     *         &lt;element name="CL">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;length value="1"/>
     *               &lt;whiteSpace value="preserve"/>
     *               &lt;pattern value="M"/>
     *               &lt;pattern value="G"/>
     *               &lt;pattern value="E"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="cTar" minOccurs="0">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.portalfiscal.inf.br/cte}TString">
     *               &lt;minLength value="1"/>
     *               &lt;maxLength value="4"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="vTar" type="{http://www.portalfiscal.inf.br/cte}TDec_1302"/>
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
        "cl",
        "cTar",
        "vTar"
    })
    public static class Tarifa {

        @XmlElement(name = "CL", required = true)
        protected String cl;
        protected String cTar;
        @XmlElement(required = true)
        protected String vTar;

        /**
         * Gets the value of the cl property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCL() {
            return cl;
        }

        /**
         * Sets the value of the cl property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCL(String value) {
            this.cl = value;
        }

        /**
         * Gets the value of the cTar property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCTar() {
            return cTar;
        }

        /**
         * Sets the value of the cTar property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCTar(String value) {
            this.cTar = value;
        }

        /**
         * Gets the value of the vTar property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getVTar() {
            return vTar;
        }

        /**
         * Sets the value of the vTar property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setVTar(String value) {
            this.vTar = value;
        }

    }

}
