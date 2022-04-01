package ViewUsuário;

import ViewUsuário.FormularioView;//Importei a tela02(formulario.view)
import static ViewUsuário.FormularioView.Resultado;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class DadosUsuario extends javax.swing.JFrame {//classetela01
    //Variaveis que vou usar em outros Jframes e outras partes do código

    public static int idade, i;
    public static String nome, sexo;
    private static long cpf;

    public DadosUsuario() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        NOMEUSER = new javax.swing.JLabel();
        CAMPODETEXTOCPF = new java.awt.TextField();
        CPFUSER = new javax.swing.JLabel();
        CAMPODETEXTONOME = new java.awt.TextField();
        SEXOUSER = new javax.swing.JLabel();
        CAMPODEOPCAOFEM = new javax.swing.JCheckBox();
        CAMPODEOPCAOMAS = new javax.swing.JCheckBox();
        CAMPODETEXTOIDADE = new java.awt.TextField();
        IDADEUSER = new javax.swing.JLabel();
        PROXIMOBUTTON = new javax.swing.JButton();
        SAIRDOSISTEMA = new javax.swing.JButton();
        PlanodeFundo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        NOMEUSER.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        NOMEUSER.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        NOMEUSER.setText("Nome:");
        NOMEUSER.setOpaque(true);
        getContentPane().add(NOMEUSER);
        NOMEUSER.setBounds(10, 80, 55, 30);

        CAMPODETEXTOCPF.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        CAMPODETEXTOCPF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CAMPODETEXTOCPFActionPerformed(evt);
            }
        });
        getContentPane().add(CAMPODETEXTOCPF);
        CAMPODETEXTOCPF.setBounds(50, 40, 290, 30);

        CPFUSER.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        CPFUSER.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        CPFUSER.setText("CPF:");
        CPFUSER.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        CPFUSER.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        CPFUSER.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        CPFUSER.setName(""); // NOI18N
        CPFUSER.setOpaque(true);
        getContentPane().add(CPFUSER);
        CPFUSER.setBounds(10, 40, 36, 30);

        CAMPODETEXTONOME.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CAMPODETEXTONOMEActionPerformed(evt);
            }
        });
        getContentPane().add(CAMPODETEXTONOME);
        CAMPODETEXTONOME.setBounds(70, 80, 270, 30);

        SEXOUSER.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        SEXOUSER.setText("Sexo:");
        SEXOUSER.setOpaque(true);
        getContentPane().add(SEXOUSER);
        SEXOUSER.setBounds(170, 160, 50, 30);

        CAMPODEOPCAOFEM.setText("Fem");
        CAMPODEOPCAOFEM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CAMPODEOPCAOFEMActionPerformed(evt);
            }
        });
        getContentPane().add(CAMPODEOPCAOFEM);
        CAMPODEOPCAOFEM.setBounds(230, 160, 50, 30);

        CAMPODEOPCAOMAS.setText("Masc");
        CAMPODEOPCAOMAS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CAMPODEOPCAOMASActionPerformed(evt);
            }
        });
        getContentPane().add(CAMPODEOPCAOMAS);
        CAMPODEOPCAOMAS.setBounds(290, 160, 50, 30);

        CAMPODETEXTOIDADE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CAMPODETEXTOIDADEActionPerformed(evt);
            }
        });
        getContentPane().add(CAMPODETEXTOIDADE);
        CAMPODETEXTOIDADE.setBounds(180, 120, 160, 30);

        IDADEUSER.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        IDADEUSER.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        IDADEUSER.setText("Idade:");
        IDADEUSER.setOpaque(true);
        getContentPane().add(IDADEUSER);
        IDADEUSER.setBounds(130, 120, 40, 30);

        PROXIMOBUTTON.setText("Próximo");
        PROXIMOBUTTON.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PROXIMOBUTTONActionPerformed(evt);
            }
        });
        getContentPane().add(PROXIMOBUTTON);
        PROXIMOBUTTON.setBounds(230, 210, 110, 40);

        SAIRDOSISTEMA.setText("SAIR");
        SAIRDOSISTEMA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SAIRDOSISTEMAActionPerformed(evt);
            }
        });
        getContentPane().add(SAIRDOSISTEMA);
        SAIRDOSISTEMA.setBounds(110, 210, 110, 40);

        PlanodeFundo.setForeground(new java.awt.Color(1, 1, 1));
        PlanodeFundo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Imagem Covid19.jpg"))); // NOI18N
        PlanodeFundo.setText("jLabel5");
        PlanodeFundo.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        PlanodeFundo.setMinimumSize(new java.awt.Dimension(0, 0));
        getContentPane().add(PlanodeFundo);
        PlanodeFundo.setBounds(-340, -60, 1350, 440);

        setSize(new java.awt.Dimension(546, 307));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void CAMPODETEXTOIDADEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CAMPODETEXTOIDADEActionPerformed
        //String pegartexto = CAMPODETEXTOIDADE.getText(); //variavel auxiliar
        //idade = Integer.parseInt(pegartexto);//covertendo String para Inteiro

    }//GEN-LAST:event_CAMPODETEXTOIDADEActionPerformed

    private void CAMPODEOPCAOMASActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CAMPODEOPCAOMASActionPerformed
        //if (CAMPODEOPCAOMAS.isSelected()){
        // sexo = "MASC"; //Atribuindo valor em uma variavel aux, se for selecionado CAMPODEOPCAOMAS
        // }else{ sexo = "NãoSelecionado";
        //}  
    }//GEN-LAST:event_CAMPODEOPCAOMASActionPerformed

    private void CAMPODEOPCAOFEMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CAMPODEOPCAOFEMActionPerformed
        //if (CAMPODEOPCAOFEM.isSelected()){
        //   sexo = "Fem";//Atribuindo valor em uma variavel, se for selecionado
        //}else{ sexo = "NãoSelecionado";
        //}  

    }//GEN-LAST:event_CAMPODEOPCAOFEMActionPerformed

    private void SAIRDOSISTEMAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SAIRDOSISTEMAActionPerformed
        System.exit(0);//sair do sistema

    }//GEN-LAST:event_SAIRDOSISTEMAActionPerformed

    private void PROXIMOBUTTONActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PROXIMOBUTTONActionPerformed

        //Chamando a segunda tela do usuário
        FormularioView view2Formulario = new FormularioView();
        view2Formulario.setVisible(true);
        dispose();//fechamdo a 1 tela
        //Fazendo um array tipado
        ArrayList<usuarios> lista = new ArrayList<usuarios>(10);
        usuarios pessoa; //criando a variavel 

        pessoa = new usuarios();
        pessoa.setNomeusuario(CAMPODETEXTONOME.getText());
        if (CAMPODEOPCAOFEM.isSelected()) {
            pessoa.setSexousuario("Fem");
        }
        if (CAMPODEOPCAOMAS.isSelected()) {
            pessoa.setSexousuario("Masc");
        } else {
            sexo = "NãoSelecionado";
        }
        pessoa.setCpfusuario(Long.parseLong(CAMPODETEXTOCPF.getText()));
        pessoa.setIdadeusuario(Integer.parseInt(CAMPODETEXTOIDADE.getText()));
        pessoa.setResultadousuario(Resultado);
        lista.add(pessoa);
        for (int i = 0; i > lista.size(); i++) {
            System.out.println(lista.get(i));
        }

    }//GEN-LAST:event_PROXIMOBUTTONActionPerformed

    private void CAMPODETEXTOCPFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CAMPODETEXTOCPFActionPerformed
        //String pegartexto = CAMPODETEXTOCPF.getText();//variavel auxiliar
        //cpf = Long.parseLong(pegartexto);//coveterndo String para long

    }//GEN-LAST:event_CAMPODETEXTOCPFActionPerformed

    private void CAMPODETEXTONOMEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CAMPODETEXTONOMEActionPerformed
        //nome = CAMPODETEXTONOME.getText();//as duas são string então só atribui o valor
    }//GEN-LAST:event_CAMPODETEXTONOMEActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                //tornando visivel a classe\tela dados do usuário
                new DadosUsuario().setVisible(true);

            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox CAMPODEOPCAOFEM;
    private javax.swing.JCheckBox CAMPODEOPCAOMAS;
    public java.awt.TextField CAMPODETEXTOCPF;
    private java.awt.TextField CAMPODETEXTOIDADE;
    private java.awt.TextField CAMPODETEXTONOME;
    private javax.swing.JLabel CPFUSER;
    private javax.swing.JLabel IDADEUSER;
    private javax.swing.JLabel NOMEUSER;
    private javax.swing.JButton PROXIMOBUTTON;
    private javax.swing.JLabel PlanodeFundo;
    private javax.swing.JButton SAIRDOSISTEMA;
    private javax.swing.JLabel SEXOUSER;
    // End of variables declaration//GEN-END:variables

}
