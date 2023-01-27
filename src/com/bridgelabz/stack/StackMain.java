package com.bridgelabz.stack;

public class StackMain
{
    public static void main(String[] args)
    {
        Stack<Integer> newStack = new Stack<>();
        newStack.push(70);
        newStack.push(30);
        newStack.push(56);
        System.out.println("\n\n===================UC1=====================\n");
        System.out.println("the simple stack created = " );
        newStack.printStack();

    }

}
