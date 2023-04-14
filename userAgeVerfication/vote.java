import java.util.*;

class vote {
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter your age: ");
       int age=sc.nextInt();
       if(age<18 && age>0)
       {
           System.out.println("Sorry you are not old enough to vote");
       }
       else if(age>=18)
       {
           System.out.println("Yes! you are old enough to vote");
       }
       else
       {
           System.out.println("Please enter a valid age");
       }
    }
}