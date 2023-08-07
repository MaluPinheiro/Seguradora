package modelo;

public class Veiculo {
    private Modelo nomeModelo;
    private int ano;
    private String marca; 
    private String cor;
    private String placa;

    public Veiculo(Modelo nomeModelo, int ano, String marca, String cor, String placa) {
        this.nomeModelo = nomeModelo;
        this.ano = ano;
        this.marca = marca;
        this.cor = cor;
        this.placa = placa;
    }

    public Modelo getNomeModelo() {
        return nomeModelo;
    }

    public void setNomeModelo(Modelo nomeModelo) {
        this.nomeModelo = nomeModelo;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }
    
}
