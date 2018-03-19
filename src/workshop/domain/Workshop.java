package workshop.domain;

import workshop.domain.Participant;

import java.util.ArrayList;
import java.util.List;

public class Workshop {

    private String title;
    private int maxAmount;
    private List<Participant> participants;

    public Workshop(String title, int maxAmount) {
        this.title = title;
        this.maxAmount = maxAmount;
        participants = new ArrayList<>();
    }

    public String getTitle(){
        return title;
    }

    public int getMaxAmount() {
        return maxAmount;
    }

    public List<Participant> getParticipants() {
        return participants;
    }

    public void addParticipant(String name, String id){
        Participant participant = new Participant(name, id);
        participants.add(participant);
    }
}
