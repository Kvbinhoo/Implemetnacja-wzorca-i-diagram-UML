package app;

import app.model.KeyboardProducer;
import app.model.Writer;

public class Main {
    public static void main(String[] args) {
        Writer writer = new Writer(new KeyboardProducer());
        writer.run();
    }
}
