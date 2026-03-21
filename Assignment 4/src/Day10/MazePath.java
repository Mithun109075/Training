package Day10;
public class MazePath {

    static int N = 4;

    // Function to print solution
    public static void printSolution(int sol[][]) {
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++)
                System.out.print(sol[i][j] + " ");
            System.out.println();
        }
    }

    // Check if position is safe
    public static boolean isSafe(int maze[][], int x, int y) {
        return (x < N && y < N && maze[x][y] == 1);
    }

    // Backtracking function
    public static boolean solveMaze(int maze[][], int x, int y, int sol[][]) {

        // If destination reached
        if (x == N - 1 && y == N - 1) {
            sol[x][y] = 1;
            return true;
        }

        if (isSafe(maze, x, y)) {
            sol[x][y] = 1;

            // Move right
            if (solveMaze(maze, x, y + 1, sol))
                return true;

            // Move down
            if (solveMaze(maze, x + 1, y, sol))
                return true;

            // Backtrack
            sol[x][y] = 0;
            return false;
        }

        return false;
    }

    public static void main(String[] args) {
        int maze[][] = {
                {1, 0, 0, 0},
                {1, 1, 0, 1},
                {0, 1, 0, 0},
                {1, 1, 1, 1}
        };

        int sol[][] = new int[N][N];

        if (solveMaze(maze, 0, 0, sol)) {
            System.out.println("Path found:");
            printSolution(sol);
        } else {
            System.out.println("No path exists");
        }
    }
}