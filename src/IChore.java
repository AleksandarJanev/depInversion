public interface IChore {
    void performedWork(double hours);

    void completeChore();

    Person getOwner();

    void setOwner(Person owner);

    String getChoreName();

    void setChoreName(String choreName);
}
