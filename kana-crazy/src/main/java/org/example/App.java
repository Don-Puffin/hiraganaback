package org.example;

import org.generator.HiraganaGenerator;
import org.types.Hiragana;

import java.util.Map;

public class App {
    public static void main(String[] args) {
        HiraganaGenerator hiraganaGenerator = new HiraganaGenerator();
        Map<Hiragana, String> generatedHiragana = hiraganaGenerator.hiraganaGenerator(20);

        System.out.println("Generated Hiragana:");
        for (Map.Entry<Hiragana, String> entry : generatedHiragana.entrySet()) {
            Hiragana hiragana = entry.getKey();
            String englishValue = hiragana.getEnglishValue();
            String hiraganaValue = hiragana.getValue();
            System.out.println( "Hiragana: " + hiraganaValue + " English: " + englishValue);
        }
    }
}
