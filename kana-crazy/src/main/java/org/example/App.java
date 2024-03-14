package org.example;

import org.generator.HiraganaGenerator;
import org.types.Hiragana;


import java.util.Map;

/**
 * Hello world!
 *
 */
public class App
{
    public static void main( String[] args )
    {
        HiraganaGenerator hiraganaGenerator = new HiraganaGenerator();
        Map<Hiragana, String> generatedHiragana = hiraganaGenerator.hiraganaGenerator(20);


        System.out.println("Generated Hiragana:");
        for (String hiragana : generatedHiragana.values()) {
            System.out.println(hiragana);
        }
    }
}
