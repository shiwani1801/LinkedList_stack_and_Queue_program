package com.bridgelabz.stack;

public class StackMain
{
    public static void main(String[] args)
    {
        Stack<Integer> newStack = new Stack<>();
        System.out.println("\n\n===================UC1=====================\n");
        newStack.push(70);
        System.out.println("after adding 70:");
        newStack.printStack();
        newStack.push(30);
        System.out.println("after adding 30:");
        newStack.printStack();
        newStack.push(56);
        System.out.println("after adding 56:");
        newStack.printStack();
        System.out.println("Element are as:");

        newStack.printStack();
        System.out.println("\n\n===================UC2=====================\n");

        //Performing pop and peek operation till stack is empty
        int topElement = newStack.peek();
        System.out.println("The element at the top of the stack is : "+topElement);
        int deletedElement = newStack.pop();
        System.out.println("Deleted top most element is :" +deletedElement);
        System.out.println("after deleted top most element is :");
        newStack.printStack();

        newStack.isEmpty();

        int secondElement = newStack.peek();
        System.out.println("The element at the 2nd of the stack is : "+secondElement);
        int deletedElement1 = newStack.pop();

        System.out.println("Deleted 2nd element is :" +deletedElement1);
        System.out.println("after deleted 2nd element is :");
        newStack.printStack();

        newStack.isEmpty();

        int thirdElement = newStack.peek();
        System.out.println("The element at the 3rd of the stack is : "+thirdElement);
        int deletedElement2 = newStack.pop();

        System.out.println("Deleted 3rd element is :" +deletedElement2);
        System.out.println("after deleted 3rd element is :");
        newStack.printStack();

        newStack.isEmpty();



    }

}
