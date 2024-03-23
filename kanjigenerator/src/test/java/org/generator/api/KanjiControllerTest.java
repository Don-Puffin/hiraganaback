package org.generator.api;

import lombok.RequiredArgsConstructor;
import org.generator.KanjiGenerator;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
public class KanjiControllerTest {
    KanjiGenerator kanjiGenerator = new KanjiGenerator();
    KanjiController kanjiController = new KanjiController(kanjiGenerator);
    @Test
    public void shouldGenerateKanjiList() {

        var kanjiString = kanjiController.generateKanji(5);

        assertThat(kanjiString.size(), equalTo(5));
    }
}
