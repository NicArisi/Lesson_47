import java.io.*;
import java.util.*;
public class Histogram {

	public static void main(String[] args) throws FileNotFoundException {
		Scanner sf = new Scanner(new File("HistogramData.txt"));
	    int maxIndx = -1;
	    String text[] = new String[16]; // To be safe, declare more than we need
	    while (sf.hasNext()) {
		    maxIndx++;
		    text[maxIndx] = sf.nextLine();
	    }sf.close();
	    String words[]=text[0].split(", ");
	    /*for(int x=0; x<words.length;x++) {
	    	System.out.println(words[x]);
	    }*/
	    Map<String, Integer> s1 = new TreeMap<String, Integer>();
	    for(int y=0;y<words.length;y++) {
	    	if(s1.containsKey(words[y])) {
	    		s1.replace(words[y], s1.get(words[y]+1));
	    	}else {
	    		s1.put(words[y], 1);
	    	}
	    }
	    Set s2 = s1.keySet();
	    Iterator<String> iter = s2.iterator();
	    while(iter.hasNext()){
	    	Object key = iter.next();
	    	Object val = s1.get(key);
	    	System.out.println(key + " " + val);
	    }
	}

}
