package app.model;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileProducer implements Producer{

    private final BufferedReader reader;

    public FileProducer(String filename) throws IOException {
        reader = new BufferedReader(new FileReader(filename));
    }

    @Override
    public String produce() throws Exception {
        return reader.readLine();
    }
}