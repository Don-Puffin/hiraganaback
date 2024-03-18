//package org.example;
//
//import org.generator.HiraganaGenerator;
//import org.types.Hiragana;
//
//import java.util.Map;
//
//public class App {
//    public static void main(String[] args) {
//        HiraganaGenerator hiraganaGenerator = new HiraganaGenerator();
//        Map<Hiragana, String> generatedHiragana = hiraganaGenerator.hiraganaGenerator(20);
//
//        System.out.println("Generated Hiragana:");
//        for (Map.Entry<Hiragana, String> entry : generatedHiragana.entrySet()) {
//            Hiragana hiragana = entry.getKey();
//            String englishValue = hiragana.getEnglishValue();
//            String hiraganaValue = hiragana.getValue();
//            System.out.println( "Hiragana: " + hiraganaValue + " English: " + englishValue);
//        }
//    }
//}

package org.example;

import org.generator.HiraganaGenerator;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.types.Hiragana;

import java.util.Map;

@SpringBootApplication
public class App {
    public static void main(String[] args) {
        SpringApplication.run(App.class, args);
    }
}

@RestController
class HiraganaController {
    private final HiraganaGenerator hiraganaGenerator;

    public HiraganaController(HiraganaGenerator hiraganaGenerator) {
        this.hiraganaGenerator = hiraganaGenerator;
    }

    @GetMapping("/generateHiragana")
    public Map<Hiragana, String> generateHiragana(@RequestParam int size) {
        return hiraganaGenerator.hiraganaGenerator(size);
    }
}
