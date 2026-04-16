package lop;
class Student {

    // private data (Encapsulation)
    private int id;
    private String name;
    private int age;
    private double marks;

    // setter methods
    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        if(age > 0)
            this.age = age;
    }

    public void setMarks(double marks) {
        this.marks = marks;
    }

    // getter methods
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getMarks() {
        return marks;
    }
}