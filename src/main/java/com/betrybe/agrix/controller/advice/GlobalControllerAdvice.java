package com.betrybe.agrix.controller.advice;

import com.betrybe.agrix.service.exception.CropBadRequestException;
import com.betrybe.agrix.service.exception.CropNotFoundException;
import com.betrybe.agrix.service.exception.FarmNotFoundException;
import com.betrybe.agrix.service.exception.FertilizerNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 * The type Global controller advice.
 */
@RestControllerAdvice
public class GlobalControllerAdvice {

  /**
   * Handle not found response entity.
   *
   * @param exception the exception
   * @return the response entity
   */
  @ExceptionHandler({FarmNotFoundException.class})
  public ResponseEntity<String> handleNotFound(RuntimeException exception) {
    return ResponseEntity.status(HttpStatus.NOT_FOUND)
        .body(exception.getMessage());
  }

  @ExceptionHandler({CropNotFoundException.class})
  public ResponseEntity<String> handleCropNotFound(RuntimeException exception) {
    return ResponseEntity.status(HttpStatus.NOT_FOUND)
        .body(exception.getMessage());
  }

  @ExceptionHandler({CropBadRequestException.class})
  public ResponseEntity<String> handleCropBadRequest(CropBadRequestException exception) {
    return ResponseEntity.status((HttpStatus.BAD_REQUEST)).body(exception.getMessage());
  }

  @ExceptionHandler({FertilizerNotFoundException.class})
  public ResponseEntity<String> handleFertilizerNotFound(RuntimeException exception) {
    return ResponseEntity.status(HttpStatus.NOT_FOUND)
        .body(exception.getMessage());
  }
}
