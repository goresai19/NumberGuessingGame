import java.util.*;
class Number_Guess{
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_PURPLE = "\u001B[35m";
    public static final String ANSI_YELLOW = "\u001B[33m";
 public static void main(String [] args)
 {  
    // define the range
    Scanner sc= new Scanner(System.in);
    int max,min,random;
    System.out.println(ANSI_YELLOW+"\n\t\t\t\t\tWelcome,CHAMP\nEnter the limit in which you want to Guess the number");
    System.out.println("Enter the lower limit to Guess the number :"+ANSI_GREEN);
    min=sc.nextInt();
    System.out.println(ANSI_YELLOW+"Enter the upper limit to Guess the number :"+ANSI_GREEN);
    max=sc.nextInt();

    int range = max - min + 1;

    // generate random numbers within 1 to 10
         random = (int)(Math.random() * range) + min;
    
   // int random=(int)(Math.random()*100+1);
    System.out.println(ANSI_YELLOW+"Enter a positve number between "+min+" to "+max +" : "+ANSI_GREEN);
    int Num=sc.nextInt();
    int count=0;
    while(Num!=random){
        count++;
        if(Num<random)
        System.out.println(ANSI_YELLOW+"Your Enterd number "+ Num +" is smaller than the number");
        else
        System.out.println(ANSI_YELLOW+"Your Enterd number "+ Num +" is greater than the number");
        System.out.println("Your taken chances to guess the number :"+count+"\n");
        System.out.println("-----------------------------------------------------------------------------------------------");
        System.out.println("Enter another number :-"+ANSI_GREEN);
        Num=sc.nextInt();
    }
    if(count==1)
    System.out.println(ANSI_YELLOW+"\t\tCongratulations Champ!!!\n\t\tYour score is :"+ANSI_GREEN+" 100\n "+ANSI_RESET);
    else if(count<=5)
    System.out.println(ANSI_YELLOW+"\t\tCongratulations Champ!!!\n\t\tYour score is :"+ANSI_GREEN+"50 \n"+ANSI_RESET);
    else 
    System.out.println(ANSI_YELLOW+"\t\tCongratulations Champ!!!\n\t\tYour score is :"+ANSI_GREEN+"10 \n "+ANSI_RESET);

 }
}
