package com.betrybe.agrix.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;
import java.util.Set;

/**
 * The type Fertilizer.
 */
@Entity
@Table(name = "fertilizers")
public class Fertilizer {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  private String name;
  private String brand;
  private String composition;

  @ManyToMany(mappedBy = "fertilizers")
  private Set<Crop> crops;

  /**
   * Instantiates a new Fertilizer.
   *
   * @param id          the id
   * @param name        the name
   * @param brand       the brand
   * @param composition the composition
   */
  public Fertilizer(Long id, String name, String brand, String composition) {
    this.id = id;
    this.name = name;
    this.brand = brand;
    this.composition = composition;
  }

  public Fertilizer() {

  }

  /**
   * Gets id.
   *
   * @return the id
   */
  public Long getId() {
    return id;
  }

  /**
   * Sets id.
   *
   * @param id the id
   */
  public void setId(Long id) {
    this.id = id;
  }

  /**
   * Gets name.
   *
   * @return the name
   */
  public String getName() {
    return name;
  }

  /**
   * Sets name.
   *
   * @param name the name
   */
  public void setName(String name) {
    this.name = name;
  }

  /**
   * Gets brand.
   *
   * @return the brand
   */
  public String getBrand() {
    return brand;
  }

  /**
   * Sets brand.
   *
   * @param brand the brand
   */
  public void setBrand(String brand) {
    this.brand = brand;
  }

  /**
   * Gets composition.
   *
   * @return the composition
   */
  public String getComposition() {
    return composition;
  }

  /**
   * Sets composition.
   *
   * @param composition the composition
   */
  public void setComposition(String composition) {
    this.composition = composition;
  }

  /**
   * Gets crops.
   *
   * @return the crops
   */
  public Set<Crop> getCrops() {
    return crops;
  }

  /**
   * Sets crops.
   *
   * @param crops the crops
   */
  public void setCrops(Set<Crop> crops) {
    this.crops = crops;
  }
}
