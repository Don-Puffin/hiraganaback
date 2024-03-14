package org.generator;

import org.types.Hiragana;

public class HiraganaPair {
    private Hiragana hiragana;
    private String englishValue;
    private String japaneseValue;

    public HiraganaPair(Hiragana hiragana, String englishValue, String japaneseValue) {
        this.hiragana = hiragana;
        this.englishValue = englishValue;
        this.japaneseValue = japaneseValue;
    }

    public Hiragana getHiragana() {
        return hiragana;
    }

    public String getEnglishValue() {
        return englishValue;
    }

    public String getJapaneseValue() {
        return japaneseValue;
    }
}
