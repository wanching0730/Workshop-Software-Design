package workshop.ui;

import workshop.domain.*;

import java.util.List;
import java.util.Scanner;

public class AppUI implements IUserInterface {

    private Scanner scanner;
    private AppController controller;

    public AppUI(){
        scanner = new Scanner(System.in);
    }

    public void setController(AppController controller){
        this.controller = controller;
    }

    @Override
    public void start() {
        int choice;

        do {
            System.out.println("Do you want to:");
            System.out.println("1 - Create new workshop");
            System.out.println("2 - Get workshop details");
            System.out.println("3 - Register participant for workshop");
            System.out.println("4 - Exit");

            System.out.println("Please selection an option from the menu above (1-4): ");
            choice = scanner.nextInt();

            while(choice < 1 || choice > 4){
                System.out.println("Invalid choice");
                System.out.println("Please enter your option again (1-4): ");
                choice = scanner.nextInt();
            }

            switch (choice) {
                case 1: createWorkshop();
                break;

                case 2: searchWorkshop();
                break;

                case 3: addParticipant();
                break;

            }
        } while (choice != 5);
    }

    private void createWorkshop(){

        System.out.println("Enter workshop title: ");
        String skip = scanner.nextLine();
        String title = scanner.nextLine();

        System.out.println("Enter max amount of participant ");
        int maxAmount = scanner.nextInt();

        controller.createWorkshop(title, maxAmount);
        System.out.println("New workshop created!");
    }

    private void searchWorkshop(){
        System.out.println("Enter workshop title: ");
        String skip = scanner.nextLine();
        String title = scanner.nextLine();

        Workshop workshop = controller.searchWorkshop(title);

        if(workshop == null){
            System.out.println("No workshop is found!");
        } else {
            List<Participant> participants = workshop.getParticipants();
            System.out.println("List of participants: ");
            for(int i = 0; i < participants.size(); i++){
                System.out.println("Name: " + participants.get(i).getName() + "\tID: " + participants.get(i).getId());
            }

        }
    }

    private void addParticipant(){

        searchWorkshop();

        Workshop selectedWorkshop = controller.getSelectedWorkshop();

        if(selectedWorkshop != null){
            System.out.println("Enter participant name: ");
            String name = scanner.nextLine();

            System.out.println("Enter participant ID: ");
            String id = scanner.nextLine();

            controller.addParticipant(name, id);
        }
    }
}
