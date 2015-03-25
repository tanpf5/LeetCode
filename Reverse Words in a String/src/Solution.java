
public class Solution {

    public static String reverseWords(String s) {
    	if (s.equals("")) return "";
        String[] s1 = s.split(" ");
        if (s1.length == 0) return "";
        int low = 0, high = s1.length - 1;
        StringBuilder ans = new StringBuilder();
        while (s1[low].equals("")) ++low;
        while (s1[high].equals("")) --high;
        for (int i = high; i > low; i--) {
        	if (!s1[i].equals("")) ans.append(s1[i] + " ");
        }
         ans.append(s1[low]);
        return ans.toString();
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(reverseWords(""));
	}

}
