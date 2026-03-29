class Solution {

    private int groupe(int i, int j) {
        return 3*(i/3) + (j/3);
    }
    public boolean isValidSudoku(char[][] board) {
       HashSet<Character>[] Hrow = new HashSet[9];
       HashSet<Character>[] Hcol = new HashSet[9];
       HashSet<Character>[] Hgroup = new HashSet[9];

       for(int i=0;i<9;i++){
        Hrow[i]=new HashSet<>();
        Hcol[i]=new HashSet<>();
        Hgroup[i]=new HashSet<>();
       }
       for(int i=0;i<9;i++){
        for(int j=0;j<9;j++) {
            char c= board[i][j];

            if (c=='.') {
                continue;
            }
            int group= groupe(i,j);
            if(!Hrow[i].add(c)) {
                return false;
            }

            if (!Hcol[j].add(c)) {
                return false;
            }
            if (!Hgroup[group].add(c)) {
                return false;
            }
        }
       }
        return true;
    }
}
