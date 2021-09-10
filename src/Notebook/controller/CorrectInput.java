package Notebook.controller;

import Notebook.view.View;

import java.util.Scanner;

public class CorrectInput {
    private Scanner scanner;
    private View view;

    public CorrectInput(Scanner scanner, View view) {
        this.scanner = scanner;
        this.view = view;
    }

    String inputStringValueWithScanner(String message, String regex) {
        String res;
        view.printStringInput(message);
        while( !(scanner.hasNext() && (res = scanner.next()).matches(regex))) {
            view.printWrongStringInput(message);
        }
        return res;
    }
}