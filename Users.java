/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javafxapplication3;

/**
 *
 * @author demia
 */
import java.util.InputMismatchException;
public abstract class Users {  // abstract without abstract fun :)  "inheritance"
    private String name ;
    private int id ;
    private String email ;
    private String college ;
    private String department ;
    private int age ;
    private String gender ;
    private String password ; 
    static private int counter ;
    private boolean logedIn  ;

    public static int getCounter() {
        return counter;
    }

    public boolean isLogedIn() {
        return logedIn;
    }
    public Users() {
        counter++;
        logedIn = false;
    }

    public Users(String name, String email, String college, String department, int age, String gender, String password) {
        this();
        this.name = name;
        this.id = counter;
        this.email = email;
        this.college = college;
        this.department = department;
        this.age = age;
        this.gender = gender;
        this.password = password;
        logedIn = false;
//    Scanner in =new Scanner(System.in);
    //password =in ;
        
    }
    
    public String getName() {
//        if(!logedIn ){
//            System.out.println("not loged in");
//            return null;
//           }
        return name;
    }

    public void setName(String name) {
//        if(!logedIn ){
//            System.out.println("not loged in");
//            return ;
//           }
        this.name = name;
    }

    public int getId() {
//        if(!logedIn ){
//            System.out.println("not loged in");
//            return -1;
//           }
        return id;
    }


    public String getEmail() {
//        if(!logedIn ){
//             return email;
//           }
       
        System.out.println("not loged in");
        return null;
    }

    public void setEmail(String email) {
//        if(!logedIn ){
//            System.out.println("not loged in");
//            return ;
//           }
        this.email = email;
    }

    public String getCollege() {
//        if(!logedIn ){
//            System.out.println("not loged in");
//            return null;
//           }
        return college;
    }

    public void setCollege(String college) {
//        if(!logedIn ){
//            System.out.println("not loged in");
//            return ;
//           }
        this.college = college;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
//        if(!logedIn ){
//            System.out.println("not loged in");
//            return;
//           }
        this.department = department;
    }

    public int getAge() {
//        if(!logedIn ){
//            System.out.println("not loged in");
//            return -1;
//           }
        return age;
    }

    public void setAge(int age) {
//        if(!logedIn ){
//            System.out.println("not loged in");
//            return;
//           }
        try {
        if (age < 16)
            throw new InputMismatchException("the age can't be less than 16");
        else 
            this.age = age;
        }catch(InputMismatchException e)
        {
            System.out.println(e);
        }
    }

    public String getGender() {
//        if(!logedIn ){
//            System.out.println("not loged in");
//            return null;
//           }
        return gender;
    }

    public void setGender(String gender) {
//        if(!logedIn ){
//            System.out.println("not loged in");
//            return;
//           }
        this.gender = gender;
    }

    public String getPassword() {
//        if(!logedIn ){
//            System.out.println("not loged in");
//            return null;
//           }
        return password;
    }

    public void setPassword(String pass) {
//        if(!logedIn ){
//            System.out.println("not loged in");
//            return;
//           }
            this.password = pass;
        
    }
    public void login(String username, String password) {
        if (this.email.equals(username) && this.password.equals(password)) {
            logedIn = true;
          
        }
        else {
            logedIn  = false ;
       
        }
    }
}
//    @Override
//    public String toString() { // except password 
//        return "Users{" + "name=" + name + ", id=" + id + ", email=" + email + ", college=" + college + ", department=" + department + ", age=" + age + ", gender=" + gender + '}';
//    }
//    public boolean login(String username , String password)
//    {
//        if(this.name == username && )
//    }}