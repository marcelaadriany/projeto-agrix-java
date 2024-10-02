package com.betrybe.agrix.service.exception;

/**
 * The type Fertilizer bad request exception.
 */
public class FertilizerBadRequestException extends RuntimeException {

  /**
   * Instantiates a new Fertilizer bad request exception.
   *
   * @param message the message
   */
  public FertilizerBadRequestException(String message) {
    super(message);
  }
}
