package com.betrybe.agrix.service.exception;

/**
 * The type Crop bad request exception.
 */
public class CropBadRequestException extends RuntimeException {
  @Override
  public String getMessage() {
    return "Os campos estão errados";
  }
}