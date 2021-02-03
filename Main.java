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
    int creationDate = scan.nextInt();
  System.out.println("Is your business still a business? (true/false)");
    boolean stillABusi = scan.nextBoolean();
  System.out.println("What is your revenue yearly?(Please type in decimals as well).");
    double moneyMadeYearly = scan.nextDouble();
  System.out.println("What is your cash flow yearly? (Please type in decimals as well).");
    double cashFlowYearly = scan.nextDouble();


  //Prints input from Scanner
  System.out.println(company(companyName));
  int age = companyAge(currentDate, creationDate);
  System.out.println(age + " is the difference in years between your business creation and the current year.");
  
  loanQualify(moneyMadeYearly, cashFlowYearly);
  }
  

  //Method returns name of business 
  static String company(String name){
    name = "Congratulations on having this company which is named " + name + "!";
    return name;
  } 
  //Method returns date when business was created
  static int companyAge(int date, int busiDate){
     int date1 = date - busiDate;
    return date1;
  }
  //Method returns if the business is still a business
  static boolean loanQualify(double revenueYearly, double cashFlow){
    if(revenueYearly >= 20000.00 && cashFlow >= 10000.00){
      System.out.println(" Your company qualifies for a loan!");
    return true;
    }
    else{
      System.out.println("Your company does not qualify for a loan.");
      return false;
    }
  }
}