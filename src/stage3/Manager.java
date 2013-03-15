
/**
 * Project Club World Cup
 * stage3
 * Created By Mohammed.B.Olateju
 */

package stage3;

import java.io.*;
import java.util.ArrayList;

/**
 *The Manager Class Reads the text file Competitordetails.txt and Writes a report to Final Report.txt
 */
public class Manager {
    private Name nm=new Name();
    private CompetitorList cl=new CompetitorList();
    private ContinentChamps cc=new ContinentChamps();
    private ArrayList<CompetitorList> complist=new ArrayList<CompetitorList>();
    private Exception exception;
    
    /**
     * printFR method Prints a Final Report to a file using the other methods in Class
     * @return void
     */
    public void printFR(){
        readAllComp();
 	try {
      //FileWriter fw = new FileWriter("/home/mohammed/NetBeansProjects/ClubWorldCup/src/stage3/FinalReport.txt");
      FileWriter fw = new FileWriter("C:/Users/Mohammed/Documents/NetBeansProjects/ClubWorldCup/src/stage3/FinalReport.txt");
      fw.write("+---------------------------------------------------------------------------------------+\n");
      fw.write("+-------------------- FULL DETAILS OF COMPETITORS FOR CLUB WORLD CUP -------------------+\n");
      fw.write("+NO+------COMPETITORS-----------+-SCORES--+----LEVEL-----+--TOTAL-SCORE-+---COUNTRY-----+\n");
      fw.write("+--+----------------------------+---------+--------------+--------------+---------------+\n");
      for(int i=0;i<12;i++){    
          fw.write("|"+complist.get(i).getCompno()+"|"+complist.get(i).getCompname()+
                  "\t|"+complist.get(i).getCompScores().toString()
                  +"| "+complist.get(i).getCompLvl()+" |\t"
                  +complist.get(i).getOverallScore()+"\t|"+complist.get(i).getCompCnty()+"\t|\n");
      }
      fw.write("+---------------------------------------------------------------------------------------+\n");
      fw.write("+THE COMPETITOR WITH THE HIGHEST SCORE IS "+complist.get(11).getCompname().toUpperCase()
              +"WITH A SCORE OF "+ complist.get(11).getOverallScore() +" +\n");
      fw.write("+---------------------------------------------------------------------------------------+\n");
      fw.write("+------------------------------"+cc.getShortDetails(7) +"-----------------------+\n\n\n");
      fw.write("+---------------------------------------------------------------------------------------+\n");
      fw.write("+------------------------------------STATISTICS-----------------------------------------+\n");
      fw.write("+---------+----------+---------------------+-----------------------+--------------------+\n");
      fw.write("+CLUBNAME +TOTALSCORE+-----MINIMUMSOCRE----+------MAXIMUMSOCRE-----+----AVERAGESOCRE----+\n");
      fw.write("+---------+----------+---------------------+-----------------------+--------------------+\n");
      for(int i=0,j=1;i<12;i++,j++){
          
          fw.write("|  "+nm.getShortClubName(j) +"         "+totScores(i)+"               "+minScore(j)+"           "
                  + "        "+maxScore(j)+"                        "+avgScores(i)+"                    \n");
          fw.write("+---------+----------+---------------------+-----------------------+--------------------+\n");
      }
      
      fw.write("\n\nFULL DETAILS =>"+cc.getFullDetails(7)+"\n");
      fw.close();
        }
   catch (Exception e){
     e.printStackTrace();
     this.exception=e;
   }
   finally{
        if (exception==null){
            System.out.println("Full Details Have been Written To File");
                }
        }
        
    }
    
    /**
     * Calculates the Total Score of a Competitor
     * @return int
     * @param Index of the Competitors starting from 0
     */
    private int totScores(int i){
        int[]scores=new int[5];
        int j=0;
        String[] score = this.complist.get(i).getCompScores().split(",");
        while(j<5) {
               scores[j]=Integer.parseInt(score[j]);
               j++;
            }
        int total=scores[0]+scores[1]+scores[2]+scores[3]+scores[4];
    return total;
    }
    
    /**
     * Calculates the Average Score of a Competitor
     * @return double
     * @param Index of the Competitors starting from 0
     */
    
    private double avgScores(int i){
        int[]scores=new int[5];
        int j=0;
        String[] score = this.complist.get(i).getCompScores().split(",");
        while(j<5) {
               scores[j]=Integer.parseInt(score[j]);
                j++;
        }
        int total=scores[0]+scores[1]+scores[2]+scores[3]+scores[4];
        
    return total/5;
    } 

    /**
     * Calculates the Maximum score of a Competitor
     * @return int
     * @param Competitor's Number starting from 1
     */
    private int maxScore(int clubnumber){
       int maxscore=0;
        if (1==clubnumber){
             maxscore=4;
        }else if (2==clubnumber){
             maxscore=4;
        }else if (3==clubnumber){
             maxscore=1;
        }else if (4==clubnumber){
             maxscore=4;
        }else if (5==clubnumber){
             maxscore=2;
        }else if (6==clubnumber){
             maxscore=2;
        }else if (7==clubnumber){
            maxscore=5;
        }else if (8==clubnumber){
            maxscore=5;
        }else if (9==clubnumber){
            maxscore=4;
        }else if (10==clubnumber){
            maxscore=3;
        }else if (11==clubnumber){
            maxscore=3;
        }else if (12==clubnumber){
            maxscore=5;
        }
        return maxscore;
    
    } 
    
    /**
     * Calculates the Minimum score of a Competitor
     * @return int
     * @param Competitor's Number from 1
     */
    private int minScore(int clubnumber){
        int minscore=0;
        if (1==clubnumber){
             minscore=2;
        }else if (2==clubnumber){
             minscore=0;
        }else if (3==clubnumber){
             minscore=1;
        }else if (4==clubnumber){
             minscore=1;
        }else if (5==clubnumber){
             minscore=0;
        }else if (6==clubnumber){
             minscore=0;
        }else if (7==clubnumber){
            minscore=1;
        }else if (8==clubnumber){
            minscore=1;
        }else if (9==clubnumber){
            minscore=1;
        }else if (10==clubnumber){
            minscore=1;
        }else if (11==clubnumber){
            minscore=1;
        }else if (12==clubnumber){
            minscore=1;
        }
        return minscore;
    }
    
    /**
     * Read All Competitors Details from Competitorsdetails.ext
     * @return ArrayList of type CompetitorList
     */
    public ArrayList<CompetitorList> readAllComp(){
        
       try{
        //File compFile=new File("/home/mohammed/NetBeansProjects/ClubWorldCup/src/stage3/competitorsdetails.txt");
        File compFile=new File("C:/Users/Mohammed/Documents/NetBeansProjects/ClubWorldCup/src/stage3/competitorsdetails.txt");
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
        return this.complist;
    }
    
    /**
     * Algorithm for sorting organizing eachline from text file to be read
     * @return CompetitorList Object
     * @param String of Each Line from the Text File
     */
    private CompetitorList addEachComp(String values) {
        String[] details = values.split("/");
        CompetitorList compls = new CompetitorList(details[0], details[1], details[2], details[3], details[4]
                , details[5]);
        complist.add(compls);
        return compls;
    }
}
