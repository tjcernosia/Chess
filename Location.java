public class Location{
	
	final char[] FILES = {'A','B','C','D','E','F','G','H'};
	
	int x,y;
	
	public Location(int x, int y){
		this.x = x;
		this.y = y;
	}
	
	public int getX(){
		return x;
	}
	
	public int getY(){
		return y;
	}
	
	public String getRankFile(){
		return "" + FILES[x] + y;
	}
	
}