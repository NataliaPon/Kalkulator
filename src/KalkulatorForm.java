
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/**
 * Projekt kalkulatora z zegarem 
 * @author Natalia Poniatowska
 */

public class KalkulatorForm extends javax.swing.JFrame  {

    double liczba1, wynik;
    int dzialanie;
    String nazwa;
    
    
    private static String[] nazwcz = {"Cambria", "Vivaldi", "Forte"};
    private static String[] tytul = {"kwiaty.jpg", "liscie.jpg", "woda.jpg"};
    private Icon[] obrazki ={
    new ImageIcon(getClass().getResource(tytul[0])),
    new ImageIcon(getClass().getResource(tytul[1])),
    new ImageIcon(getClass().getResource(tytul[2]))
    };
    
    

 
    KalkulatorForm() {
        initComponents();
        
        
       
        box.addItemListener(
            new ItemListener()
            {
                public void itemStateChanged(ItemEvent event)
                {
                    if(event.getStateChange()==ItemEvent.SELECTED)
                        tlo.setIcon(obrazki[box.getSelectedIndex()]);
                }
            }
        );
        
        czcionka.addItemListener(
            new ItemListener()
            {
                public void itemStateChanged(ItemEvent event)
                {
                    if(event.getStateChange()==ItemEvent.SELECTED)
                    {
                        Font f = textzegar.getFont();
                        textzegar.setFont(new Font(nazwcz[czcionka.getSelectedIndex()],f.getStyle(),f.getSize()));                      
                    }
                }
            }
        );
        
        kolor.addItemListener(
            new ItemListener()
            {
                public void itemStateChanged(ItemEvent event)
                {
                    if(event.getStateChange()==ItemEvent.SELECTED)
                    {                        
                        switch(kolor.getSelectedIndex())
                        {
                            case 0:
                            textzegar.setForeground(Color.black);
                            break;
                            case 1:
                            textzegar.setForeground(Color.white);
                            break;
                            case 2:
                            textzegar.setForeground(Color.red);
                            break;
                        }
                    }
                }
            }
        );
        
        //odliczanie czasu
        new Thread ()
        {
         public void run()
        {
            
            while(true)
            {
             Calendar cal = new GregorianCalendar();
        
            int godz = cal.get(Calendar.HOUR);
            int min = cal.get(Calendar.MINUTE);
            int sek = cal.get(Calendar.SECOND);
            int AP = cal.get(Calendar.AM_PM);
            
            if (AP == 1)
            {
                godz += 12;
            }
        
            String czas = godz + ":"+min+":"+sek;
        
            textzegar.setText(czas);
            
            szukaj();
            
            
            }                       
        }
        
        }.start();
        
    }

    //funkcjonalnosc kalkulatora
    public void dzialania ()
    {
        switch(dzialanie)
        {
            case 1:
                try{
                wynik = liczba1 + Double.parseDouble(textwynik.getText());
                textwynik.setText(Double.toString(wynik));
                }
                catch(NumberFormatException e)
                        {
                            textwynik.setText("Zly format.");
                        }
                break;
            case 2:
                try{
                wynik = liczba1 - Double.parseDouble(textwynik.getText());
                textwynik.setText(Double.toString(wynik));
                }
                catch(NumberFormatException e)
                        {
                            textwynik.setText("Zly format.");
                        }
                break;
            case 3:
                try{
                wynik = liczba1 * Double.parseDouble(textwynik.getText());
                textwynik.setText(Double.toString(wynik));
                }
                catch(NumberFormatException e)
                        {
                            textwynik.setText("Zly format.");
                        }
                break;
            case 4:
                try{
                wynik = liczba1 / Double.parseDouble(textwynik.getText());
                textwynik.setText(Double.toString(wynik));
                }
                catch(NumberFormatException e)
                        {
                            textwynik.setText("Zly format.");
                        }
                break;
        }
    }
    
    
    
  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        textwynik = new javax.swing.JTextField();
        p2 = new javax.swing.JButton();
        p3 = new javax.swing.JButton();
        p1 = new javax.swing.JButton();
        p4 = new javax.swing.JButton();
        p6 = new javax.swing.JButton();
        p5 = new javax.swing.JButton();
        p7 = new javax.swing.JButton();
        p8 = new javax.swing.JButton();
        p9 = new javax.swing.JButton();
        pplus = new javax.swing.JButton();
        prazy = new javax.swing.JButton();
        pminus = new javax.swing.JButton();
        pdziel = new javax.swing.JButton();
        prowna = new javax.swing.JButton();
        pkropka = new javax.swing.JButton();
        p0 = new javax.swing.JButton();
        pusun1 = new javax.swing.JButton();
        box = new javax.swing.JComboBox<>();
        textzegar = new javax.swing.JLabel();
        podglad = new javax.swing.JLabel();
        czcionka = new javax.swing.JComboBox<>();
        kolor = new javax.swing.JComboBox<>();
        tlo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Kalkulator");
        setMinimumSize(new java.awt.Dimension(310, 400));
        getContentPane().setLayout(null);

        textwynik.setFont(new java.awt.Font("Arial Unicode MS", 1, 14)); // NOI18N
        textwynik.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        textwynik.setToolTipText("tabwynik");
        getContentPane().add(textwynik);
        textwynik.setBounds(24, 51, 254, 39);

        p2.setText("2");
        p2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                p2ActionPerformed(evt);
            }
        });
        getContentPane().add(p2);
        p2.setBounds(89, 206, 59, 43);

        p3.setText("3");
        p3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                p3ActionPerformed(evt);
            }
        });
        getContentPane().add(p3);
        p3.setBounds(154, 206, 59, 43);

        p1.setText("1");
        p1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                p1ActionPerformed(evt);
            }
        });
        getContentPane().add(p1);
        p1.setBounds(24, 206, 59, 43);

        p4.setText("4");
        p4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                p4ActionPerformed(evt);
            }
        });
        getContentPane().add(p4);
        p4.setBounds(24, 157, 59, 43);

        p6.setText("6");
        p6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                p6ActionPerformed(evt);
            }
        });
        getContentPane().add(p6);
        p6.setBounds(154, 157, 59, 43);

        p5.setText("5");
        p5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                p5ActionPerformed(evt);
            }
        });
        getContentPane().add(p5);
        p5.setBounds(89, 157, 59, 43);

        p7.setText("7");
        p7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                p7ActionPerformed(evt);
            }
        });
        getContentPane().add(p7);
        p7.setBounds(24, 108, 59, 43);

        p8.setText("8");
        p8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                p8ActionPerformed(evt);
            }
        });
        getContentPane().add(p8);
        p8.setBounds(89, 108, 59, 43);

        p9.setText("9");
        p9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                p9ActionPerformed(evt);
            }
        });
        getContentPane().add(p9);
        p9.setBounds(154, 108, 59, 43);

        pplus.setText("+");
        pplus.setToolTipText("");
        pplus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pplusActionPerformed(evt);
            }
        });
        pplus.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                pplusKeyPressed(evt);
            }
        });
        getContentPane().add(pplus);
        pplus.setBounds(219, 108, 59, 43);

        prazy.setText("x");
        prazy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                prazyActionPerformed(evt);
            }
        });
        getContentPane().add(prazy);
        prazy.setBounds(219, 206, 59, 43);

        pminus.setText("-");
        pminus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pminusActionPerformed(evt);
            }
        });
        getContentPane().add(pminus);
        pminus.setBounds(219, 157, 59, 43);

        pdziel.setText("/");
        pdziel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pdzielActionPerformed(evt);
            }
        });
        getContentPane().add(pdziel);
        pdziel.setBounds(219, 255, 59, 43);

        prowna.setText("=");
        prowna.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                prownaActionPerformed(evt);
            }
        });
        getContentPane().add(prowna);
        prowna.setBounds(219, 304, 59, 43);

        pkropka.setText(".");
        pkropka.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pkropkaActionPerformed(evt);
            }
        });
        getContentPane().add(pkropka);
        pkropka.setBounds(89, 255, 59, 43);

        p0.setText("0");
        p0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                p0ActionPerformed(evt);
            }
        });
        getContentPane().add(p0);
        p0.setBounds(24, 255, 59, 43);

        pusun1.setText("C");
        pusun1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pusun1ActionPerformed(evt);
            }
        });
        getContentPane().add(pusun1);
        pusun1.setBounds(154, 255, 59, 43);

        box.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "kwiaty", "liscie", "woda" }));
        box.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boxActionPerformed(evt);
            }
        });
        getContentPane().add(box);
        box.setBounds(0, 0, 80, 24);

        textzegar.setFont(new java.awt.Font("Stencil", 1, 24)); // NOI18N
        textzegar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(textzegar);
        textzegar.setBounds(24, 304, 110, 43);

        podglad.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        podglad.setToolTipText("");
        getContentPane().add(podglad);
        podglad.setBounds(125, 11, 153, 29);

        czcionka.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Cambria", "Vivaldi", "Forte" }));
        czcionka.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                czcionkaActionPerformed(evt);
            }
        });
        getContentPane().add(czcionka);
        czcionka.setBounds(80, 0, 80, 24);

        kolor.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Czarny", "Bialy", "Czerwony" }));
        getContentPane().add(kolor);
        kolor.setBounds(160, 0, 80, 24);
        getContentPane().add(tlo);
        tlo.setBounds(-6, 0, 310, 360);

        pack();
    }// </editor-fold>//GEN-END:initComponents
   
    //mozliwosc wpisywania danych z klawiatury
    public void szukaj()
    {
        String znak = textwynik.getText();
        int plus;
        int minus;
        int podzielic;
        int razy;
        int rowne;
        try{
            plus = znak.indexOf("+");
        }
        catch(java.lang.NullPointerException ex)
        {
            plus=-1;
        }
        try{
            minus = znak.indexOf("-");}
        catch(java.lang.NullPointerException ex)
        {
            minus=-1;
        }
        try{
        razy = znak.indexOf("*");}
        catch(java.lang.NullPointerException ex)
        {
           razy=-1; 
        }
        try{
            podzielic = znak.indexOf("/");}
        catch(java.lang.NullPointerException ex)
        {
            podzielic=-1;
        }
        try{
        rowne = znak.indexOf("=");}
        catch(java.lang.NullPointerException ex)
        {
            rowne=-1;
        }
        
        
        if(plus!= -1)
        {
            try{
                    
                int dlugosc =znak.length();
                String liczba = znak.substring(0, dlugosc-1);
                liczba1 = Double.parseDouble(liczba);
                dzialanie =1;
                textwynik.setText("");
                podglad.setText(liczba+" + ");
                
                }
                catch(NumberFormatException e)
                        {
                            textwynik.setText("Zly format.");
                        }
        }
        if (minus != -1)
        {
            try{
                    
                int dlugosc =znak.length();
                String liczba = znak.substring(0, dlugosc-1);
                liczba1 = Double.parseDouble(liczba);
                dzialanie =2;
                textwynik.setText("");
                podglad.setText(liczba+" - ");
                
                }
                catch(NumberFormatException e)
                        {
                            textwynik.setText("Zly format.");
                        }
        }
        if (razy != -1)
        {
            try{
                    
                int dlugosc =znak.length();
                String liczba = znak.substring(0, dlugosc-1);
                liczba1 = Double.parseDouble(liczba);
                dzialanie =3;
                textwynik.setText("");
                podglad.setText(liczba+" * ");
                
                }
                catch(NumberFormatException e)
                        {
                            textwynik.setText("Zly format.");
                        }
        }
        if (podzielic != -1)
        {
            try{
                    
                int dlugosc =znak.length();
                String liczba = znak.substring(0, dlugosc-1);
                liczba1 = Double.parseDouble(liczba);
                dzialanie =4;
                textwynik.setText("");
                podglad.setText(liczba+" / ");
                
                }
                catch(NumberFormatException e)
                        {
                            textwynik.setText("Zly format.");
                        }
        }
        
        if (rowne != -1)
        {
        int dlugosc =znak.length();
        String liczba = znak.substring(0, dlugosc-1);
        textwynik.setText(liczba);
        dzialania(); 
        podglad.setText("");
        
        }

    }
    

    //obsluga poszczegolnych dzialan matematycznych i ich znakow
    private void pplusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pplusActionPerformed
        try{
        liczba1 = Double.parseDouble(textwynik.getText());
        dzialanie =1;
        textwynik.setText("");
        podglad.setText(liczba1+" + ");
        }
        catch(NumberFormatException e)
                        {
                            textwynik.setText("Zly format.");
                        }
    }//GEN-LAST:event_pplusActionPerformed

    private void p0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_p0ActionPerformed
        textwynik.setText(textwynik.getText()+"0");
       
    }//GEN-LAST:event_p0ActionPerformed

    private void p1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_p1ActionPerformed
        textwynik.setText(textwynik.getText()+"1");
    }//GEN-LAST:event_p1ActionPerformed

    private void p2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_p2ActionPerformed
        textwynik.setText(textwynik.getText()+"2");
    }//GEN-LAST:event_p2ActionPerformed

    private void p3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_p3ActionPerformed
        textwynik.setText(textwynik.getText()+"3");
    }//GEN-LAST:event_p3ActionPerformed

    private void p4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_p4ActionPerformed
        textwynik.setText(textwynik.getText()+"4");
    }//GEN-LAST:event_p4ActionPerformed

    private void p5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_p5ActionPerformed
        textwynik.setText(textwynik.getText()+"5");
    }//GEN-LAST:event_p5ActionPerformed

    private void p6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_p6ActionPerformed
        textwynik.setText(textwynik.getText()+"6");
    }//GEN-LAST:event_p6ActionPerformed

    private void p7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_p7ActionPerformed
        textwynik.setText(textwynik.getText()+"7");
    }//GEN-LAST:event_p7ActionPerformed

    private void p8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_p8ActionPerformed
        textwynik.setText(textwynik.getText()+"8");
    }//GEN-LAST:event_p8ActionPerformed

    private void p9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_p9ActionPerformed
        textwynik.setText(textwynik.getText()+"9");
    }//GEN-LAST:event_p9ActionPerformed

    private void prazyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_prazyActionPerformed
        try{
        liczba1 = Double.parseDouble(textwynik.getText());
        dzialanie =3;
        textwynik.setText("");
        podglad.setText(liczba1+" x ");  
        }
        catch(NumberFormatException e)
                        {
                            textwynik.setText("Zly format.");
                        }
    }//GEN-LAST:event_prazyActionPerformed

    private void pdzielActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pdzielActionPerformed
        try{
        liczba1 = Double.parseDouble(textwynik.getText());
        dzialanie =4;
        textwynik.setText("");
        podglad.setText(liczba1+" / ");}
        catch(NumberFormatException e)
                        {
                            textwynik.setText("Zly format.");
                        }
    }//GEN-LAST:event_pdzielActionPerformed

    private void pkropkaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pkropkaActionPerformed
        textwynik.setText(textwynik.getText()+".");
    }//GEN-LAST:event_pkropkaActionPerformed

    private void pminusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pminusActionPerformed
        try{
        liczba1 = Double.parseDouble(textwynik.getText());
        dzialanie =2;
        textwynik.setText("");
        podglad.setText(liczba1+" - ");
        }
        catch(NumberFormatException e)
                        {
                            textwynik.setText("Zly format.");
                        }
    }//GEN-LAST:event_pminusActionPerformed

    private void pusun1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pusun1ActionPerformed
        textwynik.setText("");
        podglad.setText("");
    }//GEN-LAST:event_pusun1ActionPerformed

    private void prownaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_prownaActionPerformed
       dzialania(); 
       podglad.setText("");
    }//GEN-LAST:event_prownaActionPerformed

    private void boxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boxActionPerformed
       
        
    }//GEN-LAST:event_boxActionPerformed

    private void czcionkaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_czcionkaActionPerformed
     
    }//GEN-LAST:event_czcionkaActionPerformed

    private void pplusKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_pplusKeyPressed

        
    }//GEN-LAST:event_pplusKeyPressed
   

    
    
    

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
            java.util.logging.Logger.getLogger(KalkulatorForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(KalkulatorForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(KalkulatorForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(KalkulatorForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new KalkulatorForm().setVisible(true);

            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> box;
    private javax.swing.JComboBox<String> czcionka;
    private javax.swing.JComboBox<String> kolor;
    private javax.swing.JButton p0;
    private javax.swing.JButton p1;
    private javax.swing.JButton p2;
    private javax.swing.JButton p3;
    private javax.swing.JButton p4;
    private javax.swing.JButton p5;
    private javax.swing.JButton p6;
    private javax.swing.JButton p7;
    private javax.swing.JButton p8;
    private javax.swing.JButton p9;
    private javax.swing.JButton pdziel;
    private javax.swing.JButton pkropka;
    private javax.swing.JButton pminus;
    private javax.swing.JLabel podglad;
    private javax.swing.JButton pplus;
    private javax.swing.JButton prazy;
    private javax.swing.JButton prowna;
    private javax.swing.JButton pusun1;
    private javax.swing.JTextField textwynik;
    private javax.swing.JLabel textzegar;
    private javax.swing.JLabel tlo;
    // End of variables declaration//GEN-END:variables
}
