import java.util.List;

public class Persona {

    private List<Automobile> auto;

    public List<Automobile> getAuto(){
        return this.auto;
    }


    public void addAuto(Automobile a){
        if(a!=null){
            this.auto.add(a);
            a.setProprietario(this);
        }
    }

    public void removeAuto(Automobile a){
        if(a!=null){
            this.auto.remove(a);
            a.clearProprietario();
        }
    }

}
