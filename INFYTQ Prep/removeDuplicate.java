import java.util.*;

public class removeDuplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner s=new Scanner(System.in);
    String str=s.nextLine();
    HashMap<Character,Integer> m=new LinkedHashMap();
    char ch;
    int count;
    for(int i=0;i<str.length();i++) {
    	ch=str.charAt(i);
    	if(m.containsKey(ch)) {
    		count=m.get(ch);
    		count++;
    		m.put(ch, count);
    	}else {
    		m.put(ch,1);
    	}
    }
    List<Character> alKeys = new ArrayList<Character>(m.keySet());
    Collections.reverse(alKeys);
    for(Character key:alKeys)
    {
    	System.out.print(key);
    }
	}

}
