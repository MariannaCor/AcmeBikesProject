
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
 *         &lt;element name="lista" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
    "lista"
})
@XmlRootElement(name = "calcolaPreventivo")
public class CalcolaPreventivo {

    @XmlElement(required = true)
    protected String lista;

    /**
     * Recupera il valore della propriet� lista.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLista() {
        return lista;
    }

    /**
     * Imposta il valore della propriet� lista.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLista(String value) {
        this.lista = value;
    }

}
