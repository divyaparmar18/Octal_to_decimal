package com.divya.converter;

import java.util.List;

public class SumOfList {
    public static int getTotal(List<Integer> numberdOfProduct){
        int total = 0;
        for (int digit : numberdOfProduct) {
            total+=digit;
        }
        return total;
    }
}
