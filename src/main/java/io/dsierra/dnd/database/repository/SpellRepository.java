package io.dsierra.dnd.database.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;

import io.dsierra.dnd.database.model.Spell;

@RepositoryRestResource
public interface SpellRepository extends CrudRepository<Spell, Long> {

  @Override
  @RestResource(exported = false)
  Spell save(Spell s);

  @Override
  @RestResource(exported = false)
  void delete(Long id);

  @Override
  @RestResource(exported = false)
  void delete(Spell entity);
}
