package br.com.repositories;

import br.com.domain.Bilhete;
import io.quarkus.mongodb.panache.PanacheMongoRepository;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class BilheteRepository implements PanacheMongoRepository<Bilhete> {
}
