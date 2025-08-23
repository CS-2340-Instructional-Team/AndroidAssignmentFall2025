package com.example.android_assignment_fall_2025;

import org.junit.Test;

import static org.junit.Assert.*;

public class ExampleUnitTest {
    // TODO 7: Write a unit test for ensuring correct behavior of checkGuess in GameManagerSingleton
    @Test
    public void test_check_guess_behavior() {
        GameManagerSingleton gm = GameManagerSingleton.getInstance();
        gm.resetGame();

        int target = gm.getGuesses().size(); // just reset to be safe

        String feedbackLow = gm.checkGuess(0);
        assertEquals("Too Low!", feedbackLow);

        String feedbackHigh = gm.checkGuess(101);
        assertEquals("Too High!", feedbackHigh);
    }
}
