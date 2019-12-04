package GUI;

import Logic.PieceNodes;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

/**
 *
 * @author steveespinoza
 */
public class JFOthelloPrincipal extends javax.swing.JFrame implements ActionListener {

    ArrayList<PieceNodes> pieceList = new ArrayList<>();

    public JFOthelloPrincipal() {

        initComponents();
        this.setLocationRelativeTo(null);

        for (int i = 0; i < 64; i++) {
            PieceNodes piece = new PieceNodes();
            piece.addActionListener(this);
            int row = (i / 8) % 2;
            if (row == 0) {
                piece.setBackground(i % 2 == 0 ? Color.CYAN.darker().darker() : Color.CYAN.darker().darker());
            } else {
                piece.setBackground(i % 2 == 0 ? Color.CYAN.darker().darker() : Color.CYAN.darker().darker());
            }
            jPanelGameBoard.add(piece);
            pieceList.add(piece);
        }

        iniciateNodes();
        iniciateBoard();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelGameBoard = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        label = new javax.swing.JLabel();
        Jugador = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenuGame = new javax.swing.JMenu();
        jMenuItemRestart = new javax.swing.JMenuItem();
        jMenuItemExit = new javax.swing.JMenuItem();
        jMenuHelp = new javax.swing.JMenu();
        jMenuItemInfo = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanelGameBoard.setLayout(new java.awt.GridLayout(8, 8));
        getContentPane().add(jPanelGameBoard, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 8, 710, 510));

        label.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        label.setText("Juega: ");

        Jugador.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(label)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Jugador, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(513, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(Jugador, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(4, 4, 4))
                    .addComponent(label, javax.swing.GroupLayout.Alignment.LEADING))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 540, 720, 60));

        jMenuGame.setText("Juego");

        jMenuItemRestart.setText("Reiniciar");
        jMenuItemRestart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemRestartActionPerformed(evt);
            }
        });
        jMenuGame.add(jMenuItemRestart);

        jMenuItemExit.setText("Salir");
        jMenuItemExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemExitActionPerformed(evt);
            }
        });
        jMenuGame.add(jMenuItemExit);

        jMenuBar1.add(jMenuGame);

        jMenuHelp.setText("Ayuda");

        jMenuItemInfo.setText("Informacion");
        jMenuItemInfo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemInfoActionPerformed(evt);
            }
        });
        jMenuHelp.add(jMenuItemInfo);

        jMenuBar1.add(jMenuHelp);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents


    private void jMenuItemExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemExitActionPerformed
        Login window = new Login();
        window.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jMenuItemExitActionPerformed

    private void jMenuItemInfoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemInfoActionPerformed
        Help hlp = new Help(this, true);
        hlp.setVisible(true);

    }//GEN-LAST:event_jMenuItemInfoActionPerformed

    private void jMenuItemRestartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemRestartActionPerformed
        this.dispose();
        JFOthelloPrincipal neww = new JFOthelloPrincipal();
        neww.setVisible(true);
        iniciateBoard();
    }//GEN-LAST:event_jMenuItemRestartActionPerformed

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
            java.util.logging.Logger.getLogger(JFOthelloPrincipal.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFOthelloPrincipal.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFOthelloPrincipal.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFOthelloPrincipal.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFOthelloPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Jugador;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenu jMenuGame;
    private javax.swing.JMenu jMenuHelp;
    private javax.swing.JMenuItem jMenuItemExit;
    private javax.swing.JMenuItem jMenuItemInfo;
    private javax.swing.JMenuItem jMenuItemRestart;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanelGameBoard;
    private javax.swing.JLabel label;
    // End of variables declaration//GEN-END:variables
    public String turn = "b";
    ArrayList<Integer> avalible = new ArrayList<>();
    ArrayList<Integer> used = new ArrayList<>();
    String colorIcon = "/Images/dark.png";

    private void middleNodeCreation(int i, int nextR, int previousR) {
        pieceList.get(i).setNorth(pieceList.get(previousR));
        pieceList.get(i).setNorthwest(pieceList.get(previousR - 1));
        pieceList.get(i).setNortheast(pieceList.get(previousR + 1));
        pieceList.get(i).setWest(pieceList.get(i - 1));
        pieceList.get(i).setEast(pieceList.get(i + 1));
        pieceList.get(i).setSouthwest(pieceList.get(nextR - 1));
        pieceList.get(i).setSouth(pieceList.get(nextR));
        pieceList.get(i).setSoutheast(pieceList.get(nextR + 1));
    }

    public void iniciateBoard() {
        for (PieceNodes piece : pieceList) {
            piece.setEnabled(false);
        }

        pieceList.get(27).setEnabled(true);
        pieceList.get(27).setNodeColor("w");
        pieceList.get(27).setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/light.png")));
        pieceList.get(28).setEnabled(true);
        pieceList.get(28).setNodeColor("b");
        pieceList.get(28).setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/dark.png")));
        pieceList.get(35).setEnabled(true);
        pieceList.get(35).setNodeColor("b");
        pieceList.get(35).setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/dark.png")));
        pieceList.get(36).setEnabled(true);
        pieceList.get(36).setNodeColor("w");
        pieceList.get(36).setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/light.png")));
        Jugador.setText("Negras");
        used.add(27);
        used.add(28);
        used.add(35);
        used.add(36);
        checkLegalMoves();
    }

    private void iniciateNodes() {

        int nextR = 9;
        int previousR = 1;
        // caso del primer nodo, esquina izquierda superior
        pieceList.get(0).setSouth(pieceList.get(8));
        pieceList.get(0).setSoutheast(pieceList.get(9));
        pieceList.get(0).setEast(pieceList.get(1));

        for (int i = 1; i < pieceList.size() - 1; i++) {

            if (i < 7) { //primera fila
                pieceList.get(i).setWest(pieceList.get(i - 1));
                pieceList.get(i).setEast(pieceList.get(i + 1));
                pieceList.get(i).setSouthwest(pieceList.get(nextR - 1));
                pieceList.get(i).setSouth(pieceList.get(nextR));
                pieceList.get(i).setSoutheast(pieceList.get(nextR + 1));
                nextR++;

            }
            if (i == 7) {
                pieceList.get(i).setWest(pieceList.get(i - 1));
                pieceList.get(i).setSouthwest(pieceList.get(nextR - 1));
                pieceList.get(i).setSouth(pieceList.get(nextR));
                nextR++;
            }
            if (i > 8 && i < 15) {
                middleNodeCreation(i, nextR, previousR);
                nextR++;
                previousR++;
            }
            if (i > 16 && i < 23) {
                middleNodeCreation(i, nextR, previousR);
                nextR++;
                previousR++;
            }
            if (i > 24 && i < 31) {
                middleNodeCreation(i, nextR, previousR);
                nextR++;
                previousR++;
            }
            if (i > 32 && i < 39) {
                middleNodeCreation(i, nextR, previousR);
                nextR++;
                previousR++;
            }
            if (i > 40 && i < 47) {
                middleNodeCreation(i, nextR, previousR);
                nextR++;
                previousR++;
            }
            if (i > 48 && i < 55) {
                middleNodeCreation(i, nextR, previousR);
                nextR++;
                previousR++;
            }
            if (i == 15 || i == 23 || i == 31 || i == 39 || i == 47) {
                pieceList.get(i).setNorth(pieceList.get(previousR));
                pieceList.get(i).setNorthwest(pieceList.get(previousR - 1));
                pieceList.get(i).setWest(pieceList.get(i - 1));
                pieceList.get(i).setWest(pieceList.get(i - 1));
                pieceList.get(i).setSouthwest(pieceList.get(nextR - 1));
                pieceList.get(i).setSouth(pieceList.get(nextR));
                nextR++;
                previousR++;
            }
            if (i == 55) {
                pieceList.get(i).setNorth(pieceList.get(previousR));
                pieceList.get(i).setNorthwest(pieceList.get(previousR - 1));
                pieceList.get(i).setWest(pieceList.get(i - 1));
                pieceList.get(i).setWest(pieceList.get(i - 1));
                pieceList.get(i).setSouthwest(pieceList.get(nextR - 1));
                pieceList.get(i).setSouth(pieceList.get(nextR));
                previousR++;
            }
            if (i > 56) { //ultima fila
                pieceList.get(i).setWest(pieceList.get(i - 1));
                pieceList.get(i).setEast(pieceList.get(i + 1));
                pieceList.get(i).setNorthwest(pieceList.get(previousR - 1));
                pieceList.get(i).setNorth(pieceList.get(previousR));
                pieceList.get(i).setNortheast(pieceList.get(previousR + 1));
                previousR++;

            }

            if (i == 8) {
                pieceList.get(i).setNorth(pieceList.get(0));
                pieceList.get(i).setNortheast(pieceList.get(1));
                pieceList.get(i).setEast(pieceList.get(i + 1));
                pieceList.get(i).setSoutheast(pieceList.get(nextR + 1));
                pieceList.get(i).setSouth(pieceList.get(nextR));
                nextR++;
            }
            if (i == 16 || i == 24 || i == 32 || i == 40 || i == 48) {
                pieceList.get(i).setNorth(pieceList.get(previousR));
                pieceList.get(i).setNortheast(pieceList.get(previousR + 1));
                pieceList.get(i).setEast(pieceList.get(i + 1));
                pieceList.get(i).setSoutheast(pieceList.get(nextR + 1));
                pieceList.get(i).setSouth(pieceList.get(nextR));
                nextR++;
                previousR++;

            }
            if (i == 56) {
                pieceList.get(i).setNorth(pieceList.get(previousR));
                pieceList.get(i).setEast(pieceList.get(i + 1));
                pieceList.get(i).setNortheast(pieceList.get(previousR + 1));
                previousR++;
            }
        }
        pieceList.get(63).setNorth(pieceList.get(55));
        pieceList.get(63).setNorthwest(pieceList.get(54));
        pieceList.get(63).setWest(pieceList.get(62));
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        for (int i = 0; i < pieceList.size(); i++) {
            if (e.getSource() == pieceList.get(i)) {
                System.out.println(pieceList.get(i).getNodeColor());
                if (checkUsed(i)) {
                    flipPieces(i);
                }
            }
        }
    }

    private void checkLegalMoves() {

        for (int i = 0; i < pieceList.size(); i++) {
            if (pieceList.get(i).isEnabled() && pieceList.get(i).getNodeColor().equals(turn)) {
                checkAvalibleMovements(i);
            }
        }
        //avalible.clear();
    }

    private void checkWest(int position) {
        PieceNodes aux = pieceList.get(position);
        if (aux.getWest() != null) {
            if (!aux.getWest().getNodeColor().equals("n")) {

                while (aux != null && !aux.getNodeColor().equals("n") && !aux.getWest()
                        .getNodeColor().equals(turn)) {
                    aux = aux.getWest();
                }
                if (pieceList.indexOf(aux) != position) {
                    changeIcon(pieceList.indexOf(aux));
                    avalible.add(pieceList.indexOf(aux));
                }

            }
        }

    }

    private void checkEast(int position) {
        PieceNodes aux = pieceList.get(position);
        if (aux.getEast() != null) {
            if (!aux.getEast().getNodeColor().equals("n")) {

                while (aux != null && !aux.getNodeColor().equals("n") && !aux.getEast()
                        .getNodeColor().equals(turn)) {
                    aux = aux.getEast();
                }
                if (pieceList.indexOf(aux) != position) {
                    changeIcon(pieceList.indexOf(aux));
                    avalible.add(pieceList.indexOf(aux));
                }

            }
        }

    }

    private void checkNorth(int position) {
        PieceNodes aux = pieceList.get(position);
        if (aux.getNorth() != null) {
            if ((!aux.getNorth().getNodeColor().equals("n")) && (!aux.getNorth().getNodeColor().equals(turn))) {
                while (aux != null && !aux.getNodeColor().equals("n") && !aux.getNorth()
                        .getNodeColor().equals(turn)) {
                    aux = aux.getNorth();

                }
                if (pieceList.indexOf(aux) != position) {
                    changeIcon(pieceList.indexOf(aux));
                    avalible.add(pieceList.indexOf(aux));
                }

            }
        }

    }

    private void checkSouth(int position) {
        PieceNodes aux = pieceList.get(position);
        if (aux.getSouth() != null) {
            if ((!aux.getSouth().getNodeColor().equals("n"))) {

                while (aux != null && !aux.getNodeColor().equals("n") && !aux.getSouth()
                        .getNodeColor().equals(turn)) {
                    aux = aux.getSouth();
                }
                if (pieceList.indexOf(aux) != position) {
                    changeIcon(pieceList.indexOf(aux));
                    avalible.add(pieceList.indexOf(aux));
                }

            }
        }

    }

    private void checkNorthWest(int position) {
        PieceNodes aux = pieceList.get(position);
        if (aux.getNorthwest() != null) {
            if (!aux.getNorthwest().getNodeColor().equals("n")) {

                while (aux != null && !aux.getNodeColor().equals("n") && !aux.getNorthwest()
                        .getNodeColor().equals(turn)) {
                    aux = aux.getNorthwest();
                }
                if (pieceList.indexOf(aux) != position) {
                    changeIcon(pieceList.indexOf(aux));
                    avalible.add(pieceList.indexOf(aux));
                }

            }
        }

    }

    private void checkNorthEast(int position) {
        PieceNodes aux = pieceList.get(position);
        if (aux.getNortheast() != null) {
            if (!aux.getNortheast().getNodeColor().equals("n")) {
                while (aux != null && !aux.getNodeColor().equals("n") && !aux.getNortheast()
                        .getNodeColor().equals(turn)) {
                    aux = aux.getNortheast();
                }
                if (pieceList.indexOf(aux) != position) {
                    changeIcon(pieceList.indexOf(aux));
                    avalible.add(pieceList.indexOf(aux));
                }
            }
        }
    }

    private void checkSouthWest(int position) {
        PieceNodes aux = pieceList.get(position);
        if (aux.getSouthwest() != null) {
            if (!aux.getSouthwest().getNodeColor().equals("n")) {

                while (aux != null && !aux.getNodeColor().equals("n") && !aux.getSouthwest()
                        .getNodeColor().equals(turn)) {
                    aux = aux.getSouthwest();
                }
                if (pieceList.indexOf(aux) != position) {
                    changeIcon(pieceList.indexOf(aux));
                    avalible.add(pieceList.indexOf(aux));
                }

            }
        }

    }

    private void checkSouthEast(int position) {
        PieceNodes aux = pieceList.get(position);
        if (aux.getSoutheast() != null) {
            if (!aux.getSoutheast().getNodeColor().equals("n")) {
                try {
                    while (aux != null && !aux.getNodeColor().equals("n") && !aux.getSoutheast()
                            .getNodeColor().equals(turn)) {
                        aux = aux.getSoutheast();
                    }

                    if (pieceList.indexOf(aux) != position) {
                        changeIcon(pieceList.indexOf(aux));
                        avalible.add(pieceList.indexOf(aux));
                    }
                } catch (NullPointerException e) {
                    System.out.println("Llego al este.");
                }
            }
        }

    }

    private void checkAvalibleMovements(int position) {
        checkNorth(position);
        checkSouth(position);
        checkEast(position);
        checkWest(position);

        checkNorthEast(position);
        checkNorthWest(position);

        checkSouthEast(position);
        checkSouthWest(position);
    }

    private void changeIcon(int position) {
        pieceList.get(position).setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/legalMoveIcon.png")));
        pieceList.get(position).setEnabled(true);
    }

    private boolean checkUsed(int usedPosition) {

        for (Integer position : used) {
            if (pieceList.get(position) == pieceList.get(usedPosition)) {
                return false;
            }
        }
        return true;
    }

    private void flipPieces(int position) {
        used.add(position);
        for (Integer node : avalible) {
            if (pieceList.get(node) != pieceList.get(position)) {
                pieceList.get(node).setEnabled(false);
                pieceList.get(node).setIcon(null);
            }
        }

        avalible.clear();

        if (turn.equals("b")) {
            colorIcon = "/Images/dark.png";
            pieceList.get(position).setIcon(new javax.swing.ImageIcon(getClass().getResource(colorIcon)));
        } else {
            colorIcon = "/Images/light.png";
            pieceList.get(position).setIcon(new javax.swing.ImageIcon(getClass().getResource(colorIcon)));
        }

        changeColors(position);
        if (turn.equals("b")) {
            turn = "w";
            Jugador.setText("Blancos");
            checkLegalMoves();
        } else {
            turn = "b";
            Jugador.setText("Negras");
            checkLegalMoves();
        }

    }

    private void changeColors(int position) {
        PieceNodes aux = pieceList.get(position);

        try {
            while (aux != null && !aux.getSouth().getNodeColor().equals(turn) && !aux.getSouth().getNodeColor().equals("n")) {
                aux.getSouth().setIcon(new javax.swing.ImageIcon(getClass().getResource(colorIcon)));
                aux.setNodeColor(turn);
                aux.getSouth().setNodeColor(turn);
                aux = aux.getSouth();
            }
            aux = pieceList.get(position);
        } catch (NullPointerException e) {
        }

        try {
            while (aux.getNorth() != null && !aux.getNorth().getNodeColor().equals(turn) && !aux.getNorth().getNodeColor().equals("n")) {
                aux.getNorth().setIcon(new javax.swing.ImageIcon(getClass().getResource(colorIcon)));
                aux.setNodeColor(turn);
                aux.getNorth().setNodeColor(turn);
                aux = aux.getNorth();
            }
            aux = pieceList.get(position);
        } catch (NullPointerException e) {
        }
        try {
            while (aux != null && !aux.getEast().getNodeColor().equals(turn) && !aux.getEast().getNodeColor().equals("n")) {
                aux.getEast().setIcon(new javax.swing.ImageIcon(getClass().getResource(colorIcon)));
                aux.setNodeColor(turn);
                aux.getEast().setNodeColor(turn);
                aux = aux.getEast();
            }
            aux = pieceList.get(position);
        } catch (NullPointerException e) {
        }
        try {
            while (aux != null && !aux.getWest().getNodeColor().equals(turn) && !aux.getWest().getNodeColor().equals("n")) {
                aux.getWest().setIcon(new javax.swing.ImageIcon(getClass().getResource(colorIcon)));
                aux.setNodeColor(turn);
                aux.getWest().setNodeColor(turn);
                aux = aux.getWest();
            }
            aux = pieceList.get(position);
        } catch (NullPointerException e) {
        }
        try {
            while (aux.getNorthwest() != null && !aux.getNorthwest().getNodeColor().equals(turn) && !aux.getNorthwest().getNodeColor().equals("n")) {
                aux.getNorthwest().setIcon(new javax.swing.ImageIcon(getClass().getResource(colorIcon)));
                aux.setNodeColor(turn);
                aux.getNorthwest().setNodeColor(turn);
                aux = aux.getNorthwest();
            }
            aux = pieceList.get(position);
        } catch (NullPointerException e) {
        }
        try {
            while (aux.getNortheast() != null && !aux.getNortheast().getNodeColor().equals(turn) && !aux.getNortheast().getNodeColor().equals("n")) {
                aux.getNortheast().setIcon(new javax.swing.ImageIcon(getClass().getResource(colorIcon)));
                aux.setNodeColor(turn);
                aux.getNortheast().setNodeColor(turn);
                aux = aux.getNortheast();
            }
            aux = pieceList.get(position);
        } catch (NullPointerException e) {
        }
        try {
            while (aux != null && !aux.getSouthwest().getNodeColor().equals(turn) && !aux.getSouthwest().getNodeColor().equals("n")) {
                aux.getSouthwest().setIcon(new javax.swing.ImageIcon(getClass().getResource(colorIcon)));
                aux.setNodeColor(turn);
                aux.getSouthwest().setNodeColor(turn);
                aux = aux.getSouthwest();
            }
            aux = pieceList.get(position);
        } catch (NullPointerException e) {
        }
        try {
            while (aux != null && !aux.getSoutheast().getNodeColor().equals(turn) && !aux.getSoutheast().getNodeColor().equals("n")) {
                aux.getSoutheast().setIcon(new javax.swing.ImageIcon(getClass().getResource(colorIcon)));
                aux.setNodeColor(turn);
                aux.getSoutheast().setNodeColor(turn);
                aux = aux.getSoutheast();
            }
        } catch (NullPointerException e) {
        }

    }
}
