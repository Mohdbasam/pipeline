package com.example;

public class App {

    public static void main(String[] args) {
        System.out.println("=================================");
        System.out.println(" Maven Application Started");
        System.out.println(" Java Version: " + System.getProperty("java.version"));
        System.out.println("=================================");

        while (true) {
            try {
                System.out.println("Application is running...");
                Thread.sleep(10000);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                System.out.println("Application stopped.");
                break;
            }
        }
    }
}
