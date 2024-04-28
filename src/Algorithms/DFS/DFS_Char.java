package Algorithms.DFS;

class DFS_Char {
    static int N, M;
    static int[][] map;
    static int[][] delta = {{0, -1}, {0, 1}, {-1, 0}, {1, 0}}; 
    /*
        static int[][] delta = {{-1, -1}, {0, -1}, {1, -1}, {-1, 0}, {1, 0}, {-1, 1}, {0, 1}, {1, 1}};
    */

    static void dfs(int x, int y) {
        map[x][y] = 'x';

        for(int i=0;i<4;i++) {
            int nx = x+delta[i][0];
            int ny = y+delta[i][1];

            if(nx<0||ny<0||nx>=N||ny>=M||map[nx][ny]!='#') continue;
            dfs(nx, ny);
        }
    }
}
