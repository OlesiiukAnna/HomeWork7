package home.Task_07;

import java.util.*;

/*
Есть List объектов у каждого из которых 2 поля: int и String.
Удалить те у которых значения int повторяются(оставить по одному из дубликатов)
 */
public class Task_07_4 {
    public static void main(String[] args) {
        List<SomeObject> list = new ArrayList<>();
        list.add(new SomeObject(6, "pen"));
        list.add(new SomeObject(1, "table"));
        list.add(new SomeObject(1, "printer"));
        list.add(new SomeObject(5, "lamp"));
        list.add(new SomeObject(2, "photo"));
        list.add(new SomeObject(2, "pen"));

        Map<Integer, String> map = new HashMap<>();
        for (SomeObject instance : list) {
            map.put(instance.number, instance.name);
        }

        System.out.println("list: " + list);
        System.out.println("list without int duplicates: " + map);
    }

    private static class SomeObject {
        private int number;
        private String name;

        SomeObject(int number, String name) {
            this.number = number;
            this.name = name;
        }

        @Override
        public String toString() {
            return number + "=" + name;
        }
    }
}
