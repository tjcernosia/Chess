import java.util.*;

public class King extends Piece{
	
	public King(int x, int y, boolean team){
		super(x,y,team);
		
		c = 'K';
	}
	
	public Set<Move> generateMoves(){
		return null;
	}
	
}