package io.dsierra.dnd.database.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;

import io.dsierra.dnd.database.model.Level;

@RepositoryRestResource
public interface LevelRepository extends CrudRepository<Level, Long> {

  @Override
  @RestResource(exported = false)
  Level save(Level s);

  @Override
  @RestResource(exported = false)
  void delete(Long id);

  @Override
  @RestResource(exported = false)
  void delete(Level entity);
}
