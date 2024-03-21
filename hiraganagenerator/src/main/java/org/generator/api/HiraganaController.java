package org.generator.api;

import org.generator.HiraganaGenerator;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.types.Hiragana;

import java.util.HashMap;
import java.util.Map;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
public class HiraganaController {
        private final HiraganaGenerator hiraganaGenerator;
        public HiraganaController(HiraganaGenerator hiraganaGenerator) {
            this.hiraganaGenerator = hiraganaGenerator;
        }
        HashMap<String, String> hiraganaMap = new HashMap<>();
        @GetMapping("/generate-hiragana")
        public HashMap<String,String> generateHiragana(@RequestParam("size") int size) {
            hiraganaMap.clear();
            return getHiragana(size);
        }

        private HashMap<String, String> getHiragana(int size) {;

            var hiraganaPair = hiraganaGenerator.hiraganaGenerator(size);

            for (Map.Entry<Hiragana,String> entry : hiraganaPair.entrySet()) {
                String englishValue = entry.getKey().getEnglishValue();
                String hiraganaValue = entry.getKey().getValue();
                hiraganaMap.put(hiraganaValue, englishValue);
            }

            return hiraganaMap;
        }
    }
