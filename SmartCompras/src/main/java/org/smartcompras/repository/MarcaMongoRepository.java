package org.smartcompras.repository;

import org.smartcompras.model.Marca;
import org.springframework.data.repository.CrudRepository;


public interface MarcaMongoRepository extends CrudRepository<Marca, String>{

}
