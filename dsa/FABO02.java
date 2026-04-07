import java.util.Arrays;

public class FABO02 {
    public static int fabo(int n,int []dp){
        if(n<=1) return n;
        if(dp[n]!=-1) return dp[n];

        int ans=fabo(n-1,dp)+fabo(n-2,dp);
        dp[n]=ans;
        return dp[n];
    }
    public static void main(String[] args) {
        int []dp=new int[5+1];
         Arrays.fill(dp, -1);
         for(int i=0;i<=5;i++){
            System.out.print(fabo(i,dp)+" ");
       // System.out.println(fabo(15,dp));
    }
}
}