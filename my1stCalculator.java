mport java.util.Scanner;

class My1stCalculator{
    static int num1 ,num2;
    
public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.println(" ");
    num1 = scan.nextInt();
    System.out.println(" ");
    char operator=scan.next().charAt(num2);
 
    


    switch (operator) {
        case ('+'):
        num2 =scan.nextInt();
        System.out.println(num1 - num2);

            break;
        case ('-'):
            num2 =scan.nextInt();
            System.out.println(num1 - num2);
            break;
        case ('*'):
            num2 =scan.nextInt();
            System.out.println(num1 * num2);
            break;
        case ('/'):
             num2 =scan.nextInt();
            System.out.println(num1 / num2);
            break;
    
        default:
           System.out.println("Choose an applicable math operator.");
            break;
    }

  
    
    scan.close();
}
}
