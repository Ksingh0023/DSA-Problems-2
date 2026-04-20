import java.util.*;

class Solution {
    public String[] findWords(String[] words) {
        String r1="qwertyuiop", r2="asdfghjkl", r3="zxcvbnm";
        List<String> res=new ArrayList<>();

        for(String w:words){
            String s=w.toLowerCase();
            String row = r1.contains(""+s.charAt(0))?r1:
                         r2.contains(""+s.charAt(0))?r2:r3;

            boolean ok=true;
            for(char c:s.toCharArray())
                if(!row.contains(""+c)) ok=false;

            if(ok) res.add(w);
        }
        return res.toArray(new String[0]);
    }
}
