import java.util.ArrayList;
import java.util.List;

public class Agenda {
    public String usuario;
    public int ano;
    public List<Compromisso> compromissos; // aqui declara uma lista do tipo Compromisso com o nome "compromissos"

    public Agenda(){
        this.compromissos = new ArrayList<>(); //aqui no construtor coloca o arraylist mas nao é expressamente nessessario
    }
    
    public Agenda(String usuario, int ano) {
        this.usuario = usuario;
        this.ano = ano;
        this.compromissos = new ArrayList<>();
    }

    public String getUsuario(){
        return usuario;
    }

    public void setUsuario(String usuario){
        this.usuario = usuario;
    }

    public int getAno(){
        return ano;
    }

    public void setAno(int ano){
        this.ano = ano;
    }


    public void addCompromisso(Compromisso compromisso){
        this.compromissos.add(compromisso);
    }

    public boolean delCompromisso(Compromisso compromisso){
        return this.compromissos.remove(compromisso);
    }

    public Compromisso getCompromisso(int dia, int mes, int hora){
        for(Compromisso compromisso : compromissos){
            if(compromisso.getDia() == dia && compromisso.getMes() == mes && compromisso.getHora() == hora){
                return compromisso;
            }
        }
        return null;
    }
    public List<Compromisso> getCompromissos() {
        return compromissos;
    }
}
