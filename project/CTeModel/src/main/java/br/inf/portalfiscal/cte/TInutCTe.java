//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.09.26 at 12:40:29 AM BRT 
//


package br.inf.portalfiscal.cte;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlID;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import org.w3._2000._09.xmldsig.SignatureType;


/**
 * Tipo Pedido de Inutilização de Numeração do Conhecimento de Transporte eletrônico
 * 
 * <p>Java class for TInutCTe complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TInutCTe">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="infInut">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="tpAmb" type="{http://www.portalfiscal.inf.br/cte}TAmb"/>
 *                   &lt;element name="xServ" type="{http://www.portalfiscal.inf.br/cte}TServ"/>
 *                   &lt;element name="cUF" type="{http://www.portalfiscal.inf.br/cte}TCodUfIBGE"/>
 *                   &lt;element name="ano">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}short">
 *                         &lt;pattern value="[0-9]{1,2}"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="CNPJ" type="{http://www.portalfiscal.inf.br/cte}TCnpj"/>
 *                   &lt;element name="mod" type="{http://www.portalfiscal.inf.br/cte}TModCT"/>
 *                   &lt;element name="serie" type="{http://www.portalfiscal.inf.br/cte}TSerie"/>
 *                   &lt;element name="nCTIni" type="{http://www.portalfiscal.inf.br/cte}TNF"/>
 *                   &lt;element name="nCTFin" type="{http://www.portalfiscal.inf.br/cte}TNF"/>
 *                   &lt;element name="xJust" type="{http://www.portalfiscal.inf.br/cte}TJust"/>
 *                 &lt;/sequence>
 *                 &lt;attribute name="Id" use="required">
 *                   &lt;simpleType>
 *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}ID">
 *                       &lt;pattern value="ID[0-9]{39}"/>
 *                     &lt;/restriction>
 *                   &lt;/simpleType>
 *                 &lt;/attribute>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element ref="{http://www.w3.org/2000/09/xmldsig#}Signature"/>
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
@XmlType(name = "TInutCTe", propOrder = {
    "infInut",
    "signature"
})
public class TInutCTe {

    @XmlElement(required = true)
    protected TInutCTe.InfInut infInut;
    @XmlElement(name = "Signature", namespace = "http://www.w3.org/2000/09/xmldsig#", required = true)
    protected SignatureType signature;
    @XmlAttribute(name = "versao", required = true)
    protected String versao;

    /**
     * Gets the value of the infInut property.
     * 
     * @return
     *     possible object is
     *     {@link TInutCTe.InfInut }
     *     
     */
    public TInutCTe.InfInut getInfInut() {
        return infInut;
    }

    /**
     * Sets the value of the infInut property.
     * 
     * @param value
     *     allowed object is
     *     {@link TInutCTe.InfInut }
     *     
     */
    public void setInfInut(TInutCTe.InfInut value) {
        this.infInut = value;
    }

    /**
     * Gets the value of the signature property.
     * 
     * @return
     *     possible object is
     *     {@link SignatureType }
     *     
     */
    public SignatureType getSignature() {
        return signature;
    }

    /**
     * Sets the value of the signature property.
     * 
     * @param value
     *     allowed object is
     *     {@link SignatureType }
     *     
     */
    public void setSignature(SignatureType value) {
        this.signature = value;
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
     *         &lt;element name="tpAmb" type="{http://www.portalfiscal.inf.br/cte}TAmb"/>
     *         &lt;element name="xServ" type="{http://www.portalfiscal.inf.br/cte}TServ"/>
     *         &lt;element name="cUF" type="{http://www.portalfiscal.inf.br/cte}TCodUfIBGE"/>
     *         &lt;element name="ano">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}short">
     *               &lt;pattern value="[0-9]{1,2}"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="CNPJ" type="{http://www.portalfiscal.inf.br/cte}TCnpj"/>
     *         &lt;element name="mod" type="{http://www.portalfiscal.inf.br/cte}TModCT"/>
     *         &lt;element name="serie" type="{http://www.portalfiscal.inf.br/cte}TSerie"/>
     *         &lt;element name="nCTIni" type="{http://www.portalfiscal.inf.br/cte}TNF"/>
     *         &lt;element name="nCTFin" type="{http://www.portalfiscal.inf.br/cte}TNF"/>
     *         &lt;element name="xJust" type="{http://www.portalfiscal.inf.br/cte}TJust"/>
     *       &lt;/sequence>
     *       &lt;attribute name="Id" use="required">
     *         &lt;simpleType>
     *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}ID">
     *             &lt;pattern value="ID[0-9]{39}"/>
     *           &lt;/restriction>
     *         &lt;/simpleType>
     *       &lt;/attribute>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "tpAmb",
        "xServ",
        "cuf",
        "ano",
        "cnpj",
        "mod",
        "serie",
        "nctIni",
        "nctFin",
        "xJust"
    })
    public static class InfInut {

        @XmlElement(required = true)
        protected String tpAmb;
        @XmlElement(required = true)
        protected String xServ;
        @XmlElement(name = "cUF", required = true)
        protected String cuf;
        protected short ano;
        @XmlElement(name = "CNPJ", required = true)
        protected String cnpj;
        @XmlElement(required = true)
        protected String mod;
        @XmlElement(required = true)
        protected String serie;
        @XmlElement(name = "nCTIni", required = true)
        protected String nctIni;
        @XmlElement(name = "nCTFin", required = true)
        protected String nctFin;
        @XmlElement(required = true)
        protected String xJust;
        @XmlAttribute(name = "Id", required = true)
        @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
        @XmlID
        protected String id;

        /**
         * Gets the value of the tpAmb property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTpAmb() {
            return tpAmb;
        }

        /**
         * Sets the value of the tpAmb property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setTpAmb(String value) {
            this.tpAmb = value;
        }

        /**
         * Gets the value of the xServ property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getXServ() {
            return xServ;
        }

        /**
         * Sets the value of the xServ property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setXServ(String value) {
            this.xServ = value;
        }

        /**
         * Gets the value of the cuf property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCUF() {
            return cuf;
        }

        /**
         * Sets the value of the cuf property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCUF(String value) {
            this.cuf = value;
        }

        /**
         * Gets the value of the ano property.
         * 
         */
        public short getAno() {
            return ano;
        }

        /**
         * Sets the value of the ano property.
         * 
         */
        public void setAno(short value) {
            this.ano = value;
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
         * Gets the value of the mod property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getMod() {
            return mod;
        }

        /**
         * Sets the value of the mod property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setMod(String value) {
            this.mod = value;
        }

        /**
         * Gets the value of the serie property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSerie() {
            return serie;
        }

        /**
         * Sets the value of the serie property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSerie(String value) {
            this.serie = value;
        }

        /**
         * Gets the value of the nctIni property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getNCTIni() {
            return nctIni;
        }

        /**
         * Sets the value of the nctIni property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setNCTIni(String value) {
            this.nctIni = value;
        }

        /**
         * Gets the value of the nctFin property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getNCTFin() {
            return nctFin;
        }

        /**
         * Sets the value of the nctFin property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setNCTFin(String value) {
            this.nctFin = value;
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
         * Gets the value of the id property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getId() {
            return id;
        }

        /**
         * Sets the value of the id property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setId(String value) {
            this.id = value;
        }

    }

}
