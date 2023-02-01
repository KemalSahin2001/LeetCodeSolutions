public class longestCommonPrefix {
    public static void main(String[] args) {
        String[] strs = {"flower","flow","flight"};
        String commonPre = "";
        outer:
        for (int i = 1; i < 201; i++) {
            for (String temp: strs) {
                try {
                    if(!strs[0].substring(0,i).equals(temp.substring(0,i))) break outer;
                }
                catch (Exception e){
                    break outer;
                }
            }
            commonPre = strs[0].substring(0,i);
        }
        System.out.println(commonPre);
    }
}
