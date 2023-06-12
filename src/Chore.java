import java.util.logging.Logger;

public class Chore implements IChore{
    private String choreName;
    public double hoursWorked;
    public boolean isComplete;
    private IPerson owner;
    IMessageSender messageSender;
    public void performedWork(double hours){
        hoursWorked = hoursWorked + hours;
        System.out.println("Performe work on " + choreName);
    }

    public void completeChore(){
        isComplete = true;
        System.out.println("Completed " + choreName);
        messageSender.sendMessage(owner,  " the chore " + choreName + " is complete.");
    }

    public IPerson getOwner() {
        return owner;
    }

    public void setOwner(IPerson owner) {
        this.owner = owner;
    }

    public String getChoreName() {
        return choreName;
    }

    public void setChoreName(String choreName) {
        this.choreName = choreName;
    }

    public Chore(IMessageSender messageSender) {
        this.messageSender = messageSender;
    }
}
