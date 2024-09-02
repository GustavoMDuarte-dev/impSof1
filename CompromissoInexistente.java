public class CompromissoInexistente extends Exception {
    private int dia;
    private int mes;
    private int ano;

    public CompromissoInexistente(int dia, int mes, int ano) {
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }
    
    public String toString() {
        return "Nao ha compromisso no dia " + dia + "/" + mes + "/" + ano;
    }
}
