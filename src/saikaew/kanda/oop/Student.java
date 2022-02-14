public abstract class Student {
    // privacy modifier: default
    // default => only classes in the same package can access
    // String name;

    // protected modifier: subclasses even in different pacakges can access
    protected String name;
    protected String favoriteCourse;
    public abstract void writePrograms();
    public int learnSpeed() {
        return 5;
    }
    public String getFavoriteCourse() {
        return favoriteCourse;
    }
    public String toString() {
        return name + " likes " + favoriteCourse;
    }
}

