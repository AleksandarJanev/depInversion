public class Factory {
    public IPerson createPerson(){
        return new Person();
    }

    public IChore createChore(){
        return new Chore(createMessage());
    }

    public IMessageSender createMessage(){
        return new Emailer();
    }
}
