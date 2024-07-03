class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int originalcolor=image[sr][sc];
        if(color!=originalcolor)
        {
            dfs(image,sr,sc,originalcolor,color);
        }
        return image;
    }

    private void dfs(int [][]image,int sr,int sc,int originalcolor,int color)
    {
        if(sr<0 || sr>=image.length || sc<0 || sc>=image[0].length || image[sr][sc]!=originalcolor || image[sr][sc]==color)
        {
            return;
        }

        image[sr][sc]=color;
        //up
        dfs(image,sr-1,sc,originalcolor,color);
        //down
        dfs(image,sr+1,sc,originalcolor,color);
        //left
        dfs(image,sr,sc-1,originalcolor,color);
        //right
        dfs(image,sr,sc+1,originalcolor,color);
    }
}