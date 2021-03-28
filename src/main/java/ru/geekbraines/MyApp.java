package ru.geekbraines;

import java.util.HashMap;
import java.util.Map;

public class MyApp {

    public static void main(String[] args) {
        MyApp a = new MyApp();
        System.out.println("\nЗадание №1\n");
        a.strArrayCounter();
        System.out.println("\nЗадание №2\n");
        a.phoneBook();
    }

    private void phoneBook() {
        PhoneBook pb = new PhoneBook();
        pb.add("Иванов","1234");
        pb.add("Петров","3221");
        pb.add("Васильев","4567");
        pb.add("Иванов","1235");
        pb.add("Измайлов","7896");
        pb.add("Иванов","9631");
        PhoneBook res = pb.get("Иванов");
        res.print();
    }

    private void strArrayCounter() {
        String[] strArray = {
                "apple",   // 2
                "book",    // 2
                "pen",     // 1 --
                "apple",   // 2
                "car",     // 2
                "cat",     // 3
                "car",     // 2
                "cat",     // 3
                "house",   // 1 --
                "gun",     // 1 --
                "book",    // 2
                "dog",     // 1 --
                "achieve", // 1 --
                "black",   // 1 --
                "cat",     // 3
                "passport",// 2
                "passport" // 2
        };
        HashMap<String, Integer> hm1 = new HashMap<String, Integer>();
        for (String word : strArray) {
            // hm1.merge(word, 1, Integer::sum);
            if (hm1.get(word) != null) {
                hm1.put(word,hm1.get(word) + 1);
            } else {
                hm1.put(word,1);
            }
        }

        System.out.println("Уникальные слова:");
        for (HashMap.Entry<String, Integer> o: hm1.entrySet()) {
            if (o.getValue() == 1) {
                System.out.println(o.getKey());
            }
        }

        System.out.println("\nКоличество повторов слов:");
        for (Map.Entry<String, Integer> o: hm1.entrySet()) {
            System.out.println(o.getKey() + ": встретилось " + o.getValue() + " раз");
        }
    }
}
