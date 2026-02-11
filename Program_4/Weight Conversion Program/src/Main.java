import java.util.Scanner;
public class Main {
    public static void main(String[] args){

        // WEIGHT CONVERSION PROGRAM

        Scanner scanner = new Scanner(System.in);

        double weight;
        double newWeight;
        int choice;

        System.out.println("Weight Conversion Program");
        System.out.println(" 1 : Convert Lbs to Kgs");
        System.out.println(" 2 : Convert Kgs to Lbs");

        System.out.print("Choose an option : ");
        choice = scanner.nextInt();

        if(choice == 1){
            System.out.print(" Enter the weight in lbs : ");
            weight = scanner.nextDouble();
            newWeight = weight * 0.453592;
            System.out.printf(" The new weight in Kgs is : %.2f ",newWeight);
        }
        else if(choice == 2){
            System.out.print(" Enter the weight in Kgs : ");
            weight = scanner.nextDouble();
            newWeight = weight * 2.20462;
            System.out.printf(" The new weight in Lbs is : %.2f ",newWeight);
        }
        else{
            System.out.println(" That was not a valid choice ");
        }
        scanner.close();
    }

}
