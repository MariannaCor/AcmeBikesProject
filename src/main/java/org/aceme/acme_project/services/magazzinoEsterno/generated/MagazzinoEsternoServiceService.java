
package org.aceme.acme_project.services.magazzinoEsterno.generated;

import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "magazzinoEsternoServiceService", targetNamespace = "acme.wsdl", wsdlLocation = "/MagazzinoEsterno.wsdl")
public class MagazzinoEsternoServiceService
    extends Service
{

    private final static URL MAGAZZINOESTERNOSERVICESERVICE_WSDL_LOCATION;
    private final static WebServiceException MAGAZZINOESTERNOSERVICESERVICE_EXCEPTION;
    private final static QName MAGAZZINOESTERNOSERVICESERVICE_QNAME = new QName("acme.wsdl", "magazzinoEsternoServiceService");

    static {
        MAGAZZINOESTERNOSERVICESERVICE_WSDL_LOCATION = org.aceme.acme_project.services.magazzinoEsterno.generated.MagazzinoEsternoServiceService.class.getResource("/MagazzinoEsterno.wsdl");
        WebServiceException e = null;
        if (MAGAZZINOESTERNOSERVICESERVICE_WSDL_LOCATION == null) {
            e = new WebServiceException("Cannot find '/MagazzinoEsterno.wsdl' wsdl. Place the resource correctly in the classpath.");
        }
        MAGAZZINOESTERNOSERVICESERVICE_EXCEPTION = e;
    }

    public MagazzinoEsternoServiceService() {
        super(__getWsdlLocation(), MAGAZZINOESTERNOSERVICESERVICE_QNAME);
    }

    public MagazzinoEsternoServiceService(WebServiceFeature... features) {
        super(__getWsdlLocation(), MAGAZZINOESTERNOSERVICESERVICE_QNAME, features);
    }

    public MagazzinoEsternoServiceService(URL wsdlLocation) {
        super(wsdlLocation, MAGAZZINOESTERNOSERVICESERVICE_QNAME);
    }

    public MagazzinoEsternoServiceService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, MAGAZZINOESTERNOSERVICESERVICE_QNAME, features);
    }

    public MagazzinoEsternoServiceService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public MagazzinoEsternoServiceService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns MagazzinoEsternoService
     */
    @WebEndpoint(name = "magazzinoEsternoServiceServicePort")
    public MagazzinoEsternoService getMagazzinoEsternoServiceServicePort() {
        return super.getPort(new QName("acme.wsdl", "magazzinoEsternoServiceServicePort"), MagazzinoEsternoService.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns MagazzinoEsternoService
     */
    @WebEndpoint(name = "magazzinoEsternoServiceServicePort")
    public MagazzinoEsternoService getMagazzinoEsternoServiceServicePort(WebServiceFeature... features) {
        return super.getPort(new QName("acme.wsdl", "magazzinoEsternoServiceServicePort"), MagazzinoEsternoService.class, features);
    }

    private static URL __getWsdlLocation() {
        if (MAGAZZINOESTERNOSERVICESERVICE_EXCEPTION!= null) {
            throw MAGAZZINOESTERNOSERVICESERVICE_EXCEPTION;
        }
        return MAGAZZINOESTERNOSERVICESERVICE_WSDL_LOCATION;
    }

}
