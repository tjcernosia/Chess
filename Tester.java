import java.util.*;
import java.io.PrintStream;
import java.io.UnsupportedEncodingException;

public class Tester{
	
	public static void main(String[] args) throws UnsupportedEncodingException {
		
		PrintStream p = new PrintStream(System.out, true, "UTF-8");
		
		ChessBoard b = new ChessBoard();
		Knight k = new Knight(0,0,true);
		
		p.println(k.generateMoves());
		
	}
	
}