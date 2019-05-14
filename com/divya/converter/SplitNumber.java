package com.divya.converter;

import java.util.ArrayList;
import java.util.List;

public class SplitNumber {
    public static List<Integer> getDigits(String number) {
        String[] NumOfString = number.split("");
        List<Integer> splitOfDigits = new ArrayList<>();
        for (int i = NumOfString.length; i > 0; i--) {
            splitOfDigits.add(Integer.valueOf(NumOfString[i - 1]));
        }
        return (splitOfDigits);
    }
}
