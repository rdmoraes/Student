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
         for (Student s:studentList) {
            return s.getName().equals(name);
        }
        return false;
    }

    ArrayList<Student> getStudentList() {
        return studentList;
    }
}
