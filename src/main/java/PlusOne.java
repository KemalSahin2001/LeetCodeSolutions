import java.util.Arrays;

public class PlusOne {
    public static void main(String[] args) {
        int[] num = {9};
        for (int i = num.length - 1; i >= 0; i--) {
            if(num[i] + 1 >= 10){
                if(i == 0){
                    int[] firstArray = {0};
                    int sal = num.length;   //determines length of secondArray
                    int[] result = new int[1 + sal];  //resultant array of size first array and second array
                    System.arraycopy(firstArray, 0, result, 0, 1);
                    System.arraycopy(num, 0, result, 1, sal);
                    result[1] = 0;
                    result[0] = 1;
                    num = result;
                    break;
                }
                else num[i] = 0;
            }
            else{
                num[i] += 1;
                break;
            }
        }
        System.out.println(Arrays.toString(num));
    }
}
