/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package visual;
import dao.ClienteDAO;
import dao.PedidoDAO;
import dao.ProdutoDAO;
import model.Cliente;
import model.Pedido;
import model.Produto;
import javax.swing.JOptionPane;
import java.util.List;

/**
 *
 * @author mathe
 */
public class TelaPedido extends javax.swing.JFrame {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(TelaPedido.class.getName());
    private List<Cliente> listaClientes;
    private List<Produto> listaProdutos; 
    /**
     * Creates new form TelaPedido
     */
    public TelaPedido() {
        initComponents();
         carregarDados();
    }

    private void carregarDados() {
        try {
            // Carregar clientes
            ClienteDAO clienteDAO = new ClienteDAO();
            listaClientes = clienteDAO.listar();
            
            // Carregar produtos
            ProdutoDAO produtoDAO = new ProdutoDAO();
            listaProdutos = produtoDAO.listar();
            
            // Preencher o ComboBox de produtos
            jComboBox1.removeAllItems();
            for (Produto p : listaProdutos) {
                jComboBox1.addItem(p.getNome());
            }
            
            // Adicionar listener para calcular valor automaticamente
            jComboBox1.addActionListener(e -> calcularValor());
            jSpinner1.addChangeListener(e -> calcularValor());
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, 
                "Erro ao carregar dados: " + e.getMessage(), 
                "Erro", 
                JOptionPane.ERROR_MESSAGE);
            e.printStackTrace();
        }
        
        
    }private void calcularValor() {
        try {
            int indiceProduto = jComboBox1.getSelectedIndex();
            if (indiceProduto >= 0 && indiceProduto < listaProdutos.size()) {
                Produto produtoSelecionado = listaProdutos.get(indiceProduto);
                int quantidade = (Integer) jSpinner1.getValue();
                double total = produtoSelecionado.getPreco() * quantidade;
                jTextField1.setText(String.format("%.2f", total));
            }
        } catch (Exception e) {
            jTextField1.setText("0.00");
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jSpinner1 = new javax.swing.JSpinner();
        jComboBox1 = new javax.swing.JComboBox<>();
        jTextField1 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Nome:");

        jLabel2.setText("Produto:");

        jLabel3.setText("Registro de Pedido");

        jLabel4.setText("Quantidade:");

        jLabel5.setText("Valor:");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jButton1.setText("Menu");
        jButton1.addActionListener(this::jButton1ActionPerformed);

        jButton2.setText("Registrar");
        jButton2.addActionListener(this::jButton2ActionPerformed);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jSpinner1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel1))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 117, Short.MAX_VALUE)
                        .addComponent(jButton2)
                        .addGap(83, 83, 83))))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(62, 62, 62)
                    .addComponent(jLabel3)
                    .addContainerGap(239, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(77, 77, 77)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(142, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(87, 87, 87)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jSpinner1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 46, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addGap(32, 32, 32))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(56, 56, 56)
                    .addComponent(jLabel3)
                    .addContainerGap(228, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(94, 94, 94)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(184, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
new TelaMenu().setVisible(true);
    dispose();         // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        try {
            
            String nomeCliente = jTextField3.getText().trim();
            
            
            if (nomeCliente.isEmpty()) {
                JOptionPane.showMessageDialog(this, 
                    "Por favor, digite o nome do cliente!", 
                    "Aviso", 
                    JOptionPane.WARNING_MESSAGE);
                return;
            }
            
            
            Cliente clienteEncontrado = null;
            for (Cliente c : listaClientes) {
                if (c.getNome().equalsIgnoreCase(nomeCliente)) {
                    clienteEncontrado = c;
                    break;
                }
            }
            
            if (clienteEncontrado == null) {
                JOptionPane.showMessageDialog(this, 
                    "Cliente não encontrado! Cadastre o cliente primeiro.", 
                    "Aviso", 
                    JOptionPane.WARNING_MESSAGE);
                return;
            }
            
         
            int indiceProduto = jComboBox1.getSelectedIndex();
            if (indiceProduto < 0) {
                JOptionPane.showMessageDialog(this, 
                    "Por favor, selecione um produto!", 
                    "Aviso", 
                    JOptionPane.WARNING_MESSAGE);
                return;
            }
            
            
            Produto produtoSelecionado = listaProdutos.get(indiceProduto);
            
            
            int quantidade = (Integer) jSpinner1.getValue();
            
           
            double total = produtoSelecionado.getPreco() * quantidade;
            
            
            Pedido pedido = new Pedido();
            
            Pedido novoPedido = new Pedido(
                0,
                clienteEncontrado.getId(),
                produtoSelecionado.getId(),
                quantidade,
                total
            );
            
       
            PedidoDAO dao = new PedidoDAO();
            dao.salvar(novoPedido);
            
            
            JOptionPane.showMessageDialog(this, 
                String.format("Pedido registrado com sucesso!%nCliente: %s%nProduto: %s%nQuantidade: %d%nTotal: R$ %.2f",
                    clienteEncontrado.getNome(),
                    produtoSelecionado.getNome(),
                    quantidade,
                    total),
                "Sucesso", 
                JOptionPane.INFORMATION_MESSAGE);
            
            // 11. Limpar os campos
            jTextField3.setText("");
            jComboBox1.setSelectedIndex(0);
            jSpinner1.setValue(1);
            jTextField1.setText("0.00");
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, 
                "Erro ao registrar pedido: " + e.getMessage(), 
                "Erro", 
                JOptionPane.ERROR_MESSAGE);
            e.printStackTrace();
        }
    // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ReflectiveOperationException | javax.swing.UnsupportedLookAndFeelException ex) {
            logger.log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> new TelaPedido().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JSpinner jSpinner1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField3;
    // End of variables declaration//GEN-END:variables
}
