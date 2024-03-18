package org.generator.api;

import lombok.RequiredArgsConstructor;
import org.junit.jupiter.api.Test;
@RequiredArgsConstructor
public class HiraganaControllerTest {

    private final HiraganaController hiraganaController;
    @Test
    public void shouldGenerateHiragana() {

        var hiraganaString = hiraganaController.generateHiragana(5);

        System.out.println(hiraganaString);

    }
}
