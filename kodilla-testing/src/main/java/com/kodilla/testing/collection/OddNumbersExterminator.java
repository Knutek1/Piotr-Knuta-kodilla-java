package com.kodilla.testing.collection;

import java.util.ArrayList;
import java.util.List;

public class OddNumbersExterminator {
    public List<Integer> exterminate(List<Integer> numbers){
        List<Integer> evenList = new ArrayList<>();
        for(int i : numbers) {
            if (i % 2 == 0 && i != 0) {
                evenList.add(i);
            }
        }
      return evenList;
    }
}
