package Lecture9HT.File;

//1. Считать с одного файла текст, посчитать количество каждого слова в тексте и записать результат в другой текстовый файл.
// Чтобы убрать знаки препинания и оставить в тексте только буквы и цифры, используйте для вашей стринги .replaceAll("[^a-zA-Z0-9]", " ")
//сплит -> хэшмэп->посчитать результаты

import java.io.*;
import java.util.*;

public class WordCounter {

    public static void main(String[] args) throws IOException {
        String separator = File.separator;
        String inputFilePath = "src" + separator+"main" + separator+"java"+separator+"Lecture9HT"+separator+"File"+separator+"input.txt";
        String outputFilePath = "src" + separator+"main" + separator+"java"+separator+"Lecture9HT"+separator+"File"+separator+"output.txt";

        String text = readTextFromFile(inputFilePath);
        text = text.replaceAll("[^a-zA-Z0-9]", " ").toLowerCase();
        String[] words = text.split("\\s+");

        Map<String, Integer> wordCountMap = countWords(words);
        writeWordCountToFile(wordCountMap, outputFilePath);

        System.out.println("Word count saved to " + outputFilePath);
    }

    private static String readTextFromFile(String filePath) throws IOException {
        StringBuilder sb = new StringBuilder();
        try (Reader reader = new FileReader(filePath)) {
            int c;
            while ((c = reader.read()) != -1) {
                sb.append((char) c);
            }
        }
        return sb.toString();
    }

    private static Map<String, Integer> countWords(String[] words) {
        Map<String, Integer> wordCountMap = new HashMap<>();
        for (String word : words) {
            wordCountMap.put(word, wordCountMap.getOrDefault(word, 0) + 1);
        }
        return wordCountMap;
    }

    private static void writeWordCountToFile(Map<String, Integer> wordCountMap, String filePath) throws IOException {
        try (Writer writer = new FileWriter(filePath)) {
            for (Map.Entry<String, Integer> entry : wordCountMap.entrySet()) {
                writer.write(entry.getKey() + ": " + entry.getValue() + "\n");
            }
        }
    }
}




