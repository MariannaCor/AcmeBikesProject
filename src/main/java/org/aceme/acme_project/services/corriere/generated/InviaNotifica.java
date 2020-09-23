
package org.aceme.acme_project.services.corriere.generated;

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
 *         &lt;element name="statusPacco" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
    "statusPacco"
})
@XmlRootElement(name = "inviaNotifica")
public class InviaNotifica {

    @XmlElement(required = true)
    protected String statusPacco;

    /**
     * Recupera il valore della proprietà statusPacco.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatusPacco() {
        return statusPacco;
    }

    /**
     * Imposta il valore della proprietà statusPacco.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatusPacco(String value) {
        this.statusPacco = value;
    }

}
