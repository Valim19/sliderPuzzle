/*
 * To implement the A* algorithm, you must use the MinPQ data type for the priority queue.
 * Throw an IllegalArgumentException in the constructor if the argument is null.
 * Return -1 in moves() if the board is unsolvable.
 * Return null in solution() if the board is unsolvable.
 *
 * You may not call any library functions other those in java.lang, java.util, and algs4.jar.
 */

public class Solver {

    // find a solution to the initial board (using the A* algorithm)
    public Solver(Board initial)

    // is the initial board solvable? (see below)
    public boolean isSolvable()

    // min number of moves to solve initial board; -1 if unsolvable
    public int moves()

    // sequence of boards in a shortest solution; null if unsolvable
    public Iterable<Board> solution()

    // test client (see below)
    public static void main(String[] args)

}
