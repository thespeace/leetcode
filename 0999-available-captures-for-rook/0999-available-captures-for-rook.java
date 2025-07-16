class Solution {
    public int numRookCaptures(char[][] board) {
        int rx = 0, ry = 0;

        // 룩 위치 찾기
        outer:
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                if (board[i][j] == 'R') {
                    rx = i;
                    ry = j;
                    break outer;
                }
            }
        }

        // 상하좌우 방향 탐색
        int count = 0;
        int[][] dirs = {{-1,0},{1,0},{0,-1},{0,1}};

        for (int[] d : dirs) {
            int x = rx + d[0];
            int y = ry + d[1];

            while (x >= 0 && x < 8 && y >= 0 && y < 8) {
                if (board[x][y] == 'B') break; // 비숍 만나면 방향 종료
                if (board[x][y] == 'p') {
                    count++;
                    break; // 폰 잡고 종료
                }
                x += d[0];
                y += d[1];
            }
        }

        return count;
    }
}