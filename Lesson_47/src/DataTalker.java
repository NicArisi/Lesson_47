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
	    Map<String, String> s1 = new TreeMap<String, String>();
	    int num= Integer.parseInt(text[0]);
	    for(int y=1; y<=num; y++) {
	    	Scanner sc= new Scanner(text[y]);
	    	sc.useDelimiter("=");
	    	s1.put(sc.next(), sc.next());
	    }
	    String sentence = text[14];
	    String word[] = sentence.split("");
	    for(int j=0;j<word.length;j++) {
	    	if(s1.containsKey(word[j])) {
	    		System.out.print(s1.get(word[j])+" ");
	    	}else {
	    		System.out.print((word[j])+" ");
	    	}
	    	
	    }

	    //sdfsdyhivsghdvgsdvyhfa
	    //please help me
	}
}
