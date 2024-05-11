/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javafxapplication3;

/**
 *
 * @author demia
 */
public class Project implements Tasks {

    double fullmark;
    double Grade;
    String Name ;
    Time Deadline ;

    public Project() {
    }
    

    public Project(double fullmark, String Name, Time Deadline) {
        this.fullmark = fullmark;
        this.Name = Name;
        this.Deadline = Deadline;
    }
       
     @Override
    public double getGrade(){
        return Grade ;

    }  
   
   @Override
   public String getName(){
    return Name ;
  
  } 
   @Override
    public Time getDeadLine(){
        return Deadline ;
    }
   @Override
    public double getFullmark(){
         return fullmark ;
  
    }
    @Override
    public void setGrade(int grade) {
        this.Grade = grade;
    }
}