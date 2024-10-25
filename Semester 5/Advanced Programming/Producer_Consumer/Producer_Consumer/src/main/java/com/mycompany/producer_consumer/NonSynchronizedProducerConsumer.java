/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.producer_consumer;

/**
 *
 * @author AbdulRazzaq
 */
import java.util.LinkedList;
import java.util.Queue;

class NonSynchronizedProducerConsumer {
    private final int CAPACITY = 5;
    private Queue<Integer> queue = new LinkedList<>();

    // Producer class
    class Producer implements Runnable {
        @Override
        public void run() {
            int value = 0;
            while (true) {
                // No synchronization, producer will produce without waiting for the consumer
                if (queue.size() < CAPACITY) {
                    System.out.println("Produced: " + value);
                    queue.add(value++);
                } else {
                    System.out.println("Queue is full, Producer is still trying...");
                }

                try {
                    Thread.sleep(500); // Simulating some delay
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    // Consumer class
    class Consumer implements Runnable {
        @Override
        public void run() {
            while (true) {
                // No synchronization, consumer will consume without waiting for the producer
                if (!queue.isEmpty()) {
                    int value = queue.poll();
                    System.out.println("Consumed: " + value);
                } else {
                    System.out.println("Queue is empty, Consumer is still trying...");
                }

                try {
                    Thread.sleep(1000); // Simulating some delay
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    // Main method to start the producer and consumer threads
    public static void main(String[] args) {
        NonSynchronizedProducerConsumer pc = new NonSynchronizedProducerConsumer();

        Thread producerThread = new Thread(pc.new Producer());
        Thread consumerThread = new Thread(pc.new Consumer());

        // Start both threads
        producerThread.start();
        consumerThread.start();
    }
}
