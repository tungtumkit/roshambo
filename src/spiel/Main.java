/*
Dieses Programms ist ein Schere-Stein-Papier mit Grafik
Der Benutzer spielt gegen den Computer-Gegner
Regelt :    Schere besiegt Papier
            Papier besiegt Stein
            Stein besiegt Schere
Wer bekommt zuerst 5 Punkte, gewinnt
Nach dem Spiel wird gefragt, ob Benutzer weitermachen will 
Der Benutzer kann jederzeit das Spiel unterbrechen oder stoppen (exit)
*/

package spiel;

import javax.swing.UIManager;

public class Main {

    public Main() {
        AppWindow window = new AppWindow();
        window.setLocationRelativeTo(null); //centralize
        window.setVisible(true);
    }
    
    public static void main(String[] args) throws Exception {
        UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        new Main();
    }
}
