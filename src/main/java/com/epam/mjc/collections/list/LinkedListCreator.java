package com.epam.mjc.collections.list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class LinkedListCreator {
    public LinkedList<Integer> createLinkedList(List<Integer> sourceList) {
        LinkedList<Integer> linkedList = new LinkedList<>();

        for (int i=0; i<sourceList.size(); i++) {
            if (sourceList.get(i)%2!=0) {
                linkedList.addFirst(sourceList.get(i));
            } else {
                linkedList.addLast(sourceList.get(i));
            }
        }

        return linkedList;
    }
    public static void main(String[] args) {
        Integer[] arr = new Integer[]{2, 14, 3, 6, 5, 7};
        List<Integer> list = new ArrayList<>(Arrays.asList(arr));

        LinkedListCreator llc = new LinkedListCreator();
        System.out.println(llc.createLinkedList(list));
    }
}
