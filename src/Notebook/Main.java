package Notebook;


import Notebook.controller.Controller;
import Notebook.model.Model;
import Notebook.view.View;

public class Main {

    public static void main(String[] args) {

        Controller controller = new Controller(new Model(), new View());
        controller.startProgram();
    }
}
