import java.awt.Color;

public class S extends forme {
    public int [][]Coordonees;
    public int []origine;

    public S(Color c){
        super(c);
        int [] temp={0,0};                  // premère colonne abscisse, 2ème colonne ordonée
        origine=temp;                     
        int [][]tab={{origine[0]-1,origine[0],origine[0]+1},{origine[1],origine[1]+1,origine[1]+1}};  //idem pour les formes
        Coordonees=tab;

    }
    public void descendre(){
        origine[1]=origine[1]+1;
    }
}
