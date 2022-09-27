package com.epam.collections.queue;

import java.util.*;

public class PriorityQueueCreator {
    public PriorityQueue<String> createPriorityQueue(List<String> firstList, List<String> secondList) {
        List<String> list = new ArrayList<>();
        list.addAll(firstList);
        list.addAll(secondList);
        Collections.sort(list);

        Collections.reverse(list);

        Comparator<String> comp = (o1, o2) -> o2.compareTo(o1);
        PriorityQueue<String> priorityQueue = new PriorityQueue<>(comp);
        priorityQueue.addAll(list);
        return priorityQueue;
    }
}
