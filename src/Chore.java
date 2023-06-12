import java.util.logging.Logger;

public class Chore implements IChore {
    private Person owner;
    private String choreName;
    public double hoursWorked;
    public boolean isComplete;
    public IMessageSender messageSender;

    @Override
    public void performedWork(double hours){
        hoursWorked = hoursWorked + hours;
        System.out.println("Performe work on " + choreName);
    }

    @Override
    public void completeChore(){
        isComplete = true;
        System.out.println("Completed " + choreName);
        Emailer emailer = new Emailer();
        emailer.sendEmail(owner,  " the chore " + choreName + " is complete.");
    }

    @Override
    public Person getOwner() {
        return owner;
    }

    @Override
    public void setOwner(Person owner) {
        this.owner = owner;
    }

    @Override
    public String getChoreName() {
        return choreName;
    }

    @Override
    public void setChoreName(String choreName) {
        this.choreName = choreName;
    }

    public Chore(IMessageSender messageSender) {
        this.messageSender = messageSender;
    }
}
