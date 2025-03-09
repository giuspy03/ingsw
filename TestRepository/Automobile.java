public class Automobile {
    private Persona proprietario;

    public Persona getProprietario(){
        return this.proprietario;
    }

    void setProprietario(Persona p){
        if(p!=null)
            this.proprietario=p;
    }

}
