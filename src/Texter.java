public class Texter implements IMessageSender{
    @Override
    public void sendMessage(IPerson person, String message) {
        System.out.println("Sending a text to " + person.getEmailAddress() + " to say " + message);
    }
}
