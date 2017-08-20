/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zzz.quoridor.launcher;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import javax.swing.JOptionPane;

/**
 *
 * @author atanas
 */
public class LauncherFrame extends javax.swing.JFrame {

    /**
     * Creates new form LauncherFrame
     */
    public LauncherFrame() {
        initComponents();
        initData();
        Runtime.getRuntime().addShutdownHook(new ShutdownHook());
    }

    private static final String DATA_FILE = System.getProperty("user.home") + "/.quoridor";

    private ConnectionData data;

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        mainPanel = new javax.swing.JPanel();
        containerPanel = new javax.swing.JPanel();
        fieldsPanel = new javax.swing.JPanel();
        hostLabel = new javax.swing.JLabel();
        hostField = new javax.swing.JTextField();
        portLabel = new javax.swing.JLabel();
        portField = new javax.swing.JTextField();
        roomLabel = new javax.swing.JLabel();
        roomField = new javax.swing.JTextField();
        nicknameLabel = new javax.swing.JLabel();
        nicknameField = new javax.swing.JTextField();
        versionLabel = new javax.swing.JLabel();
        logoLabel = new javax.swing.JLabel();
        connectButtonPanel = new javax.swing.JPanel();
        connectButton = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Launcher");
        setBackground(new java.awt.Color(0, 102, 153));
        setLocation(new java.awt.Point(200, 200));
        setResizable(false);
        setSize(new java.awt.Dimension(250, 350));

        mainPanel.setBackground(new java.awt.Color(51, 51, 51));
        mainPanel.setSize(new java.awt.Dimension(250, 350));
        mainPanel.setLayout(new java.awt.BorderLayout());

        containerPanel.setBackground(new java.awt.Color(51, 51, 51));
        containerPanel.setForeground(new java.awt.Color(204, 204, 204));
        containerPanel.setLayout(new java.awt.BorderLayout());

        fieldsPanel.setBackground(new java.awt.Color(51, 51, 51));
        fieldsPanel.setBorder(javax.swing.BorderFactory.createEmptyBorder(40, 55, 40, 55));
        fieldsPanel.setForeground(new java.awt.Color(51, 51, 51));
        fieldsPanel.setAlignmentX(0.0F);
        fieldsPanel.setAlignmentY(0.0F);
        fieldsPanel.setMinimumSize(new java.awt.Dimension(250, 350));
        fieldsPanel.setPreferredSize(new java.awt.Dimension(250, 300));
        fieldsPanel.setLayout(new java.awt.GridLayout(8, 1, 0, 1));

        hostLabel.setForeground(new java.awt.Color(204, 204, 204));
        hostLabel.setText("Host");
        hostLabel.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        hostLabel.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 5, 0, 0));
        fieldsPanel.add(hostLabel);

        hostField.setBackground(new java.awt.Color(102, 102, 102));
        hostField.setForeground(new java.awt.Color(204, 204, 204));
        fieldsPanel.add(hostField);

        portLabel.setForeground(new java.awt.Color(204, 204, 204));
        portLabel.setText("Port");
        portLabel.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        portLabel.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 5, 0, 0));
        fieldsPanel.add(portLabel);

        portField.setBackground(new java.awt.Color(102, 102, 102));
        portField.setForeground(new java.awt.Color(204, 204, 204));
        fieldsPanel.add(portField);

        roomLabel.setForeground(new java.awt.Color(204, 204, 204));
        roomLabel.setText("Room");
        roomLabel.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        roomLabel.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 5, 0, 0));
        fieldsPanel.add(roomLabel);

        roomField.setBackground(new java.awt.Color(102, 102, 102));
        roomField.setForeground(new java.awt.Color(204, 204, 204));
        fieldsPanel.add(roomField);

        nicknameLabel.setForeground(new java.awt.Color(204, 204, 204));
        nicknameLabel.setText("Nickname");
        nicknameLabel.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        nicknameLabel.setAlignmentX(0.5F);
        nicknameLabel.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 5, 0, 0));
        fieldsPanel.add(nicknameLabel);

        nicknameField.setBackground(new java.awt.Color(102, 102, 102));
        nicknameField.setForeground(new java.awt.Color(204, 204, 204));
        fieldsPanel.add(nicknameField);

        containerPanel.add(fieldsPanel, java.awt.BorderLayout.CENTER);

        versionLabel.setBackground(new java.awt.Color(0, 0, 0));
        versionLabel.setFont(new java.awt.Font("Lucida Grande", 0, 9)); // NOI18N
        versionLabel.setForeground(new java.awt.Color(255, 255, 255));
        versionLabel.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        versionLabel.setText("v1.4");
        versionLabel.setToolTipText("");
        versionLabel.setBorder(javax.swing.BorderFactory.createEmptyBorder(5, 5, 5, 5));
        versionLabel.setMinimumSize(new java.awt.Dimension(5, 5));
        containerPanel.add(versionLabel, java.awt.BorderLayout.PAGE_END);

        mainPanel.add(containerPanel, java.awt.BorderLayout.CENTER);

        logoLabel.setBackground(new java.awt.Color(102, 102, 102));
        logoLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/zzz/quoridor/launcher/logo.png"))); // NOI18N
        logoLabel.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        mainPanel.add(logoLabel, java.awt.BorderLayout.PAGE_START);

        connectButtonPanel.setBackground(new java.awt.Color(102, 102, 102));
        connectButtonPanel.setLayout(new java.awt.BorderLayout());

        connectButton.setBackground(new java.awt.Color(51, 51, 51));
        connectButton.setForeground(new java.awt.Color(255, 255, 255));
        connectButton.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        connectButton.setText("Connect");
        connectButton.setPreferredSize(new java.awt.Dimension(52, 30));
        connectButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                connectButtonMousePressed(evt);
            }
        });
        connectButtonPanel.add(connectButton, java.awt.BorderLayout.PAGE_END);

        mainPanel.add(connectButtonPanel, java.awt.BorderLayout.PAGE_END);

        getContentPane().add(mainPanel, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void connectButtonMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_connectButtonMousePressed

        setData();

        String validation = data.validateFields();

        if (validation != null) {
            JOptionPane.showMessageDialog(this, "Empty or invalid field: " + validation, "Error", JOptionPane.WARNING_MESSAGE);
            return;
        }

        String command = "java -cp lib/scala.jar:lib/scala-swing.jar:lib/quoridor.jar com.csc.quoridor.Main auto "
                + data.getHost() + " " + data.getPort() + " " + data.getRoom() + " " + data.getNickname();

        try {
            Process process = Runtime.getRuntime().exec(command);
            setVisible(false);
            new RequestFocusThread(process.waitFor()).start();
        } catch (Exception ex) {
        }

    }//GEN-LAST:event_connectButtonMousePressed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                LauncherFrame frame = new LauncherFrame();
                frame.setLocationRelativeTo(null);
                frame.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel connectButton;
    private javax.swing.JPanel connectButtonPanel;
    private javax.swing.JPanel containerPanel;
    private javax.swing.JPanel fieldsPanel;
    private javax.swing.JTextField hostField;
    private javax.swing.JLabel hostLabel;
    private javax.swing.JLabel logoLabel;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JTextField nicknameField;
    private javax.swing.JLabel nicknameLabel;
    private javax.swing.JTextField portField;
    private javax.swing.JLabel portLabel;
    private javax.swing.JTextField roomField;
    private javax.swing.JLabel roomLabel;
    private javax.swing.JLabel versionLabel;
    // End of variables declaration//GEN-END:variables

    private void initData() {

        try {
            FileInputStream fis = new FileInputStream(DATA_FILE);
            ObjectInputStream ois = new ObjectInputStream(fis);
            data = (ConnectionData) ois.readObject();
        } catch (Exception e) {

        }

        if (data == null) {
            data = new ConnectionData("localhost", "12222", "lambda", "");
        }

        hostField.setText(data.getHost());
        portField.setText(data.getPort());
        roomField.setText(data.getRoom());
        nicknameField.setText(data.getNickname());

    }

    private void setData() {
        data.setHost(hostField.getText());
        data.setPort(portField.getText());
        data.setRoom(roomField.getText());
        data.setNickname(nicknameField.getText());
    }

    private class ShutdownHook extends Thread {

        @Override
        public void run() {

            setData();

            try {
                FileOutputStream fos = new FileOutputStream(DATA_FILE);
                ObjectOutputStream oos = new ObjectOutputStream(fos);
                oos.writeObject(data);
            } catch (Exception e) {

            }
        }

    }

    private class RequestFocusThread extends Thread {

        private int result;

        public RequestFocusThread(int result) {
            this.result = result;
        }

        @Override
        public void run() {
            try {
                Thread.sleep(500);
            } catch (InterruptedException ex) {
            }

            setVisible(true);
            setAlwaysOnTop(true);

            if (result != 0) {
                switch (result) {
                    case 10:
                        JOptionPane.showMessageDialog(LauncherFrame.this, "Cannot connect to server", "Error", JOptionPane.ERROR_MESSAGE);
                        break;
                    case 11:
                        JOptionPane.showMessageDialog(LauncherFrame.this, "Cannot enter room", "Error", JOptionPane.ERROR_MESSAGE);
                        break;
                    default:
                        JOptionPane.showMessageDialog(LauncherFrame.this, "Unexpected error occured", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }

            toFront();
            requestFocus();
            setAlwaysOnTop(false);

        }

    }

}