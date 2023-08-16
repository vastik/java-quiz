package ru.quiz;

import org.junit.jupiter.api.Test;

import java.io.*;

public class StreamCaseTests {

    /**
     * Записать в файл2 все байты из файл1, но в обратном порядке. Закрыть потоки.
     */
    @Test
    public void reverseFileRead() throws IOException {
        File sourceFile = new File("workspace/dictionary.bin");
        File resultFile = new File("workspace/dictionary-reversed.bin");
    }
}
