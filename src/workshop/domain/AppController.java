package workshop.domain;

public class AppController {

    private IWorkshopList workshopList;
    private Workshop selectedWorkshop;

    public AppController(){
        workshopList = new WorkshopArrayList();
        selectedWorkshop = null;
    }

    public Workshop getSelectedWorkshop(){
        return selectedWorkshop;
    }

    public void createWorkshop(String title, int maxAmount){
        workshopList.createWorkshop(title, maxAmount);
    }

    public Workshop searchWorkshop(String title){
        selectedWorkshop = workshopList.searchWorkshop(title);
        return selectedWorkshop;
    }

    public void addParticipant(String name, String id){
        selectedWorkshop.addParticipant(name, id);
    }


}
