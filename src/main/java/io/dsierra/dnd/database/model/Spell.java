package io.dsierra.dnd.database.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "spells_spring")
public class Spell {

  private long id;
  private String name;
  private String type;
  private String castingTime;
  private String range;
  private String components;
  private String duration;
  private String primaryDescription;
  private int level;

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

  public String getType() {

    return type;
  }

  public void setType(String type) {

    this.type = type;
  }

  public String getCastingTime() {

    return castingTime;
  }

  public void setCastingTime(String castingTime) {

    this.castingTime = castingTime;
  }

  public String getRange() {

    return range;
  }

  public void setRange(String range) {

    this.range = range;
  }

  public String getComponents() {

    return components;
  }

  public void setComponents(String components) {

    this.components = components;
  }

  public String getDuration() {

    return duration;
  }

  public void setDuration(String duration) {

    this.duration = duration;
  }

  public String getPrimaryDescription() {

    return primaryDescription;
  }

  public void setPrimaryDescription(String primaryDescription) {

    this.primaryDescription = primaryDescription;
  }

  public int getLevel() {

    return level;
  }

  public void setLevel(int level) {

    this.level = level;
  }
}
