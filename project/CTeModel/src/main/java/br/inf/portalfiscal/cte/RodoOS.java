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
 *         &lt;choice>
 *           &lt;element name="TAF" type="{http://www.portalfiscal.inf.br/cte}TTermoAutFreta"/>
 *           &lt;element name="NroRegEstadual" type="{http://www.portalfiscal.inf.br/cte}TNroRegEstadual"/>
 *         &lt;/choice>
 *         &lt;element name="veic" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="placa">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.portalfiscal.inf.br/cte}TPlaca">
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="RENAVAM" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.portalfiscal.inf.br/cte}TString">
 *                         &lt;minLength value="9"/>
 *                         &lt;maxLength value="11"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="prop" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;choice>
 *                               &lt;element name="CPF" type="{http://www.portalfiscal.inf.br/cte}TCpf"/>
 *                               &lt;element name="CNPJ" type="{http://www.portalfiscal.inf.br/cte}TCnpjOpc"/>
 *                             &lt;/choice>
 *                             &lt;choice>
 *                               &lt;element name="TAF" type="{http://www.portalfiscal.inf.br/cte}TTermoAutFreta"/>
 *                               &lt;element name="NroRegEstadual" type="{http://www.portalfiscal.inf.br/cte}TNroRegEstadual"/>
 *                             &lt;/choice>
 *                             &lt;element name="xNome">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.portalfiscal.inf.br/cte}TString">
 *                                   &lt;maxLength value="60"/>
 *                                   &lt;minLength value="2"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;sequence minOccurs="0">
 *                               &lt;element name="IE">
 *                                 &lt;simpleType>
 *                                   &lt;restriction base="{http://www.portalfiscal.inf.br/cte}TIeDest">
 *                                   &lt;/restriction>
 *                                 &lt;/simpleType>
 *                               &lt;/element>
 *                               &lt;element name="UF" type="{http://www.portalfiscal.inf.br/cte}TUf"/>
 *                             &lt;/sequence>
 *                             &lt;element name="tpProp">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                   &lt;whiteSpace value="preserve"/>
 *                                   &lt;enumeration value="0"/>
 *                                   &lt;enumeration value="1"/>
 *                                   &lt;enumeration value="2"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="UF" type="{http://www.portalfiscal.inf.br/cte}TUf"/>
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
    "taf",
    "nroRegEstadual",
    "veic"
})
@XmlRootElement(name = "rodoOS")
public class RodoOS {

    @XmlElement(name = "TAF")
    protected String taf;
    @XmlElement(name = "NroRegEstadual")
    protected String nroRegEstadual;
    protected RodoOS.Veic veic;

    /**
     * Gets the value of the taf property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTAF() {
        return taf;
    }

    /**
     * Sets the value of the taf property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTAF(String value) {
        this.taf = value;
    }

    /**
     * Gets the value of the nroRegEstadual property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNroRegEstadual() {
        return nroRegEstadual;
    }

    /**
     * Sets the value of the nroRegEstadual property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNroRegEstadual(String value) {
        this.nroRegEstadual = value;
    }

    /**
     * Gets the value of the veic property.
     * 
     * @return
     *     possible object is
     *     {@link RodoOS.Veic }
     *     
     */
    public RodoOS.Veic getVeic() {
        return veic;
    }

    /**
     * Sets the value of the veic property.
     * 
     * @param value
     *     allowed object is
     *     {@link RodoOS.Veic }
     *     
     */
    public void setVeic(RodoOS.Veic value) {
        this.veic = value;
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
     *         &lt;element name="placa">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.portalfiscal.inf.br/cte}TPlaca">
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="RENAVAM" minOccurs="0">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.portalfiscal.inf.br/cte}TString">
     *               &lt;minLength value="9"/>
     *               &lt;maxLength value="11"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="prop" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;choice>
     *                     &lt;element name="CPF" type="{http://www.portalfiscal.inf.br/cte}TCpf"/>
     *                     &lt;element name="CNPJ" type="{http://www.portalfiscal.inf.br/cte}TCnpjOpc"/>
     *                   &lt;/choice>
     *                   &lt;choice>
     *                     &lt;element name="TAF" type="{http://www.portalfiscal.inf.br/cte}TTermoAutFreta"/>
     *                     &lt;element name="NroRegEstadual" type="{http://www.portalfiscal.inf.br/cte}TNroRegEstadual"/>
     *                   &lt;/choice>
     *                   &lt;element name="xNome">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.portalfiscal.inf.br/cte}TString">
     *                         &lt;maxLength value="60"/>
     *                         &lt;minLength value="2"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;sequence minOccurs="0">
     *                     &lt;element name="IE">
     *                       &lt;simpleType>
     *                         &lt;restriction base="{http://www.portalfiscal.inf.br/cte}TIeDest">
     *                         &lt;/restriction>
     *                       &lt;/simpleType>
     *                     &lt;/element>
     *                     &lt;element name="UF" type="{http://www.portalfiscal.inf.br/cte}TUf"/>
     *                   &lt;/sequence>
     *                   &lt;element name="tpProp">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                         &lt;whiteSpace value="preserve"/>
     *                         &lt;enumeration value="0"/>
     *                         &lt;enumeration value="1"/>
     *                         &lt;enumeration value="2"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="UF" type="{http://www.portalfiscal.inf.br/cte}TUf"/>
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
        "placa",
        "renavam",
        "prop",
        "uf"
    })
    public static class Veic {

        @XmlElement(required = true)
        protected String placa;
        @XmlElement(name = "RENAVAM")
        protected String renavam;
        protected RodoOS.Veic.Prop prop;
        @XmlElement(name = "UF", required = true)
        @XmlSchemaType(name = "string")
        protected TUf uf;

        /**
         * Gets the value of the placa property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPlaca() {
            return placa;
        }

        /**
         * Sets the value of the placa property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPlaca(String value) {
            this.placa = value;
        }

        /**
         * Gets the value of the renavam property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getRENAVAM() {
            return renavam;
        }

        /**
         * Sets the value of the renavam property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setRENAVAM(String value) {
            this.renavam = value;
        }

        /**
         * Gets the value of the prop property.
         * 
         * @return
         *     possible object is
         *     {@link RodoOS.Veic.Prop }
         *     
         */
        public RodoOS.Veic.Prop getProp() {
            return prop;
        }

        /**
         * Sets the value of the prop property.
         * 
         * @param value
         *     allowed object is
         *     {@link RodoOS.Veic.Prop }
         *     
         */
        public void setProp(RodoOS.Veic.Prop value) {
            this.prop = value;
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
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *         &lt;choice>
         *           &lt;element name="CPF" type="{http://www.portalfiscal.inf.br/cte}TCpf"/>
         *           &lt;element name="CNPJ" type="{http://www.portalfiscal.inf.br/cte}TCnpjOpc"/>
         *         &lt;/choice>
         *         &lt;choice>
         *           &lt;element name="TAF" type="{http://www.portalfiscal.inf.br/cte}TTermoAutFreta"/>
         *           &lt;element name="NroRegEstadual" type="{http://www.portalfiscal.inf.br/cte}TNroRegEstadual"/>
         *         &lt;/choice>
         *         &lt;element name="xNome">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.portalfiscal.inf.br/cte}TString">
         *               &lt;maxLength value="60"/>
         *               &lt;minLength value="2"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;sequence minOccurs="0">
         *           &lt;element name="IE">
         *             &lt;simpleType>
         *               &lt;restriction base="{http://www.portalfiscal.inf.br/cte}TIeDest">
         *               &lt;/restriction>
         *             &lt;/simpleType>
         *           &lt;/element>
         *           &lt;element name="UF" type="{http://www.portalfiscal.inf.br/cte}TUf"/>
         *         &lt;/sequence>
         *         &lt;element name="tpProp">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *               &lt;whiteSpace value="preserve"/>
         *               &lt;enumeration value="0"/>
         *               &lt;enumeration value="1"/>
         *               &lt;enumeration value="2"/>
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
            "cpf",
            "cnpj",
            "taf",
            "nroRegEstadual",
            "xNome",
            "ie",
            "uf",
            "tpProp"
        })
        public static class Prop {

            @XmlElement(name = "CPF")
            protected String cpf;
            @XmlElement(name = "CNPJ")
            protected String cnpj;
            @XmlElement(name = "TAF")
            protected String taf;
            @XmlElement(name = "NroRegEstadual")
            protected String nroRegEstadual;
            @XmlElement(required = true)
            protected String xNome;
            @XmlElement(name = "IE")
            protected String ie;
            @XmlElement(name = "UF")
            @XmlSchemaType(name = "string")
            protected TUf uf;
            @XmlElement(required = true)
            protected String tpProp;

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
             * Gets the value of the taf property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getTAF() {
                return taf;
            }

            /**
             * Sets the value of the taf property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setTAF(String value) {
                this.taf = value;
            }

            /**
             * Gets the value of the nroRegEstadual property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getNroRegEstadual() {
                return nroRegEstadual;
            }

            /**
             * Sets the value of the nroRegEstadual property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setNroRegEstadual(String value) {
                this.nroRegEstadual = value;
            }

            /**
             * Gets the value of the xNome property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getXNome() {
                return xNome;
            }

            /**
             * Sets the value of the xNome property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setXNome(String value) {
                this.xNome = value;
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
             * Gets the value of the tpProp property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getTpProp() {
                return tpProp;
            }

            /**
             * Sets the value of the tpProp property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setTpProp(String value) {
                this.tpProp = value;
            }

        }

    }

}
