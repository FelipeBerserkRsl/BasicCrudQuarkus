package br.com.resources;

import java.util.List;

import org.bson.types.ObjectId;

import br.com.domain.Produto;
import br.com.services.ProdutoService;
import jakarta.inject.Inject;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;

@Path("/Produtos")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class ProdutoResource {

    @Inject
    ProdutoService ProdutoService;

    @GET
    public List<Produto> listarProdutos() {
        return ProdutoService.listarProdutos();
    }

    @GET
    @Path("/{id}")
    public Produto getProduto(@PathParam("id") ObjectId id) {
        return ProdutoService.getProduto(id);
    }

    @POST
    public Produto criarProduto(Produto Produto) {
        return ProdutoService.criarProduto(Produto);
    }

    @PUT
    @Path("/{id}")
    public Produto atualizarProduto(@PathParam("id") ObjectId id, Produto Produto) {
        return ProdutoService.atualizarProduto(id, Produto);
    }

    @DELETE
    @Path("/{id}")
    public void deletarProduto(@PathParam("id") ObjectId id) {
        ProdutoService.deletarProduto(id);
    }
}

