import java.util.Stack;

public class ValidParanthesis{
    static Boolean Match(char a,char b){
        if(a == ')' && b == '('){
            return true;
        }else if(a == ']' && b == '['){
            return true;
        }else if(a == '}' && b == '{'){
            return true;
        }else{
            return false;
        }
    }
    public static void main(String[] args){
        Stack<Character> st = new Stack<>();

        String s = "()()";


        if(s.charAt(0) == ')' || s.charAt(0) == ']' || s.charAt(0) == '}'){
            System.out.println(false);
            System.exit(0);
        }


        for(int i = 0;i<s.length();i++){
            if(s.charAt(i) == '(' || s.charAt(i) == '[' || s.charAt(i) == '{'){
                st.push(s.charAt(i));
            }else{
                if(st.isEmpty()){
                    System.out.println(false);
                    System.exit(0);
                }
                if(Match(s.charAt(i),st.peek())){
                    st.pop();
                }else{
                    
                    System.out.println(false);
                    System.exit(0);
                }
            }
        }
        System.out.println(true);
        

    }
}