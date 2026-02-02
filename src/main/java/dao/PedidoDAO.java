package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import model.Conexao;
import model.Pedido;
import model.Pedido;

public class PedidoDAO {

    public void salvar(Pedido pedido) {
        String sql = "INSERT INTO pedido (cliente_id, produto_id, quantidade, total) "
                   + "VALUES (?, ?, ?, ?)";

        try (Connection c = Conexao.conectar();
             PreparedStatement ps = c.prepareStatement(sql)) {

            ps.setInt(1, pedido.getClienteId());
            ps.setInt(2, pedido.getProdutoId());
            ps.setInt(3, pedido.getQuantidade());
            ps.setDouble(4, pedido.getTotal());

            ps.execute();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}