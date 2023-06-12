import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent; import java.awt.event.ActionListener;
public class TicTacToeGUI extends JFrame implements ActionListener { private JButton[][] buttons;
private JLabel currentPlayerLabel;
private JButton resetButton;
private boolean isPlayerX;
public TicTacToeGUI() {
setTitle("Tic Tac Toe");
setSize(300, 300); setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); setLayout(new BorderLayout());
JPanel gamePanel = new JPanel(new GridLayout(3, 3)); buttons = new JButton[3][3];
isPlayerX = true;
for (int i = 0; i < 3; i++) { for (int j = 0; j < 3; j++) {
buttons[i][j] = new JButton();
buttons[i][j].setFont(new Font("Arial", Font.BOLD, 48)); buttons[i][j].addActionListener(this); gamePanel.add(buttons[i][j]);
} }
currentPlayerLabel = new JLabel("Current Player: X"); resetButton = new JButton("Reset"); resetButton.addActionListener(this);
add(gamePanel, BorderLayout.CENTER); add(currentPlayerLabel, BorderLayout.NORTH); add(resetButton, BorderLayout.SOUTH);
setVisible(true);
} @Override
public void actionPerformed(ActionEvent e) { if (e.getSource() == resetButton) {
resetGame(); } else {
JButton clickedButton = (JButton) e.getSource(); if (clickedButton.getText().isEmpty()) {
if (isPlayerX) {
clickedButton.setText("X"); currentPlayerLabel.setText("Current Player: O");
} else {
clickedButton.setText("O"); currentPlayerLabel.setText("Current Player: X");
}
isPlayerX = !isPlayerX;

checkWinCondition(); }
} }
private void checkWinCondition() { String[][] board = new String[3][3]; for (int i = 0; i < 3; i++) {
for (int j = 0; j < 3; j++) {
board[i][j] = buttons[i][j].getText();
} }
// Check rows
for (int i = 0; i < 3; i++) {
if (board[i][0].equals(board[i][1]) && board[i][0].equals(board[i][2]) && !board[i] [0].isEmpty()) {
displayWinner(board[i][0]);
return; }
}
// Check columns
for (int j = 0; j < 3; j++) {
if (board[0][j].equals(board[1][j]) && board[0][j].equals(board[2][j]) && !board[0] [j].isEmpty()) {
displayWinner(board[0][j]);
return; }

}
// Check diagonals
if (board[0][0].equals(board[1][1]) && board[0][0].equals(board[2][2]) && !board[0] [0].isEmpty()) {
displayWinner(board[0][0]);
return; }
if (board[0][2].equals(board[1][1]) && board[0][2].equals(board[2][0]) && !board[0] [2].isEmpty()) {
displayWinner(board[0][2]);
return; }
// Check if the game is a draw boolean isDraw = true;
boolean isDraw = false;

for (int i = 0; i < 3; i++) {
for (int j = 0; j < 3; j++) {
if (board[i][j].isEmpty()) {
 isDraw = false;
break; }
}
if (!isDraw) {
break; }
}

if (isDraw) {
JOptionPane.showMessageDialog(this, "It's a draw!", "Game Over", JOptionPane.INFORMATION_MESSAGE);
resetGame(); }
}
private void displayWinner(String player) {
String message = "Player " + player + " wins!";
JOptionPane.showMessageDialog(this, message, "Game Over", JOptionPane.INFORMATION_MESSAGE);
resetGame(); }
private void resetGame() {
isPlayerX = true; currentPlayerLabel.setText("Current Player: X"); for (int i = 0; i < 3; i++) {
for (int j = 0; j < 3; j++) { buttons[i][j].setText("");
} }
}
public static void main(String[] args) { SwingUtilities.invokeLater(() -> new TicTacToeGUI());
} }
