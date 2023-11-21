package classe;

public class Data {
    int dia;
    int mes;
    int ano;

    Data(){
        dia = 1;
        mes = 1;
        ano = 1970;
    }

    Data(int dia, int mes, int ano){
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }

    String dataFormatada(){
        //return "Dia: " + dia + "\nMes: " + mes + "\nAno: " + ano;
    	
    	final String formatado = "DATA: %d/%s/%d";// Variavel local
        return String.format(formatado, dia, mes, ano);
    }
}
