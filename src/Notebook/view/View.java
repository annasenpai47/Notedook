package Notebook.view;

import java.util.Locale;
import java.util.ResourceBundle;

import static Notebook.view.TextConstant.*;

public class View {

    private static String MESSAGES_BUNDLE_NAME = "messages";

    public final static ResourceBundle bundle =
            ResourceBundle.getBundle(
                    MESSAGES_BUNDLE_NAME,
                    new Locale("ua"));
                    //new Locale("en"));

    public void printSMTH(String message){
        System.out.println(message);
    }

    private String concatenationString(String... message){
        StringBuilder concatString = new StringBuilder();
        for(String v : message) {concatString.append(v);}
        return new String(concatString);
    }


    public void printStringInput(String message) {
        printSMTH(bundle.getString(message));
    }

    public void printWrongStringInput(String message) {
        printSMTH(concatenationString(
                bundle.getString(WRONG_DATA),
                bundle.getString(message)));
    }
}