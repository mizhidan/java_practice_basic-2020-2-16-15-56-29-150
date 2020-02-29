package com.thoughtworks.collection;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class Practice2 {

    public static void main(String[] args) {
        List<Integer> list = getNumbers();
        for(int index = 0; index < list.size(); ++index) {
            System.out.print(list.indexOf(index) + " ");
        }
        System.out.println("");
        for(Integer value : list) {
            System.out.print(value + " ");
        }
        System.out.println("");
        Iterator<Integer> iterator = list.iterator();
        while(iterator.hasNext()) {
            Integer number = iterator.next();
            System.out.print(number + " ");
        }

    }

    /**
     * 创建一个List 然后在List中添加0到100整数
     */
    public static List<Integer> getNumbers() {
        List<Integer> list = new LinkedList<>();
        Collection<Integer> collection = new HashSet<>();
        Random rand = new Random();
        while(collection.size() != 100) {
            collection.add(rand.nextInt(100));
        }
        list.addAll(collection);
        return list;
    }


}
