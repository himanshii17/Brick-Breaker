package brickBracker;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics2D;

public class MapGenerator {
    public int map[][];
    public int brickheight;
    public int brickwidth;
    public MapGenerator(int row,int col) {
    	map = new int[row][col];
    	for(int i=0;i<map.length;i++) {
    		for(int j=0;j<map[0].length;j++) {
    			map[i][j]=1; //ball is not intersected with brick
    		}
    	}
    	brickwidth=540/col;
    	brickheight=150/row;
    }
    public void draw(Graphics2D g) {
    	for(int i=0;i<map.length;i++) {
    		for(int j=0;j<map[0].length;j++) {
    			if(map[i][j]>0) {
    				g.setColor(Color.white);
    				g.fillRect(j*brickwidth+80, i*brickheight+50, brickwidth, brickheight);
    				g.setStroke(new BasicStroke(3));
    				g.setColor(Color.black);
    				g.drawRect(j*brickwidth+80, i*brickheight+50, brickwidth, brickheight);
    			}
    		}
    }
}
    public void setBrickValue(int value,int row,int col) {
    	map[row][col]=value;
    }
}
