package br.com.resources;

import java.util.List;

import org.bson.types.ObjectId;

import br.com.domain.Bilhete;
import br.com.services.BilheteService;
import jakarta.inject.Inject;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;

@Path("/bilhetes")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class BilheteResource {

    @Inject
    BilheteService bilheteService;

    @GET
    public List<Bilhete> listarBilhetes() {
        return bilheteService.listarBilhetes();
    }

    @GET
    @Path("/{id}")
    public Bilhete getBilhete(@PathParam("id") ObjectId id) {
        return bilheteService.getBilhete(id);
    }

    @POST
    public Bilhete criarBilhete(Bilhete bilhete) {
        return bilheteService.criarBilhete(bilhete);
    }

    @PUT
    @Path("/{id}")
    public Bilhete atualizarBilhete(@PathParam("id") ObjectId id, Bilhete bilhete) {
        return bilheteService.atualizarBilhete(id, bilhete);
    }

    @DELETE
    @Path("/{id}")
    public void deletarBilhete(@PathParam("id") ObjectId id) {
        bilheteService.deletarBilhete(id);
    }
}

