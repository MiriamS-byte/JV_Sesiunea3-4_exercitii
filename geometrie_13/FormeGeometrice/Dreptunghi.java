package itFactory.sesiunea3_4.exercitii3_4.geometrie_13.FormeGeometrice;

public class Dreptunghi {
    private int dreptunghiLungime;
    private int dreptunghiLatime;



    public Dreptunghi(){
        this.dreptunghiLungime = dreptunghiLungime;
        this.dreptunghiLatime = dreptunghiLatime;
    }


    public int perimetruDreptunghi(int dreptunghiLungime, int dreptunghiLatime){
        return ((dreptunghiLungime + dreptunghiLatime) * 2);
    }

    public int arieDreptunghi(int dreptunghiLungime, int dreptunghiLatime){
        return (dreptunghiLungime * dreptunghiLatime);
    }
}