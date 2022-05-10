package spiel;
import javax.swing.JOptionPane;

public class GameBoard extends javax.swing.JPanel {
    
    private final int[][] result = {{0,-1,1}, {1,0,-1}, {-1,1,0}};
        // 0 = draw, 1 = win, 2 = lost
        // storing all possible outcome of a round
        
    private int roundNumber; //number of rounds played
    
    public GameBoard() {
        initComponents();
        roundNumber = 0;
    }
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        resetButton = new javax.swing.JButton();
        randomButton = new javax.swing.JButton();
        paperButton = new javax.swing.JButton();
        stoneButton = new javax.swing.JButton();
        schereButton = new javax.swing.JButton();
        resultLabel = new javax.swing.JLabel();
        compLabel = new javax.swing.JLabel();
        playerLabel = new javax.swing.JLabel();
        compScoreLabel = new javax.swing.JLabel();
        playerScoreLabel = new javax.swing.JLabel();
        player = new spiel.User();
        comp = new spiel.Computer();
        roundNumberLabel = new javax.swing.JLabel();

        resetButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/data/reset.jpg"))); // NOI18N
        resetButton.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        resetButton.setMaximumSize(new java.awt.Dimension(105, 105));
        resetButton.setMinimumSize(new java.awt.Dimension(100, 100));
        resetButton.setPreferredSize(new java.awt.Dimension(102, 102));
        resetButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetButtonActionPerformed(evt);
            }
        });

        randomButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/data/random.png"))); // NOI18N
        randomButton.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        randomButton.setMinimumSize(new java.awt.Dimension(100, 100));
        randomButton.setPreferredSize(new java.awt.Dimension(102, 102));
        randomButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                randomButtonActionPerformed(evt);
            }
        });

        paperButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/data/papier.jpg"))); // NOI18N
        paperButton.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        paperButton.setMaximumSize(new java.awt.Dimension(105, 105));
        paperButton.setMinimumSize(new java.awt.Dimension(100, 100));
        paperButton.setPreferredSize(new java.awt.Dimension(102, 102));
        paperButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                paperButtonActionPerformed(evt);
            }
        });

        stoneButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/data/stein.jpg"))); // NOI18N
        stoneButton.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        stoneButton.setMinimumSize(new java.awt.Dimension(100, 100));
        stoneButton.setPreferredSize(new java.awt.Dimension(102, 102));
        stoneButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                stoneButtonActionPerformed(evt);
            }
        });

        schereButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/data/schere.jpg"))); // NOI18N
        schereButton.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        schereButton.setMinimumSize(new java.awt.Dimension(100, 100));
        schereButton.setPreferredSize(new java.awt.Dimension(102, 102));
        schereButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                schereButtonActionPerformed(evt);
            }
        });

        resultLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        resultLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        resultLabel.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        resultLabel.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        compLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/data/evilcomputer.jpg"))); // NOI18N
        compLabel.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        playerLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/data/player.jpg"))); // NOI18N
        playerLabel.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        compScoreLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        compScoreLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        compScoreLabel.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        compScoreLabel.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        playerScoreLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        playerScoreLabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        playerScoreLabel.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        playerScoreLabel.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        player.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        comp.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        roundNumberLabel.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        roundNumberLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        roundNumberLabel.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(playerLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(playerScoreLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(roundNumberLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(resultLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addComponent(compScoreLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(compLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(107, 107, 107)
                .addComponent(stoneButton, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(paperButton, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(111, 111, 111)
                        .addComponent(randomButton, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(216, 216, 216)
                        .addComponent(resetButton, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(53, 53, 53)
                        .addComponent(comp, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE))))
            .addComponent(schereButton, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(player, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(playerLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(playerScoreLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(roundNumberLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(resultLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(compScoreLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(compLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(comp, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(player, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(194, 194, 194)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(stoneButton, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(paperButton, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(randomButton, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(resetButton, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(schereButton, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)))))
        );
    }// </editor-fold>//GEN-END:initComponents
    private void randomButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_randomButtonActionPerformed
        player.choose("random");
        update();
    }//GEN-LAST:event_randomButtonActionPerformed

    private void schereButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_schereButtonActionPerformed
        player.choose("schere");
        update();
    }//GEN-LAST:event_schereButtonActionPerformed

    private void stoneButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_stoneButtonActionPerformed
        player.choose("stone");
        update();
    }//GEN-LAST:event_stoneButtonActionPerformed

    private void paperButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_paperButtonActionPerformed
        player.choose("paper");
        update();
    }//GEN-LAST:event_paperButtonActionPerformed

    private void resetButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetButtonActionPerformed
        reset();
    }//GEN-LAST:event_resetButtonActionPerformed

    //reset all values to begin a new game
    public void reset() {
        //empty all text fields
        resultLabel.setText("");
        playerScoreLabel.setText("");
        compScoreLabel.setText("");
        roundNumberLabel.setText("");
       
        roundNumber = 0;
        player.reset();
        comp.reset();
    }
    
    private void update() { //show change on the display
        //first let the computer go its turn
        comp.choose();
         
        int res = result[player.getStatus()][comp.getStatus()];
        //show round result
        switch (res) {
            case 1: //player wins this round
                player.incScore();
                resultLabel.setText("Gewonnen :D");
                break;
            case -1: //computer wins this round
                comp.incScore();
                resultLabel.setText("Verloren :(");
                break;
            default:
                resultLabel.setText("Unentschieden :O ");
                break;
        }
        
        //Show current round and points
        roundNumber++;
        roundNumberLabel.setText("Runde " + roundNumber);
        playerScoreLabel.setText("Du : " + player.getScore() + " Punkt(e)");
        compScoreLabel.setText("Com : " + comp.getScore() + " Punkt(e)");
        
        //If one side gets 5 point, game is finished
        if (player.getScore()==5 || comp.getScore()==5) {
            //message : zeigt die Nachricht auf einem Dialog an
            String message = (player.getScore() == 5) ? "Gratulieren! Du hast gewonnen!"
                    : "Schade! Der Computer hat dich besiegt :(.";
            message += " Willst du noch mal spielen ?";
            
            //let user decide whether to continue playing
            //YES_OPTION = continue, NO_OPTION = stop and exit
            Object[] options = {"Ja","Nein"};
            int decide = JOptionPane.showOptionDialog(
                    this,message, "Spiel beendet",
                    JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE,
                    null, options, options[0]);
            
            if (decide == 0) //YES_OPTION
                reset();
            else //NO_OPTION
                System.exit(0);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private spiel.Computer comp;
    private javax.swing.JLabel compLabel;
    private javax.swing.JLabel compScoreLabel;
    private javax.swing.JButton paperButton;
    private spiel.User player;
    private javax.swing.JLabel playerLabel;
    private javax.swing.JLabel playerScoreLabel;
    private javax.swing.JButton randomButton;
    private javax.swing.JButton resetButton;
    private javax.swing.JLabel resultLabel;
    private javax.swing.JLabel roundNumberLabel;
    private javax.swing.JButton schereButton;
    private javax.swing.JButton stoneButton;
    // End of variables declaration//GEN-END:variables
}
