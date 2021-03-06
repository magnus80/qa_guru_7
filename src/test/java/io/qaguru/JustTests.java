package io.qaguru;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static io.qameta.allure.Allure.step;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
import static org.junit.jupiter.api.Assertions.assertEquals;

class JustTests {

    @Test
    @Tag("positive")
    void successTest() {
        assertEquals(true, true);
    }

    @Test
    @Tag("negative")
    void negativeTest() {
        assertEquals(false, false);
    }

    @Test
    @DisplayName("Some negative test")
    void withStepTest() {
        step("Some step", () -> assertThat(false, is(false)));
    }
}
