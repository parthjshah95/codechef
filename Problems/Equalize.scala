package Problems

/**
  * Created by parshah on 19-Jul-16.
  */
/*
Chef is creating a map for a certain real-time strategy video game. In this game, a map is a 2D rectangle of dimensions N × M tiles. Initially, the tile at row i and column j has a height of Hi,j. Heights are always integers.

Before creating the map, Chef first wants to make the heights of all the tiles equal. But he can only change height values using the equalize tool. The equalize tool is rectangular in shape, with dimensions K × L, and upon application, it replaces the height values of all the affected cells by their median. The equalize tool cannot be rotated. For example, in the following 5 × 9 grid of heights:

9 8 8 8 7 7 7 8 7
1 1 1 4 4 5 2 4 4
2 3 1 2 1 2 1 1 9
3 2 8 8 9 9 7 7 7
7 7 7 7 7 7 8 8 8

Suppose the dimensions of the equalize tool is 3 × 7, and we apply it in the middle 3 × 7 region. The median of the values in that region is 3, so after application, the grid becomes:

9 8 8 8 7 7 7 8 7
1 3 3 3 3 3 3 3 4
2 3 3 3 3 3 3 3 9
3 3 3 3 3 3 3 3 7
7 7 7 7 7 7 8 8 8

Note that K and L are odd integers, so that the median is always an integer.

Chef wants to make all height values equal by repeatedly applying the equalize tool. Furthermore, he also wants the final (common) height to be as large as possible. What is the maximum final (common) height that he can obtain?

Furthermore, you have to answer Q queries, where each query denotes a different set of values for K and L.
Input

The first line of input contains three integers, N, M, Q.

The following N lines describe the height values. Each line contains M integers. The jth value in the ith line contains Hi,j.

The following Q lines describe the queries. The jth line contains two integers, Kj and Lj.
Output

For each query, output a single integer, the maximum final (common) height that Chef can obtain, assuming the size of the equalize tool is Kj × Lj.
Constraints

    3 ≤ N, M ≤ 1000
    1 ≤ Q ≤ 25
    0 ≤ Hi,j ≤ 107
    3 ≤ Kj ≤ N
    3 ≤ Lj ≤ M
    Kj and Lj are odd.

Example

Input:
3 7 3
8 5 5 5 8 6 8
8 9 5 5 5 9 8
8 6 8 5 5 5 8
3 3
3 5
3 7

Output:
8
5
6

Explanation

In the first query, Chef can obtain a final height of 8 by first applying the equalizer on the leftmost 3 × 3 region:

8 8 8 5 8 6 8
8 8 8 5 5 9 8
8 8 8 5 5 5 8

then the rightmost 3 × 3 region:

8 8 8 5 8 8 8
8 8 8 5 8 8 8
8 8 8 5 8 8 8

and then finally the middlemost 3 × 3 region:

8 8 8 8 8 8 8
8 8 8 8 8 8 8
8 8 8 8 8 8 8

It can be shown that this is the largest final height that can be obtained.

 */
object Equalize {

}