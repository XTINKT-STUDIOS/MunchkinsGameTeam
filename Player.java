import java.util.*;

public class Player {

	private ArrayList<ArrayList<String>> cards = new ArrayList<ArrayList<String>>();
	private ArrayList<ArrayList<String>> items = new ArrayList<ArrayList<String>>(); //maybe have a 
    //separate variable that holds the total bonuses?

	// true = male | false = female
    private Boolean sex;
    // [0] class name | [1] Attack bonus | [2] Run bonus
    private String[] job = new String[3];
    private String[] race = new String[3];
    private Scanner x = new Scanner(System.in);
    private int level = 1;
    private String name = ""; 
    // [0] head | [1] body | [2] left | [3] right | [4] feet
    private boolean[] slot = {false, false, false, false, false};

    public Player(Treasure treasure) throws Exception {  
    	for(int i = 0; i < 5; i++){
    		cards.add(treasure.get());
    	} 

    	// sets gender
        while(sex == null){
        	System.out.println("Sex: [M]ale or [F]emale?");
        	String gender = x.nextLine();   
        	if(gender.length() != 1 && (!gender.toLowerCase().equals("m") && !gender.toLowerCase().equals("f"))){
        		System.out.println("Try again");
        	}else if(gender.toLowerCase().equals("m")){
        		sex = true;
        	}else{
        		sex = false;
        	}
        }
        
        // sets name
        System.out.println("What is your name?");
        name = x.nextLine();
        if (name.length() == 0) {
            name = "Big dumb dumb loser face that cant put in a name";
            System.out.println("Your name is now: " + name);
            name = "Dummy";
            System.out.println("Just kidding, your name is: " + name);
        }

        // sets class
         while(job[0] == null){
            System.out.println("What class do you want to be?\n [N]oble\n [P]irate\n [S]paceman\n [D]uck\n [A]lien\n [W]izard\n [K]night\n");       	
        	String cla = x.nextLine();   
        	if(cla.toLowerCase().equals("n")){
        		job[0] = "Noble";
                job[1] = "0";
                job[2] = "5";
        	}else if(cla.toLowerCase().equals("d")){
        		job[0] = "Duck";
                job[1] = "4";
                job[2] = "1";
        	}else if(cla.toLowerCase().equals("p")){
        		job[0] = "Pirate";
                job[1] = "1";
                job[2] = "2";
        	}else if(cla.toLowerCase().equals("s")){
                job[0] = "Noble";
                job[1] = "0";
                job[2] = "5";
            }else if(cla.toLowerCase().equals("a")){
                job[0] = "Alien";
                job[1] = "3";
                job[2] = "1";
            }else if(cla.toLowerCase().equals("w")){
                job[0] = "Wizard";
                job[1] = "1";
                job[2] = "3";
            }else if(cla.toLowerCase().equals("k")){
                job[0] = "Knight";
                job[1] = "3";
                job[2] = "0";
            }else{
                System.out.println("Try again!");
            }
         }

            // sets race
             while(race[0] == null){
            System.out.println("What race do you want to be?\n [P]ineapple\n [D]emon\n [R]agon\n [G]oose\n [Z]ebra\n [J]oe Rogan\n");       	
        	String raw = x.nextLine();   
        	if(raw.toLowerCase().equals("p")){
        		race[0] = "Pineapple";
                race[1] = "1";
                race[2] = "2";
        	}else if(raw.toLowerCase().equals("d")){
        		race[0] = "Demon";
                race[1] = "3";
                race[2] = "-2";
        	}else if(raw.toLowerCase().equals("g")){
        		race[0] = "Goose";
                race[1] = "4";
                race[2] = "7";
        	}else if(raw.toLowerCase().equals("r")){
                race[0] = "Ragon";
                race[1] = "4";
                race[2] = "0";
            }else if(raw.toLowerCase().equals("z")){
                race[0] = "Zebra";
                race[1] = "5";
                race[2] = "0";
            }else if(raw.toLowerCase().equals("j")){
                race[0] = "Joe Rogan";
                race[1] = "-2";
                race[2] = "8";
            }else{
                System.out.println("Try again!");
            }
        }       
    }
    
    // returns level
    public int getLevel() {return level;}
    public void incrementLevel() {level++;}
    public String getName() {return name;}

    // returns player class and race stats
    public int getAttack() {
		int atk = 0;
		for(int i = 0; i < items.size();i++){ // why is this '<' AND 'size()-1' ??? does this not leave out the last element?
			atk += Integer.parseInt(items.get(i).get(1)); 		} 
		return atk + Integer.parseInt(job[1]) + (Integer.parseInt(race[1])) + getLevel(); // added + getLevel() so the attack includes the level of the player
		} 
		
    public int getRun() {
		int p = 0;
		for(int i = 0; i < items.size();i++){
			p += Integer.parseInt(items.get(i).get(2)); 		} 
		return p + Integer.parseInt(job[2]) + (Integer.parseInt(race[2]));
		}
    
    //public useItem() method
    public void useItem(int index) throws Exception {
		if(cards.get(index).get(1).equals("GUAL")){
			incrementLevel();
		    cards.remove(index);
		}else{
           equip(index); 
        }
    }

    //removes the card
    public void removeCard(int num){
       cards.remove(num);
    }

    //returns the number of items
    public int getNumItems() {
    	return items.size();
    }
    
    //returns the number of cards
    public int getNumCards() {
    	return cards.size();
    }

    //get the gender
    public String getGender() {
        return sex ? "M" : "F";
    }

    //returns player item
    public String getItems(){
        String place = "";
        for(int i = 0; i < items.size(); i++){
            place += "["+i+"]\n" + Run.displayCard(items.get(i)) + "\n";
        }
        return place;
    }
	
    //returns the items in a string format
    public ArrayList<String> getItem(int p){
        return items.get(p);
    }

    //slot indexes: [0] head | [1] body | [2] left | [3] right | [4] feet
	public void equip(int v){
       int ind = Integer.parseInt(cards.get(v).get(3));
       if(ind >= 0) {
    	   removeEquip(ind);
       }
       
       if(ind == 3){
           if(!slot[4]){		
               slot[4] = true;
               items.add(cards.remove(v));
           }
       }else if(ind == 2){
           if(!slot[2]){
               slot[2] = true;
             items.add(cards.remove(v));
           }else if(!slot[3]){
             slot[3] = true;
             items.add(cards.remove(v));
            } 
       }else if(ind >= 0){
           if(!slot[ind]){
               slot[ind] = true;
               items.add(cards.remove(v));
           }
       } else if(ind < 0) {
    	   items.add(cards.remove(v));
       } else {
           System.out.println("You can't equip it! Too bad no space!🤣");
       }    
	}
	
	//removes the equipped item
    public void removeEquip(int ind){
    	if(items.size() == 0) {
    		return;
    	}
    	if(ind == 3){
    		if(slot[4]) {
    			slot[4] = false;
    		} else { return;}
        }else if(ind == 2){
        	if(slot[2] && slot[3]) {
            	if(slot[2]){
            		slot[2] = false;
            	}else if(slot[3]){
            		slot[3] = false;
            	}
        	} else {
        		return;
        	}
        }else if(ind >= 0){
            if(slot[ind]){
                slot[ind] = false;
            } else { return; }
        }
        for(int i = 0; i < getNumItems(); i++) {
        	if(items.get(i).get(3).equals(""+ind)) {
        		items.remove(i);
        		break;
        	}
    	}
    }

    // returns player hand
    public String getCards(){
        String brun = "";
        for(int i = 0; i < cards.size(); i++){
            brun += "["+i+"]\n"+Run.displayCard(cards.get(i)) +"\n";
        }
        return brun;
    }
    
    public void addCard(Treasure card) throws Exception {
    	cards.add(card.get());
    }
    
    
    
    
    
    
}
