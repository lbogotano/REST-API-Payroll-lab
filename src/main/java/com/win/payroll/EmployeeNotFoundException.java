package com.win.payroll;

public class EmployeeNotFoundException extends RuntimeException {


    /**
     *
     */
    private static final long serialVersionUID = -7815629844860435713L;

    EmployeeNotFoundException(Long id) {
        super("Could not find employee " + id);
    }
}