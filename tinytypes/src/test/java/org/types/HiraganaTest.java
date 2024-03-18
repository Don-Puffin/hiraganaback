package org.types;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class HiraganaTest {


    @Test
    public void shouldMakeHiragana() {
        var result = Hiragana.of("あ", "a");

        assertThat(result.getValue(), equalTo("あ"));
        assertThat(result.getEnglishValue(), equalTo("a"));
    }

    @Test
    public void shouldMakeEnglishValueIntoLowerCase() {
        var result = Hiragana.of("あ", "A");

        assertThat(result.getEnglishValue(), equalTo("a"));
    }

    @Test
    public void shouldNotMakeHiraganaWithNullValue() {
        IllegalArgumentException e = assertThrows(IllegalArgumentException.class, () -> Hiragana.of(null, null));
        assertThat(e.getMessage(), equalTo("Cannot make hiragana from null"));
    }

    @Test
    public void shouldNotMakeHiraganaWithNonHiraganaCharacters() {
        IllegalArgumentException e = assertThrows(IllegalArgumentException.class, () -> Hiragana.of("A", "A"));
        assertThat(e.getMessage(), equalTo("Please use a hiragana character for value and a valid English value for englishValue"));
    }
}
