package com.bridgelabz.linkedlist;
public class LinkedListMain {
    public static void main(String[] args) {

        createSimpleLinkedList();
        addingElements();
        appendingTheElements();
        insertingData();
        popFirstData();
        popLastData();
        searchNode();
        insertingAfterElement();
        deleteAndShowSize();
        sortAccendingOrder();
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

    public static void popFirstData() {//input 56,30,70
        System.out.println("================== UC5 ==================");

        Linkedlist<Integer> linkedlist5 = new Linkedlist<>();
        linkedlist5.append(56);
        System.out.println("after append 56");
        linkedlist5.Display();
        linkedlist5.append(30);
        System.out.println("after append 30");
        linkedlist5.Display();
        linkedlist5.append(70);
        System.out.println("after append 70");
        linkedlist5.Display();
        System.out.println("data is : ");
        linkedlist5.Display();
        System.out.println("required output sequence (after deleting first element ) ==> 30,70");
        System.out.println("Pop value is : " + linkedlist5.pop());
        linkedlist5.Display();
        System.out.println("**********************************************************************");
    }

    public static void popLastData() {//input 56,30,70
        System.out.println("================== UC6==================");

        Linkedlist<Integer> linkedlist6 = new Linkedlist<>();
        linkedlist6.append(56);
        System.out.println("after append 56");
        linkedlist6.Display();
        linkedlist6.append(30);
        System.out.println("after append 30");
        linkedlist6.Display();
        linkedlist6.append(70);
        System.out.println("after append 70");
        linkedlist6.Display();

        System.out.println("data is : ");
        linkedlist6.Display();

        System.out.println("required output sequence (after deleting last element ) ==> 56,30");
        System.out.println("Pop value is : " + linkedlist6.popLast());
        System.out.println("after deleting it shows");
        linkedlist6.Display();

        System.out.println("**********************************************************************");
    }

    public static void searchNode() {
        System.out.println("===============================UC7==============================\n");

        Linkedlist<Integer> linkedlist7 = new Linkedlist<>();
        linkedlist7.append(56);
        linkedlist7.append(30);
        linkedlist7.append(70);

        System.out.println("searching for key 30 :");
        linkedlist7.search(30);
        linkedlist7.Display();
        System.out.println("**********************************************************************");
    }

    public static void insertingAfterElement() {
        System.out.println("\n==========================================UC8===================================\n");

        Linkedlist<Integer> linkedlist8 = new Linkedlist<>();
        linkedlist8.append(56);
        linkedlist8.append(30);
        linkedlist8.append(70);
        System.out.println("the data is : ");
        linkedlist8.Display();// using the output of appendingTheElements method
        linkedlist8.insert(1, 40);
        System.out.println("\nRequired output is : 56->30->40->70 \nthe index of value 30 is 1...so after inserting 40 at index 2 we get the list as :  ");
        linkedlist8.Display();
        System.out.println("**********************************************************************");

    }

    public static void deleteAndShowSize() {
        System.out.println("=====================================UC9==========================");
        Linkedlist<Integer> linkedlist8 = new Linkedlist<>();
        linkedlist8.append(56);
        linkedlist8.append(30);
        linkedlist8.append(40);
        linkedlist8.append(70);
        System.out.println("data is: ");
        linkedlist8.Display();

        linkedlist8.deleteNode(40);
        System.out.println("data and size after deleting element 40 \n ");
        linkedlist8.Display();
        linkedlist8.size();

        System.out.println("**********************************************************************");

    }
        public static void sortAccendingOrder() {

        System.out.println("=====================================UC10==========================");

        Linkedlist<Integer> linkedlist9 = new Linkedlist<>();
        linkedlist9.append(56);
        linkedlist9.append(30);
        linkedlist9.append(40);
        linkedlist9.append(70);
        linkedlist9.sortList();

        //print linked list
        System.out.println("Linked list in ascending order after sorting: ");
        linkedlist9.Display();

    }

}