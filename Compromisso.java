public class Compromisso{
    private int dia;
    private int mes;
    private int hora;
    private String descricao;

    public Compromisso(){

    }

    public Compromisso(int dia, int mes, int hora, String descricao){
        this.dia = dia;
        this.mes = mes;
        this.hora = hora;
        this.descricao = descricao;
    }

    public int getDia(){
        return dia;
    }

    public void setDia(int dia){
        this.dia = dia;
    }

    public int getMes(){
        return mes;
    }

    public void setMes(int mes){
        this.mes = mes;
    }

    public int getHora(){
        return hora;
    }

    public void setHora(int hora){
        this.hora = hora;
    }

    public String getDescricao(){
        return descricao;
    }

    public void setDescricao(String descricao){
        this.descricao = descricao;
    }

}