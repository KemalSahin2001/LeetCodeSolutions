import java.util.Stack;

public class ValidParantheses {
    public static void main(String[] args) {
        String asd = "([])";
        Stack<Character> stck = new Stack<>();
        stck.push(asd.charAt(0));
        for (int i = 1; i < asd.length(); i++) {
            String temp = String.valueOf(asd.charAt(i));
            if(temp.equals("(") | temp.equals("[") | temp.equals("{")){
                stck.push(asd.charAt(i));
            }
            else{
                try{
                    String val = String.valueOf(stck.peek());
                    if (temp.equals(")") & val.equals("(")) stck.pop();
                    else if (temp.equals("]") & val.equals("[")) stck.pop();
                    else if (temp.equals("}") & val.equals("{")) stck.pop();
                    else stck.push(asd.charAt(i));
                }
                catch (Exception e) {
                    stck.push(asd.charAt(i));
                }
            }
        }
        System.out.println(stck.isEmpty());
    }
}
