package Notebook.controller;

import Notebook.model.Group;
import Notebook.model.Model;
import Notebook.view.View;

import java.util.Scanner;
import static Notebook.view.TextConstant.*;



public class Controller {

    private Model model;
    private View view;

    private static final String NAMES = "[а-яА-Яa-zA-Z]{2,}[-]?[а-яА-Яa-zA-Z]*\\s*";
    private static final String UNNUL = "[\\D]+.*";
    private static final String NUM_COUSE = "[\\d]{1}";
    private static final String DOM_TEL = "[\\d]{6}";
    private static final String MOD_TEL = "[+]?([3]{1}[8]{1})?[0]{1}[\\d]{9}";
    private static final String EMAIL2 = "[\\d\\D]+[@]{1}[g]?[m]{1}[a]{1}[i]{1}[l]{1}[.]{1}(([c]{1}[o]{1}[m]{1})?([r]{1}(u){1})?){1}]";
    private static final String EMAIL = "[\\d\\D]+[@]{1}[\\D]+[.]{1}[\\D]+";
    private static final String SKYPE = "[a-zA-Z]{3,}";
    private static final String INDEX = "[\\d]{5}";
    private static final String DOM = "[\\d]+.*";
    private static final String KV = "[^0][\\d]+";

    Scanner sc = new Scanner(System.in);

    public Controller(Model model, View view){
        this.model = model;
        this.view = view;
    }

    public void registration(){
        InputNewNotebook inputNewNotebook = new InputNewNotebook(view,sc);


    }
/*
    public void startProgram(){
        enterName();
        enterAddInfo();
        enterConnect();
        enterAddress();
        model.setDate();
        model.printInfo();




    }*/
/*
    private void enterName(){
        String surname, name, batko;
        view.printSMTH(SURNAME);
        while (!(surname = sc.nextLine()).matches(NAMES)) {
            view.printSMTH(WRONG_DATA);
        }
        view.printSMTH(NAME);
        while (!(name = sc.nextLine()).matches(NAMES)) {
            view.printSMTH(WRONG_DATA);
        }
        view.printSMTH(BATKO);
        while (!(batko = sc.nextLine()).matches(NAMES)) {
            view.printSMTH(WRONG_DATA);
        }
        model.setFIO(surname, name, batko);
    }

    private void enterAddInfo(){
        String nick, com, gr, c;
        Group group = null;
        boolean loop = true;
        view.printSMTH(NICK);
        while (!(nick = sc.nextLine()).matches(UNNUL)) {
            view.printSMTH(WRONG_DATA);
        }
        model.setNick(nick);
        view.printSMTH(COM);
        com = sc.nextLine();
        model.setCom(com);
        view.printSMTH(GROUP);
        while (loop){
            gr = sc.nextLine();
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
                    view.printSMTH(WRONG_GROUP);
                    for (Group el: Group.values()){
                        System.out.print(el + " ");
                    }
                    System.out.println();
                    break;
            }
        }
        view.printSMTH(COURSE);
        while (!((c = sc.nextLine()).matches(NUM_COUSE) && (Integer.parseInt(c) > 0 && Integer.parseInt(c) < 7 ))) {
            view.printSMTH(WRONG_COURSE);
        }
        model.setGroup(group, Integer.parseInt(c));

    }

    private void enterConnect(){
        String s;
        view.printSMTH(DOM_TEL);
        while (!(s = sc.nextLine()).matches(DOM_TEL)) {
            view.printSMTH(WRONG_DATA);
        }
        model.setDom_tel(s);

        view.printSMTH(MOD_TEL);
        while (!(s = sc.nextLine()).matches(MOD_TEL)){
            view.printSMTH(WRONG_DATA);
        }
        model.setMod_tel(s);

        view.printSMTH(ADD_MOD_TEL);
        while (!((s = sc.nextLine()).matches(MOD_TEL) || s.equals("-"))){
            view.printSMTH(WRONG_DATA);
        }
        model.setMod_tel_add(s);

        view.printSMTH(EMAIL);
        while (!(s = sc.nextLine()).matches(EMAIL)){
            view.printSMTH(WRONG_DATA);
        }
        model.setEmail(s);

        view.printSMTH(SKYPE);
        while (!(s = sc.nextLine()).matches(SKYPE)){
            view.printSMTH(WRONG_DATA);
        }
        model.setSkype(s);
    }

    private void enterAddress(){
        String index, city, street, dom, kv;

        view.printSMTH(INDEX);
        while (!(index = sc.nextLine()).matches(INDEX)) {
            view.printSMTH(WRONG_DATA);
        }

        view.printSMTH(CITY);
        while (!(city = sc.nextLine()).matches(NAMES)) {
            view.printSMTH(WRONG_DATA);
        }

        view.printSMTH(STREET);
        while (!(street = sc.nextLine()).matches(NAMES)) {
            view.printSMTH(WRONG_DATA);
        }

        view.printSMTH(DOM);
        while (!(dom = sc.nextLine()).matches(DOM)) {
            view.printSMTH(WRONG_DATA);
        }

        view.printSMTH(APART);
        while (!((kv = sc.nextLine()).matches(KV) || kv.equals("-"))) {
            view.printSMTH(WRONG_DATA);
        }

        model.setAddress(index,city,street,dom,kv);
    }
*/
}
