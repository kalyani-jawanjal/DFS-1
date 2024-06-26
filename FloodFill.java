//time and space - O(m*n). Approach : DFS
public class FloodFill {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        if(image == null || image.length == 0 || image[sr][sc] == color) {
            return image;
        }
        dfs(image, sr, sc, image[sr][sc], color);
        return image;
    }
    private void dfs(int[][] image, int row, int col, int oldColor, int newColor) {
        if(row < 0 || row >= image.length || col < 0 || col >= image[0].length || image[row][col] != oldColor) {
            return;
        }

        image[row][col] = newColor;

        dfs(image, row+1, col, oldColor, newColor);
        dfs(image, row-1, col, oldColor, newColor);
        dfs(image, row, col+1, oldColor, newColor);
        dfs(image, row, col-1, oldColor, newColor);
    }
}
