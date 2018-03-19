package workshop.domain;

public interface IWorkshopList {

    public void createWorkshop(String title, int maxAmount);

    public Workshop searchWorkshop(String title);
}
