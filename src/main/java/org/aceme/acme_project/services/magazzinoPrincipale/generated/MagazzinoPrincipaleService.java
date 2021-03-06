
package org.aceme.acme_project.services.magazzinoPrincipale.generated;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebService(name = "magazzinoPrincipaleService", targetNamespace = "acme.wsdl")
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
@XmlSeeAlso({
    ObjectFactory.class
})
public interface MagazzinoPrincipaleService {


    /**
     * 
     * @param body
     * @return
     *     returns org.aceme.acme_project.services.magazzinoPrincipale.generated.ScomponiOrdineResponse
     */
    @WebMethod(action = "scomponiOrdine")
    @WebResult(name = "scomponiOrdineResponse", targetNamespace = "acme.xsd", partName = "body")
    public ScomponiOrdineResponse scomponiOrdine(
        @WebParam(name = "scomponiOrdine", targetNamespace = "acme.xsd", partName = "body")
        ScomponiOrdine body);

    /**
     * 
     * @param body
     * @return
     *     returns org.aceme.acme_project.services.magazzinoPrincipale.generated.VerificaComponentiMancantiCicliResponse
     */
    @WebMethod(action = "verificaComponentiMancantiCicli")
    @WebResult(name = "verificaComponentiMancantiCicliResponse", targetNamespace = "acme.xsd", partName = "body")
    public VerificaComponentiMancantiCicliResponse verificaComponentiMancantiCicli(
        @WebParam(name = "verificaComponentiMancantiCicli", targetNamespace = "acme.xsd", partName = "body")
        VerificaComponentiMancantiCicli body);

    /**
     * 
     * @param body
     * @return
     *     returns org.aceme.acme_project.services.magazzinoPrincipale.generated.VerificaMontaggioResponse
     */
    @WebMethod(action = "verificaMontaggio")
    @WebResult(name = "verificaMontaggioResponse", targetNamespace = "acme.xsd", partName = "body")
    public VerificaMontaggioResponse verificaMontaggio(
        @WebParam(name = "verificaMontaggio", targetNamespace = "acme.xsd", partName = "body")
        VerificaMontaggio body);

    /**
     * 
     * @param body
     * @return
     *     returns org.aceme.acme_project.services.magazzinoPrincipale.generated.VerificaComponentiAccessoriResponse
     */
    @WebMethod(action = "verificaComponentiAccessori")
    @WebResult(name = "verificaComponentiAccessoriResponse", targetNamespace = "acme.xsd", partName = "body")
    public VerificaComponentiAccessoriResponse verificaComponentiAccessori(
        @WebParam(name = "verificaComponentiAccessori", targetNamespace = "acme.xsd", partName = "body")
        VerificaComponentiAccessori body);

    /**
     * 
     * @param body
     * @return
     *     returns org.aceme.acme_project.services.magazzinoPrincipale.generated.VerificaImportoSaldoResponse
     */
    @WebMethod(action = "verificaImportoSaldo")
    @WebResult(name = "verificaImportoSaldoResponse", targetNamespace = "acme.xsd", partName = "body")
    public VerificaImportoSaldoResponse verificaImportoSaldo(
        @WebParam(name = "verificaImportoSaldo", targetNamespace = "acme.xsd", partName = "body")
        VerificaImportoSaldo body);

    /**
     * 
     * @param body
     * @return
     *     returns org.aceme.acme_project.services.magazzinoPrincipale.generated.AggiornaPreventivoResponse
     */
    @WebMethod(action = "aggiornaPreventivo")
    @WebResult(name = "aggiornaPreventivoResponse", targetNamespace = "acme.xsd", partName = "body")
    public AggiornaPreventivoResponse aggiornaPreventivo(
        @WebParam(name = "aggiornaPreventivo", targetNamespace = "acme.xsd", partName = "body")
        AggiornaPreventivo body);

    /**
     * 
     * @param body
     * @return
     *     returns org.aceme.acme_project.services.magazzinoPrincipale.generated.VerificaComponentiCicliResponse
     */
    @WebMethod(action = "verificaComponentiCicli")
    @WebResult(name = "verificaComponentiCicliResponse", targetNamespace = "acme.xsd", partName = "body")
    public VerificaComponentiCicliResponse verificaComponentiCicli(
        @WebParam(name = "verificaComponentiCicli", targetNamespace = "acme.xsd", partName = "body")
        VerificaComponentiCicli body);

    /**
     * 
     * @param body
     * @return
     *     returns org.aceme.acme_project.services.magazzinoPrincipale.generated.CalcolaPreventivoResponse
     */
    @WebMethod(action = "calcolaPreventivo")
    @WebResult(name = "calcolaPreventivoResponse", targetNamespace = "acme.xsd", partName = "body")
    public CalcolaPreventivoResponse calcolaPreventivo(
        @WebParam(name = "calcolaPreventivo", targetNamespace = "acme.xsd", partName = "body")
        CalcolaPreventivo body);

    /**
     * 
     * @param body
     * @return
     *     returns org.aceme.acme_project.services.magazzinoPrincipale.generated.VerificaImportoAccontoResponse
     */
    @WebMethod(action = "verificaImportoAcconto")
    @WebResult(name = "verificaImportoAccontoResponse", targetNamespace = "acme.xsd", partName = "body")
    public VerificaImportoAccontoResponse verificaImportoAcconto(
        @WebParam(name = "verificaImportoAcconto", targetNamespace = "acme.xsd", partName = "body")
        VerificaImportoAcconto body);

}
