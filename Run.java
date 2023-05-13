import java.io.*;
import java.lang.Math;	// is / will this be this necessary?
import java.util.*;		// Specify which util and io packages to use, * is open-ended and not advised
public class Run{

	public static String displayCard(ArrayList<String> card) {
		String str = "";
		str = "===============================\n|";
		for(int i = 0; i < (29-card.get(0).length())/2; i++) {
			str += " ";
		}
		str += card.get(0);
		for(int i = 0; i < (29-card.get(0).length())/2; i++) {
			str += " ";
		}
		if(card.get(0).length()%2 == 0 && !(card.get(0).length() >= 28)) {
			str += " ";
		}
		str += "|\n|";
		String loc = "";
		switch(card.get(3)) {
			case "0": loc = "Head";
			case "1": loc = "Body";
			case "2": loc = "Hands";
			case "3": loc = "Footwear";
			default : loc = "NOP";
		}
		for(int i = 0; i < (29-loc.length())/2 - 2; i++) {
			str += "=";
		}
		str += "< " + loc + " >";
		for(int i = 0; i < (29-loc.length())/2 - 2; i++) {
			str += "=";
		}
		if(loc.length()%2 == 0) {
			str += "=";
		}
		str +="|\n|-----------------------------|\n| Attack: " + card.get(1);
		for(int i = 0; i < 20 - card.get(1).length(); i++) {
			str += " ";
		}
		str += "|\n| Run:    " + card.get(2);
		for(int i = 0; i < 20 - card.get(2).length(); i++) {
			str += " ";
		}
		str += "|\n| Value:  " + card.get(4);
		for(int i = 0; i < 20-card.get(4).length(); i++) {
			str += " ";
		}
		str += "|\n===============================";
		return str;
	}
	
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
				System.out.println(displayCard(tres.get()));
				Game game = new Game(new Player[] {player}, tres, dor);
				boolean fr = true; // what is fr // is a boolean // nah fr? never woulda guessed lol //fr! // you missed the really good while loop header// hes lying // ohh lmao // thank you // ofc ofc // this is so much better I should just do this from home every day 💀 // you do you man
				// fr is just hanging out
				game.arbitrarilyNamedMethod(); // Treasure 72 is the best I think
			}
 		}
	}

}

