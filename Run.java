import java.io.*;
import java.lang.Math;	// is / will this be this necessary?
import java.util.*;		// Specify which util and io packages to use, * is open-ended and not advised
public class Run{

	public static void main(String[] args) throws Exception {
		System.out.println("""
		
  .-._ .'=.'\\   .--.'  \\     /==/ \\  .-._  /==/- |\\  \\   /==/_ / /==/ \\  .-._  
 /==/ \\|==|  |  \\==\\-/\\ \\    |==|, \\/ /, / |==|_ `/_ /  |==|, |  |==|, \\/ /, / 
 |==|,|  / - |  /==/-|_\\ |   |==|-  \\|  |  |==| ,   /   |==|  |  |==|-  \\|  |  
 |==|  \\/  , |  \\==\\,   - \\  |==| ,  | -|  |==|-  .|    |==|- |  |==| ,  | -|  
 |==|- ,   _ |  /==/ -   ,|  |==| -   _ |  |==| _ , \\   |==| ,|  |==| -   _ |  
 |==| _ /\\   | /==/-  /\\ - \\ |==|  /\\ , |  /==/  '\\  |  |==|- |  |==|  /\\ , |  
 /==/  / / , / \\==\\ _.\\=\\.-' /==/, | |- |  \\==\\ /\\=\\.'  /==/. /  /==/, | |- |  
 `--`./  `--`   `--`         `--`./  `--`   `--`        `--`-`   `--`./  `--`
 """); 
		while(true) {
			Scanner scan = new Scanner(System.in);
			System.out.println("[P]lay\n[H]elp\nE[x]it");
			String ans = scan.nextLine();
			while(!ans.equals("p") && !ans.equals("x")) {
				System.out.println("HELP:\n - This game is super easy and super fun :)\n - In the beninging you will create a character :|\n - Then you fight munsters ;|\n - if you lose you die :)\n - You can try to run and escape impending doom and eternal suffering in the pits of tartarus >:)\n - If you somehow manage to kill said munster from the farthest reaches of the necropolis, you get some treasures to help you >:(\n - Said treasures will allow you to become more powerfulll and slay more munsters ಠ_ಠ\n - Get to level 25 and escape 6th circle of hell w(ﾟДﾟ)w\n");
				System.out.println("[P]lay\n[H]elp\nE[x]it");
				ans = scan.nextLine();
			}		// yall will love treasure 67
			if(ans.equals("x")) {
				break;
			}else {
				Treasure tres = new Treasure();
				Player player = new Player(tres);
				Door dor = new Door();
				Game game = new Game(new Player[] {player}, tres, dor);
				boolean fr = true; // what is fr // is a boolean // nah fr? never woulda guessed lol //fr! // you missed the really good while loop header// hes lying // ohh lmao // thank you // ofc ofc // this is so much better I should just do this from home every day 💀 // you do you man
				// fr is just hanging out
				game.arbitrarilyNamedMethod(); // Treasure 72 is the best I think
			}
			scan.close();
		}
	}

}

