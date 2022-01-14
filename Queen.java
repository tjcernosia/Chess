import java.util.*;

public class Queen extends Piece{
	
	public Queen(int x, int y, boolean team){
		super(x,y,team);
		
		c = 'Q';
	}
	
	public Set<Move> generateMoves(){
		return null;
	}
	
}