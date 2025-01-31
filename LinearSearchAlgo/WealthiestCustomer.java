package LinearSearchAlgo;

// https://leetcode.com/problems/richest-customer-wealth/description/

public class WealthiestCustomer {
    public static void main(String[] args) {
        int[][] accounts = {
            {1,5},
            {7,3},
            {5,3}
        };

        int ans = findRichestCustomer(accounts);
        System.out.println("maximun wealth : " + ans);
    }

    static int findRichestCustomer(int[][] accounts) {
        int ans = Integer.MIN_VALUE;

        for(int i=0; i<accounts.length; i++){
            int sum = 0;
            for(int j=0; j<accounts[i].length; j++){
                sum += accounts[i][j];
            }
            System.out.println(sum);

            if(sum > ans){
                ans = sum;
            }
        }
        return ans;
    }
}
