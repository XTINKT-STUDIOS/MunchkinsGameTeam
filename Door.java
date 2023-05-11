import java.io.*;
import java.nio.file.*;
import java.util.*;
import java.lang.Math;

public class Door {
	private ArrayList<ArrayList<String>> deck,cdeck;
	private Stack<ArrayList<String>> discard,cdiscard;
	private Path path = Paths.get("src\\door");
	private Path cpath = Paths.get("src\\curse");

	public Door() throws Exception{
		deck = new ArrayList<ArrayList<String>>();
		discard = new Stack<ArrayList<String>>();

		for(int i = 1; i < getFilesCount(path); i++){
			Scanner scan = new Scanner(new File("src\\door\\door " + i + ".dat"));
			// Scanner scan = new Scanner(new File(path + "\\door " + i + ".dat")); // This would also work btw since yous assigned a variable for the first part
			ArrayList<String> info = new ArrayList<String>();
			while(scan.hasNextLine()) {
				info.add(scan.nextLine().substring(2));
			}
			deck.add(info);
		}
	}
	
	
	public void curse() throws Exception{
		cdeck = new ArrayList<ArrayList<String>>();
		cdiscard = new Stack<ArrayList<String>>();
		this.path = Paths.get("src\\curse");

		for(int i = 1; i < getFilesCount(cpath); i++){
			Scanner scan = new Scanner(new File("src\\curse\\curse " + i + ".dat"));
			// Scanner scan = new Scanner(new File(path + "\\curse " + i + ".dat")); // This would also work btw since yous assigned a variable for the first part
			ArrayList<String> info = new ArrayList<String>();
			while(scan.hasNextLine()) {
				info.add(scan.nextLine().substring(2));
			}
			cdeck.add(info);
		}
	}

	public ArrayList<String> get() throws Exception {
		int ind = (int)(Math.random() * deck.size());
		ArrayList<String> ret = deck.get(ind);
		discard.add(deck.remove(ind));
		return ret;
	}
/**
 * Returns amount of files in the folder
 *
 * @param dir is path to target directory
 *
 * @throws NotDirectoryException if target {@code dir} is not Directory
 * @throws IOException if has some problems on opening DirectoryStream
 */
	public static int getFilesCount(Path dir) throws IOException, NotDirectoryException {
    	int c = 0;
    	if(Files.isDirectory(dir)) {
        	try(DirectoryStream<Path> files = Files.newDirectoryStream(dir)) {
            	for(Path file : files) {
                	if(Files.isRegularFile(file) || Files.isSymbolicLink(file)) {
                    	// symbolic link also looks like file
                    	c++;
                	}
            	}
        	}
    	}
    	else
    	    throw new NotDirectoryException(dir + " is not directory");

	    return c;
	}
}
