import java.util.*;

public class Player {

	private ArrayList<ArrayList<String>> cards = new ArrayList<ArrayList<String>>();
	private ArrayList<ArrayList<String>> items = new ArrayList<ArrayList<String>>();
	// true = male | false = female
    private Boolean sex;
    // [0] class name | [1] Attack bonus | [2] Run bonus
    private String[] job = new String[3];
    private String[] race = new String[3];
    private Scanner x = new Scanner(System.in);
    private int level = 1;
    private String name = ""; 

    public Player(Treasure treasure) throws Exception {  
    	for(int i = 0; i < 5; i++){
    		cards.add(treasure.get());
    	}
    	
    	// sets gender
        while(sex == null){
        	System.out.println("Sex: [M]ale or [F]emale?");
        	String gender = x.nextLine();   
        	if(gender.length() != 1){
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

        // sets class
         while(job[0] == null){
            System.out.println("What class do you want to be?\n [N]oble\n [P]irate\n [S]paceman\n [D]uck\n [A]lien\n [W]izard\n [K]night");       	
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

            //race
             while(race[0] == null){
            System.out.println("What race do you want to be?\n [P]inaeapple\n [D]emon\n [R]agon\n [G]oose\n [Z]ebra\n [J]oe Rogan");       	
        	String raw = x.nextLine();   
        	if(raw.toLowerCase().equals("p")){
        		race[0] = "Pinaeapple";
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

    // returns player class stats
    public int getAttack() {return Integer.parseInt(job[1]) + level;} 
    public int getRun() {return Integer.parseInt(job[2]);}

    // returns player hand
    public String getCards(){
        String brun = "";
        for(int i = 0; i < cards.size(); i++){
            brun += "("+i+") "+cards.get(i)+"\n";
        }
        return brun;
    }
    
    public void addCard(Treasure card) throws Exception {
    	cards.add(card.get());
    }
}
