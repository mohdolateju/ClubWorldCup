/**@
 * Project Club World Cup
 * stage3
 * Created By Mohammed.B.Olateju
 */
package stage3;

import java.util.Scanner;

/**
 * 
 * This Class Contains the Main Method of the Application
 */
public class ClubWorldCup {

    /**
     * This is the Main Method of Stage 3
     */
    public static void main(String[] args) {
        ContinentChamps cc=new ContinentChamps();
        Manager mng=new Manager();
        System.out.println("WELCOME TO THE CLUB WORLD CUP, THERE ARE 12 CLUBS IN THE COMPETITION\n"
                + "ENTER AN NUMBER TO FROM 1-12 TO GET A SHORT INFORMATION ABOUT A CLUB");
       
        Scanner scanIn = new Scanner(System.in);
        String value=scanIn.nextLine();
        String vls=value.trim();
        
        if(vls.equals("1")||vls.equals("2")||vls.equals("3")||vls.equals("4")||vls.equals("5")
                ||vls.equals("6")||vls.equals("7")||vls.equals("8")||vls.equals("9")||vls.equals("10")
                ||vls.equals("11")||vls.equals("12")){
            int number = Integer.parseInt(vls);
           System.out.println(cc.getShortDetails(number)); 
        }else {
            System.out.println("WHAT YOU ENTERED IS NOT A NUMBER BETWEEN 1-12 PLEASE RESTART THE PROGRAM "
                    + "AND ENTER A NUMBER BETWEEN 1-12\n");
            }
 
        mng.printFR();
    }

}
