public class Emailer implements IMessageSender {
    @Override
    public void sendEmail(Person person, String message) {
        System.out.println("Simulating sending an email to " + person.getEmailAddress());
    }
}
