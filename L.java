import java.awt.Color;

public class L extends forme{
    
    public L(Color c){
        super(c);
        int [] temp={0,0};                  // premère colonne abscisse, 2ème colonne ordonée
        origine=temp;                     
        int [][]tab={{origine[0]-1,origine[0]+1,origine[0]+1},{origine[1],origine[1],origine[1]+1}};  //idem pour les formes
        Coordonees=tab;
    }
    public void descendre(){
        origine[1]=origine[1]+1;
    }
}
