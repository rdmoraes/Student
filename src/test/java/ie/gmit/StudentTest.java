package ie.gmit;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StudentTest {

    Student student;

    @BeforeEach
    void init(){student = new Student();}

    @Test
    void testStudentConstructor(){
        student = new Student("Chris Barry", "cbarry@gmit.ie");
        //Grouped assertion for student object
        assertAll("student",
                () -> assertEquals("Chris Barry", student.getName()),
                () -> assertEquals("cbarry@gmit.ie",student.getEmail())
        );
    }

    @Test
    void testThrowExceptionConstructor(){
        //Test empty email
        assertThrows(NullPointerException.class, ()->{ new Student("Renan", "");});
        //Test null name
        assertThrows(NullPointerException.class, ()->{ new Student(null, "g0012121@gmit.ie");});
        //Test null name and empty email
        assertThrows(NullPointerException.class, ()->{ new Student(null, "");});
        //Test  empty name and null email
        assertThrows(NullPointerException.class, ()->{ new Student("", null);});
    }





}
