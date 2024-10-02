package com.betrybe.agrix.controller.dto;

import com.betrybe.agrix.entity.Fertilizer;

/**
 * The type Fertilizer creation dto.
 */
public record FertilizerCreationDto(String name, String brand, String composition) {

  /**
   * To entity fertilizer.
   *
   * @param fertilizerCreationDto the fertilizer creation dto
   * @return the fertilizer
   */
  public static Fertilizer toEntity(FertilizerCreationDto fertilizerCreationDto) {
    Fertilizer fertilizer = new Fertilizer();
    fertilizer.setName(fertilizerCreationDto.name());
    fertilizer.setBrand(fertilizerCreationDto.brand());
    fertilizer.setComposition(fertilizerCreationDto.composition());
    return fertilizer;
  }

}
