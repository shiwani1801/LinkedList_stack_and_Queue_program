package com.bridgelabz.linkedlist;

public class LinkedListMain {
    public static void main(String[] args) {

        createSimpleLinkedList();
        addingElements();
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
    public static void addingElements() {
        System.out.println("\n==============================UC2============================");

        Linkedlist<Integer> linkedlist2 = new Linkedlist<>();
        linkedlist2.add(70);
        System.out.println("after adding 70");
        linkedlist2.Display();
        linkedlist2.add(30);
        System.out.println("after adding 30");
        linkedlist2.Display();
        linkedlist2.add(56);
        System.out.println("after adding 56");
        linkedlist2.Display();

        System.out.println("\nwhile adding, the new elements will get added in front " +
                "\nso required output ===> 56,30,70");

        linkedlist2.Display();
        System.out.println("********************************************************************");
    }




}
