package org.types;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Getter
public class Katakana {

    private final String value;
    private final String englishValue;

    public static Katakana of(String value, String englishValue) {
        if (value == null || englishValue == null) {
            throw new IllegalArgumentException("Cannot make katakana from null");
        }
        if (!value.matches("[ァ-ヴヽヾ゛゜ー]") || !englishValue.matches("[a-zA-Z]+")) {
            throw new IllegalArgumentException("Please use a katakana character for value and a valid English value for englishValue");
        }
        return new Katakana(value, englishValue.toLowerCase());
    }
}
