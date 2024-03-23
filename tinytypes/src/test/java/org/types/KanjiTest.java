package org.types;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class KanjiTest {


    @Test
    public void shouldMakeKanji() {
        var result = Kanji.of("月", "moon");

        assertThat(result.getValue(), equalTo("月"));
        assertThat(result.getEnglishValue(), equalTo("moon"));
    }

    @Test
    public void shouldMakeEnglishValueIntoLowerCase() {
        var result = Kanji.of("月", "MOON");

        assertThat(result.getEnglishValue(), equalTo("moon"));
    }

    @Test
    public void shouldNotMakeKanjiWithNullValue() {
        IllegalArgumentException e = assertThrows(IllegalArgumentException.class, () -> Kanji.of(null, null));
        assertThat(e.getMessage(), equalTo("Cannot make kanji from null"));
    }

    @Test
    public void shouldNotMakeKanjiWithNonKanjiCharacters() {
        IllegalArgumentException e = assertThrows(IllegalArgumentException.class, () -> Kanji.of("A", "A"));
        assertThat(e.getMessage(), equalTo("Please use a kanji character for value and a valid English value for englishValue"));
    }
}
