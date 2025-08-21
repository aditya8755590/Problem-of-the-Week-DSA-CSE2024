
import java.util.*;
public class FloodFillAlgorithm {
    public static void main(String[] args) {
       
        int[][] image = {
            {1, 1, 1},
            {1, 1, 0},
            {1, 0, 1}
        };
        System.out.println(Arrays.toString(Solution.floodFill(image, 1, 1, 2)));
    }

   static  class Solution {

   static public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int pixel=image[sr][sc];
        if(pixel==color){
            return image;
        }
        dfs(image,sr,sc,pixel,color);
        return image;
    }
   static public void dfs(int[][] image, int r, int c, int oldColor,int newColor ){
        int rows = image.length, cols = image[0].length;
        if (r < 0 || c < 0 || r >= rows || c >= cols || image[r][c] != oldColor) {
            return;
        }
        image[r][c] = newColor;
        dfs(image, r + 1, c, oldColor, newColor);
        dfs(image, r - 1, c, oldColor, newColor);
        dfs(image, r, c + 1, oldColor, newColor);
        dfs(image, r, c - 1, oldColor, newColor);
    }
}
}
