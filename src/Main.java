public class Main {
    public static void main(String[] args) {
        Person person = new Person("Aleksandar", "Janev", "alek@alek.com", "111-222-333");
        Chore chore = new Chore(person, "Take out the trash");
        chore.performedWork(3);
        chore.performedWork(1.5);
        chore.completeChore();
    }
}