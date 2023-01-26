package com.company;

public class Main {

    public static void main(String[] args) {
        SinglyLinkedList list = new SinglyLinkedList();
        list.add(7);
        list.add(9);
        list.add(567);
        list.add(45);
        list.add(103);
        list.add(21);
        list.printSinglyLinkedList(list);
        list.reverse();
        list.printSinglyLinkedList(list);
    }
}
