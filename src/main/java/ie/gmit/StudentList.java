package ie.gmit;

import java.util.ArrayList;

class StudentList {

   private ArrayList<Student> studentList;

    StudentList(){
        studentList = new ArrayList<>();
    }


    Boolean addStudentToList(Student student){
        studentList.add(student);
        return studentList.contains(student);
    }

    Boolean searchStudentInList(String name){
        boolean isStudentInList = false;
        for (Student s:studentList) {
             isStudentInList = s.getName().equals(name);
        }
        return isStudentInList;
    }

    ArrayList<Student> getStudentList() {
        return studentList;
    }
}
