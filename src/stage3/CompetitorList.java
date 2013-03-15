
/**
 * Project Club World Cup
 * stage3
 * Created By Mohammed.B.Olateju
 */

package stage3;


/**
 *  Competitor List Class that will be holding all the details of each Competitor
 *  Used by the Manager Class as an object type for ArrayList of the competitors
 */
public class CompetitorList {
    
    private String Compno;
    private String Compname="";
    private String CompScores; 
    private String OverallScore; 
    private String CompLvl="";
    private String CompCnty="";
    
    CompetitorList(){
    
    }
    
    /**
     * Overloaded CompetitorList Constructor that takes in all the Competitor's
     * Attributes
     * @param 1st parameter takes Competitor's Number, 2nd parameter takes 
     * Competitor's Name, 3rd parameter takes Competitor's Level, 4th parameter takes
     * the Competitor's Scores, 5th parameter takes Overall Score and 6th parameter takes
     * Competitor 's Country 
     * @return No return Value
     */
    CompetitorList(String Compno,String Compname, String CompLvl
            ,String CompScores, String OverallScore, String CompCnty){
        this.Compno=Compno;
        this.Compname=Compname;
        this.OverallScore= OverallScore;
        this.CompLvl=CompLvl;
        this.CompCnty=CompCnty;
        this.CompScores=CompScores;    
    }
    
    /**
     * Used to get Competitor's Number
     * @return String
     */
    public String getCompno() {
        return this.Compno;
    }

    /**
     * Used to get Competitor's Name
     * @return String
     */
    public String getCompname() {
        return this.Compname;
    }

    /**
     * Used to get Competitor's Scores
     * @return String
     */
    public String getCompScores() {
        return this.CompScores;
    }

    /**
     * Used to get Competitor's Overall Score
     * @return String
     */
    public String getOverallScore() {
        return this.OverallScore;
    }

    /**
     * Used to get Competitor's Level
     * @return String
     */
    public String getCompLvl() {
        return this.CompLvl;
    }

    /**
     * Used to get Competitor's Country
     * @return String
     */
    public String getCompCnty() {
        return this.CompCnty;
    }
    
    
}
