package org.generator.api;

import lombok.RequiredArgsConstructor;
import org.generator.KatakanaGenerator;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
public class KatakanaControllerTest {
    KatakanaGenerator katakanaGenerator = new KatakanaGenerator();
    KatakanaController katakanaController = new KatakanaController(katakanaGenerator);
    @Test
    public void shouldGenerateKatakanaList() {

        var katakanaString = katakanaController.generateKatakana(5);

        assertThat(katakanaString.size(), equalTo(5));
    }
}
