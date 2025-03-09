import java.util.List;

public class Persona {

    private List<Automobile> auto;

    public List<Automobile> getAuto(){
        return this.auto;
    }

    public void addAuto(Automobile a){
        Automobile automobile = new Automobile();
        automobile.setProprietario(this);
        this.auto.add(a);
    }

}
