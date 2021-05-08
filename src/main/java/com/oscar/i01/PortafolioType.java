//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.3.2 
// Visite <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2021.05.07 a las 08:53:02 PM COT 
//


package com.oscar.i01;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para PortafolioType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="PortafolioType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="elemento" type="{http://www.seps.gob.ec/portafolios}ElementoType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="estructura" use="required"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *             &lt;maxLength value="3"/&gt;
 *           &lt;/restriction&gt;
 *         &lt;/simpleType&gt;
 *       &lt;/attribute&gt;
 *       &lt;attribute name="rucEntidad" use="required"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *             &lt;maxLength value="13"/&gt;
 *             &lt;pattern value="[0-9]+(\.[0-9]{1,2})*"/&gt;
 *           &lt;/restriction&gt;
 *         &lt;/simpleType&gt;
 *       &lt;/attribute&gt;
 *       &lt;attribute name="fechaCorte" use="required"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *             &lt;pattern value="(((((0[1-9])|(1\d)|(2[0-8]))/((0[1-9])|(1[0-2])))|((31/((0[13578])|(1[02])))|((29|30)/((0[1,3-9])|(1[0-2])))))/((20[0-9][0-9])|(19[0-9][0-9])))|((29/02/(19|20)(([02468][048])|([13579][26]))))"/&gt;
 *           &lt;/restriction&gt;
 *         &lt;/simpleType&gt;
 *       &lt;/attribute&gt;
 *       &lt;attribute name="numRegistro" use="required"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer"&gt;
 *             &lt;totalDigits value="8"/&gt;
 *             &lt;maxInclusive value="99999999"/&gt;
 *           &lt;/restriction&gt;
 *         &lt;/simpleType&gt;
 *       &lt;/attribute&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PortafolioType", propOrder = {
    "elemento"
})
public class PortafolioType {

    protected List<ElementoType> elemento;
    @XmlAttribute(name = "estructura", required = true)
    protected String estructura;
    @XmlAttribute(name = "rucEntidad", required = true)
    protected String rucEntidad;
    @XmlAttribute(name = "fechaCorte", required = true)
    protected String fechaCorte;
    @XmlAttribute(name = "numRegistro", required = true)
    protected BigInteger numRegistro;

    /**
     * Gets the value of the elemento property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the elemento property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getElemento().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ElementoType }
     * 
     * 
     */
    public List<ElementoType> getElemento() {
        if (elemento == null) {
            elemento = new ArrayList<ElementoType>();
        }
        return this.elemento;
    }

    /**
     * Obtiene el valor de la propiedad estructura.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEstructura() {
        return estructura;
    }

    /**
     * Define el valor de la propiedad estructura.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEstructura(String value) {
        this.estructura = value;
    }

    /**
     * Obtiene el valor de la propiedad rucEntidad.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRucEntidad() {
        return rucEntidad;
    }

    /**
     * Define el valor de la propiedad rucEntidad.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRucEntidad(String value) {
        this.rucEntidad = value;
    }

    /**
     * Obtiene el valor de la propiedad fechaCorte.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFechaCorte() {
        return fechaCorte;
    }

    /**
     * Define el valor de la propiedad fechaCorte.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFechaCorte(String value) {
        this.fechaCorte = value;
    }

    /**
     * Obtiene el valor de la propiedad numRegistro.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNumRegistro() {
        return numRegistro;
    }

    /**
     * Define el valor de la propiedad numRegistro.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNumRegistro(BigInteger value) {
        this.numRegistro = value;
    }

}
