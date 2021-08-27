import java.util.Scanner;
public class Main

{
	public static void main(String[] args) {
	   int option;
	   System.out.println(" choose anyone options from the following 1.fatty 2. slim 3.normal");
           Scanner s=new Scanner(System.in);
           option=s.nextInt();
         switch(option){
		    case 1:
		      System.out.println(" you are too fatty ,you have to workout more everyday to maintain good health");
		       break;
		    case 2:
		      System.out.println("you are slim you don't need to workout heavily");
		        break;
		    case 3:
		      System.out.println("you just try to do simple workouts");		 
		        break;
		 }
	}
}
