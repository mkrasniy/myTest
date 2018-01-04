package com.collections;


import java.util.*;

public class BasicIfaces {
    public BasicIfaces(){
        try {
            throw new RuntimeException("Non Instantiable method!");}
            catch (RuntimeException e){
                System.out.println("...do nothing...");
            }
        int[] A=fakeRet();
        A[0] = 0;
    }
    private int[] fakeRet(){
        int[] a=null;
        return a;
    }
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("asd ","qwe    ", "qewq   ","    asdf","assz", "   qwe");
        System.out.println("Basic list:"+strings);
      //  System.out.println(strings);

        strings.replaceAll(String::trim);

        System.out.println("List after  strings.replaceAll(String::trim):"+strings);

        System.out.println("number of element: "+strings.indexOf("asd"));


        String [] arrStr = new String[strings.size()];
        strings.toArray(arrStr);
       // Arrays.stream(arrStr).forEach(System.out::println);

        System.out.println("first index of \"qwe\" is: "+strings.indexOf("qwe")+". Last index of \"qwe\" is: "+strings.lastIndexOf("qwe"));
        Collections.shuffle(strings);
        System.out.println("List after  Collections.shuffle(strings):"+strings);
        System.out.println("first index of \"qwe\" is: "+strings.indexOf("qwe")+". Last index of \"qwe\" is: "+strings.lastIndexOf("qwe"));

        System.out.println("Previous iterator example: ");

        strings= new ArrayList<>(strings);

        for (ListIterator<String> stringListIterator = strings.listIterator(strings.size()); stringListIterator.hasPrevious();) {
            String previous = stringListIterator.previous();
            if (stringListIterator.previousIndex()%2==0){
                System.out.println("removing "+previous);
                stringListIterator.remove();
            }
            System.out.println(previous);
        }
        System.out.println("Result List: "+strings);
        BasicIfaces bi = new BasicIfaces();
    }
}
