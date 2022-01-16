import java.util.*;

public class ChessBoard{
	
	Piece[][] board;
	
	public ChessBoard(){
		initBoard();		
	}
	
	private void initBoard(){
		//initialize board
		board = new Piece[8][8];
		
		//pawns
		for(int i = 0; i < 8; i++){
			board[1][i] = new Pawn(i,1,true);
			board[6][i] = new Pawn(i,7,false);
		}
		
		//rooks
		board[0][0] = new Rook(0,0,true);
		board[0][7] = new Rook(0,7,true);
		board[7][0] = new Rook(7,0,false);
		board[7][7] = new Rook(7,7,false);
		
		//knights
		board[0][1] = new Knight(0,1,true);
		board[0][6] = new Knight(0,5,true);
		board[7][1] = new Knight(7,1,false);
		board[7][6] = new Knight(7,5,false);
		
		//bishops
		board[0][2] = new Bishop(0,2,true);
		board[0][5] = new Bishop(0,5,true);
		board[7][2] = new Bishop(7,2,false);
		board[7][5] = new Bishop(7,5,false);
		
		//kings
		board[0][3] = new King(0,3,true);
		board[7][3] = new King(7,3,false);
		
		//queens
		board[0][4] = new Queen(0,4,true);
		board[7][4] = new Queen(7,4,false);
		
		
	}
	
	//calls polymorphic generateMoves() for all pieces
	public Set<Move> generateMoves(){
		
		Set<Move> r = new HashSet<Move>();
		
		for(Piece[] a: board){
			for(Piece p: a){
				
				if(p != null && p.generateMoves() != null)
					r.addAll(p.generateMoves());
			
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