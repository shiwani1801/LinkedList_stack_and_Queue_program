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
        newNode.next = head;
        head = newNode;
    }
    /**
     * Method to return top element of the stack
     */
    public T peek()
    {
        return head.data;
    }
    /**
     * Method to delete the top most element of the stack
     */
    public T pop()
    {
        StackNode<T> tempNode = head;
        head = head.next;
        return tempNode.data;
    }
    /**
     * Method to check stack is empty or not
     */
    public void isEmpty()
    {
        if(head == null)
        {
            System.out.println("Stack is empty");
        }
        else
        {
            System.out.println("Stack is not empty");
        }
    }
    /**
     * Method to print stack
     */
    public void printStack()
    {
        StackNode<T> tempNode = head;
        while (tempNode != null)
        {
            System.out.print(tempNode.data +"->");

            tempNode = tempNode.next;
        }
    }

}
