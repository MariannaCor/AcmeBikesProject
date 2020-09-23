
package org.aceme.acme_project.services.magazzinoEsterno.generated;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per anonymous complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="indirizzoMagazzino" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="accessorio" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
    "indirizzoMagazzino",
    "accessorio"
})
@XmlRootElement(name = "ordineComponenteAccessori")
public class OrdineComponenteAccessori {

    @XmlElement(required = true)
    protected String indirizzoMagazzino;
    @XmlElement(required = true)
    protected String accessorio;

    /**
     * Recupera il valore della proprietà indirizzoMagazzino.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIndirizzoMagazzino() {
        return indirizzoMagazzino;
    }

    /**
     * Imposta il valore della proprietà indirizzoMagazzino.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIndirizzoMagazzino(String value) {
        this.indirizzoMagazzino = value;
    }

    /**
     * Recupera il valore della proprietà accessorio.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccessorio() {
        return accessorio;
    }

    /**
     * Imposta il valore della proprietà accessorio.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccessorio(String value) {
        this.accessorio = value;
    }

}
