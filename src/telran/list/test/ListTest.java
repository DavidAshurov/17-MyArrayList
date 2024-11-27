package telran.list.test;

import org.junit.jupiter.api.Test;
import telran.list.interfaces.IList;
import telran.list.model.MyArrayList;

public class ListTest {

    @Test
    void test() {
        try {
            IList<Integer> list = new MyArrayList<Integer>(-1);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
        IList<Integer> list = new MyArrayList<Integer>();
        System.out.println(list.size());
        System.out.println(list.isEmpty());
        list.add(2);
        list.add(7);
        list.add(5);
        list.add(3);
        System.out.println(list.size());
        System.out.println(list.isEmpty());
        list.add(7);
        list.add(4,null);
        System.out.println(list.size());
        System.out.println("===get===");
        System.out.println(list.get(2));
        System.out.println(list.get(4));
        try {
            System.out.println(list.get(6));
        } catch (Exception e) {
            System.out.println("ops");
        }
        System.out.println("===indexOf===");
        System.out.println(list.indexOf(7));
        System.out.println(list.indexOf(5));
        System.out.println(list.indexOf(10));
        System.out.println(list.indexOf(null));
        System.out.println("===contains===");
        System.out.println(list.contains(5));
        System.out.println(list.contains(1));
        System.out.println(list.contains(null));
        System.out.println("===lastIndexOf===");
        System.out.println(list.lastIndexOf(7));
        System.out.println("===set===");
        try {
            list.set(6,1);
        } catch (IndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        }
        list.set(4,8);
        System.out.println(list.get(4));
        System.out.println("===iterator===");
        for (Integer elem : list) {
            System.out.println(elem);
        }
        System.out.println("===remove===");
        Integer value = 10;
        System.out.println(list.remove(value));
        value = 7;
        System.out.println(list.remove(value));
        list.remove(0);
        for (Integer elem : list) {
            System.out.println(elem);
        }
        System.out.println("===clear===");
        list.clear();
        System.out.println(list.size());
    }
}
