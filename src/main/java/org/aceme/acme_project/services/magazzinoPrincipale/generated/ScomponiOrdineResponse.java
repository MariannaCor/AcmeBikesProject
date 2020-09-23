
package org.aceme.acme_project.services.magazzinoPrincipale.generated;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
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
 *         &lt;element name="accessoriOk" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
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
    "accessoriOk"
})
@XmlRootElement(name = "scomponiOrdineResponse")
public class ScomponiOrdineResponse {

    protected boolean accessoriOk;

    /**
     * Recupera il valore della proprietà accessoriOk.
     * 
     */
    public boolean isAccessoriOk() {
        return accessoriOk;
    }

    /**
     * Imposta il valore della proprietà accessoriOk.
     * 
     */
    public void setAccessoriOk(boolean value) {
        this.accessoriOk = value;
    }

}
