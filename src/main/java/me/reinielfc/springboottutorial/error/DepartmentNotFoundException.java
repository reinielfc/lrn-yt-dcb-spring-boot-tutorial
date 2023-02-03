package me.reinielfc.springboottutorial.error;

public class DepartmentNotFoundException extends Exception {

    public DepartmentNotFoundException(String message) {
        super(message);
    }

}
