package workshop.domain;

import java.util.List;

public class Participant {

    private String name;
    private String id;

    public Participant(String name, String id){
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }
}
