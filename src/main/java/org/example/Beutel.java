package org.example;

import javax.swing.*;

public class Beutel {

    private class Element {
        Object object;
        Element nextElement;

        public Element(Object object, Element nextElement) {
            this.object = object;
            this.nextElement = nextElement;
        }
    }

    private Element firstElement = null;

    public void add(Object object) {
        if (firstElement == null) {
            firstElement = new Element(object, null);
        } else {
            Element current = firstElement;
            while (current.nextElement != null) {
                current = current.nextElement;
            }
            current.nextElement = new Element(object, null);
        }
    }

    public Object get(int index) {
        Element current = firstElement;
        int currentIndex = 0;
        while (currentIndex < index && current != null) {
            current = current.nextElement;
            currentIndex++;
        }
        if (index == currentIndex) {
            return current.object;
        }
        return null;
    }

    public int size() {
        int currentIndex = 0;
        Element current = firstElement;
        while (current != null) {
            current = current.nextElement;
            currentIndex++;
        }
        return currentIndex;
    }

    public boolean removeLast() {
        if (firstElement == null) {
            return false;
        } else if (firstElement.nextElement == null) {
            firstElement.object = null;
            firstElement = null;
        } else {
            Element current = firstElement;
            Element previous = null;
            while(current.nextElement != null) {
                previous = current;
                current = current.nextElement;
            }
            current.object = null;
            previous.nextElement = null;

        }
        return true;
    }

    public Object removeByIndex(int index) {
        Element current = firstElement;
        Element previous = null;
        int currentIndex = 0;
        while (currentIndex < index && current != null) {
            previous = current;
            current = current.nextElement;
            currentIndex++;
        }
        if (index == currentIndex) {
            previous.nextElement = current.nextElement;
            Object object = current.object;
            current.object = null; // for garbage collection
            return object;
        }
        return null;
    }

    @Override
    public String toString() {
        String result = "";

        result += "Beutel{\n";
        Element current = firstElement;
        while (current != null) {
            result += current.object.toString() + "\n";
            current = current.nextElement;
        }
        result += '}';
        return result;
    }
}
