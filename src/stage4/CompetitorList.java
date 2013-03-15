
/**
 * Project Club World Cup
 * stage3
 * Created By Mohammed.B.Olateju
 */

package stage4;
import java.io.*;
import java.util.ArrayList;


/**
 *  Competitor List Class that holds all the details of each Competitor in an ArrayList
 *  of ContinentChamp(Competitor) Objects.
 */
public class CompetitorList {
    private ArrayList <ContinentChamp> contChamps=new ArrayList<ContinentChamp>();
    
    
    /**Gets the ArrayList of ContinentalChamp(Competitor) Objects
     *@return ArrayList
     */
    public ArrayList<ContinentChamp> getContChamps() {
        return contChamps;
        
    }
    
   /**Gets the Id of the Highest Overall Competitor from the ContinentalChamp(Competitor) Objects
     *@return int
     */
    public int getHighestOverallComp() {
        int highestCompId=0;  
            for(int i=0;i < this.contChamps.size();i++){  
                
                double maxscore = this.contChamps.get(0).getOverallScore();
                if(this.contChamps.get(i).getOverallScore() > maxscore){  
                        maxscore = this.contChamps.get(i).getOverallScore();  
                        highestCompId = this.contChamps.get(i).getCompNumber();  
                    }  
            }  
          
         return highestCompId-1;
    }

    /**
     * Read All Competitors Details from Competitorsdetails.txt and populating the
     * ArrayList of ContinentalChamps(Competitor) Objects using the addEachComp Method
     */
    public void readAllComp(){
        
       try{
//      File compFile=new File("../ClubWorldCup/src/stage4/competitorsdetailswithErrors.txt");
        File compFile=new File("../ClubWorldCup/src/stage4/competitorsdetails.txt");
        FileReader file=new FileReader(compFile);
        BufferedReader Bfile=new BufferedReader(file);
        String compline=null;
        while((compline=Bfile.readLine())!=null){
            addEachComp(compline);
            }
        }
        catch(Exception e){
            e.printStackTrace();
        }
        
    }
    
    /**
     * Algorithm for sorting organizing eachline from text file to be read,
     * adding them and adding them to the ArrayList of ContinentalChamps(Competitor) Objects 
     * It is used by the readAllComp Method
     * @param String of Each Line from the Text File
     */
    private void addEachComp(String values) {
        
        String[] details = values.split("/");
        
        int compNo=Integer.parseInt(details[0]);
        
        String[]names=details[1].split(" ");
        Name compName=new Name(names[0],names[1],names[2]);
        
        String []tempCompScores=details[2].split(",");
        int[]CompScores=new int[5];
        for(int i=0;i<tempCompScores.length;i++){
        CompScores[i]=Integer.parseInt(tempCompScores[i]);
        }
        
        ContinentChamp compls = new ContinentChamp(compNo, compName, CompScores, details[3], details[4]);
        contChamps.add(compls);
        
    }
    
    
}
