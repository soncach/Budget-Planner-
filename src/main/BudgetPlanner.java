import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
/**
 * @author Sonia Cachon
 * 
 * Suppose to represent the backend logic of the budget Planner 
 * Includes, add all the monthly payment, set up the monthly income 
 * calculate your fun money, check balance of fun money, calculate how much you're saving. 
 * 
 */
public class BudgetPlanner {
    public final Scanner scanner;
    private double income;
    private HashMap<PurchaseType, Double> monthlyPayments;
    private double amtWantedSaving;
    private double currentSaving;

    public BudgetPlanner(double income, double wantedSaving, double currentSaving){
        this.income = income;
        this.amtWantedSaving = wantedSaving;
        this.currentSaving = currentSaving;
        scanner = new Scanner(System.in);
    }


    /**
     * supposed to lead the user into adding their monthly payments 
     * @return
     */
    public HashMap<PurchaseType, Double> setMonthlyPayments(){
        System.out.println("Do you have any Monthly Payment to add to your monthly budget? (y/n)");
        String line = scanner.nextLine();
        while (line.equals("y")){
            System.out.print("Enter name of  Monthly payment:");
            String type = scanner.nextLine();
            System.out.println("Enter payment amount: ");
            double cost = Integer.parseInt(scanner.nextLine());
            monthlyPayments.put(getPurchaseType(type), cost);
            System.out.println("Do you want to input any more Monthly Payments to your monthly budget? (y/n)");
            line = scanner.nextLine();
        }
        
        return monthlyPayments;
    }

    public double getCurrentSaving() {
        return currentSaving;
    }

    public void setIncome(double income) {
        this.income = income;
    }


}
