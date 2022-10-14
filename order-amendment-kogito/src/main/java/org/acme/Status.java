package org.acme;

public enum Status {
    ORDER_PLACED(1), 
    SHIPPED(2), 
    OUT_FOR_DELIVERY(3), 
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
