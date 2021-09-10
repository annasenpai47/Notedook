package Notebook.controller;

import Notebook.model.Model;
import Notebook.view.View;

import java.util.Scanner;



public class Controller {

    private Model model;
    private View view;

    Scanner sc = new Scanner(System.in);

    public Controller(Model model, View view){
        this.model = model;
        this.view = view;
    }

    public void registration(){
        InputNewNotebook inputNewNotebook = new InputNewNotebook(view,sc);

        String [] s = inputNewNotebook.inputName();
        model.setFIO(s[0], s[1], s[2]);
        model.setNick(inputNewNotebook.inputNick());
        model.setCom(inputNewNotebook.inputCom());
        model.setGroup(inputNewNotebook.inputCroup(), inputNewNotebook.inputCourse());
        model.setDom_tel(inputNewNotebook.inputDomTel());
        model.setMod_tel(inputNewNotebook.inputMobTel());
        model.setMod_tel_add(inputNewNotebook.inputDopMobTel());
        model.setEmail(inputNewNotebook.inputEmail());
        model.setSkype(inputNewNotebook.inputSkype());
        model.setAddress(inputNewNotebook.inputIndex(), inputNewNotebook.inputCity(),
                inputNewNotebook.inputStreet(),inputNewNotebook.inputDom(),inputNewNotebook.inputApart());
        model.setDate();
        view.printSMTH(model.getInfo());
    }
}