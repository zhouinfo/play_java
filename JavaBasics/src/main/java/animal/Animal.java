//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.01.19 at 03:17:43 PM CST 
//


package animal;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Animal complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Animal">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="animalName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="animalType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Animal", propOrder = {
    "animalName",
    "animalType"
})
public class Animal {

    @XmlElement(required = true)
    protected String animalName;
    @XmlElement(required = true)
    protected String animalType;

    /**
     * Gets the value of the animalName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAnimalName() {
        return animalName;
    }

    /**
     * Sets the value of the animalName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAnimalName(String value) {
        this.animalName = value;
    }

    /**
     * Gets the value of the animalType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAnimalType() {
        return animalType;
    }

    /**
     * Sets the value of the animalType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAnimalType(String value) {
        this.animalType = value;
    }

}