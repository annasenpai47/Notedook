package Notebook.controller;

import Notebook.view.View;

public interface RegexForInput {

    String NAMES_REGEX = View.bundle.getString("input.regex.name");
    String NICK_REGEX = "[A-Za-z0-9]{5,20}";
    String UNNUL_REGEX = ".*";
    String COUSE_REGEX = "[1-6]{1}";
    String DOM_TEL_REGEX = "[\\d]{6}";
    String MOD_TEL_REGEX = "([+]?[3]{1}[8]{1})?[0]{1}[\\d]{9}";
    String EMAIL_REGEX = "[\\d\\D]+[@]{1}[\\D]+[.]{1}[\\D]+";
    String SKYPE_REGEX = "[a-zA-Z]{3,}";
    String INDEX_REGEX = "[\\d]{5}";
    String DOM_REGEX = "[\\d]+.*";
    String KV_REGEX = "[^0][\\d]+";
}