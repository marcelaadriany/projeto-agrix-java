package com.betrybe.agrix.controller.dto;

import com.betrybe.agrix.entity.Person;
import com.betrybe.agrix.security.Role;

/**
 * The type Person dto created.
 */
public record PersonCreationDto(String username, String password, String role) {

  /**
   * To entity person.
   *
   * @param personDto the person dto
   * @return the person
   */
  public static Person toEntity(PersonCreationDto personDto) {

    Person newPerson = new Person();
    newPerson.setUsername(personDto.username());
    newPerson.setPassword(personDto.password());
    newPerson.setRole(Role.valueOf(personDto.role()));

    return newPerson;
  }
}