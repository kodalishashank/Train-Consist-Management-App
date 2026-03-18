package org.example;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== Train Consist Management App ===");

        List<String> trainConsist = new ArrayList<>();

        System.out.println("Train initialized successfully...");
        System.out.println("Initial Bogie Count: " + trainConsist.size());
        System.out.println("Current Train Consist: " + trainConsist);
        System.out.println("System ready for operations...");
    }
}