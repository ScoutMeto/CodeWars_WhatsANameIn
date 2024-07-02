package org.example;

public class Kata {
    public static boolean nameInStr(String str, String name) {
        str = str.toLowerCase().trim();
        name = name.toLowerCase().trim();

        int nameIndex = 0;

        for (int i = 0; i < str.length(); i++) {
            char currentChar = str.charAt(i);
            if (nameIndex < name.length() && currentChar == name.charAt(nameIndex)) {
                nameIndex++;
            }
        }

        return nameIndex == name.length();
    }
}


/*
TESTING

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import org.junit.runners.JUnit4;

public class SolutionTest {
    @Test
    public void sampleTest() {
        assertEquals(true, Kata.nameInStr("Across the rivers", "chris"));
        assertEquals(false, Kata.nameInStr("Next to a lake", "chris"));
        assertEquals(false, Kata.nameInStr("Under a sea", "chris"));
        assertEquals(false, Kata.nameInStr("A crew that boards the ship", "chris"));
        assertEquals(false, Kata.nameInStr("A live son", "Allison"));
    }
}
 */