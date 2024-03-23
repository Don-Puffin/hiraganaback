package org.types;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class KatakanaTest {


    @Test
    public void shouldMakeKatakana() {
        var result = Katakana.of("ア", "a");

        assertThat(result.getValue(), equalTo("ア"));
        assertThat(result.getEnglishValue(), equalTo("a"));
    }

    @Test
    public void shouldMakeEnglishValueIntoLowerCase() {
        var result = Katakana.of("ア", "A");

        assertThat(result.getEnglishValue(), equalTo("a"));
    }

    @Test
    public void shouldNotMakeKatakanaWithNullValue() {
        IllegalArgumentException e = assertThrows(IllegalArgumentException.class, () -> Katakana.of(null, null));
        assertThat(e.getMessage(), equalTo("Cannot make katakana from null"));
    }

    @Test
    public void shouldNotMakeKatakanaWithNonKatakanaCharacters() {
        IllegalArgumentException e = assertThrows(IllegalArgumentException.class, () -> Katakana.of("A", "A"));
        assertThat(e.getMessage(), equalTo("Please use a katakana character for value and a valid English value for englishValue"));
    }
}
