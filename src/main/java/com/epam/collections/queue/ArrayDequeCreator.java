package com.epam.collections.queue;

import java.util.ArrayDeque;
import java.util.Objects;
import java.util.PriorityQueue;
import java.util.Queue;

public class ArrayDequeCreator extends PriorityQueue<String> {
    public ArrayDeque<Integer> createArrayDeque(Queue<Integer> firstQueue, Queue<Integer> secondQueue) {
        ArrayDeque<Integer> arrayDeque = new ArrayDeque<>();
        arrayDeque.add(Objects.requireNonNull(firstQueue.poll()));
        arrayDeque.add(Objects.requireNonNull(firstQueue.poll()));
        arrayDeque.add(Objects.requireNonNull(secondQueue.poll()));
        arrayDeque.add(Objects.requireNonNull(secondQueue.poll()));

        boolean firstTurn = true;
        while (secondQueue.size() != 0) {
            if (firstTurn) {
                firstQueue.add(arrayDeque.pollLast());
                arrayDeque.add(Objects.requireNonNull(firstQueue.poll()));
                arrayDeque.add(Objects.requireNonNull(firstQueue.poll()));
                firstTurn = false;
            } else {
                secondQueue.add(arrayDeque.pollLast());
                arrayDeque.add(Objects.requireNonNull(secondQueue.poll()));
                arrayDeque.add(Objects.requireNonNull(secondQueue.poll()));
                firstTurn = true;
            }
        }

        return arrayDeque;
    }
}
