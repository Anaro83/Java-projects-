import java.util.Scanner;
public class fitnessLevel{
    public static String getFitnessLevel(int steps){
        if (steps>=10000);{return "Excelent";
    } else if(steps>=7000&&steps<10000);{return "Good";}
        else if(steps>=4000&&steps<7000);{return "Average";}
        else {return "Poor";}}
    {public static void main(String[] args)
    Scanner input=new Scanner(System.in);
    System.out.println("Enter your steps for the day:");
    int steps=input.nextInt();
    String level=
            getFitnessLevel(steps);
    System.out.println("Your fitnes level is:"+level);
    }
}
