import java.util.Arrays;

public class climbing_chair {
    public static int mincost(int[]cost,int idx,int[]dp){
        if(idx==0 || idx==1) return cost[idx];
        if(dp[idx]!=-1) return dp[idx];
        return dp[idx]=cost[idx]+Math.min(mincost(cost,idx-1,dp),mincost(cost,idx-2,dp));

    }
    public static int climb(int[]cost){
        int n=cost.length;
        int[]dp=new int [n+1];
        Arrays.fill(dp,-1);
       return Math.min(mincost(cost,n-1,dp),mincost(cost,n-2,dp));
    }
    public static void main(String[] args) {
        int [] arr = {1, 2, 3, 4, 5};
        System.out.println(climb(arr));
    }
}
