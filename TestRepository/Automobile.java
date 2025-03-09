public class Automobile {
    private Persona proprietario;

    public Persona getProprietario(){
        return this.proprietario;
    }

    protected void clearProprietario(){
        this.proprietario=null;
    }

    protected void setProprietario(Persona p){
        if(p!=null)
            this.proprietario=p;
    }

}
