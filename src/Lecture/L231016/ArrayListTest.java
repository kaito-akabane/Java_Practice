package Lecture.L231016;

import java.util.ArrayList;

public class ArrayListTest {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("MILK");
        list.add("BREAD");
        list.add("BUTTER");
        list.add(1, "APPLE");
        list.set(2, "GRAPE");
        list.remove(3);
        
        System.out.println(list);
    }
}