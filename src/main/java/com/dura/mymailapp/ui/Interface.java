package com.dura.mymailapp.ui;

import com.dura.mymailapp.logic.Sender;
import java.text.ParseException;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import java.awt.BorderLayout;
import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JProgressBar;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import de.javasoft.plaf.synthetica.SyntheticaBlackMoonLookAndFeel;
import java.awt.Dimension;
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.UnsupportedLookAndFeelException;

public class Interface extends javax.swing.JFrame {

    private JOptionPane jOptionPane;
    private String path = "0";

    public Interface() throws UnsupportedLookAndFeelException, ParseException {
        UIManager.setLookAndFeel(new SyntheticaBlackMoonLookAndFeel());
        initComponents();

        setResizable(false);
        Dimension screenSize = new Dimension(Toolkit.getDefaultToolkit().getScreenSize());
        setPreferredSize(new Dimension(340, 285));
        Dimension windowSize = new Dimension(getPreferredSize());
        int wdwLeft = 50 + screenSize.width / 2 - windowSize.width / 2;
        int wdwTop = screenSize.height / 2 - windowSize.height / 2;
        pack();
        setLocation(wdwLeft, wdwTop);
        setTitle("Rapid Mailer v0.5");

        Image im = Toolkit.getDefaultToolkit().getImage("/mail.png");
        setIconImage(im);
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtTo = new javax.swing.JTextField();
        txtSubject = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtMsg = new javax.swing.JTextArea();
        btnSend = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        AttachBut = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImage(getIconImage());

        jLabel3.setText("To");

        jLabel4.setText("Subject");

        txtMsg.setColumns(20);
        txtMsg.setRows(5);
        jScrollPane1.setViewportView(txtMsg);

        btnSend.setText("Send");
        btnSend.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSendActionPerformed(evt);
            }
        });

        jButton2.setText("Clear");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setText("Rapid Mailer");

        AttachBut.setText("No Attachment");
        AttachBut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AttachButActionPerformed(evt);
            }
        });

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/letter.png"))); // NOI18N
        jLabel2.setMaximumSize(new java.awt.Dimension(128, 128));
        jLabel2.setPreferredSize(new java.awt.Dimension(60, 60));

        jLabel5.setText("v0.5");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(4, 4, 4)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel5))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4))
                                .addGap(40, 40, 40)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtSubject)
                                    .addComponent(txtTo, javax.swing.GroupLayout.DEFAULT_SIZE, 235, Short.MAX_VALUE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(AttachBut)
                        .addGap(13, 13, 13)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnSend, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel1)
                        .addComponent(jLabel5))
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtTo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(txtSubject, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AttachBut)
                    .addComponent(btnSend)
                    .addComponent(jButton2))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSendActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSendActionPerformed

        if(txtTo.getText().equals("") || txtSubject.getText().equals("") || txtMsg.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Dont you feel like missing Something?", "Rapid Mailer v0.5", javax.swing.JOptionPane.INFORMATION_MESSAGE);
            return;
        }

        try {
            Load();
        } catch (Throwable ex) {
        }
    }//GEN-LAST:event_btnSendActionPerformed

    public void postMail() {
        try {
            String to = txtTo.getText();
            String subject = txtSubject.getText();
            String message = txtMsg.getText();
            Sender sender = new Sender();

            boolean flag = sender.Send(to, subject, message, path);

            if (flag == true) {
                JOptionPane.showMessageDialog(this, "Message has been successfully send to " + to, "Rapid Mailer v0.5", javax.swing.JOptionPane.INFORMATION_MESSAGE);
                clear();
            } else {
                JOptionPane.showMessageDialog(this, "Error occured while Sending!", "Rapid Mailer v0.5", javax.swing.JOptionPane.ERROR_MESSAGE);
            }
        } catch (Throwable ex) {
        }
    }

    private void AttachButActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AttachButActionPerformed
        JFileChooser jfc = new JFileChooser();
        jfc.setMultiSelectionEnabled(true);// added line
        int result = jfc.showOpenDialog(this);
        if (result == JFileChooser.CANCEL_OPTION) {
            AttachBut.setText("No Attachment");
            path = "0";
            return;
        }
        try {
            path = jfc.getSelectedFile().getPath();
            JOptionPane.showMessageDialog(this, path, "File Added", javax.swing.JOptionPane.INFORMATION_MESSAGE);
            AttachBut.setText("File Attached");
            AttachBut.setToolTipText(path);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage(), "File Error", JOptionPane.ERROR_MESSAGE);
            AttachBut.setText("No Attachment");
            path = "0";
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_AttachButActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        clear();
    }//GEN-LAST:event_jButton2ActionPerformed

    public void clear() {
        txtTo.setText("");
        txtSubject.setText("");
        txtMsg.setText("");
        path = "0";
        AttachBut.setText("No Attachment");
        txtTo.requestFocus();
    }

    public void Load() throws Throwable {

        final JFrame frame = new JFrame("Rapid Mailer v0.5");
        frame.setResizable(false);

        final JProgressBar progressBar = new JProgressBar();
        progressBar.setIndeterminate(true);
        final JPanel contentPane = new JPanel();
        contentPane.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        contentPane.setLayout(new BorderLayout());
        contentPane.add(new JLabel("Sending..."), BorderLayout.NORTH);
        contentPane.add(progressBar, BorderLayout.CENTER);
        frame.setContentPane(contentPane);
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);

        Runnable runnable = new Runnable() {

            public void run() {
                // do loading stuff in here
                // for now, simulate loading task with Thread.sleep(...)
                try {
                    System.out.println("Sending mail...");
                    Thread.sleep(1000);
                    postMail();
                } catch (InterruptedException e) {
                }
                // when loading is finished, make frame disappear
                SwingUtilities.invokeLater(new Runnable() {

                    public void run() {
                        frame.setVisible(false);
                    }
                });

            }
        };
        new Thread(runnable).start();
    }

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                try {
                    new Interface().setVisible(true);
                } catch (UnsupportedLookAndFeelException ex) {
                } catch (ParseException ex) {
                }
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AttachBut;
    private javax.swing.JButton btnSend;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea txtMsg;
    private javax.swing.JTextField txtSubject;
    private javax.swing.JTextField txtTo;
    // End of variables declaration//GEN-END:variables
}
