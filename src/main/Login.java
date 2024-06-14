import java.util.HashMap;
import java.util.Scanner;

/*
 * @Authoe Sonia Cachon 
 * start: 6/13/2024
 * Represents A login page
 */
public class Login {
    private static HashMap<String, String> userInfo = new HashMap<>();
    public static Scanner scanner;

    /**
     * Supposed to simulate a user logining in
     * @param username
     * @param password
     * @return if user was able to login or not 
     * @throws LoginExceptions
     */
    public static boolean autenticateUser(String username, String password) throws LoginExceptions{
        if (userInfo.containsKey(username) && userInfo.get(username). equals(password)){
            System.out.println("You're Loged in");
            return true;
        }else if(!userInfo.containsKey(username)){
            // instead of throwing an exception maybe just change it to an print statement 
            throw new LoginExceptions("Username doesn't exist");
        }else{
             // instead of throwing an exception maybe just change it to an print statement 
            throw new LoginExceptions("Password is incorrect.");
        }
    }

/**
 * Suppose to ensure that a username is valid 
 * a username is valid as long as it doesn't already exist in the hashMap
 * @param username userinputed username
 * @return username the users username that is valid 
 */
    private static String validUser(String username)throws LoginExceptions{
        if(username == null){
            throw new LoginExceptions("Empty Username");
        }
        while(userInfo.containsKey(username)){
            System.out.print("Username already exist, enter new Username:");
            username = scanner.nextLine();
        }
        return username;
    }
    /**
     * Supposed to Valididate Password 
     * a valid password is 
     *      longer than 8 characters
     *      Conatins one UpperCase letter 
     *      conatins one lowercase letter
     *      Contains one digit 
     *      Contains one Symbol
     * @param password users perfered password 
     * @param password password that fits the paramerters above 
     */
    private static String validPassword(String password){
        while(password.length() < 8){
            System.out.print("password to short. Needs to be 8 characters long. \nEnter new Password:");
            password = scanner.nextLine();
        }
        return password;
    }

    /**
     * Creates a new User and logs it into the "Database"
     * @throws LoginExceptions
     */
    public static void CreateUser() throws LoginExceptions{
        System.out.print("Enter Username:");
        String username = validUser(scanner.nextLine());
        
        System.out.print("Enter password:");
        String Password = validPassword(scanner.nextLine());

        userInfo.put(username, Password);
        System.out.println("User has been created! ");

    }
    /**
     * Repesents logining in a user 
     */
    public static void loginUser() throws LoginExceptions{
        System.out.print("Enter Username:");
        String username = scanner.nextLine();
            
        System.out.print("Enter password:");
        String password = scanner.nextLine();
        autenticateUser(username,password);
    }

    public static void main(String[] args) throws LoginExceptions {
        scanner = new Scanner(System.in);
        System.out.print("Do you want to login? (y/n) ");
        String loginOrCreate = scanner.nextLine();
        if (loginOrCreate.equals("y")){
            loginUser();
        }else{
            CreateUser();
            loginUser();
        }
        


    }


}
