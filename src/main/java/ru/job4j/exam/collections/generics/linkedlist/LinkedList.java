package ru.job4j.exam.collections.generics.linkedlist;

public class LinkedList {
    Node head;

    class Node {
        int data;
        Node next;

        Node(int d) {
            data = d;
            next = null;
        }
    }

    public void deleteNode(Node head, int position) {

        Node temp = head; // Create a temporary node pointing to the head of the linked list
        Node prev = head; // Create a previous node pointing to the head of the linked list

        for (int i = 0; i < position; i++) { // Loop through the linked list to find the node at the given position
            if (i == 0 && position == 1) { // If the node to delete is the head
                head = head.next; // Set the next node as the new head
            } else {
                if (i == position - 1 && temp != null) { // If the node to delete is found
                    prev.next = temp.next; // Set the next node of the previous node to be the next node of the current node
                } else {
                    prev = temp; // Move the previous node to the current node

                    // If the previous node is null, the position was greater than the number of nodes in the list
                    if (prev == null) {
                        break;
                    }
                    temp = temp.next; // Move the temporary node to the next node
                }
            }
        }
        return;
    }

    public void append(int newData) {
        Node newNode = new Node(newData);
        if (head == null) {
            head = new Node(newData);
            return;
        }
        newNode.next = null;
        Node last = head;
        while (last.next != null) {
            last = last.next;
        }
        last.next = newNode;
        return;
    }

    public void insertAfter(Node prevNode, int newData) {
        if (head == null) {
            System.out.println("List is empty. No elements to delete.");
            return;
        }

        Node temp = head;
        head = head.next;
        temp.next = null;

        System.out.println("Deleted element: " + temp.data);
    }

    public void push(int newData) {
        Node newNode = new Node(newData);
        newNode.next = head;
        head = newNode;
    }

    public void printList() {
        Node tnode = head;
        while (tnode != null) {
            System.out.println(tnode.data + " ");
            tnode = tnode.next;
        }
    }

    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.push(1);
        list.push(2);
        list.push(3);
        list.push(4);
        list.deleteNode(list.head, 1);
        System.out.println("\nCreated Linked list is: ");
        list.printList();
    }
}
