import java.io.*; // Try to specify which java.io packages are being used rather than importing them all - brody
import java.lang.Math;  // Is this being used? if not, maybe remove it to save performance (especially on bradley's slow pc for some reason) - brody
import java.util.*; // Try to specify which java.util packages are being used rather than importing them all - brody
public class Run {
	public static void main(String[] args) throws Exception {
		Door dor = new Door();
		Treasure tres = new Treasure();
		Player player = new Player(tres);
		Game game = new Game(new Player[] {player});
	}
}