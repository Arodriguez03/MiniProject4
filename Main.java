//imports Scanner
import java.util.Scanner;
class Main {
  public static void main(String[] args) {
   Scanner scan = new Scanner(System.in); 
  
  //calls the 3 methods
  System.out.println("What is your business called?");
    String companyName = scan.nextLine();
    System.out.println("What is the current year?");
    int currentDate = scan.nextInt();
  System.out.println("When was your business created? (Year only)");
    int creationDate1 = scan.nextInt();
  System.out.println("Is your business still a business? (true/false)");
    boolean stillABusi = scan.nextBoolean();

  //Prints input from Scanner
  System.out.println(company(companyName));
  System.out.println(creationDate(currentDate, creationDate1) + " is the difference in years between your business creation and the current year.");
  if(stillABusi == true){
    System.out.println(stillAlive(stillABusi) + "." + " Your company is still around.");
  }else{
    System.out.println("Your company is out of business. Sorry");
  }
}
  //Method returns name of business 
  static String company(String name){
    name = "Congratulations on having this company which is named " + name + "!";
    return name;
  } 
  //Method returns date when business was created
  static int creationDate(int date, int busiDate){
     int date1 = date - busiDate;
    return date1;
  }
  //Method returns if the business is still a business
  static boolean stillAlive(boolean alive){
    alive = true;
    return alive;
  }
}