/**
 *
 * @author roudet
 */
public class Orange {
    private double prix;
    private String origine;
	
    public Orange() 
    {
        this.prix = 0.5;  //prix en euros
        this.origine="Espagne";
    }
    
    public Orange(double prix, String origine) 
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
 
    public void setOrigine(String origine){
	this.origine=origine;
    }

    @Override
    public String toString(){
        return "Orange de " + origine + " a " + prix + " euros";
    }

    @Override
    public boolean equals(Object o){  //predicat pour tester si 2 oranges sont equivalentes
        if(o != null && getClass() == o.getClass()){
            Orange or = (Orange) o;
            return (prix == or.prix && origine.equals(or.origine));
        }
        return false;
    }

    public boolean isSeedless() {  //predicat indiquant qu'une orange a des pepins
        return false;
    }


    public static void main (String[] args){
        //Test Daniel
        Orange o1 = new Orange();
        Orange o2 = new Orange();
        o2.setOrigine("britania");
        System.out.println("premier test Orange");
        if (o1.equals(o2))
            System.out.println("Méthode equal ne marche pas");
        else
            System.out.println("Méthode equal marche");

        //Test Yann
        Orange o = new Orange(2, "tortueLand");
        Orange oot = new Orange(1, "");
        Orange oot2 = new Orange(-1, "Daniel's House");
        System.out.println("orange 1 => " + o.getOrigine() + ":" + o.getPrix() + "euro");
        System.out.println("orange 2 => " + oot.getOrigine() + ":" + oot.getPrix() + "euro");
        System.out.println("orange 3 => " + oot2.getOrigine() + ":" + oot2.getPrix() + "euro");
   }
}
