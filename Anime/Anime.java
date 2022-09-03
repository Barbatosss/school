public class Anime {
    String title;
    int episodes;
    int runtimePerEP;
    String CharaName;
    String seiyuu;
    
public Anime(String ttl, int ep, int rnp , String cn, String cv){
    title = ttl;
    episodes = ep;
    runtimePerEP = rnp;  
    CharaName = cn;
    seiyuu = cv;
    
System.out.println("the title is " + title + "\n" + "with " + episodes + "episodes " + "\n" + "and a runtime of " + runtimePerEP + "minutes per episode " + "\n" + "introducing " + CharaName + "\n" + "voiced by " + seiyuu );

 }



}
