package Notebook;


public class Main {

    public static void main(String[] args) {

        Controller controller = new Controller(new Model(), new View());
        controller.startProgram();
    }
}
