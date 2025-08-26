package projects.studentms;

import java.util.ArrayList;
import java.util.List;

public class StudentManager {
    private final List<Student> students = new ArrayList<>();

    public void addStudent(Student s) { students.add(s); }

    public Student getStudentById(int id){
        for(Student s : students){
            if (s.getId() == id) return s;
        }
        return null;
    }

    public boolean updateStudent(int id, Student newData){
        Student s = getStudentById(id);
        if(s == null) return false;
        s.setName(newData.getName());
        s.setAge(newData.getAge());
        s.setDepartment(newData.getDepartment());
        s.setMarks(newData.getMarks());
        return true;
    }

    public boolean deleteStudent(int id){
        Student s = getStudentById(id);
        if(s == null) return false;
        return students.remove(s);
    }

    public List<Student> getAllStudents(){ return new ArrayList<>(students); }
}
