import java.util.*;

public abstract class Piece{
	
	boolean team;
	Location l;
	char c;
	
	public Piece(int x, int y, boolean team){
		this.l = new Location(x,y);
		this.team = team;
	}
	
	public char icon(){
		return c;
	}
	
	public Location getLoc(){
		return l;	
	}
	
	//movement
	abstract Set<Move> generateMoves();
	
}