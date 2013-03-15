
/**
 * Project Club World Cup
 * stage3
 * Created By Mohammed.B.Olateju
 */

package stage3;


/**
 * This Class Contains Basic  methods for the Project with methods to create Full Details,
 * Short Details, getting All Scores of Competitors and getting Overall Scores.
 */
public class ContinentChamps {
    
    //Number of Each Competitor
    private int barcelonaFcnum=1;
    private int fcFluminesenum=2;
    private int nyRedBullnum=3;
    private int xinXonFcnum=4;
    private int barshautdnum=5;
    private int springbckfcnum=6;
    private int rmfcnum=7;
    private int intfcnum=8;
    private int lagnum=9;
    private int hkutdnum=10;
    private int tcometsnum=11;
    private int prfcnum=12;
    
    //Names of the Competitor
    private Name nm=new Name();
    private String barcafc=nm.getFullClubName(1);
    private String fcflum=nm.getFullClubName(2);
    private String nyrdbulls=nm.getFullClubName(3);
    private String xinxfc=nm.getFullClubName(4);
    private String barshautd=nm.getFullClubName(5);
    private String springbckfc=nm.getFullClubName(6);
    private String rmfc=nm.getFullClubName(7);
    private String intfc=nm.getFullClubName(8);
    private String lag=nm.getFullClubName(9);
    private String hkutd=nm.getFullClubName(10);
    private String tcomets=nm.getFullClubName(11);
    private String prfc=nm.getFullClubName(12);
    
    //Competitors Scores
    private int[] barcafcscore={4,4,4,2,2};
    private int[] fluminesescore={0,4,0,4,4};
    private int[] nyredbullscore={1,1,1,1,1};
    private int[] xinxonfcscore={1,4,1,1,1};
    private int[] bshautdscore={2,0,2,2,2};
    private int[] springbockscore={1,0,2,1,2};
    private int[] realmdfcscore={2,2,3,5,2};
    private int[] intfcscore={5,5,1,3,4};
    private int[] lagscore={4,2,1,1,1};
    private int[] hkutdscore={1,1,1,2,3};
    private int[] tcometsscore={3,1,2,1,3};
    private int[] prfcscore={5,1,2,3,4};
    
    
    //Level/Ranking of Competitors
    private String barcalvl="WorldClass";
    private String flumlvl="Professional";
    private String nyrblvl="Professional";
    private String xinxlvl="Amateur";
    private String bshutdlvl="Professional";
    private String sprbcklvl="Amateur";
    private String rmfclvl="WorldClass";
    private String intfclvl="Professional";
    private String laglvl="Professional";
    private String hkutdlvl="Amateur";
    private String tcometslvl="Amateur";
    private String prfclvl="Amateur";
    
    //Country of Each Competitor
    private String barcacnty = "Spain";
    private String flumcnty = "Brazil";
    private String nyrblcnty = "U.S.A";
    private String xinxcnty = "China";
    private String bshutdcnty = "U.A.E";
    private String sprbckcnty = "South Africa";
    private String rmfccnty="Spain";
    private String intfccnty="Brazil";
    private String lagcnty="U.S.A";
    private String hkutdcnty="China";
    private String tcometscnty="U.A.E";
    private String prfccnty="South Africa";
    

    
    public void ContChapms(){
        
    }
    
    
    /**Gets the Overall Score of the Competitors by dividing the total by 5 if 
      *team is worldclass, 4 if the team is professional and 3 if the team is
      *an amatuer club
      * @return double
      * @param Competitor Number Starting from 1
      */
    
    public double getOverallScore(int clubnumber){
        int[] clubscore=new int[5];
        double overallscore=0.0;
        if (1==clubnumber){
            clubscore=this.barcafcscore;
            int total=clubscore[0]+clubscore[1]+clubscore[2]+clubscore[3]+clubscore[4];
            overallscore=(total/5);
        }else if (2==clubnumber){
            clubscore=this.fluminesescore;
            int total=clubscore[0]+clubscore[1]+clubscore[2]+clubscore[3]+clubscore[4];
            overallscore=(total/4);
        }else if (3==clubnumber){
            clubscore=this.nyredbullscore;
            int total=clubscore[0]+clubscore[1]+clubscore[2]+clubscore[3]+clubscore[4];
            overallscore=(total/4);
        }else if (4==clubnumber){
            clubscore=this.xinxonfcscore;
            int total=clubscore[0]+clubscore[1]+clubscore[2]+clubscore[3]+clubscore[4];
            overallscore=(total/3);
        }else if (5==clubnumber){
            clubscore=this.bshautdscore;
            int total=clubscore[0]+clubscore[1]+clubscore[2]+clubscore[3]+clubscore[4];
            overallscore=(total/4);
        }else if (6==clubnumber){
            clubscore=this.springbockscore;
            int total=clubscore[0]+clubscore[1]+clubscore[2]+clubscore[3]+clubscore[4];
            overallscore=(total/3);
        }else if (7==clubnumber){
            clubscore=this.realmdfcscore;
            int total=clubscore[0]+clubscore[1]+clubscore[2]+clubscore[3]+clubscore[4];
            overallscore=(total/5);
        }else if (8==clubnumber){
            clubscore=this.intfcscore;
            int total=clubscore[0]+clubscore[1]+clubscore[2]+clubscore[3]+clubscore[4];
            overallscore=(total/4);
        }else if (9==clubnumber){
            clubscore=this.lagscore;
            int total=clubscore[0]+clubscore[1]+clubscore[2]+clubscore[3]+clubscore[4];
            overallscore=(total/4);
        }else if (10==clubnumber){
            clubscore=this.hkutdscore;
            int total=clubscore[0]+clubscore[1]+clubscore[2]+clubscore[3]+clubscore[4];
            overallscore=(total/3);
        }else if (11==clubnumber){
            clubscore=this.tcometsscore;
            int total=clubscore[0]+clubscore[1]+clubscore[2]+clubscore[3]+clubscore[4];
            overallscore=(total/3);
        }else if (12==clubnumber){
            clubscore=this.prfcscore;
            int total=clubscore[0]+clubscore[1]+clubscore[2]+clubscore[3]+clubscore[4];
            overallscore=(total/3);
        }
        
        
        return overallscore;
    }
    
    /**
     * Gets all the scores of the club in a an array
     * @return int[]
     * @param Club number starting from 1
     */
    public int[] getScores(int clubnumber){
        int[] clubscore={0,0,0,0,0};
        if (1==clubnumber){
            clubscore=this.barcafcscore;
        }else if (2==clubnumber){
            clubscore=this.fluminesescore;
        }else if (3==clubnumber){
            clubscore=this.nyredbullscore;
        }else if (4==clubnumber){
            clubscore=this.xinxonfcscore;
        }else if (5==clubnumber){
            clubscore=this.bshautdscore;
        }else if (6==clubnumber){
            clubscore=this.springbockscore;
        }else if (7==clubnumber){
            clubscore=this.realmdfcscore;
        }else if (8==clubnumber){
            clubscore=this.intfcscore;
        }else if (9==clubnumber){
            clubscore=this.lagscore;
        }else if (10==clubnumber){
            clubscore=this.hkutdscore;
        }else if (11==clubnumber){
            clubscore=this.tcometsscore;
        }else if (12==clubnumber){
            clubscore=this.prfcscore;
        }
        return clubscore;
    }
    
    /**
     * Empty for now this function doesn't do anything
     */
    public void setOverallScore(){
        //Empty since I wont be setting anything
        
    }
    
    /**
     * Gets the Full Details of a Competitor from their Numbers
     * @return String
     * @param  Competitor's Number Starting from 1
     */
    public String getFullDetails(int clubnumber){
        String fulldetails="Not A Valid Competitor Number";
        if (1==clubnumber){
            fulldetails="Competition Number=> "+this.barcelonaFcnum+", "+this.barcafc+ "'s Ranking is "+this.barcalvl+
                    ",their scores are "+getScores(1)[0]+","+getScores(1)[1]+","+getScores(1)[2]+","
                    +getScores(1)[3]+","+getScores(1)[4]
                    +" and they achieved an overall score of "+getOverallScore(1) 
                    +", "+this.barcafc+" are from "+this.barcacnty+".";
        }else if (3==clubnumber){
            fulldetails="Competition Number=> "+this.nyRedBullnum+", "+this.nyrdbulls+ "'s Ranking is "+this.nyrblvl+
                    ",their scores are "+getScores(3)[0]+","+getScores(3)[1]+","+getScores(3)[2]+","
                    +getScores(3)[3]+","+getScores(3)[4]+
                    " and they achieved an overall score of "+getOverallScore(3)+
                    ", "+this.nyrdbulls+" are from "+this.nyrblcnty+".";
        }else if (2==clubnumber){
            fulldetails="Competition Number=> "+this.fcFluminesenum+", "+this.fcflum+ "'s Ranking is "+this.flumlvl+
                    ",their scores are "+getScores(2)[0]+","+getScores(2)[1]+","+getScores(2)[2]+","
                    +getScores(2)[3]+","+getScores(2)[4]+
                    "  and they achieved an overall score of "+getOverallScore(2) +
                    ", "+this.fcflum+" are from "+this.flumcnty+".";
        }else if (4==clubnumber){
            fulldetails="Competition Number=> "+this.xinXonFcnum+", "+this.xinxfc+ "'s Ranking is "+this.xinxlvl+
                    ",their scores are "+getScores(4)[0]+","+getScores(4)[1]+","+getScores(4)[2]+","
                    +getScores(4)[3]+","+getScores(4)[4]+
                    " and they achieved an overallscore of "+getOverallScore(4) 
                    +", "+this.xinxfc+" are from "+this.xinxcnty+".";
        }else if (5==clubnumber){
            fulldetails="Competition Number=> "+this.barshautdnum+", "+this.barshautd+ "'s Ranking is "+this.bshutdlvl+
                    ",their scores are "+getScores(5)[0]+","+getScores(5)[1]+","+getScores(5)[2]+","
                    +getScores(5)[3]+","+getScores(5)[4]+
                    " and they achieved an overall score of "+getOverallScore(5) 
                    +", "+this.barshautd+" are from "+this.bshutdcnty+".";
        }else if (6==clubnumber){
            fulldetails="Competition Number=> "+this.springbckfcnum+", "+this.springbckfc+ "'s Ranking is "+this.sprbcklvl+
                    ",their scores are "+getScores(6)[0]+","+getScores(6)[1]+","+getScores(6)[2]+","
                    +getScores(6)[3]+","+getScores(6)[4]+
                    " and they achieved an overall score of "+getOverallScore(6) +
                    ", "+this.springbckfc+" are from "+this.sprbckcnty+".";
        }else if (7==clubnumber){
            fulldetails="Competition Number=> "+this.rmfcnum+", "+this.rmfc+ "'s Ranking is "+this.rmfclvl+
                    ",their scores are "+getScores(7)[0]+","+getScores(7)[1]+","+getScores(7)[2]+","
                    +getScores(7)[3]+","+getScores(7)[4]+
                    " and they achieved an overall score of "+getOverallScore(7) +
                    ", "+this.rmfc+" are from "+this.rmfccnty+".";
        }else if (8==clubnumber){
            fulldetails="Competition Number=> "+this.intfcnum+", "+this.intfc+ "'s Ranking is "+this.intfclvl+
                    ",their scores are "+getScores(8)[0]+","+getScores(8)[1]+","+getScores(8)[2]+","
                    +getScores(8)[3]+","+getScores(8)[4]+
                    " and they achieved an overall score of "+getOverallScore(8) +
                    ", "+this.intfc+" are from "+this.intfccnty+".";
        }else if (9==clubnumber){
            fulldetails="Competition Number=> "+this.lagnum+", "+this.lag+ "'s Ranking is "+this.laglvl+
                    ",their scores are "+getScores(9)[0]+","+getScores(9)[1]+","+getScores(9)[2]+","
                    +getScores(9)[3]+","+getScores(9)[4]+
                    " and they achieved an overall score of "+getOverallScore(9) +
                    ", "+this.lag+" are from "+this.lagcnty+".";
        }else if (10==clubnumber){
            fulldetails="Competition Number=> "+this.hkutdnum+", "+this.hkutd+ "'s Ranking is "+this.hkutdlvl+
                    ",their scores are "+getScores(10)[0]+","+getScores(10)[1]+","+getScores(10)[2]+","
                    +getScores(10)[3]+","+getScores(10)[4]+
                    " and they achieved an overall score of "+getOverallScore(10) +
                    ", "+this.hkutd+" are from "+this.hkutdcnty+".";
        }else if (11==clubnumber){
            fulldetails="Competition Number=> "+this.tcometsnum+", "+this.tcomets+ "'s Ranking is "+this.tcometslvl+
                    ",their scores are "+getScores(11)[0]+","+getScores(11)[1]+","+getScores(11)[2]+","
                    +getScores(11)[3]+","+getScores(11)[4]+
                    " and they achieved an overall score of "+getOverallScore(11) +
                    ", "+this.tcomets+" are from "+this.tcometscnty+".";
        }else if (12==clubnumber){
            fulldetails="Competition Number=> "+this.prfcnum+", "+this.prfc+ "'s Ranking is "+this.prfclvl+
                    ",their scores are "+getScores(12)[0]+","+getScores(12)[1]+","+getScores(12)[2]+","
                    +getScores(12)[3]+","+getScores(12)[4]+
                    " and they achieved an overall score of "+getOverallScore(12) +
                    ", "+this.prfc+" are from "+this.prfccnty+".";
        }
        return fulldetails;
    }
    
    /**Empty for now this function doesn't do anything*/
    public void setFullDetails(){
        //Empty Since i wont be setting anything
        
    }
    /**
     * Gets the Short Details of the the Competitor from their Numbers
     * @return String
     * @param Competitors Number Stating from 1
     */
    public String getShortDetails(int clubnumber) {
        String shrtdetails="Not A Valid Competitor Number";
        if (1==clubnumber){
            shrtdetails=this.barcelonaFcnum+" "+nm.getShortClubName(clubnumber) 
                    +" has an overall score of "+this.getOverallScore(1);
        }else if (3==clubnumber){
            shrtdetails=this.nyRedBullnum+" "+nm.getShortClubName(clubnumber)+
                    " has an overall score of "+getOverallScore(3);
        }else if (2==clubnumber){
            shrtdetails=this.fcFluminesenum+" "+nm.getShortClubName(clubnumber)
                    +" has an overall score of "+getOverallScore(2);
        }else if (4==clubnumber){
            shrtdetails=this.xinXonFcnum+" "+nm.getShortClubName(clubnumber)
                    +" has an overall score of "+getOverallScore(4);
        }else if (5==clubnumber){
            shrtdetails=this.barshautdnum+" "+nm.getShortClubName(clubnumber)
                    +" has a overall score of "+getOverallScore(5);
        }else if (6==clubnumber){
            shrtdetails=this.springbckfcnum+" "+nm.getShortClubName(clubnumber)
                    +" has an overall score of "+getOverallScore(6);
        }else if (7==clubnumber){
            shrtdetails=this.rmfcnum+" "+nm.getShortClubName(clubnumber)
                    +" has an overall score of "+getOverallScore(7);
        }else if (8==clubnumber){
            shrtdetails=this.intfcnum+" "+nm.getShortClubName(clubnumber)
                    +" has an overall score of "+getOverallScore(8);
        }else if (9==clubnumber){
            shrtdetails=this.lagnum+" "+nm.getShortClubName(clubnumber)
                    +" has an overall score of "+getOverallScore(9);
        }else if (10==clubnumber){
            shrtdetails=this.hkutdnum+" "+nm.getShortClubName(clubnumber)
                    +" has a overall score of "+getOverallScore(10);
        }else if (11==clubnumber){
            shrtdetails=this.tcometsnum+" "+nm.getShortClubName(clubnumber)
                    +" has an overall score of "+getOverallScore(11);
        }else if (12==clubnumber){
            shrtdetails=this.prfcnum+" "+nm.getShortClubName(clubnumber)
                    +" has an overall score of "+getOverallScore(12);
        }
        
        return shrtdetails;
    }
    
    /**This Function doesn't do anything*/
    public void setShortDetails(){
        //Empty Since i wont be setting anything
    } 
}
