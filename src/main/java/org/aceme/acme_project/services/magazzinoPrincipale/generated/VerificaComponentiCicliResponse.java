
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
    "verificaComponente"
})
@XmlRootElement(name = "verificaComponentiCicliResponse")
public class VerificaComponentiCicliResponse {

    protected boolean verificaComponente;

    /**
     * Recupera il valore della propriet� verificaComponente.
     * 
     */
    public boolean isVerificaComponente() {
        return verificaComponente;
    }

    /**
     * Imposta il valore della propriet� verificaComponente.
     * 
     */
    public void setVerificaComponente(boolean value) {
        this.verificaComponente = value;
    }

}