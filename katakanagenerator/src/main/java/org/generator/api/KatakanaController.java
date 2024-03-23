package org.generator.api;

import org.generator.KatakanaGenerator;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.types.Katakana;

import java.util.HashMap;
import java.util.Map;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
public class KatakanaController {
        private final KatakanaGenerator katakanaGenerator;
        public KatakanaController(KatakanaGenerator katakanaGenerator) {
            this.katakanaGenerator = katakanaGenerator;
        }
        HashMap<String, String> katakanaMap = new HashMap<>();
        @GetMapping("/generate-katakana")
        public HashMap<String,String> generateKatakana(@RequestParam("size") int size) {
            katakanaMap.clear();
            return getKatakana(size);
        }

        private HashMap<String, String> getKatakana(int size) {

            var katakanaPair = katakanaGenerator.katakanaGenerator(size);

            for (Map.Entry<Katakana,String> entry : katakanaPair.entrySet()) {
                String englishValue = entry.getKey().getEnglishValue();
                String katakanaValue = entry.getKey().getValue();
                katakanaMap.put(katakanaValue, englishValue);
            }

            return katakanaMap;
        }
    }
