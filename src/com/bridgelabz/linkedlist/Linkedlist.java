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