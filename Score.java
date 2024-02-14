import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;

public class Score {
	Font font;
	private int points;
	private int timesIncremented;
	
	public Score () {
		points = 0;
		timesIncremented = 1;
		font = new Font("Arial", Font.PLAIN, 36);
	}
	
	public void draw(Graphics2D g){
		g.setColor(Color.RED);
		g.setFont(font);
		g.drawString("Score: " + points, 200, 50);
		g.setColor(Color.BLACK);
	}
	public void incrementScore(){
		points += timesIncremented*10;
		timesIncremented++;
		System.out.println("x" + points);
	}
	public int getPoints(){
		return points;
	}
}