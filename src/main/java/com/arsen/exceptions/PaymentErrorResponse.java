package com.arsen.exceptions;

import lombok.Data;
import org.springframework.stereotype.Component;

@Component
@Data
public class PaymentErrorResponse {
    private String message;
    private String dateTime;
}
