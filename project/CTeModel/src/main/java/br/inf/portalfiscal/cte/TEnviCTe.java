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
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Tipo Pedido de Concessão de Autorização da CT-e
 * 
 * <p>Java class for TEnviCTe complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TEnviCTe">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="idLote" type="{http://www.portalfiscal.inf.br/cte}TIdLote"/>
 *         &lt;element name="CTe" type="{http://www.portalfiscal.inf.br/cte}TCTe" maxOccurs="50"/>
 *       &lt;/sequence>
 *       &lt;attribute name="versao" use="required" type="{http://www.portalfiscal.inf.br/cte}TVerCTe" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TEnviCTe", propOrder = {
    "idLote",
    "cTe"
})
public class TEnviCTe {

    @XmlElement(required = true)
    protected String idLote;
    @XmlElement(name = "CTe", required = true)
    protected List<TCTe> cTe;
    @XmlAttribute(name = "versao", required = true)
    protected String versao;

    /**
     * Gets the value of the idLote property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdLote() {
        return idLote;
    }

    /**
     * Sets the value of the idLote property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdLote(String value) {
        this.idLote = value;
    }

    /**
     * Gets the value of the cTe property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the cTe property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCTe().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TCTe }
     * 
     * 
     */
    public List<TCTe> getCTe() {
        if (cTe == null) {
            cTe = new ArrayList<TCTe>();
        }
        return this.cTe;
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
