package org.generator;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.types.Katakana;

import java.security.SecureRandom;
import java.util.*;
@CrossOrigin(origins = "http://localhost:3000")
@Component
public class KatakanaGenerator {
    public Map<Katakana, String> katakanaGenerator(int size) {
        Random random = new SecureRandom();
        Map<Katakana, String> possibleKatakana = makePossibleKatakanaList();
        List<Map.Entry<Katakana, String>> katakanaEntries = new ArrayList<>(possibleKatakana.entrySet());
        Map<Katakana, String> katakanaList = new HashMap<>();

        Collections.shuffle(katakanaEntries, random);

        int availableSize = katakanaEntries.size();
        if (size > availableSize) {
            throw new IllegalArgumentException("size is too large for katakana generator, please use 1 - " + makePossibleKatakanaList().size());
        }

        for (int i = 0; i < size; i++) {
            Map.Entry<Katakana, String> katakanaEntry = katakanaEntries.get(i);
            katakanaList.put(katakanaEntry.getKey(), katakanaEntry.getValue());
        }
        return katakanaList;
    }

    private Map<Katakana, String> makePossibleKatakanaList() {
        HashMap<Katakana, String> possibleKatakana = new HashMap<>();
        possibleKatakana.put(Katakana.of("ア", "a"), "a");
        possibleKatakana.put(Katakana.of("イ", "i"), "i");
        possibleKatakana.put(Katakana.of("ウ", "u"), "u");
        possibleKatakana.put(Katakana.of("エ", "e"), "e");
        possibleKatakana.put(Katakana.of("オ", "o"), "o");
        possibleKatakana.put(Katakana.of("カ", "ka"), "ka");
        possibleKatakana.put(Katakana.of("キ", "ki"), "ki");
        possibleKatakana.put(Katakana.of("ク", "ku"), "ku");
        possibleKatakana.put(Katakana.of("ケ", "ke"), "ke");
        possibleKatakana.put(Katakana.of("コ", "ko"), "ko");
        possibleKatakana.put(Katakana.of("サ", "sa"), "sa");
        possibleKatakana.put(Katakana.of("シ", "shi"), "shi");
        possibleKatakana.put(Katakana.of("ス", "su"), "su");
        possibleKatakana.put(Katakana.of("セ", "se"), "se");
        possibleKatakana.put(Katakana.of("ソ", "so"), "so");
        possibleKatakana.put(Katakana.of("タ", "ta"), "ta");
        possibleKatakana.put(Katakana.of("チ", "chi"), "chi");
        possibleKatakana.put(Katakana.of("ツ", "tsu"), "tsu");
        possibleKatakana.put(Katakana.of("テ", "te"), "te");
        possibleKatakana.put(Katakana.of("ト", "to"), "to");
        possibleKatakana.put(Katakana.of("ナ", "na"), "na");
        possibleKatakana.put(Katakana.of("ニ", "ni"), "ni");
        possibleKatakana.put(Katakana.of("ヌ", "nu"), "nu");
        possibleKatakana.put(Katakana.of("ネ", "ne"), "ne");
        possibleKatakana.put(Katakana.of("ノ", "no"), "no");
        possibleKatakana.put(Katakana.of("ハ", "ha"), "ha");
        possibleKatakana.put(Katakana.of("ヒ", "hi"), "hi");
        possibleKatakana.put(Katakana.of("フ", "fu"), "fu");
        possibleKatakana.put(Katakana.of("ヘ", "he"), "he");
        possibleKatakana.put(Katakana.of("ホ", "ho"), "ho");
        possibleKatakana.put(Katakana.of("マ", "ma"), "ma");
        possibleKatakana.put(Katakana.of("ミ", "mi"), "mi");
        possibleKatakana.put(Katakana.of("ム", "mu"), "mu");
        possibleKatakana.put(Katakana.of("メ", "me"), "me");
        possibleKatakana.put(Katakana.of("モ", "mo"), "mo");
        possibleKatakana.put(Katakana.of("ヤ", "ya"), "ya");
        possibleKatakana.put(Katakana.of("ユ", "yu"), "yu");
        possibleKatakana.put(Katakana.of("ヨ", "yo"), "yo");
        possibleKatakana.put(Katakana.of("ラ", "ra"), "ra");
        possibleKatakana.put(Katakana.of("リ", "ri"), "ri");
        possibleKatakana.put(Katakana.of("ル", "ru"), "ru");
        possibleKatakana.put(Katakana.of("レ", "re"), "re");
        possibleKatakana.put(Katakana.of("ロ", "ro"), "ro");
        possibleKatakana.put(Katakana.of("ワ", "wa"), "wa");
        possibleKatakana.put(Katakana.of("ヲ", "wo"), "wo");
        possibleKatakana.put(Katakana.of("ン", "n"), "n");
        possibleKatakana.put(Katakana.of("ガ", "ga"), "ga");
        possibleKatakana.put(Katakana.of("ギ", "gi"), "gi");
        possibleKatakana.put(Katakana.of("グ", "gu"), "gu");
        possibleKatakana.put(Katakana.of("ゲ", "ge"), "ge");
        possibleKatakana.put(Katakana.of("ゴ", "go"), "go");
        possibleKatakana.put(Katakana.of("ザ", "za"), "za");
        possibleKatakana.put(Katakana.of("ジ", "ji"), "ji");
        possibleKatakana.put(Katakana.of("ズ", "zu"), "zu");
        possibleKatakana.put(Katakana.of("ゼ", "ze"), "ze");
        possibleKatakana.put(Katakana.of("ゾ", "zo"), "zo");
        possibleKatakana.put(Katakana.of("ダ", "da"), "da");
        possibleKatakana.put(Katakana.of("ヂ", "dji"), "ji");
        possibleKatakana.put(Katakana.of("ヅ", "dzu"), "dzu");
        possibleKatakana.put(Katakana.of("デ", "de"), "de");
        possibleKatakana.put(Katakana.of("ド", "do"), "do");
        possibleKatakana.put(Katakana.of("バ", "ba"), "ba");
        possibleKatakana.put(Katakana.of("ビ", "bi"), "bi");
        possibleKatakana.put(Katakana.of("ブ", "bu"), "bu");
        possibleKatakana.put(Katakana.of("ベ", "be"), "be");
        possibleKatakana.put(Katakana.of("ボ", "bo"), "bo");
        possibleKatakana.put(Katakana.of("パ", "pa"), "pa");
        possibleKatakana.put(Katakana.of("ピ", "pi"), "pi");
        possibleKatakana.put(Katakana.of("プ", "pu"), "pu");
        possibleKatakana.put(Katakana.of("ペ", "pe"), "pe");
        possibleKatakana.put(Katakana.of("ポ", "po"), "po");
        return possibleKatakana;
    }
}