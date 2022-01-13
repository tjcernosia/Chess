import java.util.*;

public abstract class Piece{
	
	int x, y;
	
	public Piece(int x, int y){
		this.x = x;
		this.y = y;
	}
	
	//movement
	abstract Set generateMoves();
	
}