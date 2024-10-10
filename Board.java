/*
 * You may assume that the constructor receives an n-by-n array containing
 * the n2 integers between 0 and n2 − 1, where 0 represents the blank square.
 * You may also assume that 2 ≤ n < 128.
 *
 * PERFORMANCE REQUIREMENTS -
 * Your implementation should support all Board methods in time proportional to n2 (or better) in the worst case.
 *
 * You may not call any library functions other those in java.lang, java.util, and algs4.jar.
 */

public class Board {

    // create a board from an n-by-n array of tiles,
    // where tiles[row][col] = tile at (row, col)
    public Board(int[][] tiles)

    // string representation of this board
    public String toString()

    // board dimension n
    public int dimension()

    // number of tiles out of place
    public int hamming()

    // sum of Manhattan distances between tiles and goal
    public int manhattan()

    // is this board the goal board?
    public boolean isGoal()

    // does this board equal y?
    public boolean equals(Object y)

    // The neighbors() method returns an iterable containing the neighbors of the board.
    // Depending on the location of the blank square, a board can have 2, 3, or 4 neighbors.
    public Iterable<Board> neighbors()

    // a board that is obtained by exchanging any pair of tiles
    public Board twin()

    // unit testing (not graded)
    public static void main(String[] args)

}
