public class wilder{
    //atributs
    private String name;
    private boolean aware;

    //constructeurs
    public wilder(String name) {
        this.name = name;
        this.aware = false;
    }

    public wilder(String name, boolean aware) {
        this.name = name;
        this.aware = true;
    }

    // méthode instanciée
    public String whoAmI() {
        if (aware == false){
            return "Je m'appelle " + this.getName() + " et je suis pas aware";
        }else{
            return "Je m'appelle " + this.getName() + " et je suis aware";
        }
        
    }

    // accesseurs (getters)
    public String getName() {
        return this.name;
    }

    public boolean isAware() {
        return this.aware;
    }

    // mutateurs (setters)
    public void setName(String name) {
        this.name = name;
    }

    public void setAware(boolean aware) {
        this.aware = aware;
    }
}