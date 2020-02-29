package com.thoughtworks.collection;

import java.util.Collection;
import java.util.HashSet;
import java.util.Random;
import java.util.stream.Collectors;

public class Practice1 {
    public static void main(String[] args) {
        System.out.println(randomNumber());
    }

    /**
     *  生成10个0到20的随机整数，要求不能重复
     */
    public static Collection<Integer> randomNumber() {
        Collection<Integer> collection = new HashSet<>();
        Random rand = new Random();
        while(collection.size() != 10) {
            collection.add(rand.nextInt(20));
        }
        return collection;
    }
}
