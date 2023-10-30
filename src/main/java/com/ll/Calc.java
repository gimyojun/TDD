package com.ll;


public class Calc {



    public static int run(String exp){
        if(exp.isEmpty())return 0;

        final String[] expBits = exp.split(" " );

        final String sign = expBits[1];
        final int num1 = Integer.parseInt(expBits[0]);
        final int num2 = Integer.parseInt(expBits[2]);
        int rs = switch (sign) {
            case "+" -> {
                yield num1 + num2;
            }
            case "-" -> {
                yield num1 - num2;
            }
            case "*" -> {
                yield num1 * num2;
            }
            case "/" -> {
                yield num1 / num2;
            }

            default -> throw new IllegalStateException("Unexpected value: " + sign);
        };
        return rs;
    }


}
