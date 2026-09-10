package com.oop;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;


public class StudentTest {
   @Test 
   void testUpdateGrade() {
    //Arrange
  
    Student student = new Student();
    //Act 
    student.updateGrade(90);
    //Assert
   assertEquals(90, student.grade);
    }
}
    

