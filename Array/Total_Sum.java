package Array;

public class Total_Sum {
    public static void totalSum(int[][] mat) {
        int n = mat.length;;
        int sum = 0;
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                //condition for diagonal elements
                if(i == j || i == n - 1 || j == n - 1){
                    sum += mat[i][j];
                }
                //condition for boundary elements
                else if(i == 0 || j ==0 || (i + j) == n - 1){
                    sum += mat[i][j];
                }
            }
        }
        System.out.println(sum);    
    }
}
