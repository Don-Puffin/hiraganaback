package org.generator.api;

import org.generator.KanjiGenerator;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.types.Kanji;

import java.util.HashMap;
import java.util.Map;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
public class KanjiController {
        private final KanjiGenerator kanjiGenerator;
        public KanjiController(KanjiGenerator KanjiGenerator) {
            this.kanjiGenerator = KanjiGenerator;
        }
        HashMap<String, String> kanjiMap = new HashMap<>();
        @GetMapping("/generate-kanji")
        public HashMap<String,String> generateKanji(@RequestParam("size") int size) {
            kanjiMap.clear();
            return getKanji(size);
        }

        private HashMap<String, String> getKanji(int size) {;

            var kanjiPair = kanjiGenerator.kanjiGenerator(size);

            for (Map.Entry<Kanji, String> entry : kanjiPair.entrySet()) {
                String englishValue = entry.getKey().getEnglishValue();
                String kanjiValue = entry.getKey().getValue();
                kanjiMap.put(kanjiValue, englishValue);
            }

            return kanjiMap;
        }
    }
