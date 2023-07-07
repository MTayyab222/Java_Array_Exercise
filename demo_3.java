public class demo_3 {
    public static int[] runningSumMethod(int []nums){
        int [] runningSum=new int[nums.length];
        int sum=0;
        for(int i=0;i< nums.length;i++){
            sum+=nums[i];
            runningSum[i]=sum;
        }
        return runningSum;
    }
    public static void main(String[] args) {
        int []array_1={2,4,6,8};
        int[] runningsum=runningSumMethod(array_1);
        for(int i=0;i< array_1.length;i++)
        {
            System.out.print(" "+runningsum[i]);
        }

    }
}
