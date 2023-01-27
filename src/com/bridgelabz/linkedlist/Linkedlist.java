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