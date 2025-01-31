package com.example.rest.global.exception;

import com.example.rest.global.app.AppConfig;
import com.example.rest.global.dto.RsData;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.NoSuchElementException;
import java.util.stream.Collectors;

@RestControllerAdvice
@RequiredArgsConstructor
public class GlobalExceptionHandler {

    @ExceptionHandler(NoSuchElementException.class)
    public ResponseEntity<RsData<Void>> handleNoSuchElementException(NoSuchElementException e) {

        if (AppConfig.isNotProd()) e.printStackTrace();

        return ResponseEntity
                .status(HttpStatus.NOT_FOUND)
                .body(new RsData<>(
                        "404-1",
                        "해당 데이터가 존재하지 않습니다."
                ));

    }

    @ExceptionHandler(MethodArgumentNotValidException.class)
    public ResponseEntity<RsData<Void>> handleMethodArgumentNotValidException(MethodArgumentNotValidException e) {

        String msg = e.getBindingResult().getFieldErrors()
                .stream()
                .map(f -> f.getField() + " : " + f.getCode() + " : " + f.getDefaultMessage())
                .sorted()
                .collect(Collectors.joining("\n"));

        return ResponseEntity
                .status(HttpStatus.BAD_REQUEST)
                .body(new RsData<>(
                        "400-1",
                        msg
                ));
    }

    @ExceptionHandler(ServiceException.class)
    public ResponseEntity<RsData<Void>> handleServiceException (ServiceException e) {

        if (AppConfig.isNotProd()) e.printStackTrace();

        return ResponseEntity
                .status(e.getStatusCode())
                .body(new RsData<>(
                        e.getCode(),
                        e.getMessage()
                ));

    }
}
