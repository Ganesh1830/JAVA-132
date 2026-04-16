package lop;public class EncapsulationProject {

    public static void main(String[] args) {

        Student s1 = new Student();

        // setting values using setter
        s1.setId(101);
        s1.setName("Omkar");
        s1.setAge(20);
        s1.setMarks(88.5);

        // getting values using getter
        System.out.println("Student ID: " + s1.getId());
        System.out.println("Student Name: " + s1.getName());
        System.out.println("Student Age: " + s1.getAge());
        System.out.println("Student Marks: " + s1.getMarks());
    }
}