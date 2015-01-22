package ihm;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import javax.swing.JButton;
import javax.swing.JPanel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author u21406901
 */
public class PanneauChoixGridBag extends JPanel {
    protected void PanneauChoixGridBag() {
        JButton boutonCC = new JButton("B");
        JButton boutonDC = new JButton("N");
        JButton boutonCD = new JButton("س");
        JButton boutonDD = new JButton("H");
        setLayout(new GridBagLayout());
        GridBagConstraints c = new GridBagConstraints();
        // Pour centrer les elements
        c.anchor = GridBagConstraints.CENTER;
        c.gridx = 0;
        c.gridy = 0;
        add(boutonCC, c);
        c.gridx = 1;
        add(boutonDC, c);
        c.gridx = 2;
        add(boutonCD, c);
        c.gridx = 0;
        c.gridy = 1;
        add(boutonDD, c);
        c.gridx = 1;

    }
}