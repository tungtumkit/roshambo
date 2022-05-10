package spiel;

/*
Diese Klasse ist Bauplan für den HelpDialog
Der Dialog (ein Fenster) gibt Anleitung für das Spiel
*/
public class HelpDialog extends javax.swing.JDialog {
    
    public HelpDialog(java.awt.Frame parent) {
        super(parent);
        initComponents();           //Komponente des Dialogs erzeugen (vom IDE)
        setTitle("How to play");    //gen Dialog benennen
    }

    @SuppressWarnings("unchecked")
    /*  Zeilen 15-70 wurden von IDE generiert und daher nicht kommentiert
        Generiertert Code   */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Trebuchet MS", 0, 15)); // NOI18N
        jLabel1.setText("Dies ist ein traditionelles Schere-Stein-Papier Spiel.");

        jLabel2.setFont(new java.awt.Font("Trebuchet MS", 0, 15)); // NOI18N
        jLabel2.setText("Du spielst gegen den Computer");

        jLabel3.setFont(new java.awt.Font("Trebuchet MS", 0, 15)); // NOI18N
        jLabel3.setText("Klicke auf die Taste, um eine ,,Waffe'' auszuwählen.");

        jLabel4.setFont(new java.awt.Font("Trebuchet MS", 0, 15)); // NOI18N
        jLabel4.setText("Wer eine Runde gewinnt, bekommt einen Punkt.");

        jLabel5.setFont(new java.awt.Font("Trebuchet MS", 0, 15)); // NOI18N
        jLabel5.setText("Um ein neues Spiel zu starten, klicke auf ,,Reset''");

        jLabel6.setFont(new java.awt.Font("Trebuchet MS", 0, 15)); // NOI18N
        jLabel6.setText("Möchtest du zufällig auswählen, klicke auf die grüne Taste.");

        jLabel7.setFont(new java.awt.Font("Trebuchet MS", 0, 15)); // NOI18N
        jLabel7.setText("Der Gewinner ist der erste, der 5 Punkte kriegt.");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 390, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 390, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 370, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 390, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 390, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 390, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(3, 3, 3)
                .addComponent(jLabel2)
                .addGap(1, 1, 1)
                .addComponent(jLabel3)
                .addGap(1, 1, 1)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    // End of variables declaration//GEN-END:variables
    //  Ende vom generierten Code
}
