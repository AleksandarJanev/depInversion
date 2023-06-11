import java.util.logging.Logger;

public class Chore {
    private Person owner;
    private String choreName;
    public double hoursWorked;
    public boolean isComplete;

    public void performedWork(double hours){
        hoursWorked = hoursWorked + hours;
        System.out.println("Performe work on " + choreName);
    }

    public void completeChore(){
        isComplete = true;
        System.out.println("Completed " + choreName);
        Emailer emailer = new Emailer();
        emailer.sendEmail(owner,  " the chore " + choreName + " is complete.");
    }

    public Person getOwner() {
        return owner;
    }

    public void setOwner(Person owner) {
        this.owner = owner;
    }

    public String getChoreName() {
        return choreName;
    }

    public void setChoreName(String choreName) {
        this.choreName = choreName;
    }

    public Chore(Person owner, String choreName) {
        this.owner = owner;
        this.choreName = choreName;
    }
}
