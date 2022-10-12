package org.acme;

public enum Status {
    SO_CREATED(1), 
    DEL_CREATED(2), 
    SHIPPED(3), 
    DELIVERED(4), 
    INVOICED(5);

    private int value;

    Status(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}
