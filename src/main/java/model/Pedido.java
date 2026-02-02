package model;
public class Pedido {
    private int id;
    private int clienteId;
    private int produtoId;
    private int quantidade;
    private double total;
    
    public Pedido() {
    }
    
    public Pedido(int id, int clienteId, int produtoId, int quantidade, double total) {
        this.id = id;
        this.clienteId = clienteId;
        this.produtoId = produtoId;
        this.quantidade = quantidade;
        this.total = total;
    }
    
    // GETTERS
    public int getId() {
        return id;
    }
    
    public int getClienteId() {
        return clienteId;
    }
    
    public int getProdutoId() {
        return produtoId;
    }
    
    public int getQuantidade() {
        return quantidade;
    }
    
    public double getTotal() {
        return total;
    }
    
    // ADICIONE ESTES SETTERS
    public void setId(int id) {
        this.id = id;
    }
    
    public void setClienteId(int clienteId) {
        this.clienteId = clienteId;
    }
    
    public void setProdutoId(int produtoId) {
        this.produtoId = produtoId;
    }
    
    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
    
    public void setTotal(double total) {
        this.total = total;
    }
}