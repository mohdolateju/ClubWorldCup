
/**
 * Project Club World Cup
 * stage3
 * Created By Mohammed.B.Olateju
 */

package stage4;



/**
 *  Class for the Full names and Short names of the Competitors
 */
public class Name {   
    
    private String firstName;
    private String middleName;
    private String lastName;
    

    /**
     * Name Class Constructor
     * @param String Firstname, String Middlename, String Lastname
     */
      public Name(String fName, String mName, String lName) {
		firstName = fName;
                middleName= mName;
		lastName = lName;
        }

    /**
     * Get Competitor's Full name
     * @return String
     */
    public String getFullClubName(){
        
        return this.firstName+" "+this.middleName+" "+this.lastName;
         
    }
    
    /**
     * Gets Competitor's Short name
     * @return String
     */
    public String getShortClubName(){
        String shrtName=""+this.firstName.charAt(0)+this.middleName.charAt(0)+this.lastName.charAt(0);
        return shrtName;
        
    }
    

}
