public class Factory {
    public static IPerson createPerson(){
        return new Person();
    }
    public static IChore createChore(){
        return new Chore(createMessageSender());
    }
    public static IMessageSender createMessageSender(){
        // We change this from MessageSender to Texter
        // return new MessageSender();
        return new Texter();
    }
}
