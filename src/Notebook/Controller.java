package Notebook;

import java.util.Scanner;

public class Controller {

    private Model model;
    private View view;

    private static String NAMES = "[а-яА-Яa-zA-Z]{2,}[-]?[а-яА-Яa-zA-Z]*\\s*";
    private static String UNNUL = "[\\D]+.*";
    private static String NUM_COUSE = "[\\d]{1}";
    private static String DOM_TEL = "[\\d]{6}";
    private static String MOD_TEL = "[+]?([3]{1}[8]{1})?[0]{1}[\\d]{9}";
    private static String EMAIL2 = "[\\d\\D]+[@]{1}[g]?[m]{1}[a]{1}[i]{1}[l]{1}[.]{1}(([c]{1}[o]{1}[m]{1})?([r]{1}(u){1})?){1}]";
    private static String EMAIL = "[\\d\\D]+[@]{1}[\\D]+[.]{1}[\\D]+";
    private static String SKYPE = "[a-zA-Z]{3,}";
    private static String INDEX = "[\\d]{5}";
    private static String DOM = "[\\d]+.*";
    private static String KV = "[^0][\\d]+";

    Scanner sc = new Scanner(System.in);

    public Controller(Model model, View view){
        this.model = model;
        this.view = view;
    }


    public void startProgram(){
        enterName();
        enterAddInfo();
        enterConnect();
        enterAddress();
        model.setDate();
        model.printInfo();

    }

    private void enterName(){
        String surname, name, batko;
        view.entrSMTH(view.SURNAME);
        while (!(surname = sc.nextLine()).matches(NAMES)) {
            view.entrSMTH(view.INCOR_SURNAME);
        }
        view.entrSMTH(view.NAME);
        while (!(name = sc.nextLine()).matches(NAMES)) {
            view.entrSMTH(view.INCOR_NAME);
        }
        view.entrSMTH(view.BATKO);
        while (!(batko = sc.nextLine()).matches(NAMES)) {
            view.entrSMTH(view.INCOR_BATKO);
        }
        model.setFIO(surname, name, batko);
    }

    private void enterAddInfo(){
        String nick, com, gr, c;
        Group group = null;
        boolean loop = true;
        view.entrSMTH(view.NICK);
        while (!(nick = sc.nextLine()).matches(UNNUL)) {
            view.entrSMTH(view.INCOR_NIKC);
        }
        model.setNick(nick);
        view.entrSMTH(view.COM);
        com = sc.nextLine();
        model.setCom(com);
        view.entrSMTH(view.GROUP);
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
                    view.entrSMTH(view.INCOR_GROUP);
                    for (Group el: Group.values()){
                        System.out.print(el + " ");
                    }
                    System.out.println();
                    break;
            }
        }
        view.entrSMTH(view.COURSE);
        while (!((c = sc.nextLine()).matches(NUM_COUSE) && (Integer.parseInt(c) > 0 && Integer.parseInt(c) < 7 ))) {
            view.entrSMTH(view.INCOR_COURSE);
        }
        model.setGroup(group, Integer.parseInt(c));

    }

    private void enterConnect(){
        String s;
        view.entrSMTH(view.DOM_TEL);
        while (!(s = sc.nextLine()).matches(DOM_TEL)) {
            view.entrSMTH(view.INCOR_TEL);
        }
        model.setDom_tel(s);

        view.entrSMTH(view.MOD_TEL);
        while (!(s = sc.nextLine()).matches(MOD_TEL)){
            view.entrSMTH(view.INCOR_TEL);
        }
        model.setMod_tel(s);

        view.entrSMTH(view.ADD_MOD_TEL);
        while (!((s = sc.nextLine()).matches(MOD_TEL) || s.equals("-"))){
            view.entrSMTH(view.INCOR_TEL);
        }
        model.setMod_tel_add(s);

        view.entrSMTH(view.EMAIL);
        while (!(s = sc.nextLine()).matches(EMAIL)){
            view.entrSMTH(view.INCOR_EMAIL);
        }
        model.setEmail(s);

        view.entrSMTH(view.SKYPE);
        while (!(s = sc.nextLine()).matches(SKYPE)){
            view.entrSMTH(view.INCOR_SKYPE);
        }
        model.setSkype(s);
    }

    private void enterAddress(){
        String index, city, street, dom, kv;

        view.entrSMTH(view.INDEX);
        while (!(index = sc.nextLine()).matches(INDEX)) {
            view.entrSMTH(view.INCOR_INDEX);
        }

        view.entrSMTH(view.CITY);
        while (!(city = sc.nextLine()).matches(NAMES)) {
            view.entrSMTH(view.INCOR_CITY);
        }

        view.entrSMTH(view.STREET);
        while (!(street = sc.nextLine()).matches(NAMES)) {
            view.entrSMTH(view.INCOR_STREET);
        }

        view.entrSMTH(view.DOM);
        while (!(dom = sc.nextLine()).matches(DOM)) {
            view.entrSMTH(view.INCOR_DOM);
        }

        view.entrSMTH(view.KB);
        while (!((kv = sc.nextLine()).matches(KV) || kv.equals("-"))) {
            view.entrSMTH(view.INCOR_KB);
        }

        model.setAddress(index,city,street,dom,kv);
    }

}
