

package org.example;
import java.util.HashMap;
import java.util.Map;

public class ex001 {
    public static void main(String[] args) {
        String str = "Философия мира такова, что альтруизм остаётся мифом.git remote add origin https://github.com/ImKeK/seminar-java.git";
        printWords(getCountWords(str));
    }

    /**
     * @apiNote Вывод слов в консоль
     * @param map
     */
    private static void printWords(Map<String, Integer> map) {
        System.out.println("Количество вхождений слов в тексте:");
        for (String key: map.keySet()) {
            System.out.printf("%s - %d\n", key, map.get(key));
        }
    }

    /**
     * @apiNote Подсчитать количество вхождения каждого слова
     * @param str Текст, в котором считаются слова
     * @return Слова, с количеством вхождений
     */
    private static Map<String, Integer> getCountWords(String str) {
        Map<String, Integer> map = new HashMap<>();
        str = str.toLowerCase().replaceAll("[.—:;,!?]", "");
        String[] words = str.split("\\s+");

        for (String item: words) {
            map.putIfAbsent(item, 0);
            map.put(item, map.get(item)+1);
        }
        return map;
    }
}