public interface IChore {
    void performedWork(double hours);

    void completeChore();

    IPerson getOwner();

    void setOwner(IPerson owner);

    String getChoreName();

    void setChoreName(String choreName);
}
