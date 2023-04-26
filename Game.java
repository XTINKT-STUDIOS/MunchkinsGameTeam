import java.util.*; // Try to specify which java.util packages are being used rather than importing them all - brody

public class Game {
	private Player[] players;
	
	public Game(Player[] p) {
		players = p;
	}
	
	public Player hasWon() {
		for(int i = 0; i < players.length; i++) {
			if(players[i].getLevel() >= 10) {
				return players[i];
			}
		}
		return null;
	}
	
	public void nextRound(Player p, Door d, Treasure t) throws Exception {
		ArrayList<String> card = d.get();
		if(p.getAttack() > Integer.parseInt(card.get(1).substring(2))) {
			for(int i = 0; i < Integer.parseInt(card.get(2).substring(2)); i++) {
				p.addCard(t);
			}
		}
	}
}
