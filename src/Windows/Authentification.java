/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Windows;

import javax.swing.JOptionPane;
import utils.DB;
import java.sql.ResultSet;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import models.Client;

/**
 *
 * @author Toshiba
 */
public class Authentification extends javax.swing.JFrame {

    /**
     * Creates new form Authentification
     */
    private static DB db;
    public Authentification() {
        initComponents();
        inscription.setVisible(false);

        try {
            db = DB.getInstance();
        } catch (Exception e) {
            
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PanelConnexion = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        email_txt = new javax.swing.JTextField();
        passw_txt = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        valider = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        inscription = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        nom_txt = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        prenom_txt = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        valider_client = new javax.swing.JButton();
        email_client_txt = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        password_client_txt = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        PanelConnexion.setBackground(new java.awt.Color(255, 255, 255));
        PanelConnexion.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 0, 153), new java.awt.Color(0, 0, 153), new java.awt.Color(0, 0, 102), new java.awt.Color(0, 0, 153)));
        PanelConnexion.setForeground(new java.awt.Color(0, 51, 102));

        jLabel1.setFont(new java.awt.Font("Yu Gothic Medium", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 102));
        jLabel1.setText("Bienvenu(e) sur notre application");

        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Email");

        jLabel3.setForeground(new java.awt.Color(51, 51, 51));
        jLabel3.setText("Password");

        valider.setBackground(new java.awt.Color(0, 0, 153));
        valider.setForeground(new java.awt.Color(255, 255, 255));
        valider.setText("Valider");
        valider.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                validerActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Je n'ai pas de compte ");
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
        });

        jLabel5.setBackground(new java.awt.Color(0, 0, 153));
        jLabel5.setFont(new java.awt.Font("Segoe UI Historic", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Connexion");

        javax.swing.GroupLayout PanelConnexionLayout = new javax.swing.GroupLayout(PanelConnexion);
        PanelConnexion.setLayout(PanelConnexionLayout);
        PanelConnexionLayout.setHorizontalGroup(
            PanelConnexionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelConnexionLayout.createSequentialGroup()
                .addContainerGap(60, Short.MAX_VALUE)
                .addGroup(PanelConnexionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelConnexionLayout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 292, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(45, 45, 45))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelConnexionLayout.createSequentialGroup()
                        .addGroup(PanelConnexionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(valider)
                            .addGroup(PanelConnexionLayout.createSequentialGroup()
                                .addGroup(PanelConnexionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel2))
                                .addGap(18, 18, 18)
                                .addGroup(PanelConnexionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(passw_txt, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(email_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(61, 61, 61))))
        );
        PanelConnexionLayout.setVerticalGroup(
            PanelConnexionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelConnexionLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel1)
                .addGap(34, 34, 34)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                .addGroup(PanelConnexionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(email_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(PanelConnexionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(passw_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(valider)
                .addGap(28, 28, 28))
        );

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 0, 102), new java.awt.Color(0, 0, 153), new java.awt.Color(0, 0, 102), new java.awt.Color(0, 0, 153)));

        jLabel6.setFont(new java.awt.Font("Segoe UI Light", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 153));
        jLabel6.setText("Inscription");

        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("Nom");

        jLabel8.setForeground(new java.awt.Color(51, 51, 51));
        jLabel8.setText("Prenom");

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 0));
        jLabel9.setText("Se connecter");
        jLabel9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel9MouseClicked(evt);
            }
        });

        valider_client.setBackground(new java.awt.Color(0, 0, 153));
        valider_client.setForeground(new java.awt.Color(255, 255, 255));
        valider_client.setText("Valider");
        valider_client.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                valider_clientActionPerformed(evt);
            }
        });

        jLabel10.setForeground(new java.awt.Color(51, 51, 51));
        jLabel10.setText("Email");

        password_client_txt.setText("***********");

        jLabel11.setForeground(new java.awt.Color(51, 51, 51));
        jLabel11.setText("Password");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(71, 71, 71)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jLabel9)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(valider_client)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel11)
                                .addComponent(jLabel10))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(email_client_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(password_client_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(57, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(70, 70, 70)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel8)
                        .addComponent(jLabel7))
                    .addGap(18, 18, 18)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(prenom_txt, javax.swing.GroupLayout.DEFAULT_SIZE, 208, Short.MAX_VALUE)
                        .addComponent(nom_txt))
                    .addContainerGap(59, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 102, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(email_client_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(password_client_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(valider_client)
                .addGap(17, 17, 17))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(83, 83, 83)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel7)
                        .addComponent(nom_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(18, 18, 18)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel8)
                        .addComponent(prenom_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addContainerGap(151, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout inscriptionLayout = new javax.swing.GroupLayout(inscription);
        inscription.setLayout(inscriptionLayout);
        inscriptionLayout.setHorizontalGroup(
            inscriptionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        inscriptionLayout.setVerticalGroup(
            inscriptionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelConnexion, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(inscription, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelConnexion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(inscription, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void validerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_validerActionPerformed
        String email = email_txt.getText();
        String passw = passw_txt.getText();
        
        // testons les champs
        if(testChampsVide(email,passw)){
            JOptionPane.showMessageDialog(null, "Les champs  ne doivent pas etres vide");
            return;
        }
        
        if(testEmail(email) == false ){
            JOptionPane.showMessageDialog(null,"Email invalide");
            //dropFields();
            return;
        }
        if(testPassw(passw) == false ){
            JOptionPane.showMessageDialog(null,"Password invalide");
            //dropFields(email,passw);
            return;
        }
        if(testAuthentification(email,passw) == false){
            JOptionPane.showMessageDialog(null,"Erreur d'authentification !!!");
            dropFields();
            return;
        }
        //.setVisible(true);
        PanelConnexion.setVisible(false);
    }//GEN-LAST:event_validerActionPerformed

    private void valider_clientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_valider_clientActionPerformed
        String nom = nom_txt.getText();
        String prenom = prenom_txt.getText();
        String email = email_client_txt.getText();
        String passw = password_client_txt.getText();
        
        // test des champs
        if(testChampsVide(nom,prenom,email,passw)){
            JOptionPane.showMessageDialog(null, "Les champs ne doivent pas etres vide !!! ");
            return;
        }
        
        if(testNombreDeCharactere(nom,prenom)){
            JOptionPane.showMessageDialog(null, "Le nom/ prenom doivent avoir au moins 2 caracteres");
            return;
        }
        if(testEmail(email) == false ){
            JOptionPane.showMessageDialog(null,"Email invalide");
            //dropFields();
            return;
        }
        if(testPassw(passw) == false ){
            JOptionPane.showMessageDialog(null,"Password invalide");
            //dropFields(email,passw);
            return;
        }
        //test de lexistance du client
        if(testAuthentificationClient(email)){
            JOptionPane.showMessageDialog(null,"Connectez-vous vous avez deja un compte !!!");
            dropFields(nom_txt, prenom_txt ,email_client_txt,password_client_txt);

            return;
        }
        Client client = new Client(nom,prenom,email,passw);
        //insertion du client
        int r = insertionOrdinateur(client);
        if(r != 0){
            JOptionPane.showMessageDialog(null,"Inscription terminee !!! ");
            dropFields(nom_txt, prenom_txt ,email_client_txt,password_client_txt);
            return;
        }
    }//GEN-LAST:event_valider_clientActionPerformed

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked
        inscription.setVisible(true);
        PanelConnexion.setVisible(false);
    }//GEN-LAST:event_jLabel4MouseClicked
    // importer un jfame
    private void ouvrirDeuxiemeJFrameActionPerformed(java.awt.event.ActionEvent evt) {
    // Créez une instance du deuxième formulaire (JFrame 2)
    Authentification deuxiemeFenetre = new Authentification();

    // Rendez JFrame 1 invisible (optionnel, dépend de vos besoins)
    this.setVisible(false);

    // Affichez le deuxième formulaire
    deuxiemeFenetre.setVisible(true);

    // Assurez-vous que le programme se termine lorsque JFrame 2 est fermé
    deuxiemeFenetre.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
}
    private void jLabel9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9MouseClicked
        PanelConnexion.setVisible(true);
        inscription.setVisible(false);
    }//GEN-LAST:event_jLabel9MouseClicked

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
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Authentification.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Authentification.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Authentification.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Authentification.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Authentification().setVisible(true);
            }
        });
    }
    
    public boolean testAuthentification(String email, String passw){
        try {
            String sql = "SELECT email_C,password FROM Client WHERE email_C = ? ";
            db.iniPreparedCmd(sql);
            db.getPstmt().setString(1, email);
            ResultSet rs =  db.executePreparedSelect();
            if(rs.next()){
               String e = rs.getString("email_C");
               String p = rs.getString("password");
               return p.equalsIgnoreCase(passw);
            }
        } catch (Exception e) {
            System.out.println(e.getMessage()+ " "+ e.getClass());
        }
        return false;
    }
    // test des champs
    public boolean testChampsVide(String... champs){
        for(String field : champs){
            if(field.trim().isEmpty()){
                return true;
            }
        }
        return false;
    }
    // test pour l'email
    public static boolean testEmail(String email){
        String regex = "^[a-z|A-Z][a-z0-9-_./]*@[a-z]{3,}.[a-z]{2,}$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(email);
        email.toLowerCase();
        return matcher.matches();
    }
    
    // test pour le mots de passe
    public boolean testPassw(String passw){
        String regex = "^[a-z|A-Z]+[0-9-_.]+$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(passw);
        //passw.toLowerCase();
        return matcher.matches();
        
    }
    
    // teste pour vider les champs
    public boolean dropFields(JTextField... champs){
        for(JTextField field : champs){
            field.setText("");
        }
        return false;
    }
    
    // test des nombres de caracteres
    public boolean testNombreDeCharactere(String... champs){
        for(String field : champs){
            if(field.length() < 2 ){
                return true;
            }
        }
        return false;
    }
    public boolean testAuthentificationClient(String email){
        try {
            String sql = "SELECT * FROM client WHERE email_C = ? ";
            db.iniPreparedCmd(sql);
            db.getPstmt().setString(1, email);
            ResultSet rs = db.executePreparedSelect();
            return (rs.next());
        } catch (Exception e) {
            System.out.println(e);
        }
        return false;
    }
    // insertion
    public int insertionOrdinateur(Client C){
        int r;
        try {
            String sql = "Insert into client(nom_C,prenom_C,email_C,password)VALUES(?,?,?,?)";
            db.iniPreparedCmd(sql);
            
            db.getPstmt().setString(1, C.getNom_c());
            db.getPstmt().setString(2, C.getPrenom_c());
            db.getPstmt().setString(3, C.getAddress_c());            
            db.getPstmt().setString(4, C.getPassword());
            r = db.executePreparedCUD();
        } catch (Exception e) {
            System.out.println(e);
        }
        return -1;
    }
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PanelConnexion;
    private javax.swing.JTextField email_client_txt;
    private javax.swing.JTextField email_txt;
    private javax.swing.JPanel inscription;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField nom_txt;
    private javax.swing.JTextField passw_txt;
    private javax.swing.JTextField password_client_txt;
    private javax.swing.JTextField prenom_txt;
    private javax.swing.JButton valider;
    private javax.swing.JButton valider_client;
    // End of variables declaration//GEN-END:variables
}
