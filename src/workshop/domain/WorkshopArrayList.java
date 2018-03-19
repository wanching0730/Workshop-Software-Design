package workshop.domain;

import java.util.ArrayList;
import java.util.List;

public class WorkshopArrayList implements IWorkshopList{

    private List<Workshop> workshops;

    public WorkshopArrayList(){
        workshops = new ArrayList<>();
    }

    public void createWorkshop(String title, int maxAmount){
        Workshop workshop = new Workshop(title, maxAmount);
        workshops.add(workshop);
    }

    public Workshop searchWorkshop(String title){
        Workshop workshop = null;
        boolean found = false;
        int i = 0;

        while(i < workshops.size() && !found){
            workshop = workshops.get(i);
            if(workshop.getTitle().equals(title)){
                found = true;
            } else {
                i++;
            }
        }

        if(found){
            return workshop;
        } else {
            return null;
        }
    }

}
