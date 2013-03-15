
/**
 * Project stage2
 * Created By Mohammed.B.Olateju
 */

package stage2;


/**
 *
 */
public class Name {   
    private String bfcfirstname="Barcelona";
    private String bfcLastname=" Football Club";
    private String fcflumfirstname="Club le";
    private String fcflumlastname=" Fluminese";
    private String nyrdfirstname="New York";
    private String nyrdlastname=" Red Bulls";
    private String xxfcfirstname="XinXong";
    private String xxfclastname=" Football Club";
    private String butdfirstname="Al-Barsha";
    private String butdlastname=" United";
    private String sprbckfirstname="SpringBocks";
    private String sprbcklastname=" Football Club";
   
    public String getClubName(int number){
        String fullName="";
        if (number==1){
            fullName=this.bfcfirstname+this.bfcLastname;
        }else if (number==2){
            fullName=this.fcflumfirstname+this.fcflumlastname;            
        }else if (number==3){
            fullName=this.nyrdfirstname+this.nyrdlastname;
        }else if (number==4){
            fullName=this.xxfcfirstname+this.xxfclastname;            
        }else if (number==5){
            fullName=this.butdfirstname+this.butdlastname;            
        }else if (number==6){
            fullName=this.sprbckfirstname+this.sprbcklastname;            
        }
        return fullName;
    }

}
