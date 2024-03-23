package org.types;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Getter
public class Kanji {

    private final String value;
    private final String englishValue;

    public static Kanji of(String value, String englishValue) {
        if (value == null || englishValue == null) {
            throw new IllegalArgumentException("Cannot make kanji from null");
        }
        if (!value.matches("[一-龯]") || !englishValue.matches("[a-zA-Z\\s]+")) {
            throw new IllegalArgumentException("Please use a kanji character for value and a valid English value for englishValue");
        }
        return new Kanji(value, englishValue.toLowerCase());
    }
}
