package Notebook.controller;

import Notebook.model.Group;
import Notebook.view.View;

import java.util.Scanner;

import static Notebook.controller.RegexForInput.*;
import static Notebook.view.TextConstant.*;

public class InputNewNotebook {
    private View view;
    private Scanner sc;

    public InputNewNotebook(View view, Scanner sc) {
        this.view = view;
        this.sc = sc;
    }

    public String[] inputName() {

        CorrectInput utilityController = new CorrectInput(sc, view);
        String[] s = new String[3];
        s[0] = utilityController.inputStringValueWithScanner(SURNAME, NAMES_REGEX);
        s[1] = utilityController.inputStringValueWithScanner(NAME, NAMES_REGEX);
        s[2] = utilityController.inputStringValueWithScanner(BATKO, NAMES_REGEX);
        return s;
    }

    public String inputNick() {
        CorrectInput utilityController = new CorrectInput(sc, view);
        return utilityController.inputStringValueWithScanner(NICK, NICK_REGEX);
    }

    public String inputCom(){
        CorrectInput utilityController = new CorrectInput(sc, view);
        return utilityController.inputStringValueWithScanner(COM, UNNUL_REGEX);
    }

    public Group inputCroup(){
        Scanner sc2 = new Scanner(System.in);
        String nick, com, gr, c;
        Group group = null;
        boolean loop = true;
        view.printStringInput(GROUP);
        while (loop){
            gr = sc2.nextLine();
            switch (gr){
                case "AND":
                    group = Group.AND;
                    loop = false;
                    break;
                case "PP":
                    group = Group.PP;
                    loop = false;
                    break;
                case "KN":
                    group = Group.KN;
                    loop = false;
                    break;
                default:
                    view.printStringInput(WRONG_GROUP);
                    for (Group el: Group.values()){
                        System.out.print(el + " ");
                    }
                    System.out.println();
                    break;
            }
        }
    return group;
    }

    public int inputCourse(){
        CorrectInput utilityController = new CorrectInput(sc, view);
        return Integer.parseInt(utilityController.inputStringValueWithScanner(COURSE, COUSE_REGEX));
    }

    public String inputDomTel(){
        CorrectInput utilityController = new CorrectInput(sc, view);
        return utilityController.inputStringValueWithScanner(DOM_TEL, DOM_TEL_REGEX);
    }

    public String inputMobTel(){
        CorrectInput utilityController = new CorrectInput(sc, view);
        return utilityController.inputStringValueWithScanner(MOD_TEL, MOD_TEL_REGEX);
    }

    public String inputDopMobTel(){
        view.printStringInput(ADD_MOD_TEL);
        String s;
        Scanner sc2 = new Scanner(System.in);
        while (!((s = sc2.nextLine()).matches(MOD_TEL_REGEX) || s.equals("-"))){
            view.printStringInput(WRONG_DATA);

        }
        return s;
    }

    public String inputEmail(){
        CorrectInput utilityController = new CorrectInput(sc, view);
        return utilityController.inputStringValueWithScanner(EMAIL, EMAIL_REGEX);
    }
    public String inputSkype(){
        CorrectInput utilityController = new CorrectInput(sc, view);
        return utilityController.inputStringValueWithScanner(SKYPE, SKYPE_REGEX);
    }
    public String inputIndex(){
        CorrectInput utilityController = new CorrectInput(sc, view);
        return utilityController.inputStringValueWithScanner(INDEX, INDEX_REGEX);
    }
    public String inputCity(){
        CorrectInput utilityController = new CorrectInput(sc, view);
        return utilityController.inputStringValueWithScanner(CITY, NAMES_REGEX);
    }
    public String inputStreet(){
        CorrectInput utilityController = new CorrectInput(sc, view);
        return utilityController.inputStringValueWithScanner(STREET, NAMES_REGEX);
    }
    public String inputDom(){
        CorrectInput utilityController = new CorrectInput(sc, view);
        return utilityController.inputStringValueWithScanner(DOM, DOM_REGEX);
    }
    public String inputApart(){
        CorrectInput utilityController = new CorrectInput(sc, view);
        return utilityController.inputStringValueWithScanner(APART, KV_REGEX);
    }
}