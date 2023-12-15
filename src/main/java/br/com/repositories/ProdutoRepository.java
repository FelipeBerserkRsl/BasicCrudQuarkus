package br.com.repositories;

import br.com.domain.Produto;
import io.quarkus.mongodb.panache.PanacheMongoRepository;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class ProdutoRepository implements PanacheMongoRepository<Produto> {
}
