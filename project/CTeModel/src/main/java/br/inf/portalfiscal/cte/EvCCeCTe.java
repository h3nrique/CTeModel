//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.09.18 at 02:33:38 AM BRT 
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
 *         &lt;element name="descEvento">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;whiteSpace value="preserve"/>
 *               &lt;enumeration value="Carta de Correção"/>
 *               &lt;enumeration value="Carta de Correcao"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="infCorrecao" maxOccurs="unbounded">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="grupoAlterado">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;whiteSpace value="preserve"/>
 *                         &lt;minLength value="1"/>
 *                         &lt;maxLength value="20"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="campoAlterado">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;whiteSpace value="preserve"/>
 *                         &lt;minLength value="1"/>
 *                         &lt;maxLength value="20"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="valorAlterado">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;whiteSpace value="preserve"/>
 *                         &lt;minLength value="1"/>
 *                         &lt;maxLength value="500"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="nroItemAlterado" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;whiteSpace value="preserve"/>
 *                         &lt;pattern value="[1-9][0-9]|0?[1-9]"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="xCondUso">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;whiteSpace value="preserve"/>
 *               &lt;enumeration value="A Carta de Correção é disciplinada pelo Art. 58-B do CONVÊNIO/SINIEF 06/89: Fica permitida a utilização de carta de correção, para regularização de erro ocorrido na emissão de documentos fiscais relativos à prestação de serviço de transporte, desde que o erro não esteja relacionado com: I - as variáveis que determinam o valor do imposto tais como: base de cálculo, alíquota, diferença de preço, quantidade, valor da prestação;II - a correção de dados cadastrais que implique mudança do emitente, tomador, remetente ou do destinatário;III - a data de emissão ou de saída."/>
 *               &lt;enumeration value="A Carta de Correcao e disciplinada pelo Art. 58-B do CONVENIO/SINIEF 06/89: Fica permitida a utilizacao de carta de correcao, para regularizacao de erro ocorrido na emissao de documentos fiscais relativos a prestacao de servico de transporte, desde que o erro nao esteja relacionado com: I - as variaveis que determinam o valor do imposto tais como: base de calculo, aliquota, diferenca de preco, quantidade, valor da prestacao;II - a correcao de dados cadastrais que implique mudanca do emitente, tomador, remetente ou do destinatario;III - a data de emissao ou de saida."/>
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
    "infCorrecao",
    "xCondUso"
})
@XmlRootElement(name = "evCCeCTe")
public class EvCCeCTe {

    @XmlElement(required = true)
    protected String descEvento;
    @XmlElement(required = true)
    protected List<EvCCeCTe.InfCorrecao> infCorrecao;
    @XmlElement(required = true)
    protected String xCondUso;

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
     * Gets the value of the infCorrecao property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the infCorrecao property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInfCorrecao().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EvCCeCTe.InfCorrecao }
     * 
     * 
     */
    public List<EvCCeCTe.InfCorrecao> getInfCorrecao() {
        if (infCorrecao == null) {
            infCorrecao = new ArrayList<EvCCeCTe.InfCorrecao>();
        }
        return this.infCorrecao;
    }

    /**
     * Gets the value of the xCondUso property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getXCondUso() {
        return xCondUso;
    }

    /**
     * Sets the value of the xCondUso property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setXCondUso(String value) {
        this.xCondUso = value;
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
     *         &lt;element name="grupoAlterado">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;whiteSpace value="preserve"/>
     *               &lt;minLength value="1"/>
     *               &lt;maxLength value="20"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="campoAlterado">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;whiteSpace value="preserve"/>
     *               &lt;minLength value="1"/>
     *               &lt;maxLength value="20"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="valorAlterado">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;whiteSpace value="preserve"/>
     *               &lt;minLength value="1"/>
     *               &lt;maxLength value="500"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="nroItemAlterado" minOccurs="0">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;whiteSpace value="preserve"/>
     *               &lt;pattern value="[1-9][0-9]|0?[1-9]"/>
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
        "grupoAlterado",
        "campoAlterado",
        "valorAlterado",
        "nroItemAlterado"
    })
    public static class InfCorrecao {

        @XmlElement(required = true)
        protected String grupoAlterado;
        @XmlElement(required = true)
        protected String campoAlterado;
        @XmlElement(required = true)
        protected String valorAlterado;
        protected String nroItemAlterado;

        /**
         * Gets the value of the grupoAlterado property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getGrupoAlterado() {
            return grupoAlterado;
        }

        /**
         * Sets the value of the grupoAlterado property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setGrupoAlterado(String value) {
            this.grupoAlterado = value;
        }

        /**
         * Gets the value of the campoAlterado property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCampoAlterado() {
            return campoAlterado;
        }

        /**
         * Sets the value of the campoAlterado property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCampoAlterado(String value) {
            this.campoAlterado = value;
        }

        /**
         * Gets the value of the valorAlterado property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getValorAlterado() {
            return valorAlterado;
        }

        /**
         * Sets the value of the valorAlterado property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setValorAlterado(String value) {
            this.valorAlterado = value;
        }

        /**
         * Gets the value of the nroItemAlterado property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getNroItemAlterado() {
            return nroItemAlterado;
        }

        /**
         * Sets the value of the nroItemAlterado property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setNroItemAlterado(String value) {
            this.nroItemAlterado = value;
        }

    }

}
