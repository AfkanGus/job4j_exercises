package ru.job4j.stream;

import java.util.stream.Stream;

public class DoubleLoop {
    public static void main(String[] args) {
        Stream.of(Suit.values())
                .flatMap(suit -> Stream.of(Value.values())
                        .map(value -> new Card(suit, value)))
                .forEach(card -> System.out.println(card.getSuit() + " " + card.getValue()));
    }
}
