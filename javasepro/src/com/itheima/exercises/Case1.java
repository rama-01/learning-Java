package com.itheima.exercises;

public class Case1 {
    public static void main(String[] args) {
        System.out.println(getDiscountedPrice(100, 5, "头等舱"));
        System.out.println(getDiscountedPrice(100, 4, "经济舱"));
    }

    public static double getDiscountedPrice(double price, int month, String type) {
        if (month >= 5 && month <= 10) {
            switch (type) {
                case "头等舱":
                    price *= .9;
                    break;
                case "经济舱":
                    price *= .85;
                    break;
            }
        } else {
            switch (type) {
                case "头等舱":
                    price *= .9;
                    break;
                case "经济舱":
                    price *= .85;
                    break;
            }
        }
        return price;
    }
}