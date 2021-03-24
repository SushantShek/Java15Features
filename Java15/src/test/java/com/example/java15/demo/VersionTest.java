package com.example.java15.demo;

import com.fasterxml.jackson.core.Version;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

@SpringBootTest

public class VersionTest {
    static final String errorVersionMustNotBeNull = "'version' must not be null!";
    static final String errorOtherMustNotBeNull = "'other' must not be null!";

//    @Test
//    public void exampleTest2() {
//        Version version = new Version("3.8.0-SNAPSHOT");
//        // ...
//    }


//        @Test
//        public void exampleTest() {
//            com.fasterxml.jackson.core.Version version = new Version("3.8.0");
//            // ...
//        }

//        @Test
//        public void exampleTest2() {
//            Version version = new Version("3.8.0-SNAPSHOT");
//            // ...
//        }

    // expected error messages:
    static final String errorVersionMustMatchPattern = "'version' must match: 'major.minor.patch(-SNAPSHOT)'!";

    public static void checkVersion(String str) {

        final String EXAMPLE_TEST = "This is my small example "
                + "string which I'm going to " + "use for pattern matching.";
        "\d+(\.\d+){0,2}(-SNAPSHOT)?"
        System.out.println(EXAMPLE_TEST.matches("\\w.*"));
        String[] splitString = (EXAMPLE_TEST.split("\"\\d+(\\.\\d+){0,2}(-SNAPSHOT)?\""));
        System.out.println(splitString.length);// should be 14
        for (String string : splitString) {
            System.out.println(string);
        }
        // replace all whitespace with tabs
        System.out.println(EXAMPLE_TEST.replaceAll("\\s+", "\t"));
    }

    // ... write your unit tests here ...
    @Test
    public void setErrorVersionMustNotBeNull() {
        String version = null;
        IllegalArgumentException thrown = assertThrows(
                IllegalArgumentException.class,
                () -> new Version(version),
                "Version must not be null"
        );

        assertTrue(thrown.getMessage().contains("Version must not be null"));

    }

    @Test
    public void exampleTest() {
        checkVersion("");
//        Version version = new Version("3.8.0");
        // ...
    }
}
