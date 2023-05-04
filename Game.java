import java.util.*;

public class Game {
	private Player[] players;
	private Treasure t;
	private Door d;
	private Scanner scan = new Scanner(System.in);
	private int i;
	
	public Game(Player[] p, Treasure t, Door d) {
		players = p;
		this.t = t;
		this.d = d;
		i = 0;
	}
	
	public Player hasWon() {
		for(int i = 0; i < players.length; i++) {
			if(players[i].getLevel() >= 25) {
				return players[i];
			}
		}
		return null;
	}
	
	public void arbitrarilyNamedMethod() throws Exception{
		boolean fr = true;
		while(fr && hasWon() == null) {
			fr = nextRound(players[i]);
			i = (i+1) % players.length;
		}
		if(hasWon() != null) {
			System.out.println(players[i].getName() + " wins!!!");
		}
	}
	
	public boolean nextRound(Player p) throws Exception {
		ArrayList<String> card = d.get();
		System.out.println(p.getName() + " kicks down the door and finds a " + card.get(0) + "\n[1] Items\n[2] Self\n[3] Description\n[4] Fight\n[5] Run");
		String str = scan.nextLine();
		
		while(str.length() > 1 && !(str.equals("1") || str.equals("2") || str.equals("3") || str.equals("4") || str.equals("5"))) {
			System.out.println("try again stupid");
			str = scan.nextLine();
		}
		while(!str.equals("4") && !str.equals("5")) {
			switch(str) {
				case "1":
					System.out.println("Which item would you like to use?");
					System.out.println(p.getCards());// get a better brain - treasure guy codechecking the game class
					try {
						int ind = scan.nextInt();
						switch(ind) {
							case -1:
								System.out.println("suit yourself");
							default: {
								try {
									p.useItem(ind);
								} catch(Exception e) {
									System.out.println("that is not a valid index stupid! what were you even thinking dum dum!");
								}
							} // exepotion
						}
					} catch (Exception e) {
						System.out.println("that wasn't a number stupid idiot dummy!"); // totally insane
					}
					scan.nextLine();
					break;
				case "2":
					System.out.println("Gender: " + p.getGender() + "\nLevel: [" + p.getLevel() + "]\nAttack: [" + p.getAttack() + "]\nRun: [" + p.getRun() + "]\nCurrently Equipped:\n" + p.getItems());
					break;
				case "3":
					System.out.println("\n" + card.get(0) + ": " + card.get(1) + " [ATK]\n" + card.get(3));
					break;
			}
			System.out.println("[1] Items\n[2] Self\n[3] Description\n[4] Fight\n[5] Run"); // ---> no it doesnt <---
			str = scan.nextLine(); // L + ratio stupid idiot no brain haver get one at the brain store!
		}
		if(str.equals("4")) {
			int dmg = Integer.parseInt(card.get(1));
			int roll = (int) (Math.random() * 20) + 1;
			
			if (roll == 19) {
				card = d.get();
				dmg += Integer.parseInt(card.get(1));
				System.out.println("An opponent has placed a monster");
			}
			
			if (p.getAttack() > dmg) {
				System.out.println("You win this battle");
				p.incrementLevel();
				for (int i = 0; i < Integer.parseInt(card.get(2)); i++) {
					p.addCard(t);
				}
			} else {
				System.out.println("You died. You suck\n");
				return false;
			}
		} else if(str.equals("5")) {
			if(p.getRun() + (int)(Math.random()*6 + 1) >= 5) {
				System.out.println("You have succesfully run away! Good job, you wimp!\n");
			} else {
				System.out.println("Bad stuff happens. Lose 1 card and 1 equipped item");
				try {
					p.removeCard((int)(Math.random()*p.getNumCards()));
					if(p.getNumItems() > 0) {
						p.removeEquip((int)(Math.random()*p.getNumItems()));
					} else {
						p.removeCard((int)(Math.random()*p.getNumCards()));
						System.out.println("Imagine not having enything equipped lmao loser");
					}
				} catch(Exception e) {
					System.out.println("Loser no cards, what color is your bugatti");
				}
			}
		}
		for(int i = p.getNumItems()-1;  i >= 0; i--) {
			if(p.getItem(i).get(3).equals("-1")) {
				p.removeEquip(-1);
			}
		}
		return true;
	}
}