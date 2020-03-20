package backend.dao;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import backend.entities.Admin;

@RepositoryRestResource
public interface AdminRepository extends MongoRepository<Admin, String> {

}
