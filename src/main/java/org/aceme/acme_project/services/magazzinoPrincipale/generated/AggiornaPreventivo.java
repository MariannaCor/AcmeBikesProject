
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
 *         &lt;element name="applicaSconto" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="parzialePreventivo" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="sconto" type="{http://www.w3.org/2001/XMLSchema}int"/>
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
    "applicaSconto",
    "parzialePreventivo",
    "sconto"
})
@XmlRootElement(name = "aggiornaPreventivo")
public class AggiornaPreventivo {

    protected boolean applicaSconto;
    protected double parzialePreventivo;
    protected int sconto;

    /**
     * Recupera il valore della proprietà applicaSconto.
     * 
     */
    public boolean isApplicaSconto() {
        return applicaSconto;
    }

    /**
     * Imposta il valore della proprietà applicaSconto.
     * 
     */
    public void setApplicaSconto(boolean value) {
        this.applicaSconto = value;
    }

    /**
     * Recupera il valore della proprietà parzialePreventivo.
     * 
     */
    public double getParzialePreventivo() {
        return parzialePreventivo;
    }

    /**
     * Imposta il valore della proprietà parzialePreventivo.
     * 
     */
    public void setParzialePreventivo(double value) {
        this.parzialePreventivo = value;
    }

    /**
     * Recupera il valore della proprietà sconto.
     * 
     */
    public int getSconto() {
        return sconto;
    }

    /**
     * Imposta il valore della proprietà sconto.
     * 
     */
    public void setSconto(int value) {
        this.sconto = value;
    }

}
