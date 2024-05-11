/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javafxapplication3;


/**
 *
 * @author demia
 */
import java.util.ArrayList;
import java.util.List;
public class Student extends Users implements Comparable<Student> {
private double Final_Grade;
static private int No_of_stud ;
private List<Courses> courses;
private double courseGrade;

@Override
    public int compareTo(Student s){
    if(this.Final_Grade>s.Final_Grade)
            return 1;
    else if(this.Final_Grade<s.Final_Grade)
            return -1;
    else 
        return 0;
    
    }

    public Student( String name, String email, String college, String department, int age, String gender, String password ) { 
        super(name, email, college, department, age, gender, password);
        No_of_stud++;
        
        //this.courses = new ArrayList<>();
        //this.Final_Grade = Final_Grade;
    }

    public void setCourses(List<Courses> courses) {
        this.courses = courses;
        for(Courses c:courses)
        Site.Add_Course(c);
    }


    public double getCourseGradePercentage(Courses course) {
        double coursegrade=0;
        double fullcoursegrade=0;
        int i,j;
//        for( i =0 ; i < courses.size();i++)
//        if(courses.get(i).getNameOf_course().equals(course.getNameOf_course()) )// array of courses 
//                break;
//        }
        for( j=0;j<course.getTasks().size();j++){
            coursegrade+=course.getTasks().get(j).getGrade();
            fullcoursegrade+=course.getTasks().get(j).getFullmark();
        }
        try {
         course.setGrade(coursegrade/fullcoursegrade*100); 
         return (coursegrade/fullcoursegrade*100);
        }catch(ArithmeticException e)
        {
            e.printStackTrace();
             return 0;
        }  
    }
    

    public void setCourseGrade(double courseGrade) {
        this.courseGrade = courseGrade;
    }

    public List<Courses> getCourses() {
        return courses;
    }

    public void setFinal_Grade(double Final_Grade) {
//        if(!logedIn ){
//            System.out.println("not loged in");
//            return ;
//           }
        this.Final_Grade = Final_Grade;
    }

    public static int getNo_of_stud() {
        return No_of_stud;
    }

    public static void setNo_of_stud(int No_of_stud) {
        Student.No_of_stud = No_of_stud;
    }
    

    public void addCourses (Courses course)
    {
//        if(!logedIn ){
//            System.out.println("not loged in");
//            return;
//           }
       this.courses.add(course);
       Site.Add_Course(course);
    }
    public double finalGrade(){
        for(Courses c:this.courses){
            this.Final_Grade+=this.getCourseGradePercentage(c);
  
        }
        try{

            return this.Final_Grade/this.courses.size();
        }catch(ArithmeticException e){
            e.printStackTrace();
            return 0;
        }
    }
}