/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package javafxapplication3;

/**
 *
 * @author demia
 */
//import java.time.LocalDate;
public interface Tasks {
//int no_of_terms=0;
//double fullmark=0;
//double Grade=0;
//String comment="" ;
//LocalDate Deadline= LocalDate.parse("2024-5-10") ;
    
    //  Methods  //
  double getGrade();
  String getName() ;
  Time getDeadLine();
  double getFullmark();
  void setGrade(int grade);

}