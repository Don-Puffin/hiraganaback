package org.types;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Getter
public class Hiragana {

    private final String value;
    private final String englishValue;

    public static Hiragana of(String value, String englishValue) {
        if (value == null || englishValue == null) {
            throw new IllegalArgumentException("Cannot make hiragana from null");
        }
        if (!value.matches("[ぁ-んゔ゛]") || !englishValue.matches("[a-z]+")) {
            throw new IllegalArgumentException("Please use a hiragana character for value and a valid English value for englishValue");
        }
        return new Hiragana(value, englishValue);
    }
}
