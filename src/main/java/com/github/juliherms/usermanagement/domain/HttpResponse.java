package com.github.juliherms.usermanagement.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.http.HttpStatus;

/**
 * This class responsible to represent http return from endpoint
 */
@AllArgsConstructor
@NoArgsConstructor
@Data
public class HttpResponse {
    private int httpStatusCode; // 200, 201, 400, 500
    private HttpStatus httpStatus;
    private String reason;
    private String message;

}
