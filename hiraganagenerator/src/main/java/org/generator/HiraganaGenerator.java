package org.generator;

import org.types.Hiragana;

import java.security.SecureRandom;
import java.util.*;

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
            hiraganaList.put(hiraganaEntry.getKey(), hiraganaEntry.getKey().getValue());
        }
        return hiraganaList;
    }

    private Map<Hiragana, String> makePossibleHiraganaList() {
        HashMap<Hiragana, String> possibleHiragana = new HashMap<>();
        possibleHiragana.put(Hiragana.of("あ"), "a");
        possibleHiragana.put(Hiragana.of("い"), "i");
        possibleHiragana.put(Hiragana.of("う"), "u");
        possibleHiragana.put(Hiragana.of("え"), "e");
        possibleHiragana.put(Hiragana.of("お"), "o");
        possibleHiragana.put(Hiragana.of("か"), "ka");
        possibleHiragana.put(Hiragana.of("き"), "ki");
        possibleHiragana.put(Hiragana.of("く"), "ku");
        possibleHiragana.put(Hiragana.of("け"), "ke");
        possibleHiragana.put(Hiragana.of("こ"), "ko");
        possibleHiragana.put(Hiragana.of("さ"), "sa");
        possibleHiragana.put(Hiragana.of("し"), "shi");
        possibleHiragana.put(Hiragana.of("す"), "su");
        possibleHiragana.put(Hiragana.of("せ"), "se");
        possibleHiragana.put(Hiragana.of("そ"), "so");
        possibleHiragana.put(Hiragana.of("た"), "ta");
        possibleHiragana.put(Hiragana.of("ち"), "chi");
        possibleHiragana.put(Hiragana.of("つ"), "tsu");
        possibleHiragana.put(Hiragana.of("て"), "te");
        possibleHiragana.put(Hiragana.of("と"), "to");
        possibleHiragana.put(Hiragana.of("な"), "na");
        possibleHiragana.put(Hiragana.of("に"), "ni");
        possibleHiragana.put(Hiragana.of("ぬ"), "nu");
        possibleHiragana.put(Hiragana.of("ね"), "ne");
        possibleHiragana.put(Hiragana.of("の"), "no");
        possibleHiragana.put(Hiragana.of("は"), "ha");
        possibleHiragana.put(Hiragana.of("ひ"), "hi");
        possibleHiragana.put(Hiragana.of("ふ"), "fu");
        possibleHiragana.put(Hiragana.of("へ"), "he");
        possibleHiragana.put(Hiragana.of("ほ"), "ho");
        possibleHiragana.put(Hiragana.of("ま"), "ma");
        possibleHiragana.put(Hiragana.of("み"), "mi");
        possibleHiragana.put(Hiragana.of("む"), "mu");
        possibleHiragana.put(Hiragana.of("め"), "me");
        possibleHiragana.put(Hiragana.of("も"), "mo");
        possibleHiragana.put(Hiragana.of("や"), "ya");
        possibleHiragana.put(Hiragana.of("ゆ"), "yu");
        possibleHiragana.put(Hiragana.of("よ"), "yo");
        possibleHiragana.put(Hiragana.of("ら"), "ra");
        possibleHiragana.put(Hiragana.of("り"), "ri");
        possibleHiragana.put(Hiragana.of("る"), "ru");
        possibleHiragana.put(Hiragana.of("れ"), "re");
        possibleHiragana.put(Hiragana.of("ろ"), "ro");
        possibleHiragana.put(Hiragana.of("わ"), "wa");
        possibleHiragana.put(Hiragana.of("を"), "wo");
        possibleHiragana.put(Hiragana.of("ん"), "n");
        possibleHiragana.put(Hiragana.of("が"), "ga");
        possibleHiragana.put(Hiragana.of("ぎ"), "gi");
        possibleHiragana.put(Hiragana.of("ぐ"), "gu");
        possibleHiragana.put(Hiragana.of("げ"), "ge");
        possibleHiragana.put(Hiragana.of("ご"), "go");
        possibleHiragana.put(Hiragana.of("ざ"), "za");
        possibleHiragana.put(Hiragana.of("じ"), "ji");
        possibleHiragana.put(Hiragana.of("ず"), "zu");
        possibleHiragana.put(Hiragana.of("ぜ"), "ze");
        possibleHiragana.put(Hiragana.of("ぞ"), "zo");
        possibleHiragana.put(Hiragana.of("だ"), "da");
        possibleHiragana.put(Hiragana.of("ぢ"), "ji");
        possibleHiragana.put(Hiragana.of("づ"), "zu");
        possibleHiragana.put(Hiragana.of("で"), "de");
        possibleHiragana.put(Hiragana.of("ど"), "do");
        possibleHiragana.put(Hiragana.of("ば"), "ba");
        possibleHiragana.put(Hiragana.of("び"), "bi");
        possibleHiragana.put(Hiragana.of("ぶ"), "bu");
        possibleHiragana.put(Hiragana.of("べ"), "be");
        possibleHiragana.put(Hiragana.of("ぼ"), "bo");
        possibleHiragana.put(Hiragana.of("ぱ"), "pa");
        possibleHiragana.put(Hiragana.of("ぴ"), "pi");
        possibleHiragana.put(Hiragana.of("ぷ"), "pu");
        possibleHiragana.put(Hiragana.of("ぺ"), "pe");
        possibleHiragana.put(Hiragana.of("ぽ"), "po");
        return possibleHiragana;
    }
}
