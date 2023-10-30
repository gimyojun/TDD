package com.ll;


public class Main {
    public static void main(String[] args) {

        String input = "3+5+7-2";
        String[] parts = input.split("-");

        for (String part : parts) {
            System.out.println(part);
        }

    }
}