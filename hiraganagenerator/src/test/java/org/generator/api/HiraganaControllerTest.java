package org.generator.api;

import lombok.RequiredArgsConstructor;
import org.generator.HiraganaGenerator;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
public class HiraganaControllerTest {
    HiraganaGenerator hiraganaGenerator = new HiraganaGenerator();
    HiraganaController hiraganaController = new HiraganaController(hiraganaGenerator);
    @Test
    public void shouldGenerateHiraganaList() {

        var hiraganaString = hiraganaController.generateHiragana(5);

        assertThat(hiraganaString.size(), equalTo(5));
    }
}
