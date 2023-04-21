package ru.job4j.queue;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

/**
 * Implementation of the Queue Interface
 */
public class Queuenew {
    public static void main(String[] args) {
        /*
        1. Implementing the LinkedList Class
         */
        Queue<Integer> num = new LinkedList<>();
        num.offer(1);
        num.offer(2);
        num.offer(3);
        num.offer(1);
        System.out.println(num);
        int accessedElement = num.peek();
        System.out.println(accessedElement);
        int removeElements = num.poll();
        System.out.println(removeElements);
        System.out.println(num);
        System.out.println("------------------");
        Queue<Integer> numbers = new PriorityQueue<>();

        numbers.offer(5);
        numbers.offer(3);
        numbers.offer(2);
        System.out.println(numbers);

        int accessedNumbers = numbers.peek();
        System.out.println(accessedNumbers);

        int removeNumber = numbers.poll();
        System.out.println(removeNumber);
        System.out.println(numbers);
    }

}
