package com.bridgelabz.stack;

public class Stack<T>
{
    StackNode<T> head;

    /**
     * Method to add element to the stack
     */
    public void push(T data)
    {
        StackNode<T> newNode = new StackNode<>();
        newNode.data = data;
        newNode.next = null;
        newNode.next = head;
        head = newNode;
    }

    /**
     * Method to print stack
     */
    public void printStack()
    {
        StackNode<T> tempNode = head;
        while (tempNode != null)
        {
            System.out.print(tempNode.data+"->");
            tempNode = tempNode.next;
        }
    }

}

