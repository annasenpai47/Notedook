package Notebook.controller;

public interface RegexForInput {

    //String NAMES = "input.regex.name";
    String NAMES = "[\\d]*";
    String UNNUL = "[\\D]+.*";
    String NUM_COUSE = "[\\d]{1}";
    String DOM_TEL = "[\\d]{6}";
    String MOD_TEL = "[+]?([3]{1}[8]{1})?[0]{1}[\\d]{9}";
    String EMAIL = "[\\d\\D]+[@]{1}[\\D]+[.]{1}[\\D]+";
    String SKYPE = "[a-zA-Z]{3,}";
    String INDEX = "[\\d]{5}";
    String DOM = "[\\d]+.*";
    String KV = "[^0][\\d]+";
}