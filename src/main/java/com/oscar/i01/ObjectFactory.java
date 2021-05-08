//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.3.2 
// Visite <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2021.05.07 a las 08:53:02 PM COT 
//


package com.oscar.i01;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.oscar.i01 package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _Portafolio_QNAME = new QName("http://www.seps.gob.ec/portafolios", "portafolio");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.oscar.i01
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link PortafolioType }
     * 
     */
    public PortafolioType createPortafolioType() {
        return new PortafolioType();
    }

    /**
     * Create an instance of {@link ElementoType }
     * 
     */
    public ElementoType createElementoType() {
        return new ElementoType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PortafolioType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link PortafolioType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.seps.gob.ec/portafolios", name = "portafolio")
    public JAXBElement<PortafolioType> createPortafolio(PortafolioType value) {
        return new JAXBElement<PortafolioType>(_Portafolio_QNAME, PortafolioType.class, null, value);
    }

}
