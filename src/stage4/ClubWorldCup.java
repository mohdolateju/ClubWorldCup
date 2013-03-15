/**@
 * Project Club World Cup
 * stage3
 * Created By Mohammed.B.Olateju
 */
package stage4;

import java.util.Scanner;

/**
 * 
 * This Class Contains the Main Method of the Application
 */
public class ClubWorldCup {

    /**
     * This is the Main Method of the Program
     */
    public static void main(String[] args) {

        System.out.println("WELCOME TO THE CLUB WORLD CUP, THERE ARE 12 CLUBS IN THE COMPETITION\n"
                + "ENTER AN NUMBER TO FROM 1-12 TO GET A SHORT INFORMATION ABOUT A CLUB");
        
        Scanner scanIn = new Scanner(System.in);
        String value=scanIn.nextLine();
        String trimmedvalue=value.trim();
        
        if(trimmedvalue.equals("1")||trimmedvalue.equals("2")||trimmedvalue.equals("3")||trimmedvalue.equals("4")||trimmedvalue.equals("5")
           ||trimmedvalue.equals("6")||trimmedvalue.equals("7")||trimmedvalue.equals("8")||trimmedvalue.equals("9")||trimmedvalue.equals("10")
           ||trimmedvalue.equals("11")||trimmedvalue.equals("12")){ 
                int number = Integer.parseInt(trimmedvalue);
                Manager mng=new Manager();
                System.out.println("\n"+mng.getShortDetailsById(number));
                mng.printFR();
        }else {
            System.out.println("\nWHAT YOU ENTERED IS NOT A NUMBER BETWEEN 1-12 PLEASE RESTART THE PROGRAM "
                    + "AND ENTER A NUMBER BETWEEN 1-12\n");
            }
    }

}
