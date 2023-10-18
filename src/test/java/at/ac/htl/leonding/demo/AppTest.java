package at.ac.htl.leonding.demo;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
class AppTest {
    /**
     * Rigorous Test.
     */
    @Test
    void testApp() {
        assertEquals(1, 1);
    }

    @Test
    public void given_add_function_when_adding_2_and_3_then_result_5() {
        var app = new App();
        var result = app.add(2, 3);
        assertEquals(5, result);
    }
}