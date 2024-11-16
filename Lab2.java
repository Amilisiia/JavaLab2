import java.util.*;
public class Lab2 {
    public static void main(String[] args) {
        try {
            // Задаємо текст
            String text = "First day at first school. Second lesson of the week of the month. " +
                    "Third hour of school.";

            // Використовуємо StringBuilder
            StringBuilder sb = new StringBuilder(text);

            // Розбиваємо текст на речення
            String[] sentences = sb.toString().split("\\.");

            // Видаляємо зайві пробіли
            for (int i = 0; i < sentences.length; i++) {
                sentences[i] = sentences[i].trim();
            }

            // Сортуємо речення за кількістю слів у них
            Arrays.sort(sentences, Comparator.comparingInt(s -> s.split("\\s+").length));

            // Виводимо відсортовані речення
            System.out.println("Речення в порядку зростання кількості слів:");
            for (String sentence : sentences) {
                System.out.println(sentence + ".");
            }

        } catch (Exception e) {
            System.out.println("Виникла помилка: " + e.getMessage());
        }
    }
}
