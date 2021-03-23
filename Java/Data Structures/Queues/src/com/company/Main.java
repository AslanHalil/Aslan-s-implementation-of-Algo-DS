package com.company;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class Main {

    public static class QueueDataStructure {

        Integer[] queue;
        int queueTail = 0;

        public QueueDataStructure(Integer[] queue) {
            this.queue = queue;

        }

        void enqueue(Integer[] queue, int x) {
            if(queue[queueTail] == null) {
                queue[queueTail] = x;
            } else {
                queueTail++;
                queue[queueTail] = x;
            }
        }

        int dequeue(Integer[] queue) {
            int element = queue[queueTail];
            if(queueTail == queue.length - 1) {
                return 1;
            } else {
                queue[queueTail] = null;
                queueTail--;
            }
            return element;
        }

    }

    public static void main(String[] args) {
	// write your code here
        Integer[] numbers = new Integer[10];

        QueueDataStructure queue = new QueueDataStructure(numbers);
        queue.enqueue(numbers,1);
        System.out.println(numbers[0]);
        queue.dequeue(numbers);
        System.out.println(numbers[0]);

    }
}
