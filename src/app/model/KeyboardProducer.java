package app.model;

import java.util.Scanner;

public class KeyboardProducer implements Producer{

    private final Scanner scanner;

    public KeyboardProducer() {
        this.scanner = new Scanner(System.in);
    }

    @Override
    public String produce() throws Exception {
        String result = scanner.nextLine();
        if(result.equals("end")) return null;
        return result;
    }
}
