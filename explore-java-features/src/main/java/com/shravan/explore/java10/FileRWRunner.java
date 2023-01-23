package com.shravan.explore.java10;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Collections;

public class FileRWRunner {

    public static void main(String[] args) throws IOException {
        Path path = Paths.get("./resources/sample.txt");
        String content = Files.readString(path);
        System.out.println("content = " + content);
        String newContent = content.replace("line", "something else");

        Path writePath = Paths.get("./resources/sample-write.txt");
        Files.write(writePath, Collections.singleton(newContent));
    }
}
