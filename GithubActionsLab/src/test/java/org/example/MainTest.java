package org.example;

import junit.framework.TestCase;

public class MainTest extends TestCase {

    public void testHypotenuse() {
            assertEquals(Main.hypotenuse(10, 20),
                    22.360679774997898);
        }

}