package com.game.src.main;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;

public class Menu {
	
	public Rectangle playButton1 = new Rectangle(Game.WIDTH/ 2 + 120, 200, 225, 50);
	public Rectangle playButton2 = new Rectangle(Game.WIDTH/ 2 + 120, 350, 225, 50);
	public Rectangle playButton3 = new Rectangle(Game.WIDTH/ 2 + 120, 500, 225, 50);
	public Rectangle playButton4 = new Rectangle(Game.WIDTH/ 2 + 120, 650, 225, 50);


	public void render(Graphics g) {
		Graphics2D g2d = (Graphics2D) g;
		Font fnt0  = new Font("arial", Font.BOLD, 50);
		g.setFont(fnt0);
		g.setColor(Color.white);
		g.drawString("Hands On! Physio Game", Game.WIDTH/2, 100);
		Font fnt1 = new Font("arial", Font.BOLD, 25);
		g.setFont(fnt1);
		g.drawString("Let's Play", playButton1.x + 25, playButton1.y + 35);
		g.drawString("Signal Interface", playButton2.x + 25, playButton2.y + 35);
		g.drawString("Settings", playButton3.x + 25, playButton3.y + 35);
		g.drawString("Quit", playButton4.x + 25, playButton4.y + 35);
		g2d.draw(playButton1);
		g2d.draw(playButton2);
		g2d.draw(playButton3);
		g2d.draw(playButton4);
	}
	
}
