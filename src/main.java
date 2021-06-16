import java.util.Scanner;

public class main {
    public static void main(String[] args) throws Exception {
    ///Exercise 1///
        //Java bean is POJO with a strict set of rules:
        //Access levels, Method names, Default Constructor and Serializable//

    ///Exercise 2///
        //Design patterns are not inherently language specific,//
        // although some patterns are more useful in some languages than others//

    ///Exercise 3///
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter your name:");
        logWriter.getInstance().writeToFile(scanner.next());
        System.out.println("enter your age:");
        logWriter.getInstance().writeToFile(scanner.next());
        System.out.println("enter your address:");
        logWriter.getInstance().writeToFile(scanner.next());
        System.out.println("enter your phone number:");
        logWriter.getInstance().writeToFile(scanner.next());

        ///Exercise 4///
        Drivable car = CarFactory.getcar("Fiat");
        car.drive();

        ///Exericse 5///
       //https://github.com/ben27ben/firstProject//
        ///Exercise 7///
        //A repository in Maven holds build artifacts and dependencies of varying types//
        // There are exactly two types of repositories: local and remote//

        ///Exercise 8///

    }


}
