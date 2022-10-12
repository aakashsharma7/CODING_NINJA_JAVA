package Array;

public class Spiral_Print {
    public static void spiralPrint(int m[][]){
		//Your code goes here
        if(m.length ==0){
            return;
        }
        int count=0;
        int sr =0;
        int er = m.length-1;
        int sc = 0;
        int ec = m[0].length-1;
        int total = m.length*m[0].length;
        while(count<total){
            if(count<total){
                for(int i=sc;i<=ec;i++){
                    System.out.print(m[sr][i]+" ");
                    count++;
                }
            }else{
                break;
            }
            if(count<total){
                for(int i=sr+1;i<=er;i++){
                    System.out.print(m[i][ec]+" ");
                    count++;
                }
            }else{
                break;
            }
            sr++;
            ec--;
            if(count<total){
                for(int i=ec;i>=sc;i--){
                    System.out.print(m[er][i]+" ");
                    count++;
                }
            }
            er--;
            if(count<total){
                for(int i=er;i>=sr;i--){
                    System.out.print(m[i][sc]+" ");
                    count++;
                }
            }else{
                break;
            }
            sc++;
        }
        
	}
}

