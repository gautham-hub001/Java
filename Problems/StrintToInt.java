package Problems;

public class StrintToInt {
    public static int myAtoi(String s) {
        int ans=0;
        int power=0;
        for(int i=s.length()-1; i>=0; i--){
            if(s.charAt(i)>='0' && s.charAt(i)<='9'){
                int repl = (int)(s.charAt(i)-'0');
                double po = Math.pow(10,power);
                ans+= ((int)(s.charAt(i)-'0'))*Math.pow(10,power); // subtracting with '0' is imp
                power++;
            }
            if(s.charAt(i) == '-'){
                return -ans;
            }
        }
        return ans;
    }
    public static int myAtoI(String s) {
        int ans=0;
        int power=0;

        // for test cases
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i)=='+' || s.charAt(i)=='-' || (s.charAt(i)>='0' && s.charAt(i)<='9')){
                break;
            }
            if(s.charAt(i)!=' ' && s.charAt(i)!='+' && s.charAt(i)!='-' && (s.charAt(i)<'0' || s.charAt(i)>'9'))             {
                return 0;
            }
        }
        for(int i=s.length()-1; i>=0; i--){
            if(s.charAt(i)>='0' && s.charAt(i)<='9'){
                ans+= ((int)(s.charAt(i)-'0'))*Math.pow(10,power);
                power++;
            }
            if(s.charAt(i) == '-'){
                return -ans;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        System.out.println(myAtoi("42"));
        System.out.println(myAtoI("words and 98")); // should return 0 if the string does not start with whitespaces or number or + or -
    }
}
