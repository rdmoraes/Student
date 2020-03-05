package ie.gmit;
/*
 StudentList class - organizes all students in a list

 Renan Moraes
 G00353112
 21/02/2020
 */

import java.util.ArrayList;

class StudentList {

    private ArrayList<Student> studentList;

    /*@brief: Default constructor creates a ArrayList of students*/
    public StudentList(){
        studentList = new ArrayList<>();
    }

    /*@brief: addStudentToList method
    * @param: student - Student object
    * @return: Returns true with student is appended in the list
    */
    Boolean addStudentToList(Student student){
        studentList.add(student);
        return studentList.contains(student);
    }

    /*@brief: addStudentToList method
     * @param: name - student's name
     * @return: Returns true with student is found in the list
     */
     Boolean searchStudentInList(String name){
        boolean isStudentInList = false;
        for (Student s:studentList) {
             isStudentInList = s.getName().equals(name);
        }
        return isStudentInList;
    }

    /*@brief: getStudentList method
    * @return: returns array list with all students
    */
    ArrayList<Student> getStudentList() {
        return studentList;
    }
}
