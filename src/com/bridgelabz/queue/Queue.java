package com.bridgelabz.queue;

public class Queue<T>
{
    QueueNode<T> head;
    QueueNode<T> tail;

    /**
     * Method to insert the data to queue
     */
    public void enQueue(T data)
    {
        QueueNode<T> newNode = new QueueNode<>();
        newNode.data = data;
        newNode.next = head;
        if (head == null)
        {
            head = newNode;
            tail = newNode;
        }
        else
        {
            tail.next = newNode;
            tail = newNode;
        }
    }

    /**
     * Method to check stack is empty or not
     */
    public void isEmpty()
    {
        if(tail == null)
        {
            System.out.println("Stack is empty");
        }
        else
        {
            System.out.println("Stack is not empty");
        }
    }
    /**
     * Method to print the queue
     */
    public void printQueue()
    {
        QueueNode<T> tempNode = head;
        while (tempNode != tail)
        {
            System.out.print(tempNode.data +"->");
            tempNode = tempNode.next;
        }
        System.out.println(tempNode.data);
    }
}
