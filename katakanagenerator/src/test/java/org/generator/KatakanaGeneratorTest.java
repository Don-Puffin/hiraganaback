package org.generator;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class KatakanaGeneratorTest {

    KatakanaGenerator katakanaGenerator = new KatakanaGenerator();

    @ParameterizedTest
    @ValueSource(ints = {1,2,3,4,5})
    public void shouldGenerateRandomKatakana(int size) {

        var result = katakanaGenerator.katakanaGenerator(size);

        assertThat(result.size(), equalTo(size));
    }
    @Test
    public void shouldNotGenerateRandomKatakanaWithInvalidSize() {

        IllegalArgumentException e = assertThrows(IllegalArgumentException.class, () -> katakanaGenerator.katakanaGenerator(80));

        assertThat(e.getMessage(), equalTo("size is too large for katakana generator, please use 1 - 71"));
    }
}
