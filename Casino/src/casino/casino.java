/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package casino;

import java.awt.Image;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;

/**
 *
 * @author axelg
 */
public class casino extends javax.swing.JFrame {

    
     Hilo1 hilo1;
     Hilo2 hilo2;
     Hilo3 hilo3;
     
     Integer a=4;
     Integer b=4;
     Integer c=4;
     Random random = new Random();
   
     
     
    /**
     * Creates new form casino
     */
    public casino() {
        initComponents();
        scaleImage();
        
        jButton1.setOpaque(false);
        jButton1.setContentAreaFilled(false);
        jButton1.setBorderPainted(false);
        
        jButton2.setOpaque(false);
        jButton2.setContentAreaFilled(false);
        jButton2.setBorderPainted(false);
        
        jButton3.setOpaque(false);
        jButton3.setContentAreaFilled(false);
        jButton3.setBorderPainted(false);
        
        jButton4.setOpaque(false);
        jButton4.setContentAreaFilled(false);
        jButton4.setBorderPainted(false);
        
    }
    
    public void scaleImage(){
        ImageIcon icon = new ImageIcon("src/Imagenes/img1.png");
        jLabel1.setIcon(icon);
    }
    public void scaleImage2(){
        ImageIcon icon = new ImageIcon("src/Imagenes/img2.png");
        jLabel1.setIcon(icon);
    }
    public void scaleImage3(){
        ImageIcon icon = new ImageIcon("src/Imagenes/img3.png");
        jLabel1.setIcon(icon);
    }
     public void scaleImage4(){
        ImageIcon icon = new ImageIcon("src/Imagenes/img1.png");
        jLabel2.setIcon(icon);
    }
    public void scaleImage5(){
        ImageIcon icon = new ImageIcon("src/Imagenes/img2.png");
        jLabel2.setIcon(icon);
    }
    public void scaleImage6(){
        ImageIcon icon = new ImageIcon("src/Imagenes/img3.png");
        jLabel2.setIcon(icon);
    }
     public void scaleImage7(){
        ImageIcon icon = new ImageIcon("src/Imagenes/img1.png");
        jLabel3.setIcon(icon);
    }
    public void scaleImage8(){
        ImageIcon icon = new ImageIcon("src/Imagenes/img2.png");
        jLabel3.setIcon(icon);
    }
    public void scaleImage9(){
        ImageIcon icon = new ImageIcon("src/Imagenes/img3.png");
        jLabel3.setIcon(icon);
    }
    
    
    
    //-----------------------------------------------------------------------------------------------------------------------
    // Creamos el hilo1
    public class Hilo1 extends Thread {
       
       
        @Override
        public void run(){
            
            for(int i = 1; i <= 10; i = i - 1)
            {
                
                
		int value = random.nextInt(3 + 1) + 1;
                if(value ==1){
                a=1;
                scaleImage();
            
                try {
                    Thread.sleep(100);
                } catch (InterruptedException ex) {
                    Logger.getLogger(casino.class.getName()).log(Level.SEVERE, null, ex);
                }
                
                
                }
                
                
                
                 if(value ==2){
                a=2;
                scaleImage2();
                try {
                    Thread.sleep(100);
                } catch (InterruptedException ex) {
                    Logger.getLogger(casino.class.getName()).log(Level.SEVERE, null, ex);
                }
                
                 }
                
                 
                if(value ==3){
                a=3;
                scaleImage3();
                
                try {
                    Thread.sleep(100);
                } catch (InterruptedException ex) {
                    Logger.getLogger(casino.class.getName()).log(Level.SEVERE, null, ex);
                }
                }
                
            }
            
        }

        
    }
    //-----------------------------------------------------------------------------------------------------------------------
    public class Hilo2 extends Thread {
       
       
        @Override
        public void run(){
            
            for(int i = 1; i <= 10; i = i - 1)
            {
                
                
                int value = random.nextInt(3 + 1) + 1;
                if(value ==1){
                b=1;
               
                scaleImage4();
                
                try {
                    Thread.sleep(100);
                } catch (InterruptedException ex) {
                    Logger.getLogger(casino.class.getName()).log(Level.SEVERE, null, ex);
                }
                }
                
                if(value ==2){
                b=2;
                scaleImage5();
                
                try {
                    Thread.sleep(100);
                } catch (InterruptedException ex) {
                    Logger.getLogger(casino.class.getName()).log(Level.SEVERE, null, ex);
                }
                }
                
                if(value ==3){
                b=3;
                scaleImage6();
                
                try {
                    Thread.sleep(100);
                } catch (InterruptedException ex) {
                    Logger.getLogger(casino.class.getName()).log(Level.SEVERE, null, ex);
                }
                }
            }
            
        }

        
        }
     //-----------------------------------------------------------------------------------------------------------------------
    public class Hilo3 extends Thread {
       
       
        @Override
        public void run(){
            
            for(int i = 1; i <= 10; i = i - 1)
            {
              
                int value = random.nextInt(3 + 1) + 1;
                if(value ==1){
                c=1;
               
                scaleImage7();
                
                try {
                    Thread.sleep(100);
                } catch (InterruptedException ex) {
                    Logger.getLogger(casino.class.getName()).log(Level.SEVERE, null, ex);
                }
                }
                
                if(value ==2){
                c=2;
               
                scaleImage8();
                
                try {
                    Thread.sleep(100);
                } catch (InterruptedException ex) {
                    Logger.getLogger(casino.class.getName()).log(Level.SEVERE, null, ex);
                }
                }
                
                if(value ==3){
                c=3;
               
                scaleImage9();
                
                try {
                    Thread.sleep(100);
                } catch (InterruptedException ex) {
                    Logger.getLogger(casino.class.getName()).log(Level.SEVERE, null, ex);
                }
                }
            }
            
        }

        
        }
     //-----------------------------------------------------------------------------------------------------------------------
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/img1.png"))); // NOI18N
        jLabel3.setBorder(javax.swing.BorderFactory.createMatteBorder(3, 3, 3, 3, new java.awt.Color(0, 0, 0)));
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 40, 100, 117));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/img1.png"))); // NOI18N
        jLabel2.setBorder(javax.swing.BorderFactory.createMatteBorder(3, 3, 3, 3, new java.awt.Color(0, 0, 0)));
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 40, 100, 120));

        jLabel1.setBorder(javax.swing.BorderFactory.createMatteBorder(3, 3, 3, 3, new java.awt.Color(0, 0, 0)));
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 40, 100, 120));

        jButton2.setBackground(new java.awt.Color(0, 0, 102));
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/det.png"))); // NOI18N
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 170, 110, 90));

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/det.png"))); // NOI18N
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 170, 110, -1));

        jButton1.setBackground(new java.awt.Color(255, 255, 255));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/det.png"))); // NOI18N
        jButton1.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, null, java.awt.Color.darkGray));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 170, 110, 90));

        jButton4.setBackground(new java.awt.Color(255, 255, 255));
        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/atz.png"))); // NOI18N
        jButton4.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, java.awt.Color.darkGray, java.awt.Color.darkGray));
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 280, 190, 130));

        jLabel5.setFont(new java.awt.Font("Verdana", 1, 36)); // NOI18N
        jLabel5.setText("START:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 320, -1, -1));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/fondo.jpg"))); // NOI18N
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 730, 410));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 407, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        hilo1 = new Hilo1();
        hilo2 = new Hilo2();
        hilo3 = new Hilo3();
        hilo1.start();
        hilo2.start();
        hilo3.start();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        hilo1.stop();
        if(a == b && a==b && b==c){
            System.out.println("ganaste");
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        hilo2.stop();
        
        if(a == b && a==b && b==c){
            System.out.println("ganaste");
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        hilo3.stop();
        
        ganar ganar = new ganar();
        perder perder = new perder();
        
        if(a == b && a==b && b==c){
          ganar.setVisible(true);
        }else
        {
          perder.setVisible(true);
        }
    }//GEN-LAST:event_jButton3ActionPerformed

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
            java.util.logging.Logger.getLogger(casino.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(casino.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(casino.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(casino.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new casino().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
