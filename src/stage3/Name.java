
/**
 * Project Club World Cup
 * stage3
 * Created By Mohammed.B.Olateju
 */

package stage3;



/**
 *  Class where Full names and Short names of the Competitors are Stores
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
    private String rmfcfirstname="RealMadrid";
    private String rmfclastname=" Football Club";
    private String intfirstname="Intenactional";
    private String intlastname=" Football Club";
    private String lagfirstname="Los Angeles";
    private String laglastname=" Galaxy";
    private String hkutdfirstname="HongKong";
    private String hkutdlastname=" United";
    private String tcomfirstname="Tecom";
    private String tcomlastname=" Emirates";
    private String prfcfirstname="Pretoria";
    private String prfclastname=" Football Club";
   
    /**
     * Used to get Competitor's Full name
     * @param Competitor's number
     * @return String
     */
    public String getFullClubName(int number){
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
        }else if (number==7){
            fullName=this.rmfcfirstname+this.rmfclastname;            
        }else if (number==9){
            fullName=this.lagfirstname+this.laglastname;
        }else if (number==8){
            fullName=this.intfirstname+this.intlastname;            
        }else if (number==10){
            fullName=this.hkutdfirstname+this.hkutdlastname;
        }else if (number==11){
            fullName=this.tcomfirstname+this.tcomlastname;            
        }else if (number==12){
            fullName=this.prfcfirstname+this.prfclastname;            
        }
        return fullName;
    }
    
    /**
     * Used to get Competitor's Short name
     * @param Competitor's number
     * @return String
     */
    public String getShortClubName(int number){
        String shortName="";
        if (number==1){
            shortName=""+getFullClubName(number).charAt(0)+getFullClubName(number).charAt(10)
                        +getFullClubName(number).charAt(19);
        }else if (number==2){
            shortName=getFullClubName(number).substring(8, 12);
        }else if (number==3){
            shortName=""+getFullClubName(number).charAt(0)+getFullClubName(number).charAt(4)
                        +getFullClubName(number).charAt(9);
        }else if (number==4){
            shortName=""+getFullClubName(number).charAt(0)+getFullClubName(number).charAt(8)
                        +getFullClubName(number).charAt(17);
        }else if (number==5){
            shortName=""+getFullClubName(number).charAt(3)+getFullClubName(number).charAt(10)
                    +getFullClubName(number).toUpperCase().charAt(13)
                    +getFullClubName(number).toUpperCase().charAt(15);
        }else if (number==6){
            shortName=""+getFullClubName(number).charAt(0)+getFullClubName(number).charAt(12)
                        +getFullClubName(number).charAt(21);
        }else if (number==7){
            shortName=""+getFullClubName(number).charAt(0)+getFullClubName(number).charAt(4)
                      +getFullClubName(number).charAt(11)+getFullClubName(number).charAt(20)+"";
        }else if (number==9){
            shortName=""+getFullClubName(number).charAt(0)+getFullClubName(number).charAt(4)
                    + getFullClubName(number).charAt(12);
        }else if (number==8){
            shortName=""+getFullClubName(number).charAt(0)+getFullClubName(number).charAt(14)+
                        getFullClubName(number).charAt(23);
        }else if (number==10){
            shortName=""+getFullClubName(number).charAt(0)+getFullClubName(number).charAt(4)
                    +getFullClubName(number).charAt(9);
        }else if (number==11){
            shortName=""+getFullClubName(number).charAt(0)+getFullClubName(number).toUpperCase().charAt(4)
                    + getFullClubName(number).charAt(6);
        }else if (number==12){
            shortName=""+getFullClubName(number).charAt(0)+getFullClubName(number).charAt(9)
                    + getFullClubName(number).charAt(18);
        }
        return shortName;
    }
    

}
