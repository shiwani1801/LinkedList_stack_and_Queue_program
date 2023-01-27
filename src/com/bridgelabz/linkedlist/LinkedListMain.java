package com.bridgelabz.linkedlist;

public class LinkedListMain {
    public static void main(String[] args) {

        createSimpleLinkedList();

    }
    public static void createSimpleLinkedList() {
        System.out.println("\n\n===================UC1=====================\n");

        Linkedlist<Integer> linkedlist1 = new Linkedlist<>();
        linkedlist1.push(70);
        System.out.println("after push 70");
        linkedlist1.Display();
        linkedlist1.push(30);
        System.out.println("after push 30");
        linkedlist1.Display();
        linkedlist1.push(56);
        System.out.println("after push 56");
        linkedlist1.Display();
        System.out.println("the simple linkedList created = ");
        linkedlist1.Display();
        System.out.println("***************************************************************");
    }



}