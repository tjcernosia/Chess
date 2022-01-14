import java.util.*;

public class Bishop extends Piece{
	
	static int[][] offsets = {
		{1,1},
		{1,-1},
		{-1,1},
		{-1,-1}
	};
	
	public Bishop(int x, int y, boolean team){
		super(x,y,team);
		
		c = 'b';
	}
	
	public Set<Move> generateMoves(){
		return null;
	}
	
}