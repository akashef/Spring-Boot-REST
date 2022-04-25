package com.evision.Payroll;

public class OrderNotFoundException extends RuntimeException {

    OrderNotFoundException(Long id) {
        super("Could not find employee " + id);
    }
}
