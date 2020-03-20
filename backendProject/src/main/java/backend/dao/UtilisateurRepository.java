package backend.dao;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import backend.entities.Utilisateur;
@RepositoryRestResource
public interface UtilisateurRepository  extends MongoRepository<Utilisateur, String>{

}
