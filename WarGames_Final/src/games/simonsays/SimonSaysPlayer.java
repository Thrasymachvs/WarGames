package games.simonsays;
import java.util.ArrayList;
import bge.Player;
public class SimonSaysPlayer extends Player {
	ArrayList<Color> simonPattern;
	ArrayList<Color> simonCopy;
	
	public SimonSaysPlayer(String name, int turn, String gamePiece) {
		super(name, turn, gamePiece);
		simonPattern = new ArrayList<Color>();
	}
	
	public void reloadCopy() {
		simonCopy = new ArrayList<Color>(simonPattern);
	}
	
	//DON'T NEED FOR SIMON SAYS??
	public void addGamePiece(Board gameBoard, int startRow, int startColumn, int endRow, int endColumn) {
		// TODO Auto-generated method stub
		
	}

}
