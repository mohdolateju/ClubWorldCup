
/**
 * Project Club World Cup
 * stage3
 * Created By Mohammed.B.Olateju
 */

package stage4;

import java.io.FileWriter;
import java.util.ArrayList;

/**
 *The Manager Class Reads the text file Competitordetails.txt and Writes a report to Final Report.csv
 */
public class Manager {
    
    private CompetitorList compList=new CompetitorList();
    private Exception exception;
    
    /**
     * Manager Class Constructor
     * runs the reallAllComp method from the Competitor List Class to read Competitors 
     * from the textfile("competitordetails.txt")
     */
    public Manager(){
        compList.readAllComp();
    }

    /**
     * Gets the Short Details of a Competitor from their Competitor Number
     * using the array list of Competitors.
     * @return String
     * @param int(Competitor's Number)
     */
     public String getShortDetailsById(int id){
        return compList.getContChamps().get(id-1).getShortDetails();
    }
    
    
  
    /**
     * printFR method Prints a Final Report to a file using methods from the CompetitorList Class
     * @return void
     */
     public void printFR(){
        
        ArrayList<ContinentChamp> comp=compList.getContChamps();
 	try {
      //FileWriter fw = new FileWriter("../ClubWorldCup/src/stage4/FinalReportWithErrors.csv");
      FileWriter fw = new FileWriter("../ClubWorldCup/src/stage4/FinalReport.csv");
      fw.write(",,\n");
      fw.write(",,,FULL DETAILS OF COMPETITORS FOR CLUB WORLD CUP\n");
      fw.write("NO,COMPETITORS,SCORES,LEVEL,OVERALLSCORE,COUNTRY\n");
      fw.write("\n");
      for(int i=0;i<comp.size();i++){    
          
                  fw.write(comp.get(i).getCompNumber()+","
                  +comp.get(i).getCompName().getFullClubName()+
                  ","+comp.get(i).getScores()[0]+" "+comp.get(i).getScores()[1]+" "+comp.get(i).getScores()[2]
                  +" "+comp.get(i).getScores()[3]+" "+comp.get(i).getScores()[4]
                  +","+comp.get(i).getCompLevel()+","
                  +comp.get(i).getOverallScore()+","
                  +comp.get(i).getCompCountry()+"\n");
                   
      }
      //setHighestOverallscore();
      fw.write("\n");
      fw.write("(COMPETITOR WITH THE HIGHEST SCORE)"+comp.get(compList.getHighestOverallComp()).getFullDetails()+"\n");
      fw.write("\n");
      
      fw.write(",,(SHORT DETAILS)"+getShortDetailsById(7)+"\n");
      fw.write("\n");
      fw.write(",,STATISTICS");
      fw.write("\n");
      fw.write("CLUBNAME,TOTALSCORE,MINIMUMSCORE,MAXIMUMSCORE,AVERAGESCORE\n");
      fw.write("\n");
      for(int j=0;j<comp.size();j++){
          
          fw.write(comp.get(j).getCompName().getShortClubName()+","+
                  comp.get(j).totScores()+","
                  +comp.get(j).minScore()+","
                  +comp.get(j).maxScore()+","
                  +comp.get(j).avgScore()+"\n");
      }
      
      fw.write("\n\nFULL DETAILS =>"+comp.get(7).getFullDetails()+"\n");
      fw.close();
        }
   catch (Exception e){
     e.printStackTrace();
     this.exception=e;
   }
   finally{
        if (exception==null){
            System.out.println("\nFULL DETAILS OF ALL COMPETITORS HAVE BEEN WRITTEN TO THE FILE \"FinalReport.cvs\"");
                }
        }
        
    }
    
    
   
}
