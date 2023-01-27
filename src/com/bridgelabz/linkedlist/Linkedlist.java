package com.bridgelabz.linkedlist;

public class Linkedlist<T> {
    Node<T> head;
    Node<T> tail;
    /**
     * Method to add the newnode to linkedlist
     */
    public void add(T key) {
        Node<T> node = new Node<T>();
        node.key = key;
        node.next = head;
        head = node;
    }
    /**
     * Method to push the newnode to linkedlist
     */
    public void push(T key) {
        Node<T> newNode = new Node(key);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }
    }
    /**
     * Method to append the newnode to linkedlist
     */
    public void append(T key) {
        Node<T> newNode = new Node(key);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
    }
    /**
     * Method to insert a newnode after given node  to linkedlist
     */

    public void insertAfter(Node<T> prevNode, T key) {
        Node<T> newNode = new Node<T>();
        newNode.key = key;
        newNode.next = prevNode.next;
        prevNode.next = newNode;
    }
    /**
     * Method to delete 1st node from linkedlist
     */
    public T pop() {
        if (head == null) {
            return null;
        }
        Node<T> tempNode = head;
        head = head.next;
        return tempNode.key;
    }
    /**
     * Method to delete last node from linkedlist
     */
    public T popLast() {
        Node<T> tempNode = head;
        while (tempNode.next.next != null) {
            tempNode = tempNode.next;
        }
        tempNode.next = null;
        return tempNode.key;
    }
    /**
     * Method to search for given data to linkedlist
     */
    public Node<T> search(T data) {
        Node<T> tempNode = head;
        while (tempNode != null) {
            if (tempNode.key == data) {
                System.out.println("Key found" + data);
                break;
            }
            tempNode = tempNode.next;
        }
        return tempNode;
    }
    /**
     * Method to insert the node at given position to linkedlist
     */
    public void insert(int index, T key) {
        Node<T> node = new Node();
        node.key = key;
        Node temp = head;
        for (int i = 0; i < index - 1; i++) {
            temp = temp.next;
        }
        node.next = temp.next;
        temp.next = node;
    }
    /**
     * Method to delete  node form given position to linkedlist
     */
    public void deleteNode(T key)
    {
        Node<T> tempNode = search(key);
        Node<T> prevNode = head;
        while(prevNode!= null)
        {
            if(prevNode == tempNode){
                head= tempNode.next;
                break;
            }else if(prevNode.next==tempNode){
                prevNode.next = tempNode.next;
                tempNode.next=null;
            }prevNode=prevNode.next;
        }
    }
    /**
     * Method to calculate count of node in linkedlist
     */
    public void size() {
        Node<T> tempNode = head;
        int count = 0;
        while (tempNode != null) {
            count++;
            tempNode = tempNode.next;
        }
        System.out.println("Size of the linked list is: " + count);
    }

    /**
     * Method to display the linkedlist
     */
    public void Display () {
        Node<T> tempNode = head;
        while (tempNode != null) {
            System.out.print(tempNode.key + "->");
            tempNode = tempNode.next;
        }
        System.out.println();
    }


}