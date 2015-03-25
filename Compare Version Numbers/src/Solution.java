
public class Solution {

    public static int compareVersion(String version1, String version2) {
        while (version1 != "" && version2 != "") {
        	int i = version1.indexOf('.') == -1 ? version1.length() : version1.indexOf('.');
        	int v1 = Integer.parseInt(version1.substring(0, i));
        	int j = version2.indexOf('.') == -1 ? version2.length() : version2.indexOf('.');
        	int v2 = Integer.parseInt(version2.substring(0, j));
        	if (v1 == v2) {
        		version1 = version1.indexOf('.') == -1 ? "" : version1.substring(i + 1);
        		version2 = version2.indexOf('.') == -1 ? "" : version2.substring(j + 1);
        	}
        	if (v1 > v2) return 1;
        	if (v1 < v2) return -1;
        }
        if (version1 != "") {
        	while (version1 != ""){
            	int i = version1.indexOf('.') == -1 ? version1.length() : version1.indexOf('.');
            	int v1 = Integer.parseInt(version1.substring(0, i));
            	if (v1 > 0) return 1;
            	else version1 = version1.indexOf('.') == -1 ? "" : version1.substring(i + 1);
        	}
        	
        }
        if (version2 != "") {
        	while (version2 != ""){
            	int j = version2.indexOf('.') == -1 ? version2.length() : version2.indexOf('.');
            	int v2 = Integer.parseInt(version2.substring(0, j));
            	if (v2 > 0) return -1;
            	else version2 = version2.indexOf('.') == -1 ? "" : version2.substring(j + 1);
        	}
        }
        return 0;
    }
    
    public static int compareVersion_better(String version1, String version2) {
        String []num1 = version1.split("\\.");
        String []num2 = version2.split("\\.");
        int i = 0,j = 0;
        for ( ;i <= num1.length-1 && j <= num2.length-1;i++,j++)
            if (Integer.parseInt(num1[i]) > Integer.parseInt(num2[j])) return 1;
            else if (Integer.parseInt(num1[i]) < Integer.parseInt(num2[j])) return -1; 
        for( ;i <= num1.length-1;i++) 
            if (Integer.parseInt(num1[i]) != 0) return 1;
        for( ;j <= num2.length-1;j++) 
            if (Integer.parseInt(num2[j]) != 0) return -1;
        return 0;
}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(compareVersion("3.2.0.0.0", "3.2"));
		System.out.println(compareVersion_better("3.2.0.0.0", "3.2"));
	}

}
