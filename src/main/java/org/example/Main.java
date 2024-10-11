package org.example;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Teapot[] array = new Teapot[]{
                new Teapot(1.09, "blue"),
                new Teapot(1.09, "blue"),
                new Teapot(1.1, "white"),
                new Teapot(2.5, "white"),
                new Teapot(3, "green"),
                new Teapot(5, "red"),
                new Teapot(1.3, "yellow"),
                new Teapot(1.7, "orange"),
                new Teapot(1.5, "orange")
        };
        System.out.println("Цвет " + countColors(array));
        System.out.println("Объём " + countVolumes(array));

    }

    private static Map<String,Integer> countColors(Teapot[] array) {
        Map<String, Integer> unique = new HashMap<>();
        for(Teapot t: array){
            int uniCount = 0;
            for (Teapot j: array){
                if(t.color.equals(j.color)) uniCount += 1;
            }
            unique.put(t.color, uniCount);
        }
        return unique;
    }
    private static Map<String,Integer> countVolumes(Teapot[] array) {
        Map<String, Integer> unique = new HashMap<>();
        for(Teapot t: array){
            int uniCount = 0;
            for (Teapot j: array){
                if(t.volume==j.volume) uniCount += 1;
            }
            unique.put(Double.toString(t.volume), uniCount);
        }
        return unique;
    }
}