import java.io.*;

class chess{

    char[][] board;

    public static void main(String[] args){
        board = initPieces();
        printBoard(board);
    }

    public static char[][] initPieces(){
        char[][] board = new char[8][8];

        //make pawns
        for(int i = 0; i < 8; i++){
            board[1][i] = 'p';
            board[6][i] = 'p';
        }
        //rooks
        board[0][0] = 'r';
        board[0][7] = 'r';
        board[7][0] = 'r';
        board[7][7] = 'r';
        //knights
        board[1][0] = 'k';
        board[6][0] = 'k';
        board[1][7] = 'k';
        board[6][7] = 'k';

        return board;
    }

    static void printBoard(char[][] board){
        for(int i = 0; i < board.length; i++){
            for(int j = 0; j < board[0].length; j++){
                print(board[i][j]);
                println();
            }
        }
    }
}