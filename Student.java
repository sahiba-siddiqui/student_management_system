package projects.studentms;

public class Student {
    private int id;
    private String name;
    private int age;
    private String department;
    private double marks;

    public Student(int id, String name, int age, String department, double marks) {
        this.id = id; this.name = name; this.age = age; this.department = department; this.marks = marks;
    }

    // getters & setters
    public int getId(){ return id; }
    public String getName(){ return name; }
    public void setName(String name){ this.name = name; }
    public int getAge(){ return age; }
    public void setAge(int age){ this.age = age; }
    public String getDepartment(){ return department; }
    public void setDepartment(String department){ this.department = department; }
    public double getMarks(){ return marks; }
    public void setMarks(double marks){ this.marks = marks; }

    @Override
    public String toString(){
        return id + " | " + name + " | Age:" + age + " | Dept:" + department + " | Marks:" + marks;
    }
}
