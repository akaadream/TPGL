/**
 *
 * @author roudet
 */
public class Fraise {
    private double prix;
    private String origine;

    public Fraise()
    {
        this.prix = 0.5;  //prix en euros
        this.origine="Espagne";
    }

    public Fraise(double prix, String origine)
    {
	if(prix < 0)
	    this.prix = -prix;  //une solution possible pour interdire les prix negatifs
	else
	    this.prix = prix;

	if(origine.equals(""))
            this.origine = "Espagne";  //Espagne par défaut
	else
            this.origine = origine;
    }

    public double getPrix(){
	return prix;
    }

    public void setPrix(double prix){
	this.prix=prix;
    }

    public String getOrigine(){
	return origine;
    }

    public void setOrigine(String country){
	this.origine=origine;
    }

    @Override
    public String toString(){
        return "Fraise de " + origine + " a " + prix + " euros";
    }

    @Override
    public boolean equals(Object o){  //predicat pour tester si 2 oranges sont equivalentes
        if(o != null && getClass() == o.getClass()){
            Fraise fr = (Fraise) o;
            return (prix == fr.prix && origine.equals(fr.origine));
        }
        return false;
    }

    public boolean isSeedless() {  //predicat indiquant qu'une orange a des pepins
        return false;
    }
}
