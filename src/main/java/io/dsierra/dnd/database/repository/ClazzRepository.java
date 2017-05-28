package io.dsierra.dnd.database.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;

import io.dsierra.dnd.database.model.Clazz;

@RepositoryRestResource(path = "classes", collectionResourceRel = "classes")
public interface ClazzRepository extends CrudRepository<Clazz, Long> {

  @Override
  @RestResource(exported = false)
  Clazz save(Clazz s);

  @Override
  @RestResource(exported = false)
  void delete(Long id);

  @Override
  @RestResource(exported = false)
  void delete(Clazz entity);
}
