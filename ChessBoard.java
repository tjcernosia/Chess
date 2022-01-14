import java.util.*;

public class ChessBoard{
	
	Piece[][] board;
	
	public ChessBoard(){
		board = new Piece[8][8];
	}
	
	private ChessBoard initBoard(){
		return null;
	}
	
	//possible moves
	public Set<Move> generateMoves(){
		
		HashSet<Move> r = new HashSet<Move>();
		
		for(Piece[] a: board){
			for(Piece p: a){
				
				if(p != null)
					Collections.addAll(p.generateMoves());
			
			}
		}
		
		return r;
		
	}
	
	public Set<Move> generateMoves(int team){
		return null;
	}
	
	public String toString(){
		
		String str = "";
		
		for(Piece[] a : board){
			for(Piece p : a){
				
				if(p != null){
					str += p.icon();
				} else {
					str += " ";
				}
				
				str += ".";
				
			}
			str += "\n";
		}
		
		return str;
		
	}
	
}