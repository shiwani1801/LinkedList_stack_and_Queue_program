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


    }
}