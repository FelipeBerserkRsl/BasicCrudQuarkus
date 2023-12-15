package br.com.services;

import java.util.List;

import org.bson.types.ObjectId;

import br.com.domain.Produto;
import br.com.repositories.ProdutoRepository;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;

@ApplicationScoped
public class ProdutoService {

    @Inject
    ProdutoRepository ProdutoRepository;

    public List<Produto> listarProdutos() {
        return ProdutoRepository.listAll();
    }

    public Produto getProduto(ObjectId id) {
        return ProdutoRepository.findById(id);
    }

    public Produto criarProduto(Produto Produto) {
        ProdutoRepository.persist(Produto);
        return Produto;
    }

    public Produto atualizarProduto(ObjectId id, Produto Produto) {
        Produto entity = ProdutoRepository.findById(id);
        if (entity != null) {
            entity.setNome(Produto.getNome());
            entity.setPreço(Produto.getPreço());
            entity.setQuantidade(Produto.getQuantidade());
        }
        return entity;
    }

    public void deletarProduto(ObjectId id) {

        Produto entity = ProdutoRepository.findById(id);
        if (entity != null) {
            ProdutoRepository.delete(entity);
        }
    }
}

