public class Solution1 {
    public int indexEqualsValueSearch(int[] arr){
        return binarySearch(arr,0,arr.length-1,-1);
    }

    private int bruteForce(int[] arr){
        for(int i=0;i<arr.length;i++) {
            if(i==arr[i]){
                return i;
            }
        }
        return -1;
    }

    private int binarySearch(int[] arr,int left,int right, int answer){
        if(right>=left){
            int mid = left+(right-left)/2;
            System.out.println(mid);
            if(arr[mid]==mid){
                answer=mid;
                right = mid-1;
            }else if(arr[mid]<mid){
                left = mid+1;
            }else {
                right = mid-1;
            }
            return binarySearch(arr,left,right,answer);
        }else{
            return answer;
        }
    }
}
