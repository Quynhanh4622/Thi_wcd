package com.example.T2009M1_ThiWCD.entity;

public enum PhoneStatus {
    ACTIVE(1),
    DEACTIVE(0),
    DELETED(-1),
    UNDEFINED(2);
    private int value;

    PhoneStatus(int value) {
        this.value = value;
    }

    public int getValue() {
        return this.value;
    }

    public static PhoneStatus of(int value) {
        for (PhoneStatus productStatus : PhoneStatus.values()) {
            if(productStatus.getValue() == value) {
                return productStatus;
            }
        }
        return PhoneStatus.UNDEFINED;
    }
}
