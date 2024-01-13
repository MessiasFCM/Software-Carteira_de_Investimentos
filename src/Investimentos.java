// Class para identificar, armazenar e modificar os valores de um objeto
// e é utilziado para gerenciar os dados da tabela

public class Investimentos {
    private String nome;
    private double valorAporte;
    private String data;
    private double valorAtual;
    private double lucro;
    private double porcentagem;

    public Investimentos() {
    }

    public Investimentos(String nome, double valorAporte, String data, double valorAtual, double lucro, double porcentagem) {
        this.nome = nome;
        this.valorAporte = valorAporte;
        this.data = data;
        this.valorAtual = valorAtual;
        this.lucro = lucro;
        this.porcentagem = porcentagem;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getValorAporte() {
        return valorAporte;
    }

    public void setValorAporte(double valorAporte) {
        this.valorAporte = valorAporte;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public double getValorAtual() {
        return valorAtual;
    }

    public void setValorAtual(double valorAtual) {
        this.valorAtual = valorAtual;
    }

    public double getLucro() {
        return lucro;
    }

    public void setLucro(double lucro) {
        this.lucro = lucro;
    }

    public double getPorcentagem() {
        return porcentagem;
    }

    public void setPorcentagem(double porcentagem) {
        this.porcentagem = porcentagem;
    }

    @Override
    public String toString() {
        return "Investimentos{" + "nome=" + nome + ", valorAporte=" + valorAporte + ", data=" + data + ", valorAtual=" + valorAtual + ", lucro=" + lucro + ", porcentagem=" + porcentagem + '}';
    }
    
    

}
