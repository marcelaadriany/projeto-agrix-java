package com.betrybe.agrix.controller.dto;

import com.betrybe.agrix.entity.Person;

/**
 * The type Person response.
 */
public record PersonDto(Long id, String username, String role) {
  public static PersonDto fromEntity(Person person) {
    return new PersonDto(person.getId(), person.getUsername(),
        person.getRole().toString());
  }
}