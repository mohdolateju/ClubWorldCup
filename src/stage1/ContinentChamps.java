
/**
 * Project stage1
 * Created By Mohammed.B.Olateju
 */

package stage1;

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
    private double barcafcscore=3.0;
    private double fluminesescore=4.5;
    private double nyredbullscore=2.5;
    private double xinxonfcscore=3.5;
    private double bshautdscore=2.5;
    private double springbockscore=1.5;
    
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
    
    
    /**Gets the Overall Score of the Competitors from their Numbers*/
    public double getOverallScore(int clubnumber){
        double clubscore=0.0;
        if (1==clubnumber){
            clubscore=this.barcafcscore;
        }else if (2==clubnumber){
            clubscore=this.fluminesescore;
        }else if (3==clubnumber){
            clubscore=this.nyRedBullnum;
        }else if (4==clubnumber){
            clubscore=this.xinxonfcscore;
        }else if (5==clubnumber){
            clubscore=this.bshautdscore;
        }else if (6==clubnumber){
            clubscore=this.springbockscore;
        }
        return clubscore;
    }
    
    public void setOverallScore(){
        //Empty since I wont be setting anything
        
    }
    /**Gets the Full Details of the the Competitor from their Numbers*/
    public String getFullDetails(int clubnumber){
        String fulldetails="";
        if (1==clubnumber){
            fulldetails="Competition Number=> "+this.barcelonaFcnum+", "+this.barcafc+ "'s Ranking is "+this.barcalvl
                    +" they've achieved a score of "+this.barcafcscore+" and are from "+this.barcacnty;
        }else if (3==clubnumber){
            fulldetails="Competition Number=> "+this.nyRedBullnum+", "+this.nyrdbulls+ "'s Ranking is "+this.nyrblvl+
                    " they've achieved a score of "+this.nyredbullscore+" and are from "+this.nyrblcnty;
        }else if (2==clubnumber){
            fulldetails="Competition Number=> "+this.fcFluminesenum+", "+this.fcflum+ "'s Ranking is "+this.flumlvl+
                    " they've achieved a score of "+this.fluminesescore+" and are from "+this.flumcnty;
        }else if (4==clubnumber){
            fulldetails="Competition Number=> "+this.xinXonFcnum+", "+this.xinxfc+ "'s Ranking is "+this.xinxlvl+
                    " they've achieved a score of "+this.xinxonfcscore+" and are from "+this.xinxcnty;
        }else if (5==clubnumber){
            fulldetails="Competition Number=> "+this.barshautdnum+", "+this.barshautd+ "'s Ranking is "+this.bshutdlvl+
                    " they've achieved a score of "+this.bshautdscore+" and are from "+this.bshutdcnty;
        }else if (6==clubnumber){
            fulldetails="Competition Number=> "+this.springbckfcnum+", "+this.springbckfc+ "'s Ranking is "+this.sprbcklvl+
                    " they've achieved a score of "+this.springbockscore+" and are from "+this.sprbckcnty;
        }
        return fulldetails;
    }
    
    public void setFullDetails(){
        //Empty Since i wont be setting anything
        
    }
    /**Gets the Short Details of the the Competitor from their Numbers*/
    public String getShortDetails(int clubnumber) {
        String shrtdetails="";
        if (1==clubnumber){
            shrtdetails=this.barcelonaFcnum+" "+this.barcafc.charAt(0)+this.barcafc.charAt(10)
                    + this.barcafc.charAt(19)+" has an overall score of "+this.barcafcscore;
        }else if (3==clubnumber){
            shrtdetails=this.nyRedBullnum+" "+this.nyrdbulls.charAt(0)+this.nyrdbulls.charAt(4)
                    + this.nyrdbulls.charAt(9)+" has an overall score of "+this.nyredbullscore;
        }else if (2==clubnumber){
            shrtdetails=this.fcFluminesenum+" "+this.fcflum.substring(8, 12)
                    +" has an overall score of "+this.fluminesescore;
        }else if (4==clubnumber){
            shrtdetails=this.xinXonFcnum+" "+this.xinxfc.charAt(0)+this.xinxfc.charAt(8)
                    + this.xinxfc.charAt(17)+" has an overall score of "+this.xinxonfcscore;
        }else if (5==clubnumber){
            shrtdetails=this.barshautdnum+" "+this.barshautd.charAt(3)+this.barshautd.charAt(10)
                    +this.barshautd.toUpperCase().charAt(13)
                    + this.barshautd.toUpperCase().charAt(15)+" has a overall score of "+this.bshautdscore;
        }else if (6==clubnumber){
            shrtdetails=this.springbckfcnum+" "+this.springbckfc.charAt(0)+this.springbckfc.charAt(12)
                    + this.springbckfc.charAt(21)+" has an overall score of "+this.springbockscore;
        }
        return shrtdetails;
    }
    
    public void setShortDetails(){
        //Empty Since i wont be setting anything
    } 
}
