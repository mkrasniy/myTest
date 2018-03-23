/**
 * Created by IntelliJ IDEA.
 * User: mkrasnyy
 * Date: 23.03.2018
 * Time: 14:13
 */

package com.collections;

import java.util.Arrays;
import java.util.stream.Stream;

public class Reducing {
    public static void main(String[] args) {

        System.out.println(Stream.of(1,23,32,1234,543).map(String::valueOf).reduce((x, y)->x+", "+y).orElse("Empty"));

        System.out.println(Stream.of(1).map(String::valueOf).reduce((x, y)->x+", "+y).orElse("Empty"));
        System.out.println(Stream.of().map(String::valueOf).reduce((x, y)->x+", "+y).orElse("Empty"));

    }
}
