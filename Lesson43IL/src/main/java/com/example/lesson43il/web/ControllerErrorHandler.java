package com.example.lesson43il.web;

import com.example.lesson43il.dto.IlError;
import com.example.lesson43il.exc.CarFailedException;
import com.example.lesson43il.mapper.ErrorMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RequiredArgsConstructor

@RestControllerAdvice
public class ControllerErrorHandler {

    private final ErrorMapper mapper;

    @ExceptionHandler(CarFailedException.class)
    public ResponseEntity<IlError> handler (CarFailedException exc){

        return ResponseEntity.status(exc.getCode())
                .body(mapper.toil(exc));
    }
}
