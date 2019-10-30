package problems.ValidSudoku;

import java.util.HashSet;
import java.util.Set;

public class Solution {
	public boolean isValidSudoku(char[][] board) {
		for (int x = 0; x < board.length; x++) {
			Set<Character> rowSet = new HashSet<Character>();
			Set<Character> columnSet = new HashSet<Character>();
			Set<Character> boxSet = new HashSet<Character>();
			for (int y = 0; y < board.length; y++) {
				if (board[x][y] != '.') {
					if (!rowSet.add(board[x][y])) {
						return false;
					}
				}
				if (board[y][x] != '.') {
					if (!columnSet.add(board[y][x])) {
						return false;
					}
				}
				
				if(board[(x / 3) * 3 + y / 3][(x % 3) * 3 + y % 3] != '.') {
					if(!boxSet.add(board[(x / 3) * 3 + y / 3][(x % 3) * 3 + y % 3])) {
						return false;
					}
				}
			}
		}
		return true;
	}
}
