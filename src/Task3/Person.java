package Task3;

public abstract class Person {
    private String name;

    Person (String name){
        this.name = name;
    }

    public abstract boolean addCourse(String course);

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
