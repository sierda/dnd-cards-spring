package io.dsierra.dnd.database.model;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonProperty;

@Entity
@Table(name = "class_spells_spring")
public class Level {

  private long id;
  private long clazz;
  private int level;
  private Set<Spell> spells;

  @Id
  @SequenceGenerator(name = "class_spells_spring_seq", sequenceName = "class_spells_spring_seq")
  @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "class_spells_spring_seq")
  public long getId() {

    return id;
  }

  public void setId(long id) {

    this.id = id;
  }

  @JsonProperty("class")
  @Column(name = "class")
  public long getClazz() {

    return clazz;
  }

  public void setClazz(long clazz) {

    this.clazz = clazz;
  }

  public int getLevel() {

    return level;
  }

  public void setLevel(int level) {

    this.level = level;
  }

  @OneToMany
  public Set<Spell> getSpells() {

    return spells;
  }

  public void setSpells(Set<Spell> spells) {

    this.spells = spells;
  }
}
