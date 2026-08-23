//leetcode 36 suduko problem 
// new type of array hashset learning with accutate postio by r/3 + c/3 *3
//neetcode7
import java.util.*;

class leetcode36 {
    public boolean isValidSudoku(char[][] board) {
        int n = 9;
        HashSet<Character>[] row = new HashSet[n];
        HashSet<Character>[] column = new HashSet[n];
        HashSet<Character>[] matrix = new HashSet[n];

        for(int i=0; i<n; i++){
            row[i]=new HashSet<Character>();
            column[i]=new HashSet<Character>();
            matrix[i]=new HashSet<Character>();
        }

        for(int r=0; r<n; r++){
            for(int c=0; c<n; c++){
                char val= board[c][r];

                if(val == '.'){
                    continue;
                }

                if (row[r].contains(val)){
                    return false;
                }
                row [r].add(val);

                 if (column[c].contains(val)){
                    return false;
                }
                column [c].add(val);

                int box=(r/3)+(c/3)*3;
                 if (matrix[box].contains(val)){
                    return false;
                }
                matrix [box].add(val);

            }

            
        }
        return true;
    }
}