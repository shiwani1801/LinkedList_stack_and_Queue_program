package com.bridgelabz.queue;

public class QueueMain {
    public static void main(String args[]) {
        System.out.println("=====================================uc3==========================");
        Queue<Integer> newQueue = new Queue<>();
        newQueue.enQueue(56);
        System.out.println("after enque 56");
        newQueue.printQueue();
        newQueue.enQueue(30);
        System.out.println("after enque 30");
        newQueue.printQueue();
        newQueue.enQueue(70);
        System.out.println("after enque 70");
        newQueue.printQueue();

        System.out.println("=====================================uc4==========================");

        newQueue.deQueue();  //delete the first element of queue
        System.out.println("after deleting 1st element 56 \n ");
        newQueue.printQueue();
        newQueue.isEmpty();
        System.out.println("........................................................");
        newQueue.deQueue();  //delete the 2nd element of queue
        System.out.println("after deleting 2nd element 30 \n ");
        newQueue.printQueue();
        newQueue.isEmpty();
        System.out.println("........................................................");
        newQueue.deQueue();  //delete the 3rd element of queue
        System.out.println("after deleting 3rd element 70\n ");

        newQueue.isEmpty();
    }
}