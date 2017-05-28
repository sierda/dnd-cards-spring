package io.dsierra.dnd.database.model;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity(name = "class")
@Table(name = "classes_spring")
public class Clazz {

  private long id;
  private String name;
  private Set<Level> levels;

  @Id
  public long getId() {

    return id;
  }

  public void setId(long id) {

    this.id = id;
  }

  public String getName() {

    return name;
  }

  public void setName(String name) {

    this.name = name;
  }

  @OneToMany(mappedBy = "clazz")
  public Set<Level> getLevels() {

    return levels;
  }

  public void setLevels(Set<Level> levels) {

    this.levels = levels;
  }
}
