import java.util.Scanner;


// menu function

public static int menu(){
  System.out.println("0) exit");
  System.out.println("1) human guesser");
  System.out.println("2) computer guesser");

  Scanner input = new Scanner(System.in);
  System.out.println("please enter number 0-2:");
  int choice = input.nextInt();

  return choice;

}

// main function

public static void main(String[] args){
  int choice = -1;

  while (choice != 0){
    choice = menu();
    
    if (choice == 1){
      // run human guesser

    }
	  
    else if (choice == 2){
      // run computer guesser

    }

    else if (choice != 0){
      System.out.println("ERROR: Invaild choice!");

    }

  }  

}

// humanGuesser function


