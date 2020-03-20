package backend.dao;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import backend.entities.Produit;
@RepositoryRestResource
public interface ProduitRepository extends MongoRepository<Produit, String> {

}
