package gui;

import javax.swing.JFrame;

import logic.Game;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.ImageIcon;
import java.awt.Color;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class GameOverGUI extends JFrame {

	public GameOverGUI(Game game) {
		getContentPane().setLayout(null);
		;
		
		JButton btnHighScores = new JButton("High Scores");
		btnHighScores.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				HighScores hs = new HighScores();
				hs.addScore(game.getScore(), "Player");
				dispose();
			}
		});
		
		JButton btnReset = new JButton("");
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Game game = new Game();
				dispose();
			}
		});
		btnReset.setIcon(new ImageIcon(GameOverGUI.class.getResource("/assets/reset.png")));
		btnReset.setBounds(385, 0, 46, 42);
		getContentPane().add(btnReset);
		btnHighScores.setBounds(155,250, 112, 29);
		getContentPane().add(btnHighScores);
		
		JLabel lblScore = new JLabel("Your score: " + game.getScore());
		lblScore.setHorizontalAlignment(SwingConstants.CENTER);
		lblScore.setForeground(Color.WHITE);
		lblScore.setFont(new Font("OCR A Extended", Font.BOLD, 30));
		lblScore.setBounds(70, 175, 310, 80);
		getContentPane().add(lblScore);
		
		JLabel lblGameOver = new JLabel("");
		lblGameOver.setIcon(new ImageIcon(GameOverGUI.class.getResource("/assets/GameOver.png")));
		lblGameOver.setBounds(0, 0, 444, 365);
		getContentPane().add(lblGameOver);
		
		setupWindow();
		
		super.setVisible(true);
		
	}
	
	private void setupWindow() {
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setMinimumSize(new Dimension(450, 400)); 
        setLocationRelativeTo(null);        
		
	    setResizable(false);
	}
}
