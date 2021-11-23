
package com.pagina.crud.desarrollo.models;

import webservices.Persona;


public class PersonaService {

    public PersonaService() {
    }

    public static java.util.List<webservices.Persona> mostrarPersonas() {
        webservices.Servicios_Service service = new webservices.Servicios_Service();
        webservices.Servicios port = service.getServiciosPort();
        return port.mostrarPersonas();
    }

    public static String insertarPersona(java.lang.String dni, java.lang.String nombre) {
        webservices.Servicios_Service service = new webservices.Servicios_Service();
        webservices.Servicios port = service.getServiciosPort();
        return port.insertarPersona(dni, nombre);
    }

    public static Persona mostrarPersona(int id) {
        webservices.Servicios_Service service = new webservices.Servicios_Service();
        webservices.Servicios port = service.getServiciosPort();
        return port.mostrarPersona(id);
    }

    public static String actualizarPersona(int id, java.lang.String dni, java.lang.String nombre) {
        webservices.Servicios_Service service = new webservices.Servicios_Service();
        webservices.Servicios port = service.getServiciosPort();
        return port.actualizarPersona(id, dni, nombre);
    }

  

    public static Persona eliminarPersona(int id) {
        webservices.Servicios_Service service = new webservices.Servicios_Service();
        webservices.Servicios port = service.getServiciosPort();
        return port.eliminarPersona(id);
    }
    
    
}
