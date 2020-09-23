
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
 *         &lt;element name="totalePreventivo" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="importoBonificoAcconto" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="importoBonificoSaldo" type="{http://www.w3.org/2001/XMLSchema}double"/>
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
    "totalePreventivo",
    "importoBonificoAcconto",
    "importoBonificoSaldo"
})
@XmlRootElement(name = "verificaImportoSaldo")
public class VerificaImportoSaldo {

    protected double totalePreventivo;
    protected double importoBonificoAcconto;
    protected double importoBonificoSaldo;

    /**
     * Recupera il valore della proprietà totalePreventivo.
     * 
     */
    public double getTotalePreventivo() {
        return totalePreventivo;
    }

    /**
     * Imposta il valore della proprietà totalePreventivo.
     * 
     */
    public void setTotalePreventivo(double value) {
        this.totalePreventivo = value;
    }

    /**
     * Recupera il valore della proprietà importoBonificoAcconto.
     * 
     */
    public double getImportoBonificoAcconto() {
        return importoBonificoAcconto;
    }

    /**
     * Imposta il valore della proprietà importoBonificoAcconto.
     * 
     */
    public void setImportoBonificoAcconto(double value) {
        this.importoBonificoAcconto = value;
    }

    /**
     * Recupera il valore della proprietà importoBonificoSaldo.
     * 
     */
    public double getImportoBonificoSaldo() {
        return importoBonificoSaldo;
    }

    /**
     * Imposta il valore della proprietà importoBonificoSaldo.
     * 
     */
    public void setImportoBonificoSaldo(double value) {
        this.importoBonificoSaldo = value;
    }

}
