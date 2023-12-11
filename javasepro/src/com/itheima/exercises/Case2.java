package com.itheima.exercises;

import java.util.Random;

public class Case2 {
    public static void main(String[] args) {
        System.out.println(generateRandomCode(10));
    }

    public static String generateRandomCode(int n) {
        String code = "";
        Random r = new Random();
        for (int i = 0; i < n; i++) {
            int type = r.nextInt(3);  // 0-2
            switch (type) {
                case 0:
                    code += r.nextInt(10);
                    break;
                    // A 65 - Z 65+25
                case 1:
                    code += (char) (r.nextInt(26) + 65);
                    break;
                case 2:
                    // a 97 - z 97+25
                    code += (char) (r.nextInt(26) + 97);
                    break;
            }
        }
        return code;
    }
}