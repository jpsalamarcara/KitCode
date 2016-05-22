/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package WEB;

import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.Consumes;
import javax.ws.rs.Produces;
import javax.ws.rs.Path;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import semantic.ExecuteLITEProgram;

/**
 * REST Web Service
 *
 * @author asanzher
 */
@Path("")
public class GenericResource {

    @Context
    private UriInfo context;

    /**
     * Creates a new instance of GenericResource
     */
    public GenericResource() {
    }

    @Path("/Compilar")
    @POST
    @Consumes(MediaType.TEXT_PLAIN)
    @Produces(MediaType.TEXT_PLAIN)
    public Response compilar(String content) {
        System.out.println("Request: " + content);
        String resultado = ExecuteLITEProgram.execute(content);
        System.out.println("Response: " + resultado);
        return Response.status(200).header("Access-Control-Allow-Origin", "*").entity(resultado).build();
    }
}
