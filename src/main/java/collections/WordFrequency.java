package collections;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.*;

public class WordFrequency {
    public static Map<String, Integer> wordFrequency(String filename) throws IOException {
        Map<String, Integer> res = new HashMap<>();
        List<String> lines = getLines(filename);
        List<String> words = new ArrayList<>();
        for(String line : lines){
            words.addAll(lineToWords(line));
        }
        for(String word : words){
            if(res.containsKey(word)){
                res.replace(word, res.get(word) + 1);
            }else{
                res.put(word, 1);
            }
        }
        return res;
    }

    public static List<String> getLines(String filename) throws IOException {
        return Files.readAllLines(Path.of(filename));
    }

    public static List<String> lineToWords(String line) {
        return Arrays.asList(line.replaceAll("[^a-zA-Z ]", "").toLowerCase().split("\\s+"));
    }
}
