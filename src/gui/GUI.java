package gui;
//Author: sven
import chatclient.ChatClient;
import chatclient.ChatListener;
import java.awt.event.*;
import java.io.*;
import java.util.logging.*;
import javax.swing.*;
import shared.ProtocolStrings;

public class GUI extends javax.swing.JFrame implements ChatListener {

    static String NL = System.getProperty("line.separator");
    ChatClient client = new ChatClient();
    DefaultListModel model;

    String ip = "chatserver.cloudapp.net";
    String userName = "Anonymous";
    int port = 9090;

    public GUI() {
        this.setTitle("Chat Client");
        this.setSize(800, 600);
        initComponents();
        setLocationRelativeTo(null);
        Main.setVisible(true);
        Settings.setVisible(false);
        setLabels();
        model = new DefaultListModel();
        jListOnlineUsers.setModel(model);
        jButtonDisconnect.setEnabled(false);
        jButtonSend.setEnabled(false);

        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent ev) {
                if (jButtonSend.isEnabled()) {
                    try {
                        JOptionPane.showMessageDialog(GUI.this, "Closing the Connection");
                        if (client != null) {
                            client.stopClient();
                        }
                    } catch (IOException ex) {
                        Logger.getLogger(GUI.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            }
        });
    }

    public void hidePanels() {
        Main.setVisible(false);
        Settings.setVisible(false);
    }

    public void setLabels() {
        jLabelIP.setText(ip);
        jLabelPort.setText(Integer.toString(port));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Main = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jButtonConnect = new javax.swing.JButton();
        jButtonDisconnect = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        textReceived = new javax.swing.JTextArea();
        jButtonSend = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTextArea3 = new javax.swing.JTextArea();
        jLabel7 = new javax.swing.JLabel();
        jLabelIP = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabelPort = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jListOnlineUsers = new javax.swing.JList();
        Settings = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jButtonSettingSave = new javax.swing.JButton();
        jButtonSettingCancel = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItemMain = new javax.swing.JMenuItem();
        jMenuItemSettings = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel4.setText("Username:");

        jTextField1.setText("Anonymous");

        jButtonConnect.setText("Connect");
        jButtonConnect.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonConnectActionPerformed(evt);
            }
        });

        jButtonDisconnect.setText("Disconnect");
        jButtonDisconnect.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDisconnectActionPerformed(evt);
            }
        });

        jLabel5.setText("Online users:");

        textReceived.setEditable(false);
        textReceived.setColumns(20);
        textReceived.setLineWrap(true);
        textReceived.setRows(5);
        jScrollPane2.setViewportView(textReceived);

        jButtonSend.setText("Send");
        jButtonSend.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSendActionPerformed(evt);
            }
        });

        jTextArea3.setColumns(20);
        jTextArea3.setRows(5);
        jScrollPane3.setViewportView(jTextArea3);

        jLabel7.setText("IP:");

        jLabelIP.setText("255.255.255.255");

        jLabel9.setText("Port:");

        jLabelPort.setText("9090");

        jListOnlineUsers.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        jScrollPane4.setViewportView(jListOnlineUsers);

        javax.swing.GroupLayout MainLayout = new javax.swing.GroupLayout(Main);
        Main.setLayout(MainLayout);
        MainLayout.setHorizontalGroup(
            MainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MainLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(MainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(MainLayout.createSequentialGroup()
                        .addComponent(jScrollPane3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonSend))
                    .addGroup(MainLayout.createSequentialGroup()
                        .addGroup(MainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2))
                    .addGroup(MainLayout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabelIP)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabelPort)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 46, Short.MAX_VALUE)
                        .addComponent(jButtonConnect)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonDisconnect)))
                .addContainerGap())
        );
        MainLayout.setVerticalGroup(
            MainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MainLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(MainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonConnect)
                    .addComponent(jButtonDisconnect)
                    .addComponent(jLabel7)
                    .addComponent(jLabelIP)
                    .addComponent(jLabel9)
                    .addComponent(jLabelPort))
                .addGap(8, 8, 8)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(MainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 307, Short.MAX_VALUE)
                    .addComponent(jScrollPane4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(MainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButtonSend, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane3))
                .addContainerGap())
        );

        jLabel1.setText("Settings for server:");

        jLabel2.setText("Server IP:");

        jTextField2.setText("chatserver.cloudapp.net");
        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });

        jLabel3.setText("Port:");

        jTextField3.setText("9090");

        jButtonSettingSave.setText("Save");
        jButtonSettingSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSettingSaveActionPerformed(evt);
            }
        });

        jButtonSettingCancel.setText("Cancel");
        jButtonSettingCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSettingCancelActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout SettingsLayout = new javax.swing.GroupLayout(Settings);
        Settings.setLayout(SettingsLayout);
        SettingsLayout.setHorizontalGroup(
            SettingsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SettingsLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(SettingsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(SettingsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(SettingsLayout.createSequentialGroup()
                            .addComponent(jButtonSettingCancel)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 50, Short.MAX_VALUE)
                            .addComponent(jButtonSettingSave))
                        .addGroup(SettingsLayout.createSequentialGroup()
                            .addGroup(SettingsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel2)
                                .addComponent(jLabel3))
                            .addGap(18, 18, 18)
                            .addGroup(SettingsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jTextField2, javax.swing.GroupLayout.DEFAULT_SIZE, 105, Short.MAX_VALUE)
                                .addComponent(jTextField3)))))
                .addContainerGap(418, Short.MAX_VALUE))
        );
        SettingsLayout.setVerticalGroup(
            SettingsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SettingsLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(SettingsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(SettingsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(SettingsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonSettingSave)
                    .addComponent(jButtonSettingCancel))
                .addContainerGap(340, Short.MAX_VALUE))
        );

        jMenu1.setText("File");

        jMenuItemMain.setText("Main");
        jMenuItemMain.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemMainActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItemMain);

        jMenuItemSettings.setText("Settings");
        jMenuItemSettings.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemSettingsActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItemSettings);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Main, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(Settings, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Main, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(Settings, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    private void jMenuItemMainActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemMainActionPerformed
        hidePanels();
        Main.setVisible(true);
    }//GEN-LAST:event_jMenuItemMainActionPerformed
    private void jMenuItemSettingsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemSettingsActionPerformed
        hidePanels();
        Settings.setVisible(true);
    }//GEN-LAST:event_jMenuItemSettingsActionPerformed
    private void jButtonSettingSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSettingSaveActionPerformed
        ip = jTextField2.getText();
        port = Integer.parseInt(jTextField3.getText());
        setLabels();
        hidePanels();
        Main.setVisible(true);
    }//GEN-LAST:event_jButtonSettingSaveActionPerformed
    private void jButtonSettingCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSettingCancelActionPerformed
        jTextField2.setText(ip);
        jTextField3.setText(Integer.toString(port));
        hidePanels();
        Main.setVisible(true);
    }//GEN-LAST:event_jButtonSettingCancelActionPerformed
    private void jButtonConnectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonConnectActionPerformed
        if (!jTextField1.getText().equals("")) {
            client = new ChatClient();
            userName = jTextField1.getText().trim();
            try {
                client.connect(ip, port, userName);
                client.registerEchoListener(this);
                jButtonConnect.setEnabled(false);
                jButtonDisconnect.setEnabled(true);
                jButtonSend.setEnabled(true);
                jTextField3.requestFocus();

            } catch (IOException ex) {
                Logger.getLogger(GUI.class.getName()).log(Level.SEVERE, null, ex);
                JOptionPane.showMessageDialog(this, "Could not connect to server", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_jButtonConnectActionPerformed
    private void jButtonDisconnectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDisconnectActionPerformed
        try {
            client.stopClient();
            jTextArea3.setText("");
            jButtonConnect.setEnabled(true);
            jButtonDisconnect.setEnabled(false);
            jButtonSend.setEnabled(false);
            model.clear();
        } catch (IOException ex) {
            Logger.getLogger(GUI.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButtonDisconnectActionPerformed
    private void jButtonSendActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSendActionPerformed

        if (!jTextArea3.getText().equals("")) {
            String msg = jTextArea3.getText();
            //see if he has selected any users and if so take the values. if not, make an empty array
            int[] selection = jListOnlineUsers.getSelectedIndices();
            String[] users;
            if (selection.length > 0) {
                users = new String[selection.length];
                int counter = 0;
                for (int i : selection) {
                    users[counter] = jListOnlineUsers.getModel().getElementAt(i).toString();
                    System.out.println(users[counter]);
                    counter++;
                }
                client.sendToSome(msg, users);
            } else {
                client.sendToAll(msg);
            }
        }
    }//GEN-LAST:event_jButtonSendActionPerformed

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

    @Override
    public void messageArrived(String data) {
        textReceived.setText(textReceived.getText() + NL + data);
    }

    @Override
    public void updateUserList(String[] users) {
        model.clear();
        for (String u : users) {
            model.addElement(u);
        }
    }

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Main;
    private javax.swing.JPanel Settings;
    private javax.swing.JButton jButtonConnect;
    private javax.swing.JButton jButtonDisconnect;
    private javax.swing.JButton jButtonSend;
    private javax.swing.JButton jButtonSettingCancel;
    private javax.swing.JButton jButtonSettingSave;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabelIP;
    private javax.swing.JLabel jLabelPort;
    private javax.swing.JList jListOnlineUsers;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItemMain;
    private javax.swing.JMenuItem jMenuItemSettings;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTextArea jTextArea3;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextArea textReceived;
    // End of variables declaration//GEN-END:variables
}
