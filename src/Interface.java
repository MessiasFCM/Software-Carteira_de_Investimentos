import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Interface extends javax.swing.JFrame {
    
    private AtualizarTabela AT; // Criar um objeto da tela AtualizarTabela
    
    public Interface() {
        initComponents();
        setLocationRelativeTo(null);    // Deixar a Tela Centralizada
        
        this.AT = new AtualizarTabela();
        jTabela.setModel(AT);
        // Colunas utilizadas na tabela
        jTabela.getColumnModel().getColumn(0).setHeaderValue("Nome");
        jTabela.getColumnModel().getColumn(1).setHeaderValue("V. Aporte");
        jTabela.getColumnModel().getColumn(2).setHeaderValue("Data");
        jTabela.getColumnModel().getColumn(3).setHeaderValue("V. Atual");
        jTabela.getColumnModel().getColumn(4).setHeaderValue("Lucro");
        jTabela.getColumnModel().getColumn(5).setHeaderValue("Retorno (%)");
        
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PainelGeral = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        PainelMenu = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jAdicionar = new javax.swing.JButton();
        jLimpar = new javax.swing.JButton();
        jData = new javax.swing.JFormattedTextField();
        jRepetirAporte = new javax.swing.JCheckBox();
        jHoje = new javax.swing.JCheckBox();
        jValorAtual = new javax.swing.JTextField();
        jNome = new javax.swing.JTextField();
        jAporte = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTabela = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(1280, 720));
        setMinimumSize(new java.awt.Dimension(1280, 720));
        setSize(new java.awt.Dimension(1280, 720));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        PainelGeral.setBackground(new java.awt.Color(204, 204, 204));
        PainelGeral.setMaximumSize(new java.awt.Dimension(1280, 720));
        PainelGeral.setMinimumSize(new java.awt.Dimension(1280, 720));
        PainelGeral.setPreferredSize(new java.awt.Dimension(1280, 720));
        PainelGeral.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Impact", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Carteira de Investimentos do Seu José");
        PainelGeral.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 1280, 60));

        PainelMenu.setOpaque(false);
        PainelMenu.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Inter_FXH", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Nome:");
        PainelMenu.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, 100, 30));

        jLabel3.setFont(new java.awt.Font("Inter_FXH", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Aporte:");
        PainelMenu.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 100, 30));

        jLabel4.setFont(new java.awt.Font("Inter_FXH", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Data aporte:");
        PainelMenu.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, 150, 30));

        jLabel5.setFont(new java.awt.Font("Inter_FXH", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Valor Atual:");
        PainelMenu.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 220, 160, 30));

        jAdicionar.setBackground(new java.awt.Color(0, 153, 0));
        jAdicionar.setFont(new java.awt.Font("Inter_FXH", 1, 24)); // NOI18N
        jAdicionar.setText("Adicionar");
        jAdicionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jAdicionarActionPerformed(evt);
            }
        });
        PainelMenu.add(jAdicionar, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 320, -1, -1));

        jLimpar.setBackground(new java.awt.Color(153, 0, 0));
        jLimpar.setFont(new java.awt.Font("Inter_FXH", 1, 24)); // NOI18N
        jLimpar.setText("Limpar");
        jLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jLimparActionPerformed(evt);
            }
        });
        PainelMenu.add(jLimpar, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 320, -1, -1));

        try {
            jData.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jData.setFont(new java.awt.Font("Inter_FXH", 0, 18)); // NOI18N
        PainelMenu.add(jData, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 150, 150, 30));

        jRepetirAporte.setFont(new java.awt.Font("Inter_FXH", 2, 18)); // NOI18N
        jRepetirAporte.setForeground(new java.awt.Color(0, 0, 0));
        jRepetirAporte.setText("repetir aporte?");
        jRepetirAporte.setOpaque(false);
        jRepetirAporte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRepetirAporteActionPerformed(evt);
            }
        });
        PainelMenu.add(jRepetirAporte, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 250, -1, -1));

        jHoje.setFont(new java.awt.Font("Inter_FXH", 2, 18)); // NOI18N
        jHoje.setForeground(new java.awt.Color(0, 0, 0));
        jHoje.setText("hoje?");
        jHoje.setOpaque(false);
        jHoje.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jHojeActionPerformed(evt);
            }
        });
        PainelMenu.add(jHoje, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 180, -1, -1));

        jValorAtual.setFont(new java.awt.Font("Inter_FXH", 0, 18)); // NOI18N
        jValorAtual.setToolTipText("");
        PainelMenu.add(jValorAtual, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 220, 150, 30));

        jNome.setFont(new java.awt.Font("Inter_FXH", 0, 18)); // NOI18N
        jNome.setToolTipText("");
        PainelMenu.add(jNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 40, 150, 30));

        jAporte.setFont(new java.awt.Font("Inter_FXH", 0, 18)); // NOI18N
        jAporte.setToolTipText("");
        PainelMenu.add(jAporte, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 80, 150, 30));

        PainelGeral.add(PainelMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 390, 590));

        jTabela.setBackground(new java.awt.Color(204, 204, 204));
        jTabela.setFont(new java.awt.Font("Inter_FXH", 0, 14)); // NOI18N
        jTabela.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nome", "V. Aporte", "Data", "V. Atual", "Lucro", "Retorno (%)"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, true, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTabela.setOpaque(false);
        jScrollPane1.setViewportView(jTabela);

        PainelGeral.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 100, 810, 560));

        getContentPane().add(PainelGeral, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1280, 720));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jLimparActionPerformed
        // Botão limpar
        jNome.setText("");
        jAporte.setText("");
        jData.setText("");
        jValorAtual.setText("");
        jHoje.setSelected(false);
        jRepetirAporte.setSelected(false);
        jData.setEditable(true);
        jValorAtual.setEditable(true);
    }//GEN-LAST:event_jLimparActionPerformed

    private void jHojeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jHojeActionPerformed
        // Check Hoje - onde puxa os dados do dia em que está
        if(jHoje.isSelected()){
            DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");
            LocalDate data = LocalDate.now();
            jData.setText(data.format(formato).toString());
            jData.setEditable(false);
        }else{
            jData.setEditable(true);
        }
    }//GEN-LAST:event_jHojeActionPerformed

    private void jRepetirAporteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRepetirAporteActionPerformed
        // Check Repetir - onde puxa os dados do valor de aporte e deixa o valor atual igual
        if(jRepetirAporte.isSelected()){
            jValorAtual.setText(jAporte.getText());
            jValorAtual.setEditable(false);
        }else{
            jValorAtual.setEditable(true);
        }
    }//GEN-LAST:event_jRepetirAporteActionPerformed

    private void jAdicionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jAdicionarActionPerformed
        // Botão principal - onde adiciona os novos dados na tabela de investimentos 
        String Nome = jNome.getText();
        Double Aporte = Double.parseDouble(jAporte.getText());
        String Data = jData.getText();
        Double ValorAtual = Double.parseDouble(jValorAtual.getText());
        Double Lucro = (ValorAtual-Aporte);
        Double Porcentagem = ((ValorAtual*100)/Aporte)-100;
        // Calculando e lendo os últimos dados inseridos
        System.out.println("Carregando e calculando dados...");
        System.out.println("Nome: " + Nome + "\nAporte: " + Aporte + "\nData: " + Data + "\nValor Atual: " + ValorAtual + "\nLucro: " + Lucro + "\nPorcentagem: " + Porcentagem);

        Investimentos investimento = new Investimentos(Nome, Aporte, Data, ValorAtual, Lucro, Porcentagem); // Enviando os dados para a classe objeto
        
        System.out.println("\nEnviando dados à tabela...");
        AT.addNovaLinha(investimento);
    }//GEN-LAST:event_jAdicionarActionPerformed

    public static void main(String args[]) {
        
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Interface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Interface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Interface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Interface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Interface().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PainelGeral;
    private javax.swing.JPanel PainelMenu;
    private javax.swing.JButton jAdicionar;
    private javax.swing.JTextField jAporte;
    private javax.swing.JFormattedTextField jData;
    private javax.swing.JCheckBox jHoje;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JButton jLimpar;
    private javax.swing.JTextField jNome;
    private javax.swing.JCheckBox jRepetirAporte;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTabela;
    private javax.swing.JTextField jValorAtual;
    // End of variables declaration//GEN-END:variables
}
