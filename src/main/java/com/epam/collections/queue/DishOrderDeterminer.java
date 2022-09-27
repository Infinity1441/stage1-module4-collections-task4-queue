package com.epam.collections.queue;

import java.util.ArrayList;
import java.util.List;

public class DishOrderDeterminer {
    public List<Integer> determineDishOrder(int numberOfDishes, int everyDishNumberToEat) {
        List<Integer> list = new ArrayList<>();
        List<Integer> ints = new ArrayList<>();
        for (int i = 1; i <= numberOfDishes; i++) {
            ints.add(i);
        }
        int step = 1, i = 0;

        while (ints.size() != 0) {
            if (i < ints.size()) {
                if (step == everyDishNumberToEat) {
                    list.add(ints.get(i));
                    ints.remove(ints.get(i));
                    step = 1;
                } else {
                    step++;
                    i++;
                }
            } else i = 0;

            if (ints.size() == 1) {
                list.add(ints.get(0));
                ints.remove(ints.get(0));
            }
        }
        return list;
    }
}
