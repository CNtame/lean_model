package com.model.learn.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * @author liu
 * @version 1.0
 * @description
 * @createDate 2021/4/9
 */
public class Test {


    public static void main(String[] args) {

        List<int[]> data = new ArrayList<>();
        Collections.reverse(data);
        int[][] arr = data.toArray(new int[data.size()][]);


    }
}
