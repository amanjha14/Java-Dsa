public class TrappedRainwater {
    public static void main(String[] args) {
        int[] arr={4,2,0,3,2,5};
        int sol=Trapped(arr);
        System.out.println(sol);

    }
    static int Trapped(int[] height){
        int[] Leftmax=new int[height.length];
        Leftmax[0]=height[0];
        for(int i=1;i<height.length;i++){
            Leftmax[i]=Math.max(Leftmax[i-1], height[i]);
        }
        int[] Rightmax=new int[height.length];
        Rightmax[height.length-1]=height[height.length-1];
        for (int i= height.length-2;i>=0;i--){
            Rightmax[i]=Math.max(Rightmax[i+1],height[i]);
        }
        int trappedwater=0;
        for(int i=0;i<height.length;i++){
            int waterlevel=Math.min(Leftmax[i],Rightmax[i]);
            trappedwater+=waterlevel -height[i];
        }
        return trappedwater;

    }
}
