/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package internal.mark;
import java.util.Scanner;

/**
 *
 * @author kamalika
 */
public class InternalMark {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        studentrecord obj=new studentrecord();
        obj.getdata();
        obj.attendancepercent();
        double ap1=obj.attendancepercent();
        if(ap1>=90)
            System.out.println("awarded 5 marks");
        else if(ap1>=80&&ap1<90)
            System.out.println("awarded 4 marks");
        else if(ap1>=75&&ap1<80)
            System.out.println("awarded 3 marks");
        else if(ap1<75)
            System.out.println("awarded 0 marks");
            
        
    }
    
}
class studentrecord
{
    String name;
    int regno;
    int workingdays;
    int dayspresent;
    double ap;
    void getdata()
    {
        Scanner obj=new Scanner(System.in);
        System.out.println("enter the student name");
        name=obj.next();
        System.out.println("enter the student register number");
        regno=obj.nextInt();
        System.out.println("enter the total number of working days in this semester");
        workingdays=obj.nextInt();
        System.out.println("enter the number of days present");
        dayspresent=obj.nextInt();
    
    }
    double attendancepercent()
    {
        ap=(double)dayspresent/workingdays;
        double attper=ap*100;
        return attper;
    }
}