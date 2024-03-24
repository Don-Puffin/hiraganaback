package org.generator;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class KanjiGeneratorTest {

    KanjiGenerator kanjiGenerator = new KanjiGenerator();

    @ParameterizedTest
    @ValueSource(ints = {1,2,3,4,5})
    public void shouldGenerateRandomKanji(int size) {

        var result = kanjiGenerator.kanjiGenerator(size);

        assertThat(result.size(), equalTo(size));
    }
    @Test
    public void shouldNotGenerateRandomKanjiWithInvalidSize() {

        IllegalArgumentException e = assertThrows(IllegalArgumentException.class, () -> kanjiGenerator.kanjiGenerator(80));

        assertThat(e.getMessage(), equalTo("size is too large for kanji generator, please use 1 - 52"));
    }
}
