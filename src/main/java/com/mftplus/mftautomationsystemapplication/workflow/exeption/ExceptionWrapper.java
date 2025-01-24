package com.mftplus.mftautomationsystemapplication.workflow.exeption;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.time.LocalDateTime;

@RestControllerAdvice
public class ExceptionWrapper
{
    @ExceptionHandler(ServiceException.class)
    @ResponseStatus(value = HttpStatus.BAD_REQUEST)
    public ResponseEntity<ExceptionMessage> exceptionHandling(ServiceException serviceException)
    {
        ExceptionMessage exceptionMessage = new ExceptionMessage();

        exceptionMessage.setMessage("Id not found...!");
        exceptionMessage.setError(true);
        exceptionMessage.setTimestamp(LocalDateTime.now());

        return ResponseEntity.badRequest().body(exceptionMessage);
    }
}