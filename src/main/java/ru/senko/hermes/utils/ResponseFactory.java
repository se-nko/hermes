package ru.senko.hermes.utils;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class ResponseFactory {

    public static ResponseEntity<?> errorWithStatus(HttpStatus status) {
        return ResponseEntity.status(status).build();
    }

}
