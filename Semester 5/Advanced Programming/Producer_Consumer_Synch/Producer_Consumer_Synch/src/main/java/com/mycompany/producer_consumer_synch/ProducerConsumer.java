/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.producer_consumer_synch;

/**
 *
 * @author AbdulRazzaq
 */
import java.util.LinkedList;
import java.util.Queue;

class ProducerConsumer {
    private final int CAPACITY = 5;
    private Queue<Integer> queue = new LinkedList<>();

    // Producer class
    class Producer implements Runnable {
        @Override
        public void run() {
            int value = 0;
            while (true) {
                synchronized (queue) {
                    // Wait while the queue is full
                    while (queue.size() == CAPACITY) {
                        try {
                            queue.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                    // Produce an item and add it to the queue
                    System.out.println("Produced: " + value);
                    queue.add(value++);
                    
                    // Notify the consumer that something is available
                    queue.notify();
                    
                    try {
                        Thread.sleep(500); // Simulating some delay
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
    }

    // Consumer class
    class Consumer implements Runnable {
        @Override
        public void run() {
            while (true) {
                synchronized (queue) {
                    // Wait while the queue is empty
                    while (queue.isEmpty()) {
                        try {
                            queue.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                    // Consume an item from the queue
                    int value = queue.poll();
                    System.out.println("Consumed: " + value);
                    
                    // Notify the producer that space is available
                    queue.notify();
                    
                    try {
                        Thread.sleep(1000); // Simulating some delay
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
    }

    // Main method to start the producer and consumer threads
    public static void main(String[] args) {
        ProducerConsumer pc = new ProducerConsumer();
        
        Thread producerThread = new Thread(pc.new Producer());
        Thread consumerThread = new Thread(pc.new Consumer());

        // Start both threads
        producerThread.start();
        consumerThread.start();
    }
}