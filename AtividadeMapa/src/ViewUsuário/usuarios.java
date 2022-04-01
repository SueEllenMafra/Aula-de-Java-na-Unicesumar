package ViewUsuário; //Criando a classe usuarios

public class usuarios {

    //criando o set
    public void setCpfusuario(long cpfusuario) {
        this.cpfusuario = cpfusuario;
    }

    public void setNomeusuario(String nomeusuario) {
        this.nomeusuario = nomeusuario;
    }

    void setIdadeusuario(int idadeusuario) {
        this.idadeusuario = idadeusuario;
    }

    public void setSexousuario(String sexousuario) {
        this.sexousuario = sexousuario;
    }

    public void setResultadousuario(int resultadousuario) {
        this.resultadousuario = resultadousuario;
    }
//Criando o Get

    public long getcpfusuario() {
        return this.cpfusuario;
    }

    public String getnomeusuario() {
        return this.nomeusuario;
    }

    public int getIdade() {
        return this.idadeusuario;
    }

    public String getSexo() {
        return this.sexousuario;
    }

    @Override //Montando um overide para devolver o codigo, descrição ordenada dos atributos desta classe
    public String toString() {
        return this.getnomeusuario() + "-" + this.getSexo() + "-" + this.getIdade() + "-" + this.getcpfusuario() + "-" + this.getResultado();
    }

    public int getResultado() {
        return this.resultadousuario;
    }
    private long cpfusuario;
    private String nomeusuario;
    private int idadeusuario;
    private String sexousuario;
    private int resultadousuario;

}
