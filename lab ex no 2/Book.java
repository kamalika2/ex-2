/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package book;

/**
 *
 * @author kamalika
 */
public class Book {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        author obj1=new author("Arundhati roy","xxx@gmail.com",'f');
        books obj=new books("War talk",obj1,300,1);
        System.out.println("name:"+obj.getname());
        System.out.println("prize:"+obj.getprize());
        obj.setprize(400);
        System.out.println("quantity:"+obj.getquantity());
        obj.setquantity(2);
        System.out.println(obj1);
        System.out.println(obj);
    }
    
}
class books
{
    String name;
    author author;
    double prize;
    int quantity=0;
    books(String n,author au,double pr,int q)
{
    name=n;
    author=au;
    prize=pr;
    quantity=q;
}
    String getname()
    {
        return name;
    }
    author getauthor()
    {
        return author;
    }
    double getprize()
    {
        return prize;
    }
    void setprize(double p1)
    {
        prize=p1;
    }
    int getquantity()
    {
        return quantity;
    }
    void setquantity(int q1)
    {
         quantity=q1;
    }
    public String toString()
    {
        return "\nname:"+name+"\nauthor details:\n"+author.toString()+"\nprize:"+prize+"\nquantity:"+quantity;
    }
} 
class author
{
    String name;
    String email;
    char gender;
    author(String na,String e,char ge)
    {
        name=na;
        email=e;
        gender=ge;
    }
    public String toString()
    {
        return "name:"+name+"\nemail:"+email+"\ngender:"+gender;
    }
}
    
            
            
                
    
        
    

