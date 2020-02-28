package ie.gmit;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class StudentListTest {

    private StudentList studentList;
    private Student student;


    @BeforeEach
    void init(){
        studentList = new StudentList();
        student =  new Student("Chris Barry", "cbarry@gmit.ie");
        studentList.addStudentToList(student);
    }

    @Test
    void testGetStudentList(){
        ArrayList<Student> hardcodeStudentList = new ArrayList<>();
        hardcodeStudentList.add(student);
        assertEquals(hardcodeStudentList, studentList.getStudentList());
    }

    @Test
    void testAddStudentToListMethod(){

        student =  new Student("Murray Scott", "mscott@gmit.ie");
        assertTrue(studentList.addStudentToList(student));

    }

    @Test
    void testSearchStudentInListTrue(){
       assertTrue(studentList.searchStudentInList("Chris Barry"));
    }

    @Test
    void testSearchStudentInListFalse(){
        assertFalse(studentList.searchStudentInList("Murray Scott"));
    }




}
