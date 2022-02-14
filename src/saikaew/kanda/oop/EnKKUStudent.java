public abstract class EnKKUStudent extends KKUStudent {
    private int gearNumber;
    /*public EnKKUStudent(String name) {
        super(name);
    }
    public EnKKUStudent() {

    }*/
    public void setGearNumber(int gearNumber) {
        this.gearNumber = gearNumber;
    }
    public int getGearNumber() {
        return gearNumber;
    }
    public String toString() {
        return name + " is a KKU Engineering student with gear number as " +
                gearNumber;
    }
    public abstract void register();
}
