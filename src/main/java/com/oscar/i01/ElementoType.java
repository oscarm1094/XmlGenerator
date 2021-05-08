//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.3.2 
// Visite <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2021.05.07 a las 08:53:02 PM COT 
//


package com.oscar.i01;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ElementoType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ElementoType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;attribute name="numeroIdentificacionDeposito" use="required"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *             &lt;maxLength value="25"/&gt;
 *             &lt;minLength value="1"/&gt;
 *             &lt;whiteSpace value="collapse"/&gt;
 *           &lt;/restriction&gt;
 *         &lt;/simpleType&gt;
 *       &lt;/attribute&gt;
 *       &lt;attribute name="tipoIdentificacionEmisorDepositario" use="required"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *             &lt;maxLength value="1"/&gt;
 *           &lt;/restriction&gt;
 *         &lt;/simpleType&gt;
 *       &lt;/attribute&gt;
 *       &lt;attribute name="identificacionEmisorDepositario" use="required"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *             &lt;maxLength value="15"/&gt;
 *             &lt;minLength value="1"/&gt;
 *             &lt;whiteSpace value="collapse"/&gt;
 *           &lt;/restriction&gt;
 *         &lt;/simpleType&gt;
 *       &lt;/attribute&gt;
 *       &lt;attribute name="fechaEmision" use="required"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *             &lt;pattern value="(((((0[1-9])|(1\d)|(2[0-8]))/((0[1-9])|(1[0-2])))|((31/((0[13578])|(1[02])))|((29|30)/((0[1,3-9])|(1[0-2])))))/((20[0-9][0-9])|(19[0-9][0-9])))|((29/02/(19|20)(([02468][048])|([13579][26]))))"/&gt;
 *           &lt;/restriction&gt;
 *         &lt;/simpleType&gt;
 *       &lt;/attribute&gt;
 *       &lt;attribute name="fechaCompra"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *             &lt;pattern value="(((((0[1-9])|(1\d)|(2[0-8]))/((0[1-9])|(1[0-2])))|((31/((0[13578])|(1[02])))|((29|30)/((0[1,3-9])|(1[0-2])))))/((20[0-9][0-9])|(19[0-9][0-9])))|((29/02/(19|20)(([02468][048])|([13579][26]))))"/&gt;
 *           &lt;/restriction&gt;
 *         &lt;/simpleType&gt;
 *       &lt;/attribute&gt;
 *       &lt;attribute name="tipoInstrumento" use="required"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *             &lt;maxLength value="3"/&gt;
 *           &lt;/restriction&gt;
 *         &lt;/simpleType&gt;
 *       &lt;/attribute&gt;
 *       &lt;attribute name="paisEmisionDepositario" use="required"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *             &lt;maxLength value="3"/&gt;
 *           &lt;/restriction&gt;
 *         &lt;/simpleType&gt;
 *       &lt;/attribute&gt;
 *       &lt;attribute name="valorNominal"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal"&gt;
 *             &lt;maxInclusive value="9999999999999"/&gt;
 *             &lt;totalDigits value="15"/&gt;
 *             &lt;fractionDigits value="2"/&gt;
 *             &lt;pattern value="[0-9]+\.[0-9]{2}"/&gt;
 *           &lt;/restriction&gt;
 *         &lt;/simpleType&gt;
 *       &lt;/attribute&gt;
 *       &lt;attribute name="valorCompra"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal"&gt;
 *             &lt;maxInclusive value="9999999999999"/&gt;
 *             &lt;totalDigits value="15"/&gt;
 *             &lt;fractionDigits value="2"/&gt;
 *             &lt;pattern value="[0-9]+\.[0-9]{2}"/&gt;
 *           &lt;/restriction&gt;
 *         &lt;/simpleType&gt;
 *       &lt;/attribute&gt;
 *       &lt;attribute name="periodicidadPagoCupon"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer"&gt;
 *             &lt;totalDigits value="4"/&gt;
 *             &lt;maxInclusive value="9999"/&gt;
 *             &lt;minInclusive value="0"/&gt;
 *             &lt;whiteSpace value="collapse"/&gt;
 *           &lt;/restriction&gt;
 *         &lt;/simpleType&gt;
 *       &lt;/attribute&gt;
 *       &lt;attribute name="clasificacionEmisorDepositario" use="required"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *             &lt;maxLength value="2"/&gt;
 *           &lt;/restriction&gt;
 *         &lt;/simpleType&gt;
 *       &lt;/attribute&gt;
 *       &lt;attribute name="tipoEmisorDepositario" use="required"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *             &lt;maxLength value="2"/&gt;
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
@XmlType(name = "ElementoType")
public class ElementoType {

    @XmlAttribute(name = "numeroIdentificacionDeposito", required = true)
    protected String numeroIdentificacionDeposito;
    @XmlAttribute(name = "tipoIdentificacionEmisorDepositario", required = true)
    protected String tipoIdentificacionEmisorDepositario;
    @XmlAttribute(name = "identificacionEmisorDepositario", required = true)
    protected String identificacionEmisorDepositario;
    @XmlAttribute(name = "fechaEmision", required = true)
    protected String fechaEmision;
    @XmlAttribute(name = "fechaCompra")
    protected String fechaCompra;
    @XmlAttribute(name = "tipoInstrumento", required = true)
    protected String tipoInstrumento;
    @XmlAttribute(name = "paisEmisionDepositario", required = true)
    protected String paisEmisionDepositario;
    @XmlAttribute(name = "valorNominal")
    protected BigDecimal valorNominal;
    @XmlAttribute(name = "valorCompra")
    protected BigDecimal valorCompra;
    @XmlAttribute(name = "periodicidadPagoCupon")
    protected Integer periodicidadPagoCupon;
    @XmlAttribute(name = "clasificacionEmisorDepositario", required = true)
    protected String clasificacionEmisorDepositario;
    @XmlAttribute(name = "tipoEmisorDepositario", required = true)
    protected String tipoEmisorDepositario;

    /**
     * Obtiene el valor de la propiedad numeroIdentificacionDeposito.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumeroIdentificacionDeposito() {
        return numeroIdentificacionDeposito;
    }

    /**
     * Define el valor de la propiedad numeroIdentificacionDeposito.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumeroIdentificacionDeposito(String value) {
        this.numeroIdentificacionDeposito = value;
    }

    /**
     * Obtiene el valor de la propiedad tipoIdentificacionEmisorDepositario.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipoIdentificacionEmisorDepositario() {
        return tipoIdentificacionEmisorDepositario;
    }

    /**
     * Define el valor de la propiedad tipoIdentificacionEmisorDepositario.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipoIdentificacionEmisorDepositario(String value) {
        this.tipoIdentificacionEmisorDepositario = value;
    }

    /**
     * Obtiene el valor de la propiedad identificacionEmisorDepositario.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdentificacionEmisorDepositario() {
        return identificacionEmisorDepositario;
    }

    /**
     * Define el valor de la propiedad identificacionEmisorDepositario.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdentificacionEmisorDepositario(String value) {
        this.identificacionEmisorDepositario = value;
    }

    /**
     * Obtiene el valor de la propiedad fechaEmision.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFechaEmision() {
        return fechaEmision;
    }

    /**
     * Define el valor de la propiedad fechaEmision.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFechaEmision(String value) {
        this.fechaEmision = value;
    }

    /**
     * Obtiene el valor de la propiedad fechaCompra.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFechaCompra() {
        return fechaCompra;
    }

    /**
     * Define el valor de la propiedad fechaCompra.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFechaCompra(String value) {
        this.fechaCompra = value;
    }

    /**
     * Obtiene el valor de la propiedad tipoInstrumento.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipoInstrumento() {
        return tipoInstrumento;
    }

    /**
     * Define el valor de la propiedad tipoInstrumento.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipoInstrumento(String value) {
        this.tipoInstrumento = value;
    }

    /**
     * Obtiene el valor de la propiedad paisEmisionDepositario.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaisEmisionDepositario() {
        return paisEmisionDepositario;
    }

    /**
     * Define el valor de la propiedad paisEmisionDepositario.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaisEmisionDepositario(String value) {
        this.paisEmisionDepositario = value;
    }

    /**
     * Obtiene el valor de la propiedad valorNominal.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getValorNominal() {
        return valorNominal;
    }

    /**
     * Define el valor de la propiedad valorNominal.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setValorNominal(BigDecimal value) {
        this.valorNominal = value;
    }

    /**
     * Obtiene el valor de la propiedad valorCompra.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getValorCompra() {
        return valorCompra;
    }

    /**
     * Define el valor de la propiedad valorCompra.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setValorCompra(BigDecimal value) {
        this.valorCompra = value;
    }

    /**
     * Obtiene el valor de la propiedad periodicidadPagoCupon.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPeriodicidadPagoCupon() {
        return periodicidadPagoCupon;
    }

    /**
     * Define el valor de la propiedad periodicidadPagoCupon.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPeriodicidadPagoCupon(Integer value) {
        this.periodicidadPagoCupon = value;
    }

    /**
     * Obtiene el valor de la propiedad clasificacionEmisorDepositario.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClasificacionEmisorDepositario() {
        return clasificacionEmisorDepositario;
    }

    /**
     * Define el valor de la propiedad clasificacionEmisorDepositario.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClasificacionEmisorDepositario(String value) {
        this.clasificacionEmisorDepositario = value;
    }

    /**
     * Obtiene el valor de la propiedad tipoEmisorDepositario.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipoEmisorDepositario() {
        return tipoEmisorDepositario;
    }

    /**
     * Define el valor de la propiedad tipoEmisorDepositario.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipoEmisorDepositario(String value) {
        this.tipoEmisorDepositario = value;
    }

}
