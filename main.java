import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Introduce
        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Write your name please:");
        String name = scanner1.nextLine();

        Scanner scanner2 = new Scanner(System.in);
        System.out.println("Write your last name please:");
        String surname = scanner2.nextLine();

        System.out.println("Hello, " + name + " " + surname);


        //Pesel
        Scanner scanner3 = new Scanner(System.in);
        System.out.println("Write your PESEL number:");
        String pesel = scanner3.nextLine();

        int number_of_digits = pesel.length();

        if (number_of_digits != 11){
            System.out.println("Wrong PESEL number");
        }
        else {
            System.out.println("All the information I can read from your PESEL\n");
        }

        if (pesel.charAt(0) == '0'){
            System.out.println("Your year of birth: 20"+pesel.charAt(0)+""+pesel.charAt(1));
        }

        if (pesel.charAt(0) != '0'){
            System.out.println("Your year of birth: 19"+pesel.charAt(0)+""+pesel.charAt(1));
        }

        if (pesel.charAt(0) != '0'){
            System.out.println("Your month of birth:"+pesel.charAt(2)+""+pesel.charAt(3));
        }

        if (pesel.charAt(0) == '0' & pesel.charAt(2) != 3){
            System.out.println("Your month of birh:0"+pesel.charAt(3));

        }

        System.out.println("Your day of birth: "+pesel.charAt(4)+""+pesel.charAt(5)+" ");

        //Sex
        if (name.endsWith("a")){
            System.out.println("You are a woman");
        }
        else {
            System.out.println("You are a man");
        }


    }
}
