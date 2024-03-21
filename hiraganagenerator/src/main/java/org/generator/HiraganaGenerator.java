package org.generator;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.types.Hiragana;

import java.security.SecureRandom;
import java.util.*;
@CrossOrigin(origins = "http://localhost:3000")
@Component
public class HiraganaGenerator {
    public Map<Hiragana, String> hiraganaGenerator(int size) {
        Random random = new SecureRandom();
        Map<Hiragana, String> possibleHiragana = makePossibleHiraganaList();
        List<Map.Entry<Hiragana, String>> hiraganaEntries = new ArrayList<>(possibleHiragana.entrySet());
        Map<Hiragana, String> hiraganaList = new HashMap<>();

        Collections.shuffle(hiraganaEntries, random);

        int availableSize = hiraganaEntries.size();
        if (size > availableSize) {
            throw new IllegalArgumentException("size is too large for hiragana generator, please use 1 - " + makePossibleHiraganaList().size());
        }

        for (int i = 0; i < size; i++) {
            Map.Entry<Hiragana, String> hiraganaEntry = hiraganaEntries.get(i);
            hiraganaList.put(hiraganaEntry.getKey(), hiraganaEntry.getValue());
        }
        return hiraganaList;
    }

    private Map<Hiragana, String> makePossibleHiraganaList() {
        HashMap<Hiragana, String> possibleHiragana = new HashMap<>();
        possibleHiragana.put(Hiragana.of("あ", "a"), "a");
        possibleHiragana.put(Hiragana.of("い", "i"), "i");
        possibleHiragana.put(Hiragana.of("う", "u"), "u");
        possibleHiragana.put(Hiragana.of("え", "e"), "e");
        possibleHiragana.put(Hiragana.of("お", "o"), "o");
        possibleHiragana.put(Hiragana.of("か", "ka"), "ka");
        possibleHiragana.put(Hiragana.of("き", "ki"), "ki");
        possibleHiragana.put(Hiragana.of("く", "ku"), "ku");
        possibleHiragana.put(Hiragana.of("け", "ke"), "ke");
        possibleHiragana.put(Hiragana.of("こ", "ko"), "ko");
        possibleHiragana.put(Hiragana.of("さ", "sa"), "sa");
        possibleHiragana.put(Hiragana.of("し", "shi"), "shi");
        possibleHiragana.put(Hiragana.of("す", "su"), "su");
        possibleHiragana.put(Hiragana.of("せ", "se"), "se");
        possibleHiragana.put(Hiragana.of("そ", "so"), "so");
        possibleHiragana.put(Hiragana.of("た", "ta"), "ta");
        possibleHiragana.put(Hiragana.of("ち", "chi"), "chi");
        possibleHiragana.put(Hiragana.of("つ", "tsu"), "tsu");
        possibleHiragana.put(Hiragana.of("て", "te"), "te");
        possibleHiragana.put(Hiragana.of("と", "to"), "to");
        possibleHiragana.put(Hiragana.of("な", "na"), "na");
        possibleHiragana.put(Hiragana.of("に", "ni"), "ni");
        possibleHiragana.put(Hiragana.of("ぬ", "nu"), "nu");
        possibleHiragana.put(Hiragana.of("ね", "ne"), "ne");
        possibleHiragana.put(Hiragana.of("の", "no"), "no");
        possibleHiragana.put(Hiragana.of("は", "ha"), "ha");
        possibleHiragana.put(Hiragana.of("ひ", "hi"), "hi");
        possibleHiragana.put(Hiragana.of("ふ", "fu"), "fu");
        possibleHiragana.put(Hiragana.of("へ", "he"), "he");
        possibleHiragana.put(Hiragana.of("ほ", "ho"), "ho");
        possibleHiragana.put(Hiragana.of("ま", "ma"), "ma");
        possibleHiragana.put(Hiragana.of("み", "mi"), "mi");
        possibleHiragana.put(Hiragana.of("む", "mu"), "mu");
        possibleHiragana.put(Hiragana.of("め", "me"), "me");
        possibleHiragana.put(Hiragana.of("も", "mo"), "mo");
        possibleHiragana.put(Hiragana.of("や", "ya"), "ya");
        possibleHiragana.put(Hiragana.of("ゆ", "yu"), "yu");
        possibleHiragana.put(Hiragana.of("よ", "yo"), "yo");
        possibleHiragana.put(Hiragana.of("ら", "ra"), "ra");
        possibleHiragana.put(Hiragana.of("り", "ri"), "ri");
        possibleHiragana.put(Hiragana.of("る", "ru"), "ru");
        possibleHiragana.put(Hiragana.of("れ", "re"), "re");
        possibleHiragana.put(Hiragana.of("ろ", "ro"), "ro");
        possibleHiragana.put(Hiragana.of("わ", "wa"), "wa");
        possibleHiragana.put(Hiragana.of("を", "wo"), "wo");
        possibleHiragana.put(Hiragana.of("ん", "n"), "n");
        possibleHiragana.put(Hiragana.of("が", "ga"), "ga");
        possibleHiragana.put(Hiragana.of("ぎ", "gi"), "gi");
        possibleHiragana.put(Hiragana.of("ぐ", "gu"), "gu");
        possibleHiragana.put(Hiragana.of("げ", "ge"), "ge");
        possibleHiragana.put(Hiragana.of("ご", "go"), "go");
        possibleHiragana.put(Hiragana.of("ざ", "za"), "za");
        possibleHiragana.put(Hiragana.of("じ", "ji"), "ji");
        possibleHiragana.put(Hiragana.of("ず", "zu"), "zu");
        possibleHiragana.put(Hiragana.of("ぜ", "ze"), "ze");
        possibleHiragana.put(Hiragana.of("ぞ", "zo"), "zo");
        possibleHiragana.put(Hiragana.of("だ", "da"), "da");
        possibleHiragana.put(Hiragana.of("ぢ", "dji"), "ji");
        possibleHiragana.put(Hiragana.of("づ", "dzu"), "dzu");
        possibleHiragana.put(Hiragana.of("で", "de"), "de");
        possibleHiragana.put(Hiragana.of("ど", "do"), "do");
        possibleHiragana.put(Hiragana.of("ば", "ba"), "ba");
        possibleHiragana.put(Hiragana.of("び", "bi"), "bi");
        possibleHiragana.put(Hiragana.of("ぶ", "bu"), "bu");
        possibleHiragana.put(Hiragana.of("べ", "be"), "be");
        possibleHiragana.put(Hiragana.of("ぼ", "bo"), "bo");
        possibleHiragana.put(Hiragana.of("ぱ", "pa"), "pa");
        possibleHiragana.put(Hiragana.of("ぴ", "pi"), "pi");
        possibleHiragana.put(Hiragana.of("ぷ", "pu"), "pu");
        possibleHiragana.put(Hiragana.of("ぺ", "pe"), "pe");
        possibleHiragana.put(Hiragana.of("ぽ", "po"), "po");
        return possibleHiragana;
    }
}