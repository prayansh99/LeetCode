class Solution {
    public boolean isValidSudoku(char[][] board) {
        int constant = 3;
        for(char[] ch : board) {
            boolean invalid = new String(ch).chars().filter(i -> i!='.')
                    .distinct()
                    .count() < new String(ch).chars().filter(i -> i!='.').count();
            if(invalid){
                return(false);
            }
        }
        char[][] transposedArray = new char[9][9];
        for (int i = 0; i < 9; i++) {
            final int row = i;
            for (int j = 0; j < 9; j++) {
                final int col = j;
                transposedArray[col][row] = board[row][col];
            }
        }
        for(char[] ch : transposedArray) {
            boolean invalid = new String(ch).chars().filter(i -> i!='.')
                    .distinct()
                    .count() < new String(ch).chars().filter(i -> i!='.').count();
            if(invalid){
                return(false);
            }
        }
        char[][] miniBoxArray = new char[9][9];
        int k = 0;
        int l = 0;
        char[] temp = new char[9];
        for(int i = 0; i < 9; i++) {
            for(int j = 0; j < 9; j++) {

                temp[k] = board[i][j];
                k += 1;
                if(k == board.length) {
                    miniBoxArray[l] = temp;
                    temp = new char[9];
                    k = 0;
                    l += 1;
                }
                if(i == board.length - 1 && j == board.length - 1){
                    break;
                }
                if(i == board.length - 1 && j == constant - 1){
                    i = 0;
                    constant += 3;
                }
                if(j == (constant - 1)){
                    j -= 3;
                    i += 1;
                }
            }
            if(l == board.length) {
                break;
            }
        }
        for(char[] ch : miniBoxArray) {
            boolean invalid = new String(ch).chars().filter(i -> i!='.')
                    .distinct()
                    .count() < new String(ch).chars().filter(i -> i!='.').count();
            if(invalid){
                return(false);
            }
        }
        return(true);
    }
}