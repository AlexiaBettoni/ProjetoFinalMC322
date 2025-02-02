package CinemaToten;

public abstract class Ingresso {
    private double preco;
    private Assento assento;
    private String nomeCliente;
    private Sessao sessao;
    
    public Ingresso(Assento assento, String nomeCliente, Sessao sessao) {
        this.assento = assento;
        this.nomeCliente = nomeCliente;
        this.sessao = sessao;
    }
    
    // Métodos abstratos
    public abstract double calcularPreco(); 
    
    // Getters e Setters
    public double getPreco() {
        return preco;
    }
    
    public void setPreco(double preco) {
        this.preco = preco;
    }
    
    public Assento getAssento() {
        return assento;
    }
    
    public void setAssento(Assento assento) {
        this.assento = assento;
    }
    
    public String getNomeCliente() {
        return nomeCliente;
    }
    
    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }
    
    public String retornarChave() { //chave que será gravada no arquivo .csv
    	return sessao.getFilme().getTitulo() + "," + sessao.getData() + "," + sessao.getHorario() + "," + assento.getPosAssento();
    }
}

