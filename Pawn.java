import java.util.*;

public class Pawn extends Piece{
	
	public Pawn(int x, int y, boolean team){
		super(x,y,team);
		
		c = 'p';
	}
	
	public Set<Move> generateMoves(){
		return null;
	}
	
}