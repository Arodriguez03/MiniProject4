//imports Scanner
import java.util.Scanner;
class Main {
  public static void main(String[] args) {
   Scanner scan = new Scanner(System.in); 
  
  //calls the 3 methods
  System.out.println("What is your business called?");
    String businessName = scan.nextLine();
  System.out.println("When was your business created? (Year only)");
    int creationDate = scan.nextInt();
  System.out.println("Is your business still a business? (true/false)");
    boolean stillABusi = scan.nextBoolean();

  //Prints input from Scanner
  System.out.println(businessName);
  System.out.println(creationDate);
  if(stillABusi == true){
    System.out.println("Your company is still going strong!");a
  }else{
    System.out.println("Your company is out of business. Sorry");
  }
  
  }
  //Method returns name of business 
  static String businessName(String name){
    return name;
  } 
  //Method returns date when business was created
  static int creationDate(int date){
    return date;
  }
  //Method returns if the business is still a business
  static boolean stillABusi(boolean alive){
    return alive;
  }
}