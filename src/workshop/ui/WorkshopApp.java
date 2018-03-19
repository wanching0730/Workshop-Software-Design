package workshop.ui;

import workshop.domain.AppController;


public class WorkshopApp {

    private static IUserInterface userInterface;
    private static AppController controller;

    public static void main(String[] args){
        controller = new AppController();
        userInterface = new AppUI();
        userInterface.setController(controller);
        userInterface.start();
    }
}
