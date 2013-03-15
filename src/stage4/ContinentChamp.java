
/**
 * Project Club World Cup
 * stage3
 * Created By Mohammed.B.Olateju
 */

package stage4;


/**
 * This Class Contains Basic  methods for the Project with methods to create Full Details,
 * Short Details, getting All Scores of Competitors and getting Overall Scores.
 */
public class ContinentChamp {
    
    private int compNumber;
    private Name compName;
    private int[] compScores=new int[5];
    private String compLevel;
    private String compCountry;
    
    /**
     * ContinentChamp(Competitor) Class Constructor
     * @param int Competitor Number, Name Competitor'sFullname, int[]Competitor Scores, String Competitor's Level
     * @param String Competitor's Country
     */
    public ContinentChamp(int number, Name name,int[] scores, String level, String country) {
		this.compNumber=number;
                this.compName=name;
                this.compScores=scores;
                this.compLevel=level;
                this.compCountry=country;
        }

    /**Gets the Competitor's Country*/
    public String getCompCountry() {
        return compCountry;
    }

    /**Gets the Competitor's Level*/
    public String getCompLevel() {
        return compLevel;
    }

    /**Gets the Competitor's Name*/
    public Name getCompName() {
        return compName;
    }

    /**Gets the Competitor's Number*/
    public int getCompNumber() {
        return compNumber;
    }


    
    
    /**Gets the Overall Score of the Competitors by dividing the total by 5 if 
      *team is worldclass, 4 if the team is professional and 3 if the team is
      *an amatuer club
      * @return double
      */
    
    public double getOverallScore(){
        double overallscore=0.0;
        if (this.compLevel.equalsIgnoreCase("Worldclass")){
            int total=this.compScores[0]+this.compScores[1]+this.compScores[2]+this.compScores[3]+this.compScores[4];
            overallscore=(total/5);
        }else if (this.compLevel.equalsIgnoreCase("Professional")){
            int total=this.compScores[0]+this.compScores[1]+this.compScores[2]+this.compScores[3]+this.compScores[4];
            overallscore=(total/4);
        }else if (this.compLevel.equalsIgnoreCase("Amateur")){
            int total=this.compScores[0]+this.compScores[1]+this.compScores[2]+this.compScores[3]+this.compScores[4];
            overallscore=(total/3);
        }
        return overallscore;
    }
    
    /**
     * Gets all the scores of the club as an array integers
     * @return int[]
     */
    public int[] getScores(){
        return this.compScores;
    }
    
    /**
     * Empty for now this function doesn't do anything
     */
    public void setOverallScore(){
        //Empty since I wont be setting anything
        
    }
    
    /**
     * Gets the Full Details of a Competitor 
     * @return String
     */
    public String getFullDetails(){
        String fulldetails;
            fulldetails="Competition Number=> "+this.compNumber+" "+this.compName.getFullClubName()+ "'s Ranking is "+this.compLevel+
                    " their scores are "+getScores()[0]+" "+getScores()[1]+" "+getScores()[2]+" "
                    +getScores()[3]+" "+getScores()[4]+
                    " and they achieved an overall score of "+getOverallScore()+
                    " "+this.compName.getFullClubName()+" are from "+this.compCountry+".";
        
        return fulldetails;
    }
    
    /**Empty for now this function doesn't do anything*/
    public void setFullDetails(){
        //Empty Since i wont be setting anything
        
    }
    
    /**
     * Gets the Short Details of the the Competitor
     * @return String
     */
    public String getShortDetails() {
        String shrtdetails;
        
            shrtdetails=this.compNumber+" "+this.compName.getShortClubName()
                    +" has an overall score of "+this.getOverallScore();
        
        
        return shrtdetails;
    }
    
    /**
     * Gets the Short Details of the the Competitor by id
     * @return String
     */
    public String getShortDetailsid(int id) {
        String shrtdetails=null;
         if (id==this.compNumber){
            shrtdetails=this.compNumber+" "+this.compName.getShortClubName()
                    +" has an overall score of "+this.getOverallScore();
         }
        
        return shrtdetails;
    }
    
    /**This Function doesn't do anything*/
    public void setShortDetails(){
        //Empty Since i wont be setting anything
    }
    
        /**
     * Calculates the Total Score of a Competitor
     * @return int

     */
    public int totScores(){
        int total=this.compScores[0]+this.compScores[1]+this.compScores[2]+
                this.compScores[3]+this.compScores[4];
        
        return total;
    }
    
    /**
     * Calculates the Average Score of a Competitor
     * @return double
     */
    
    public double avgScore(){
        int total=this.compScores[0]+this.compScores[1]+this.compScores[2]+
                this.compScores[3]+this.compScores[4];
        
        return total/5;
    } 

    /**
     * Calculates the Maximum score of a Competitor
     * @return int
     */
    public int maxScore(){
              int maxscore = this.compScores[0];  
                for(int i=0;i < this.compScores.length;i++){  
                    if(this.compScores[i] > maxscore){  
                            maxscore = this.compScores[i];  
                        }  
                }  

              return maxscore;
    } 
    
    /**
     * Calculates the Minimum score of a Competitor
     * @return int
     */
    public int minScore(){
        int minscore = this.compScores[0];  
            for(int i=1;i<this.compScores.length;i++){  
                if(this.compScores[i] < minscore){  
                    minscore = this.compScores[i];  
                }  
            }  
        return minscore;
    }
}
