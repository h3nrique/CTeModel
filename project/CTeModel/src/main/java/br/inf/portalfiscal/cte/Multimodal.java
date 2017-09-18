//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.09.18 at 03:15:07 AM BRT 
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
 *         &lt;element name="COTM">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;minLength value="1"/>
 *               &lt;maxLength value="20"/>
 *               &lt;pattern value="[!-ÿ]{1}[ -ÿ]{0,}[!-ÿ]{1}|[!-ÿ]{1}"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="indNegociavel">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="0"/>
 *               &lt;enumeration value="1"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="seg" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="infSeg">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="xSeg">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.portalfiscal.inf.br/cte}TString">
 *                                   &lt;minLength value="1"/>
 *                                   &lt;maxLength value="30"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="CNPJ" type="{http://www.portalfiscal.inf.br/cte}TCnpjOpc"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="nApol">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.portalfiscal.inf.br/cte}TString">
 *                         &lt;minLength value="1"/>
 *                         &lt;maxLength value="20"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="nAver">
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
    "cotm",
    "indNegociavel",
    "seg"
})
@XmlRootElement(name = "multimodal")
public class Multimodal {

    @XmlElement(name = "COTM", required = true)
    protected String cotm;
    @XmlElement(required = true)
    protected String indNegociavel;
    protected Multimodal.Seg seg;

    /**
     * Gets the value of the cotm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCOTM() {
        return cotm;
    }

    /**
     * Sets the value of the cotm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCOTM(String value) {
        this.cotm = value;
    }

    /**
     * Gets the value of the indNegociavel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIndNegociavel() {
        return indNegociavel;
    }

    /**
     * Sets the value of the indNegociavel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIndNegociavel(String value) {
        this.indNegociavel = value;
    }

    /**
     * Gets the value of the seg property.
     * 
     * @return
     *     possible object is
     *     {@link Multimodal.Seg }
     *     
     */
    public Multimodal.Seg getSeg() {
        return seg;
    }

    /**
     * Sets the value of the seg property.
     * 
     * @param value
     *     allowed object is
     *     {@link Multimodal.Seg }
     *     
     */
    public void setSeg(Multimodal.Seg value) {
        this.seg = value;
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
     *         &lt;element name="infSeg">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="xSeg">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.portalfiscal.inf.br/cte}TString">
     *                         &lt;minLength value="1"/>
     *                         &lt;maxLength value="30"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="CNPJ" type="{http://www.portalfiscal.inf.br/cte}TCnpjOpc"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="nApol">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.portalfiscal.inf.br/cte}TString">
     *               &lt;minLength value="1"/>
     *               &lt;maxLength value="20"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="nAver">
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
        "infSeg",
        "nApol",
        "nAver"
    })
    public static class Seg {

        @XmlElement(required = true)
        protected Multimodal.Seg.InfSeg infSeg;
        @XmlElement(required = true)
        protected String nApol;
        @XmlElement(required = true)
        protected String nAver;

        /**
         * Gets the value of the infSeg property.
         * 
         * @return
         *     possible object is
         *     {@link Multimodal.Seg.InfSeg }
         *     
         */
        public Multimodal.Seg.InfSeg getInfSeg() {
            return infSeg;
        }

        /**
         * Sets the value of the infSeg property.
         * 
         * @param value
         *     allowed object is
         *     {@link Multimodal.Seg.InfSeg }
         *     
         */
        public void setInfSeg(Multimodal.Seg.InfSeg value) {
            this.infSeg = value;
        }

        /**
         * Gets the value of the nApol property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getNApol() {
            return nApol;
        }

        /**
         * Sets the value of the nApol property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setNApol(String value) {
            this.nApol = value;
        }

        /**
         * Gets the value of the nAver property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getNAver() {
            return nAver;
        }

        /**
         * Sets the value of the nAver property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setNAver(String value) {
            this.nAver = value;
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
         *         &lt;element name="xSeg">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.portalfiscal.inf.br/cte}TString">
         *               &lt;minLength value="1"/>
         *               &lt;maxLength value="30"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="CNPJ" type="{http://www.portalfiscal.inf.br/cte}TCnpjOpc"/>
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
            "xSeg",
            "cnpj"
        })
        public static class InfSeg {

            @XmlElement(required = true)
            protected String xSeg;
            @XmlElement(name = "CNPJ", required = true)
            protected String cnpj;

            /**
             * Gets the value of the xSeg property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getXSeg() {
                return xSeg;
            }

            /**
             * Sets the value of the xSeg property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setXSeg(String value) {
                this.xSeg = value;
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

        }

    }

}
