package ViewUsuário;
//importando as variaveis

import static ViewUsuário.DadosUsuario.idade;
import static ViewUsuário.DadosUsuario.nome;
import static ViewUsuário.DadosUsuario.sexo;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class FormularioView extends javax.swing.JFrame {
//Criando variavel statica que armazena a soma e que precisaria em outros Jframes

    public static int Resultado = 0;

    private static String TextFieldResultado;

    public FormularioView() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jFrame1 = new javax.swing.JFrame();
        Pergunta1temfebre = new javax.swing.JCheckBox();
        Pergunta2 = new javax.swing.JCheckBox();
        Pergunta3 = new javax.swing.JCheckBox();
        Pergunta4 = new javax.swing.JCheckBox();
        Pergunta5 = new javax.swing.JCheckBox();
        Pergunta6 = new javax.swing.JCheckBox();
        Pergunta7 = new javax.swing.JCheckBox();
        Pergunta8 = new javax.swing.JCheckBox();
        Pergunta9 = new javax.swing.JCheckBox();
        Pergunta10 = new javax.swing.JCheckBox();
        descricaoview02 = new javax.swing.JLabel();
        sairdoprogramaview02 = new javax.swing.JButton();
        proximoview02 = new javax.swing.JButton();

        jFrame1.setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        jFrame1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        javax.swing.GroupLayout jFrame1Layout = new javax.swing.GroupLayout(jFrame1.getContentPane());
        jFrame1.getContentPane().setLayout(jFrame1Layout);
        jFrame1Layout.setHorizontalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jFrame1Layout.setVerticalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        getContentPane().setLayout(null);

        Pergunta1temfebre.setText("Tem Febre?");
        Pergunta1temfebre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Pergunta1temfebreActionPerformed(evt);
            }
        });
        getContentPane().add(Pergunta1temfebre);
        Pergunta1temfebre.setBounds(10, 40, 250, 23);

        Pergunta2.setText("Tem dor de cabeça?");
        Pergunta2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Pergunta2ActionPerformed(evt);
            }
        });
        getContentPane().add(Pergunta2);
        Pergunta2.setBounds(10, 70, 230, 23);

        Pergunta3.setText("Tem secreção nasal ou espirros?");
        Pergunta3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Pergunta3ActionPerformed(evt);
            }
        });
        getContentPane().add(Pergunta3);
        Pergunta3.setBounds(10, 100, 220, 23);

        Pergunta4.setText("Tem dor/irritação na garganta? ");
        Pergunta4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Pergunta4ActionPerformed(evt);
            }
        });
        getContentPane().add(Pergunta4);
        Pergunta4.setBounds(10, 130, 240, 23);

        Pergunta5.setText("Tem tosse seca?");
        Pergunta5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Pergunta5ActionPerformed(evt);
            }
        });
        getContentPane().add(Pergunta5);
        Pergunta5.setBounds(10, 160, 180, 23);

        Pergunta6.setText("Tem dificuldade respiratória? ");
        Pergunta6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Pergunta6ActionPerformed(evt);
            }
        });
        getContentPane().add(Pergunta6);
        Pergunta6.setBounds(10, 190, 180, 23);

        Pergunta7.setText("Tem dores no corpo? ");
        Pergunta7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Pergunta7ActionPerformed(evt);
            }
        });
        getContentPane().add(Pergunta7);
        Pergunta7.setBounds(10, 220, 170, 23);

        Pergunta8.setText("Tem diarreia? ");
        Pergunta8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Pergunta8ActionPerformed(evt);
            }
        });
        getContentPane().add(Pergunta8);
        Pergunta8.setBounds(10, 250, 140, 23);

        Pergunta9.setText("Esteve em contato, nos últimos 14 dias, com um caso diagnosticado com COVID-19?");
        Pergunta9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Pergunta9ActionPerformed(evt);
            }
        });
        getContentPane().add(Pergunta9);
        Pergunta9.setBounds(10, 280, 450, 23);

        Pergunta10.setText("Esteve em locais com grande aglomeração?");
        Pergunta10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Pergunta10ActionPerformed(evt);
            }
        });
        getContentPane().add(Pergunta10);
        Pergunta10.setBounds(10, 310, 260, 23);

        descricaoview02.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        descricaoview02.setText("Selecione apenas os itens que você esta sentindo:");
        getContentPane().add(descricaoview02);
        descricaoview02.setBounds(20, 10, 430, 30);

        sairdoprogramaview02.setText("Sair");
        sairdoprogramaview02.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sairdoprogramaview02ActionPerformed(evt);
            }
        });
        getContentPane().add(sairdoprogramaview02);
        sairdoprogramaview02.setBounds(350, 93, 140, 40);

        proximoview02.setText("Próximo");
        proximoview02.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                proximoview02ActionPerformed(evt);
            }
        });
        getContentPane().add(proximoview02);
        proximoview02.setBounds(350, 150, 140, 40);

        setSize(new java.awt.Dimension(546, 401));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void Pergunta1temfebreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Pergunta1temfebreActionPerformed

        if (Pergunta1temfebre.isSelected()) {
            Resultado = Resultado + 5;
        }
    }//GEN-LAST:event_Pergunta1temfebreActionPerformed

    private void proximoview02ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_proximoview02ActionPerformed

        //If e else para atribuir o resultado das alas
        if (Resultado <= 9) {
            TextFieldResultado = ("Dirija-se para Ala01");
        }
        if (Resultado > 9 && Resultado <= 19) {
            TextFieldResultado = ("Dirija-se para Ala02");
        }
        if (Resultado >= 19) {
            TextFieldResultado = ("Dirija-se para Ala03");
        } else {
            TextFieldResultado = ("Dirija-se para Ala01");
        }

        JOptionPane.showMessageDialog(null, TextFieldResultado);
        dispose();
        new DadosUsuario().setVisible(true);
    }//GEN-LAST:event_proximoview02ActionPerformed
//somando os pontos do questionario
    private void Pergunta2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Pergunta2ActionPerformed
        if (Pergunta2.isSelected()) {
            Resultado = Resultado + 1;
        }
    }//GEN-LAST:event_Pergunta2ActionPerformed

    private void Pergunta3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Pergunta3ActionPerformed
        if (Pergunta3.isSelected()) {
            Resultado = Resultado + 1;
        }
    }//GEN-LAST:event_Pergunta3ActionPerformed

    private void Pergunta4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Pergunta4ActionPerformed
        if (Pergunta4.isSelected()) {
            Resultado = +Resultado + 1;
        }
    }//GEN-LAST:event_Pergunta4ActionPerformed

    private void Pergunta5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Pergunta5ActionPerformed
        if (Pergunta5.isSelected()) {
            Resultado = Resultado + 3;
        }
    }//GEN-LAST:event_Pergunta5ActionPerformed

    private void Pergunta6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Pergunta6ActionPerformed
        if (Pergunta6.isSelected()) {
            Resultado = Resultado + 10;
        }
    }//GEN-LAST:event_Pergunta6ActionPerformed

    private void Pergunta7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Pergunta7ActionPerformed
        if (Pergunta7.isSelected()) {
            Resultado = Resultado + 1;
        }
    }//GEN-LAST:event_Pergunta7ActionPerformed

    private void Pergunta8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Pergunta8ActionPerformed
        if (Pergunta8.isSelected()) {
            Resultado = Resultado + 1;
        }
    }//GEN-LAST:event_Pergunta8ActionPerformed

    private void Pergunta9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Pergunta9ActionPerformed
        if (Pergunta9.isSelected()) {
            Resultado = Resultado + 10;
        }
    }//GEN-LAST:event_Pergunta9ActionPerformed

    private void Pergunta10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Pergunta10ActionPerformed
        if (Pergunta10.isSelected()) {
            Resultado = Resultado + 3;
        }
    }//GEN-LAST:event_Pergunta10ActionPerformed

    private void sairdoprogramaview02ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sairdoprogramaview02ActionPerformed
        //Reiniciando o sistema
        DadosUsuario retornainicio = new DadosUsuario();
        retornainicio.setVisible(true);
        dispose();//fechamdo a tela anterior
    }//GEN-LAST:event_sairdoprogramaview02ActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormularioView().setVisible(true);
            }

        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox Pergunta10;
    private javax.swing.JCheckBox Pergunta1temfebre;
    private javax.swing.JCheckBox Pergunta2;
    private javax.swing.JCheckBox Pergunta3;
    private javax.swing.JCheckBox Pergunta4;
    private javax.swing.JCheckBox Pergunta5;
    private javax.swing.JCheckBox Pergunta6;
    private javax.swing.JCheckBox Pergunta7;
    private javax.swing.JCheckBox Pergunta8;
    private javax.swing.JCheckBox Pergunta9;
    private javax.swing.JLabel descricaoview02;
    private javax.swing.JFrame jFrame1;
    public javax.swing.JButton proximoview02;
    private javax.swing.JButton sairdoprogramaview02;
    // End of variables declaration//GEN-END:variables
}
