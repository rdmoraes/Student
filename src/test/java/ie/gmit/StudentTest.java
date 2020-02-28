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
        assertEquals("Chris Barry", student.getName());
        assertEquals("cbarry@gmit.ie",student.getEmail());

    }

    @Test
    void testThrowExceptionConstructor(){
        assertThrows(NullPointerException.class, ()->{ new Student("Renan", "");});
        assertThrows(NullPointerException.class, ()->{ new Student(null, "g0012121@gmit.ie");});
        assertThrows(NullPointerException.class, ()->{ new Student(null, "");});
        assertThrows(NullPointerException.class, ()->{ new Student("", null);});
    }





}
