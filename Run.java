import java.io.*;
import java.lang.Math;
import java.util.*;
public class run{

	public static void main(String[] args) throws Exception {
		Door dor = new Door();
		Treasure tres = new Treasure();
		Player player = new Player(tres);
		Game game = new Game(new Player[] {player});
		
	}

}