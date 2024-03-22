public class ConferenceEvent extends Event {
     private boolean breakfastRequired ;
     private double brefakfastCost ;
     private boolean lunchRequired ;
     private double lunchCost ;
     private boolean dinnerRequired ;
     private double dinnerCost ;
     private double conferenceEventCost ;

     public ConferenceEvent(String eventID, String eventName, String eventLocation, String pointOfContact,  int totalParticipants, int totalEventDays , 
     double brefakfastCost, double lunchCost, double dinnerCost ) {
        super(eventID, eventName, eventLocation, pointOfContact, totalParticipants, totalEventDays);
        this.brefakfastCost = brefakfastCost;
        this.lunchCost = lunchCost;
        this.dinnerCost = dinnerCost;
    } 

    public double getBreakfastCost() {
        return brefakfastCost;
    }

    public void setBreakfastCost(double brefakfastCost) {
        this.brefakfastCost = brefakfastCost;
    }

    public double getLunchCost() {
        return lunchCost;
    }

    public void setLunchCost(double lunchCost) {
        this.lunchCost = lunchCost;
    }

    public double getDinnerCost() {
        return dinnerCost;
    }

    @Override
    public void calculateEventCost() {
        conferenceEventCost = getEventCost() +((getBreakfastCost() + getLunchCost() + getDinnerCost())*getTotalParticipants()*getTotalEventDays());
    }


    @Override
    public String toString() {
        return "Conference Event details :" + "\n" +
               "Event ID: " + getEventID() + "\n" +
               "Event Name: " + getEventName() + "\n" +
               "Event Location: " + getEventLocation() + "\n" +
              "Total Participants: " + getTotalParticipants() + "\n" +
              "Total Conference Cost: " + conferenceEventCost;
                
            }

 }
    