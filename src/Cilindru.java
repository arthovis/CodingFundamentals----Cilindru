public class Cilindru {
    public static int r;
    public static int h;

    public Cilindru (int r, int h){
        this.r=r;
        this.h=h;
    }

    public static double getSurface(){
        return (2*(Math.PI*r*r))+(2*(Math.PI*r*h));
    }

    public static double getVolume(){
        return Math.PI*r*r*h;
    }

    public String toString(){
        return "Cilindrul are raza: "+r+" si inaltimea: "+h;
    }



}

