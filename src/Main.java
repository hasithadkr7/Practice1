import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) {
        int[] arr = {-8,0,2,5};
//        int[] arr = {-1,0,3,6};
//        int[] arr = {0,1,3,6,4,5,6,7,8};
        Solution1 solution1 = new Solution1();
        long startTime = System.nanoTime();
        System.out.println("Answer : "+solution1.indexEqualsValueSearch(arr));
        long endTime = System.nanoTime();
        long durationInNano = (endTime - startTime);
        long durationInMillis = TimeUnit.NANOSECONDS.toMillis(durationInNano);
        System.out.println("Execution time in nano : "+durationInNano);
        System.out.println("Execution time in millis : "+durationInMillis);
    }
}
