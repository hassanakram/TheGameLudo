package thegameludu;

public class Piece 
{
	public String color;
	public int x;
	public int y;
        public int boardpoint;
	public boolean activated;
	public boolean atFinalHome;
        public boolean isAtFinalPath;
	public int finalhomeStartAt;
	public boolean isComputerPlayer;
        public int pieceNumber;
        public int initialHomePoint;
        public int startAt;
        public int score;
	public int[] HomeX=new int[4];
        public int [] HomeY=new int[4];
        
        
        
	public Piece(int x,int y,int BoardPoint, int PieceNumber, String color)
	{
                isAtFinalPath=false;
                score=0;
                isComputerPlayer=true;
                pieceNumber=PieceNumber;
		
		if(color.equals("RED"))
		{
                    this.initialHomePoint=79+PieceNumber;
                    finalhomeStartAt=83;
                    startAt=39;
		}
		else if(color.equals("GREEN"))
		{
                    this.initialHomePoint=70+PieceNumber;
                    finalhomeStartAt=56;
                    isComputerPlayer=false;
                    startAt=0;
		}
		else if(color.equals("BLUE"))
		{
                    this.initialHomePoint=52+PieceNumber;
                    finalhomeStartAt=74;
                    startAt=26;
		}
		else if(color.equals("YELLOW"))
		{
                    this.initialHomePoint=61+PieceNumber;    
                    finalhomeStartAt=65;
                    startAt=13;
		}
                
                
                
		this.activated=false;
		this.x=x;
		this.y=y;
                
                
                HomeX[PieceNumber]=x;
                HomeY[PieceNumber]=y;
                
		this.color=color;
		this.atFinalHome=false;
	}
	
}
