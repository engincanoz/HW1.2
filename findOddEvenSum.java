public class findOddEvenSum{
    public int sumOdd(int[] inputarray) {
        int oddsum = 0;
        for(int i = 0;i<inputarray.length;i++) {
            if (i%2==1) {
                oddsum = oddsum + inputarray[i];
            }
        }
        return oddsum;
    }
public int sumEven(int[] inputarray) {
        int evenSum = 0;
        for(int i = 0;i<inputarray.length;i++) {
            if (i%2==1) {
                evenSum = evenSum + inputarray[i];
            }
        }
        return evenSum;
    }

}