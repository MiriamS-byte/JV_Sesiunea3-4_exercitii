package itFactory.sesiunea3_4.exercitii3_4.geometrie_13.FormeGeometrice;

public class Triunghi {
    private int triunghiLatura1;
    private int triunghiLatura2;
    protected int triunghiLatura3;


    public int getTriunghiLatura1() {
        return triunghiLatura1;
    }

    public void setTriunghiLatura1(int triunghiLatura1) {
        this.triunghiLatura1 = triunghiLatura1;
    }


    public int getTriunghiLatura2() {
        return triunghiLatura2;
    }

    public void setTriunghiLatura2(int triunghiLatura2) {
        this.triunghiLatura2 = triunghiLatura2;
    }


    public int getTriunghiLatura3() {
        return triunghiLatura3;
    }

    public int perimetruTriunghi(int triunghiLatura1, int triunghiLatura2, int triunghiLatura3){
        return (triunghiLatura1 + triunghiLatura2 + triunghiLatura3);
    }


}
