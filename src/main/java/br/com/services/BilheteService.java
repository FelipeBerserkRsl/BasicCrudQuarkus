package br.com.services;

import java.util.List;

import org.bson.types.ObjectId;

import br.com.domain.Bilhete;
import br.com.repositories.BilheteRepository;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;

@ApplicationScoped
public class BilheteService {

    @Inject
    BilheteRepository bilheteRepository;

    public List<Bilhete> listarBilhetes() {
        return bilheteRepository.listAll();
    }

    public Bilhete getBilhete(ObjectId id) {
        return bilheteRepository.findById(id);
    }

    public Bilhete criarBilhete(Bilhete bilhete) {
        bilheteRepository.persist(bilhete);
        return bilhete;
    }

    public Bilhete atualizarBilhete(ObjectId id, Bilhete bilhete) {
        Bilhete entity = bilheteRepository.findById(id);
        if (entity != null) {
            entity.setWinProbability(bilhete.getWinProbability());
            entity.setOdd(bilhete.getOdd());
            entity.setBuyin(bilhete.getBuyin());
            entity.setLucroReal(bilhete.getLucroReal());
            entity.setTime1(bilhete.getTime1());
            entity.setTime2(bilhete.getTime2());
            entity.setQuantidade(bilhete.getQuantidade());
            entity.setEv(bilhete.getEv());
            entity.setEp(bilhete.getEp());
        }
        return entity;
    }

    public void deletarBilhete(ObjectId id) {

        Bilhete entity = bilheteRepository.findById(id);
        if (entity != null) {
            bilheteRepository.delete(entity);
        }
    }
}

