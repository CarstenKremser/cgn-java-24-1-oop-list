package org.example;

import java.util.Arrays;

public class Sack {

    private Object[] objects = new Object[0];

    public void add(Object object) {
        objects = Arrays.copyOf(objects,objects.length+1);
        objects[objects.length-1] = object;
    }

    public Object get(int index) {
        if (index >= 0 && index < objects.length) {
            return objects[index];
        }
        return null;
    }

    public int size() {
        return objects.length;
    }

    public boolean removeLast() {
        if (objects.length > 0) {
            objects = Arrays.copyOf(objects,objects.length-1);
            return true;
        }
        return false;
    }

    public Object removeByIndex(int index) {
        if (index >= 0 && index < objects.length) {
            Object object = objects[index];
            for (int i = index; i < objects.length -1; i++) {
                objects[i] = objects[i+1];
            }
            objects = Arrays.copyOf(objects,objects.length-1);
            return object;
        }
        return null;
    }

    @Override
    public String toString() {
        return "Sack{" +
                "objects=" + Arrays.toString(objects) +
                '}';
    }
}
