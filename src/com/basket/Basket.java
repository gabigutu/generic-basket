package com.basket;

import java.util.ArrayList;
import java.util.List;

public class Basket<T> {

    private List<T> elements;

    public Basket() {
        elements = new ArrayList<>();
    }

    public void addToBasked(T element) {
        this.elements.add(element);
    }

    public T getElement(int index) {
        return elements.get(index);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (T element : elements) {
            sb.append(element + ", ");
        }
        String str = sb.toString().trim();
        return str.substring(0, str.length() - 1);
    }

}

class Fruit {
}

class Apple extends Fruit {
    @Override
    public String toString() {
        return "This is an apple";
    }
}

class Pear extends Fruit {
}
