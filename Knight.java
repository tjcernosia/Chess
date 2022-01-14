import java.util.*;

public class Knight extends Piece{
	
	//all possible increments of x,y for knight
	int[][] offsets = {
		{2,1},
		{2,-1},
		{-2,1},
		{-2,-1},
		{1,2},
		{1,-2},
		{-1,2},
		{-1,-2}
	};
	
	public Knight(int x, int y, boolean team){
		super(x,y,team);
		
		if(team){
			c = '\u2658';
		} else {
			c = '\u2658';
		}
		
	}
	
	public Set<Move> generateMoves(){
		
		HashSet<Move> r = new HashSet<Move>();
		
		for(int[] o : offsets){
			
			Location loc = new Location(l.x + o[0], l.y + o[1]);
			
			if(loc.x >= 0 && loc.x < 8 && loc.y >= 0 && loc.y < 8)
				r.add(new Move(this, loc));
			
		}
		
		return r;
	}
	
}