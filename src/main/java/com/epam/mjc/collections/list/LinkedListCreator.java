package com.epam.mjc.collections.list;

import java.util.LinkedList;
import java.util.List;

public class LinkedListCreator {
    public LinkedList<Integer> createLinkedList(List<Integer> sourceList) {
        LinkedList<Integer> MyArray = new LinkedList<>();

        for (Integer digital : sourceList
        ) {
            if (digital % 2 != 0) {
                MyArray.addFirst(digital);
            } else {
                MyArray.addLast(digital);

            }
        }
        return MyArray;
    }
}
