/**
 * Created by IntelliJ IDEA.
 * User: mkrasnyy
 * Date: 11.01.2018
 * Time: 9:22
 */

package com.collections;

import java.lang.reflect.Array;
import java.util.*;

public class EnSetTest {
    static enum Days {SUNDAY, MONDAY, THURSDAY}


    static Set<Days> daysSet = EnumSet.of(Days.MONDAY,Days.THURSDAY);

    static Set<Days> daysNoEnumSet = new HashSet<>();


    public static void main(String[] args) {
        daysSet.forEach(System.out::println);
        daysNoEnumSet.add(Days.SUNDAY);
        daysNoEnumSet.add(Days.THURSDAY);
        daysNoEnumSet.forEach(System.out::println);
        Arrays.stream(Days.values()).forEach(d->System.out.println("Ordinal of "+d+": "+d.ordinal()));

        // ENUM MAP
        Map<Days, String> mp = new EnumMap<>(Days.class);

        mp.put(Days.SUNDAY, "SN");
        mp.put(Days.MONDAY, "MN");
        mp.put(Days.THURSDAY, "TH");
        mp.forEach((k,v)-> System.out.println(k+" -> "+v ));

    }
}
