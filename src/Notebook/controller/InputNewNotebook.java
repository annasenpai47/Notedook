package Notebook.controller;

import Notebook.view.View;

import java.util.Scanner;

import static Notebook.controller.RegexForInput.*;
import static Notebook.view.TextConstant.*;

public class InputNewNotebook {
    private View view;
    private Scanner sc;

    CorrectInput utilityController = new CorrectInput(sc, view);

    public InputNewNotebook(View view, Scanner sc) {
        this.view = view;
        this.sc = sc;
    }

    public void inputName() {
        String s = utilityController.inputStringValueWithScanner(SURNAME, NAMES);
        view.printSMTH(s);

    }


}
