package org.types;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class HiraganaTest {

    @Test
    public void shouldMakeHiragana() {
        var result = Hiragana.of("\\u3042");

        assertThat(result.getValue(), equalTo("\\u3042"));
    }

    @Test
    public void shouldNotMakeHiraganaWithNullValue() {
        IllegalArgumentException e = assertThrows(IllegalArgumentException.class, () -> Hiragana.of(null));
        assertThat(e.getMessage(), equalTo("Cannot make hiragana from null"));
    }

    @Test
    public void shouldNotMakeHiraganaWithNonHiraganaCharacters() {
        IllegalArgumentException e = assertThrows(IllegalArgumentException.class, () -> Hiragana.of("A"));
        assertThat(e.getMessage(), equalTo("Please use a hiragana character"));
    }
}
