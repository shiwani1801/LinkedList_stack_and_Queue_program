package com.bridgelabz.linkedlist;

public class LinkedListMain {
    public static void main(String[] args) {

        createSimpleLinkedList();
        addingElements();
        appendingTheElements();
        insertingData();
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
    public static void appendingTheElements() { // new element gets added at the end
        System.out.println("\n==============================UC3============================");
        Linkedlist<Integer> linkedlist3 = new Linkedlist<>();

        linkedlist3.append(56);
        System.out.println("after append 56");
        linkedlist3.Display();
        linkedlist3.append(30);
        System.out.println("after append 30");
        linkedlist3.Display();
        linkedlist3.append(70);
        System.out.println("after append 70");
        linkedlist3.Display();
        System.out.println("while appending, the new elements will get added to the end position" +
                "\nso required output is ====> 56,30,70");
        linkedlist3.Display();
        System.out.println("**********************************************************************");
    }
    public static void insertingData() {
        System.out.println("\n=================UC4==================");

        Linkedlist<Integer> linkedlist4 = new Linkedlist<>();
        linkedlist4.append(56);
        System.out.println("after append 56");
        linkedlist4.Display();
        linkedlist4.append(70);
        System.out.println("after append 70");
        linkedlist4.Display();
        System.out.println("Before inserting the elements are=");
        linkedlist4.Display();
        linkedlist4.insertAfter(linkedlist4.head, 30);
        System.out.println("inserting 30 between 56 and 70");
        linkedlist4.Display();
        System.out.println("**********************************************************************");

    }


}