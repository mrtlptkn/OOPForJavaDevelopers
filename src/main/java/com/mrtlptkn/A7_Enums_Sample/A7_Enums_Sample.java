package com.mrtlptkn.A7_Enums_Sample;

public class A7_Enums_Sample {

    public static void main(String[] args) {
        // Enum kullanımı
        Day today = Day.MONDAY;
        System.out.println("Today is: " + today);

        // Enum ile switch-case kullanımı
        switch (today) {
            case MONDAY:
                System.out.println("It's Monday, back to work!");
                break;
            case FRIDAY:
                System.out.println("It's Friday, almost weekend!");
                break;
            case SATURDAY:
            case SUNDAY:
                System.out.println("It's the weekend!");
                break;
            default:
                System.out.println("It's a regular day.");
        }

        OrderStatus orderStatus =  OrderStatus.valueOf(OrderStatus.Completed.toString());
        int code =  orderStatus.getCode();
        String text = OrderStatus.Completed.toString();
        System.out.println("Order Status: " + text + ", Code: " + code);




    }
}
