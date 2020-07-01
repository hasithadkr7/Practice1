public class Solution2 {
    static void drawHTree(int x, int y, int length, int depth){
        if(depth>0){
            drawLine(x-length/2,y,x+length/2,y);
            drawLine(x-length/2,y+length/2,x-length/2,y-length/2);
            drawLine(x+length/2,y+length/2,x+length/2,y-length/2);

            drawHTree(x-length/2,y+length/2, (int) (length/Math.sqrt(2)),depth-1);
            drawHTree(x-length/2,y-length/2, (int) (length/Math.sqrt(2)),depth-1);
            drawHTree(x+length/2,y+length/2, (int) (length/Math.sqrt(2)),depth-1);
            drawHTree(x+length/2,y-length/2, (int) (length/Math.sqrt(2)),depth-1);
        }else {
            return;
        }
    }

    static void drawLine(int x1, int y1, int x2, int y2){
        System.out.println("Draw line");
    }
}
