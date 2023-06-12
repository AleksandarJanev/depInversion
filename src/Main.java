public class Main {
    public static void main(String[] args) {
        IPerson person = Factory.createPerson();
        person.setFirstName("Aleksadnar");
        person.setLastName("Janev");
        person.setEmailAddress("alek@alek.com");
        person.setPhoneNumber("111-222-333");
        IChore chore = Factory.createChore();
        chore.setChoreName("Take out the trash");
        chore.setOwner(person);

        chore.performedWork(3);
        chore.performedWork(1.5);
        chore.completeChore();
    }
}