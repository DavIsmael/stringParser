import java.util.Scanner;
public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input;
        while(true){
            System.out.print("Input a number, it will be parsed from String to Integer (type exit to exit): ");
            input = scanner.next();
            if(input.equalsIgnoreCase("exit")){
                System.out.println("Exiting the program..");
                break;
            }
            try{
                int parsedInput = Integer.parseInt(input);
                System.out.println("Parsed number: " + input);
            }catch(NumberFormatException e){
                System.out.println(e);
            }
        }
        scanner.close();
    }
}