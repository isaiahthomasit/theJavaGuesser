import java.util.Scanner;

public class Guesser{
  static Scanner input = new Scanner(System.in);

  // menu function

  public static int menu(){
    System.out.println(" ");
    System.out.println("0) exit");
    System.out.println("1) human guesser");
    System.out.println("2) computer guesser\n");

    System.out.print("please enter number 0-2: ");
    int choice = input.nextInt();

    return choice;

  }

  // main function

  public static void main(String[] args){
    int choice = -1;

    while (choice != 0){
      choice = menu();
      
      if (choice == 1){
        humanGuesser();

      }
      
      else if (choice == 2){
        computerGuesser();

      }

      else if (choice != 0){
        System.out.println("ERROR: Invalid choice!");

      }

    }  

  }

  // humanGuesser function

  public static void humanGuesser(){
    int secretNumber = (int) (Math.random() * 100) + 1;
    int guess = 0;

    while (guess != secretNumber){
      System.out.print("enter your guess 1-100: ");
      guess = input.nextInt();

      if (guess < secretNumber){
        System.out.println("too low!");

      }

      else if (guess > secretNumber){
        System.out.println("too high!");
      
      }

      else{
        System.out.println("correct! you got it!");
      
      }
      
    }

  }

  // computerGuesser function

  public static void computerGuesser(){
    int lowerBound = 1;
    int upperBound = 100;	  
    boolean correct = false;

    while (!correct){
      int guess = (lowerBound + upperBound) / 2;

      System.out.println(" ");
      System.out.println("my guess is " + guess);
      System.out.println(" ");

      System.out.println("H) too high!");
      System.out.println("L) too low!");
      System.out.println("C) correct! you got it!\n");
      System.out.print("enter a response: ");
      String response = input.next().toUpperCase();

      if (response.equals("L")){
      lowerBound = guess + 1;

      }

      else if (response.equals("H")){
      upperBound = guess - 1;

      }

      else if (response.equals("C")){
      correct = true;

      }

      else{
        System.out.println("Please enter H, L, or C");
      
      }
    
    }

    System.out.println("yay! i guessed it!");

  }

}
