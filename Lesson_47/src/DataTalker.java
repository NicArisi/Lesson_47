import java.io.*;
import java.util.*;
public class DataTalker {
	public static void main(String[] args) throws IOException{
		Scanner sf = new Scanner(new File("data.txt"));
	    int maxIndx = -1;
	    String text[] = new String[17]; // To be safe, declare more than we need
	    while (sf.hasNext()) {
		    maxIndx++;
		    text[maxIndx] = sf.nextLine();
	    }sf.close();
	    for(int x=0; x<14;x++) {
	    	System.out.println(text[x]);
	    }
	    
	    //map stuff start
	    Set<String> s1 = new HashSet<String>();
	    int x=0;
	    while(text[x]!=null) {
	    	s1.put((Object)text[x].substring(0,text[x].indexOf("=")-1), (Object)text[x].substring(text[x].indexOf("=")+1));
	    	x++;
	    }
	    
	}
}
