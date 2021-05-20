package com.basket;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Main {

    public static void main(String[] args) throws IOException {

        Boolean aBoolean = true;

        for(String str: args) {
            System.out.println(str);
        }
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        // Reading data using readLine
        String numeCheie = reader.readLine();

        Basket<Fruit> fruitBasket = new Basket<>();
        Apple apple = new Apple();
        Pear pear = new Pear();
        fruitBasket.addToBasked(pear);
        fruitBasket.addToBasked(apple);
        System.out.println(fruitBasket);

        Fruit fruit = fruitBasket.getElement(0);
        if (fruit instanceof Apple) {
            System.out.println("First element is an apple");
        } else if (fruit instanceof Pear) {
            System.out.println("First element is a pear");
        }


        Basket<Toy> toysBasket = new Basket<>();
        Car car = new Car();
        Doll doll = new Doll();
        toysBasket.addToBasked(car);
        toysBasket.addToBasked(doll);
        System.out.println(toysBasket);

        Basket objBasket = new Basket(); // similar cu Basket<Object> basket = new Basket();

        HashMap<String, Fruit> hashMap = new HashMap<>();
        hashMap.put(numeCheie, apple);
        hashMap.put("para", pear);
        Set<Map.Entry<String, Fruit>> entrySet = hashMap.entrySet();
        for (Map.Entry<String, Fruit> entry : entrySet) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

        System.err.println("Ceva eroare");




    }
}
