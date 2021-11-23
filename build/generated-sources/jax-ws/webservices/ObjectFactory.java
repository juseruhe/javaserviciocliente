
package webservices;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the webservices package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _ActualizarPersona_QNAME = new QName("http://WebServices/", "actualizarPersona");
    private final static QName _ActualizarPersonaResponse_QNAME = new QName("http://WebServices/", "actualizarPersonaResponse");
    private final static QName _EliminarPersona_QNAME = new QName("http://WebServices/", "eliminarPersona");
    private final static QName _EliminarPersonaResponse_QNAME = new QName("http://WebServices/", "eliminarPersonaResponse");
    private final static QName _InsertarPersona_QNAME = new QName("http://WebServices/", "insertarPersona");
    private final static QName _InsertarPersonaResponse_QNAME = new QName("http://WebServices/", "insertarPersonaResponse");
    private final static QName _MostrarPersona_QNAME = new QName("http://WebServices/", "mostrarPersona");
    private final static QName _MostrarPersonaResponse_QNAME = new QName("http://WebServices/", "mostrarPersonaResponse");
    private final static QName _MostrarPersonas_QNAME = new QName("http://WebServices/", "mostrarPersonas");
    private final static QName _MostrarPersonasResponse_QNAME = new QName("http://WebServices/", "mostrarPersonasResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: webservices
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ActualizarPersona }
     * 
     */
    public ActualizarPersona createActualizarPersona() {
        return new ActualizarPersona();
    }

    /**
     * Create an instance of {@link ActualizarPersonaResponse }
     * 
     */
    public ActualizarPersonaResponse createActualizarPersonaResponse() {
        return new ActualizarPersonaResponse();
    }

    /**
     * Create an instance of {@link EliminarPersona }
     * 
     */
    public EliminarPersona createEliminarPersona() {
        return new EliminarPersona();
    }

    /**
     * Create an instance of {@link EliminarPersonaResponse }
     * 
     */
    public EliminarPersonaResponse createEliminarPersonaResponse() {
        return new EliminarPersonaResponse();
    }

    /**
     * Create an instance of {@link InsertarPersona }
     * 
     */
    public InsertarPersona createInsertarPersona() {
        return new InsertarPersona();
    }

    /**
     * Create an instance of {@link InsertarPersonaResponse }
     * 
     */
    public InsertarPersonaResponse createInsertarPersonaResponse() {
        return new InsertarPersonaResponse();
    }

    /**
     * Create an instance of {@link MostrarPersona }
     * 
     */
    public MostrarPersona createMostrarPersona() {
        return new MostrarPersona();
    }

    /**
     * Create an instance of {@link MostrarPersonaResponse }
     * 
     */
    public MostrarPersonaResponse createMostrarPersonaResponse() {
        return new MostrarPersonaResponse();
    }

    /**
     * Create an instance of {@link MostrarPersonas }
     * 
     */
    public MostrarPersonas createMostrarPersonas() {
        return new MostrarPersonas();
    }

    /**
     * Create an instance of {@link MostrarPersonasResponse }
     * 
     */
    public MostrarPersonasResponse createMostrarPersonasResponse() {
        return new MostrarPersonasResponse();
    }

    /**
     * Create an instance of {@link Persona }
     * 
     */
    public Persona createPersona() {
        return new Persona();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ActualizarPersona }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://WebServices/", name = "actualizarPersona")
    public JAXBElement<ActualizarPersona> createActualizarPersona(ActualizarPersona value) {
        return new JAXBElement<ActualizarPersona>(_ActualizarPersona_QNAME, ActualizarPersona.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ActualizarPersonaResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://WebServices/", name = "actualizarPersonaResponse")
    public JAXBElement<ActualizarPersonaResponse> createActualizarPersonaResponse(ActualizarPersonaResponse value) {
        return new JAXBElement<ActualizarPersonaResponse>(_ActualizarPersonaResponse_QNAME, ActualizarPersonaResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EliminarPersona }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://WebServices/", name = "eliminarPersona")
    public JAXBElement<EliminarPersona> createEliminarPersona(EliminarPersona value) {
        return new JAXBElement<EliminarPersona>(_EliminarPersona_QNAME, EliminarPersona.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EliminarPersonaResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://WebServices/", name = "eliminarPersonaResponse")
    public JAXBElement<EliminarPersonaResponse> createEliminarPersonaResponse(EliminarPersonaResponse value) {
        return new JAXBElement<EliminarPersonaResponse>(_EliminarPersonaResponse_QNAME, EliminarPersonaResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InsertarPersona }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://WebServices/", name = "insertarPersona")
    public JAXBElement<InsertarPersona> createInsertarPersona(InsertarPersona value) {
        return new JAXBElement<InsertarPersona>(_InsertarPersona_QNAME, InsertarPersona.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InsertarPersonaResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://WebServices/", name = "insertarPersonaResponse")
    public JAXBElement<InsertarPersonaResponse> createInsertarPersonaResponse(InsertarPersonaResponse value) {
        return new JAXBElement<InsertarPersonaResponse>(_InsertarPersonaResponse_QNAME, InsertarPersonaResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MostrarPersona }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://WebServices/", name = "mostrarPersona")
    public JAXBElement<MostrarPersona> createMostrarPersona(MostrarPersona value) {
        return new JAXBElement<MostrarPersona>(_MostrarPersona_QNAME, MostrarPersona.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MostrarPersonaResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://WebServices/", name = "mostrarPersonaResponse")
    public JAXBElement<MostrarPersonaResponse> createMostrarPersonaResponse(MostrarPersonaResponse value) {
        return new JAXBElement<MostrarPersonaResponse>(_MostrarPersonaResponse_QNAME, MostrarPersonaResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MostrarPersonas }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://WebServices/", name = "mostrarPersonas")
    public JAXBElement<MostrarPersonas> createMostrarPersonas(MostrarPersonas value) {
        return new JAXBElement<MostrarPersonas>(_MostrarPersonas_QNAME, MostrarPersonas.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MostrarPersonasResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://WebServices/", name = "mostrarPersonasResponse")
    public JAXBElement<MostrarPersonasResponse> createMostrarPersonasResponse(MostrarPersonasResponse value) {
        return new JAXBElement<MostrarPersonasResponse>(_MostrarPersonasResponse_QNAME, MostrarPersonasResponse.class, null, value);
    }

}
