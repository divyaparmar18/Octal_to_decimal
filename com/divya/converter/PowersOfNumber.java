package com.divya.converter;

import java.util.ArrayList;
import java.util.List;

public class PowersOfNumber {
    public static List<Integer> getPowers(int base, int times) {
        List<Integer> listOfPowers = new ArrayList<Integer>();
        for (int i = 0; i < times; i++) {
            int Power = ((int) (Math.pow(base, i)));
            listOfPowers.add(Power);
        }
        return listOfPowers;
    }
}
