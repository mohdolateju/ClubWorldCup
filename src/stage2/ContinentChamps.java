
/**
 * Project stage2
 * Created By Mohammed.B.Olateju
 */

package stage2;

/**
 *
 */
public class ContinentChamps {
    
    //Number of Each Competitor
    private int barcelonaFcnum=1;
    private int fcFluminesenum=2;
    private int nyRedBullnum=3;
    private int xinXonFcnum=4;
    private int barshautdnum=5;
    private int springbckfcnum=6;
    
    //Names of the Competitor
    Name nm=new Name();
    private String barcafc=nm.getClubName(1);
    private String fcflum=nm.getClubName(2);
    private String nyrdbulls=nm.getClubName(3);
    private String xinxfc=nm.getClubName(4);
    private String barshautd=nm.getClubName(5);
    private String springbckfc=nm.getClubName(6);
    
    //Competitors Scores
    private int[] barcafcscore={4,4,4,2,2};
    private int[] fluminesescore={0,4,0,4,4};
    private int[] nyredbullscore={1,1,1,1,1};
    private int[] xinxonfcscore={1,4,1,1,1};
    private int[] bshautdscore={2,0,2,2,2};
    private int[] springbockscore={1,0,2,1,2};;
    
    //Level/Ranking of Competitors
    private String barcalvl="WorldClass";
    private String flumlvl="Professional";
    private String nyrblvl="Professional";
    private String xinxlvl="Amateur";
    private String bshutdlvl="Professional";
    private String sprbcklvl="Amateur";
    
    //Country of Each Competitor
    private String barcacnty = "Spain";
    private String flumcnty = "Brazil";
    private String nyrblcnty = "U.S.A";
    private String xinxcnty = "China";
    private String bshutdcnty = "U.A.E";
    private String sprbckcnty = "South Africa";
    
    public void ContChapms(){
        
    }
    
    
    /**Gets the Overall Score of the Competitors by dividing the total by 5 if 
        team is worldclass, 4 if the team is professional and 3 if the team is
        an amatuer club*/
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
        }
        
        
        return overallscore;
    }
    
    /**Gets all the scores of the club in a an array*/
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
        }
        return clubscore;
    }
    
    /**Empty for now*/
    public void setOverallScore(){
        //Empty since I wont be setting anything
        
    }
    
    /**Gets the Full Details of the the Competitor from their Numbers*/
    public String getFullDetails(int clubnumber){
        String fulldetails="";
        if (1==clubnumber){
            fulldetails="Competition Number=> "+this.barcelonaFcnum+", "+this.barcafc+ "'s Ranking is "+this.barcalvl+
                    ",\ntheir scores are "+getScores(1)[0]+","+getScores(1)[1]+","+getScores(1)[2]+","
                    +getScores(1)[3]+","+getScores(1)[4]
                    +" and they achieved an overall score of "+getOverallScore(1) 
                    +", "+this.barcafc+" are from "+this.barcacnty+".";
        }else if (3==clubnumber){
            fulldetails="Competition Number=> "+this.nyRedBullnum+", "+this.nyrdbulls+ "'s Ranking is "+this.nyrblvl+
                    ",\ntheir scores are "+getScores(3)[0]+","+getScores(3)[1]+","+getScores(3)[2]+","
                    +getScores(3)[3]+","+getScores(3)[4]+
                    " and they achieved an overall score of "+getOverallScore(3)+
                    ", "+this.nyrdbulls+" are from "+this.nyrblcnty+".";
        }else if (2==clubnumber){
            fulldetails="Competition Number=> "+this.fcFluminesenum+", "+this.fcflum+ "'s Ranking is "+this.flumlvl+
                    ",\ntheir scores are "+getScores(2)[0]+","+getScores(2)[1]+","+getScores(2)[2]+","
                    +getScores(2)[3]+","+getScores(2)[4]+
                    "  and they achieved an overall score of "+getOverallScore(2) +
                    ", "+this.fcflum+" are from "+this.flumcnty+".";
        }else if (4==clubnumber){
            fulldetails="Competition Number=> "+this.xinXonFcnum+", "+this.xinxfc+ "'s Ranking is "+this.xinxlvl+
                    ",\ntheir scores are "+getScores(4)[0]+","+getScores(4)[1]+","+getScores(4)[2]+","
                    +getScores(4)[3]+","+getScores(4)[4]+
                    " and they achieved an overallscore of "+getOverallScore(4) 
                    +", "+this.xinxfc+" are from "+this.xinxcnty+".";
        }else if (5==clubnumber){
            fulldetails="Competition Number=> "+this.barshautdnum+", "+this.barshautd+ "'s Ranking is "+this.bshutdlvl+
                    ",\ntheir scores are "+getScores(5)[0]+","+getScores(5)[1]+","+getScores(5)[2]+","
                    +getScores(5)[3]+","+getScores(5)[4]+
                    " and they achieved an overall score of "+getOverallScore(5) 
                    +", "+this.barshautd+" are from "+this.bshutdcnty+".";
        }else if (6==clubnumber){
            fulldetails="Competition Number=> "+this.springbckfcnum+", "+this.springbckfc+ "'s Ranking is "+this.sprbcklvl+
                    ",\ntheir scores are "+getScores(6)[0]+","+getScores(6)[1]+","+getScores(6)[2]+","
                    +getScores(6)[3]+","+getScores(6)[4]+
                    " and they achieved an overall score of "+getOverallScore(6) +
                    ", "+this.springbckfc+" are from "+this.sprbckcnty+".";
        }
        return fulldetails;
    }
    
    /**Empty for now*/
    public void setFullDetails(){
        //Empty Since i wont be setting anything
        
    }
    /**Gets the Short Details of the the Competitor from their Numbers*/
    public String getShortDetails(int clubnumber) {
        String shrtdetails="";
        if (1==clubnumber){
            shrtdetails=this.barcelonaFcnum+" "+this.barcafc.charAt(0)+this.barcafc.charAt(10)
                    + this.barcafc.charAt(19)+" has an overall score of "+this.getOverallScore(1);
        }else if (3==clubnumber){
            shrtdetails=this.nyRedBullnum+" "+this.nyrdbulls.charAt(0)+this.nyrdbulls.charAt(4)
                    + this.nyrdbulls.charAt(9)+" has an overall score of "+getOverallScore(3);
        }else if (2==clubnumber){
            shrtdetails=this.fcFluminesenum+" "+this.fcflum.substring(8, 12)
                    +" has an overall score of "+getOverallScore(2);
        }else if (4==clubnumber){
            shrtdetails=this.xinXonFcnum+" "+this.xinxfc.charAt(0)+this.xinxfc.charAt(8)
                    + this.xinxfc.charAt(17)+" has an overall score of "+getOverallScore(4);
        }else if (5==clubnumber){
            shrtdetails=this.barshautdnum+" "+this.barshautd.charAt(3)+this.barshautd.charAt(10)
                    +this.barshautd.toUpperCase().charAt(13)
                    + this.barshautd.toUpperCase().charAt(15)+" has a overall score of "+getOverallScore(5);
        }else if (6==clubnumber){
            shrtdetails=this.springbckfcnum+" "+this.springbckfc.charAt(0)+this.springbckfc.charAt(12)
                    + this.springbckfc.charAt(21)+" has an overall score of "+getOverallScore(6);
        }
        return shrtdetails;
    }
    
    public void setShortDetails(){
        //Empty Since i wont be setting anything
    } 
}
