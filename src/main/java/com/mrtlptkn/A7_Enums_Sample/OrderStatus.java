package com.mrtlptkn.A7_Enums_Sample;

public enum OrderStatus {

    Completed(200),
    Pending(100);

    private final int code;

    public int getCode() {
        return code;
    }

    OrderStatus(int code) {
        this.code = code;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
