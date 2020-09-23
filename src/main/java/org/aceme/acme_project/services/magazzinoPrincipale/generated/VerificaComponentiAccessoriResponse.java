
package org.aceme.acme_project.services.magazzinoPrincipale.generated;

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
 *         &lt;element name="magazzino" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="verificaComponente" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
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
    "magazzino",
    "verificaComponente"
})
@XmlRootElement(name = "verificaComponentiAccessoriResponse")
public class VerificaComponentiAccessoriResponse {

    @XmlElement(required = true)
    protected String magazzino;
    protected boolean verificaComponente;

    /**
     * Recupera il valore della proprietà magazzino.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMagazzino() {
        return magazzino;
    }

    /**
     * Imposta il valore della proprietà magazzino.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMagazzino(String value) {
        this.magazzino = value;
    }

    /**
     * Recupera il valore della proprietà verificaComponente.
     * 
     */
    public boolean isVerificaComponente() {
        return verificaComponente;
    }

    /**
     * Imposta il valore della proprietà verificaComponente.
     * 
     */
    public void setVerificaComponente(boolean value) {
        this.verificaComponente = value;
    }

}
