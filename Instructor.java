/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javafxapplication3;

import java.util.ArrayList;
import java.util.List;

public class Instructor extends Users{ 
    private List<Courses> courses;

    
    public Instructor( String name, String email, String college, String department, int age, String gender, String password) {
        super(name, email, college, department, age, gender, password);
        this.courses = new ArrayList<>();
    }
    
    // Constructor

    public List<Courses> getCourses() {
//        if(!logedIn ){
//            System.out.println("not loged in");
//            return null;
//           }
        return courses;
    }

    public void setCourses(List<Courses> courses) {
//        if(!logedIn ){
//            System.out.println("not loged in");
//            return;
//           }
        this.courses = courses;
    }
    
//    public void discription(String duration , String courseName , String codeCourse , List<Tasks> t )
//    {
//        for(int i = 0 ; i< courses.size() ;i++)
//        {
//            courses.get(i).setDuration(duration); //
//            courses.get(i).setNameOf_course(courseName); //
//            courses.get(i).setCodeOf_course(codeCourse);// 
//            courses.get(i).setT((Tasks) t); 
//        }
//    }
    public void addCourses (Courses course)
    {
//        if(!logedIn ){
//            System.out.println("not loged in");
//            return;
//           }
       this.courses.add(course);
       Site.Add_Course(course);
    }
    public void addTask (String nameOfcourse , Tasks task) // addTask(name of course  , tasks)
    {
//        if(!logedIn ){
//            System.out.println("not loged in");
//            return;
//           }
        int i ;
        for( i =0 ; i < courses.size();i++)
        {
            if(courses.get(i).getNameOf_course().equals(nameOfcourse) )// array of courses 
                break;
        } 
        this.courses.get(i).addTasks(task);// hena 3adl fiha bs ana m4 fahmaha 
    }
    
//    public void setGrade(Student student, Courses course, Tasks task, int grade)
//    { try{
//        for(int i = 0; i< student.getCourses().size() ; i++)
//        {
//            if(student.getCourses().get(i).getNameOf_course() == course.getNameOf_course())
//            {
//                for(int j= 0; j< course.getTasks().size() ; j++)
//                {
//                    if(course.getTasks().get(j).getName()== task.getName())
//                    {
//                        task.setGrade(grade);
//                        System.out.println("hello");
//                    }
//                }
//            }
//        }
//    } catch(RuntimeException e){}  
//}     
    public void setGrade(Student student,  Courses course, Tasks task, int grade){
        try{
        int i,j;
        for( i = 0; i< this.courses.size() ; i++)
        {
            if(this.courses.get(i).getNameOf_course().equals(course.getNameOf_course()))
            {
                break;
            }
        }
        for( j= 0; j< this.courses.get(i).getTasks().size() ; j++)
                {
                    if(this.courses.get(i).getTasks().get(j).getName().equals(task.getName()))
                    {
                        break;
                    }
                }
        this.courses.get(i).getTasks().get(j).setGrade(grade);
        }catch(NullPointerException e){
            System.out.println("not valid");
        }
    }
}