package CoronaFlipkart.entity;

import java.sql.Timestamp;

public class SelfAssessment {
    public Symptoms getSymptoms() {
        return symptoms;
    }

    public void setSymptoms(Symptoms symptoms) {
        this.symptoms = symptoms;
    }

    public boolean isContactedAffectedPerson() {
        return contactedAffectedPerson;
    }

    public void setContactedAffectedPerson(boolean contactedAffectedPerson) {
        this.contactedAffectedPerson = contactedAffectedPerson;
    }

    public boolean isTravelAffectedArea() {
        return travelAffectedArea;
    }

    public void setTravelAffectedArea(boolean travelAffectedArea) {
        this.travelAffectedArea = travelAffectedArea;
    }

    public Timestamp getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Timestamp timestamp) {
        this.timestamp = timestamp;
    }

    private CoronaFlipkart.entity.Symptoms symptoms;
    private boolean contactedAffectedPerson;
    private boolean travelAffectedArea;
    private Timestamp timestamp;
}
