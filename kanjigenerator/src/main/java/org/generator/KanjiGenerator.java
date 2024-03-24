package org.generator;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.CrossOrigin;

import org.types.Kanji;

import java.security.SecureRandom;
import java.util.*;
@CrossOrigin(origins = "http://localhost:3000")
@Component
public class KanjiGenerator {
    public Map<Kanji, String> kanjiGenerator(int size) {
        Random random = new SecureRandom();
        Map<Kanji, String> possibleKanji = makePossibleKanjiList();
        List<Map.Entry<Kanji, String>> kanjiEntries = new ArrayList<>(possibleKanji.entrySet());
        Map<Kanji, String> kanjiList = new HashMap<>();

        Collections.shuffle(kanjiEntries, random);

        int availableSize = kanjiEntries.size();
        if (size > availableSize) {
            throw new IllegalArgumentException("size is too large for kanji generator, please use 1 - " + makePossibleKanjiList().size());
        }

        for (int i = 0; i < size; i++) {
            Map.Entry<Kanji, String> kanjiEntry = kanjiEntries.get(i);
            kanjiList.put(kanjiEntry.getKey(), kanjiEntry.getValue());
        }
        return kanjiList;
    }
    

    private Map<Kanji, String> makePossibleKanjiList() {
        HashMap<Kanji, String> possibleKanji = new HashMap<>();
        possibleKanji.put(Kanji.of("一", "one"), "one");
        possibleKanji.put(Kanji.of("二", "two"), "two");
        possibleKanji.put(Kanji.of("三", "three"), "three");
        possibleKanji.put(Kanji.of("四", "four"), "four");
        possibleKanji.put(Kanji.of("五", "five"), "five");
        possibleKanji.put(Kanji.of("六", "six"), "six");
        possibleKanji.put(Kanji.of("七", "seven"), "seven");
        possibleKanji.put(Kanji.of("八", "eight"), "eight");
        possibleKanji.put(Kanji.of("九", "nine"), "nine");
        possibleKanji.put(Kanji.of("十", "ten"), "ten");
        possibleKanji.put(Kanji.of("百", "hundred"), "hundred");
        possibleKanji.put(Kanji.of("千", "thousand"), "thousand");
        possibleKanji.put(Kanji.of("万", "ten thousand"), "ten thousand");
        possibleKanji.put(Kanji.of("右", "right"), "right");
        possibleKanji.put(Kanji.of("左", "left"), "left");
        possibleKanji.put(Kanji.of("口", "mouth"), "mouth");
        possibleKanji.put(Kanji.of("目", "eye"), "eye");
        possibleKanji.put(Kanji.of("耳", "ear"), "ear");
        possibleKanji.put(Kanji.of("手", "hand"), "hand");
        possibleKanji.put(Kanji.of("足", "foot"), "foot");
        possibleKanji.put(Kanji.of("玉", "ball"), "ball");
        possibleKanji.put(Kanji.of("火", "fire"), "fire");
        possibleKanji.put(Kanji.of("水", "water"), "water");
        possibleKanji.put(Kanji.of("木", "tree"), "tree");
        possibleKanji.put(Kanji.of("日", "sun"), "sun");
        possibleKanji.put(Kanji.of("月", "moon"), "moon");
        possibleKanji.put(Kanji.of("田", "rice field"), "rice field");
        possibleKanji.put(Kanji.of("山", "mountain"), "mountain");
        possibleKanji.put(Kanji.of("川", "river"), "river");
        possibleKanji.put(Kanji.of("土", "soil"), "soil");
        possibleKanji.put(Kanji.of("王", "king"), "king");
        possibleKanji.put(Kanji.of("石", "stone"), "stone");
        possibleKanji.put(Kanji.of("青", "blue"), "blue");
        possibleKanji.put(Kanji.of("空", "sky"), "sky");
        possibleKanji.put(Kanji.of("中", "inside"), "inside");
        possibleKanji.put(Kanji.of("町", "town"), "town");
        possibleKanji.put(Kanji.of("雨", "rain"), "rain");
        possibleKanji.put(Kanji.of("花", "flower"), "flower");
        possibleKanji.put(Kanji.of("草", "grass"), "grass");
        possibleKanji.put(Kanji.of("林", "woods"), "woods");
        possibleKanji.put(Kanji.of("本", "book"), "book");
        possibleKanji.put(Kanji.of("村", "village"), "village");
        possibleKanji.put(Kanji.of("男", "man"), "man");
        possibleKanji.put(Kanji.of("女", "woman"), "woman");
        possibleKanji.put(Kanji.of("母", "mother"), "mother");
        possibleKanji.put(Kanji.of("父", "father"), "father");
        possibleKanji.put(Kanji.of("牛", "cow"), "cow");
        possibleKanji.put(Kanji.of("魚", "fish"), "fish");
        possibleKanji.put(Kanji.of("虫", "insect"), "insect");
        possibleKanji.put(Kanji.of("鳥", "bird"), "bird");
        possibleKanji.put(Kanji.of("食", "eat"), "eat");
        possibleKanji.put(Kanji.of("飲", "drink"), "drink");

        return possibleKanji;
    }
}