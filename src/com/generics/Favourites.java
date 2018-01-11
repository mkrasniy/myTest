package com.generics;

import org.w3c.dom.css.CSSStyleRule;

import java.lang.reflect.Array;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.*;

public class Favourites {
    private final Map<Class<?>,Object> objects = new HashMap<>(10);

    public <T> void putElement( T el){
        objects.put(el.getClass(),el);
    }
    public <T> void putElement(Class<T> tClass, T el){
        objects.put(tClass,el);
    }

    public <T> T getElement(Class<T> tClass){
        return tClass.cast(objects.get(tClass));
    }

    public static void main(String[] args) throws IllegalAccessException, InstantiationException {
        Favourites f = new Favourites();
        f.putElement(111);
        f.putElement("222".getClass().cast("3333"));
        f.putElement(Class.class, List.class);

        Class<?> listClass = ArrayList.class;



        listClass.newInstance();
        Arrays.stream(listClass.getMethods()).map(Method::getDeclaredAnnotations).forEach(a->System.out.println(Arrays.toString(a)));



        System.out.println(f.getElement(String.class));
        System.out.println(f.getElement(Class.class));
    }

}
