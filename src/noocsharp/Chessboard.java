package noocsharp;

import noocsharp.piece.*;
import noocsharp.utilities.Color;

/**
 * Created by nihal on 6/30/2017.
 *
 * Coordinate system is bottom left to top right, where first coordinate is x and second is y
 */
public class Chessboard {
    Piece[][] chessboard;
    boolean inCheck = false;
    public final int WIDTH;
    public final int HEIGHT;

    public Chessboard (int width, int height) {
        this.WIDTH = width;
        this.HEIGHT = height;
        this.chessboard = new Piece[this.WIDTH][this.HEIGHT];
        this.reset();
    }

    public void reset() {
        this.chessboard[0][0] = new Rook(Color.WHITE);
        this.chessboard[1][0] = new Knight(Color.WHITE);
        this.chessboard[2][0] = new Bishop(Color.WHITE);
        this.chessboard[3][0] = new Queen(Color.WHITE);
        this.chessboard[4][0] = new King(Color.WHITE);
        this.chessboard[5][0] = new Bishop(Color.WHITE);
        this.chessboard[6][0] = new Knight(Color.WHITE);
        this.chessboard[7][0] = new Rook(Color.WHITE);

        this.chessboard[0][this.HEIGHT - 1] = new Rook(Color.BLACK);
        this.chessboard[1][this.HEIGHT - 1] = new Knight(Color.BLACK);
        this.chessboard[2][this.HEIGHT - 1] = new Bishop(Color.BLACK);
        this.chessboard[3][this.HEIGHT - 1] = new Queen(Color.BLACK);
        this.chessboard[4][this.HEIGHT - 1] = new King(Color.BLACK);
        this.chessboard[5][this.HEIGHT - 1] = new Bishop(Color.BLACK);
        this.chessboard[6][this.HEIGHT - 1] = new Knight(Color.BLACK);
        this.chessboard[7][this.HEIGHT - 1] = new Rook(Color.BLACK);

        for (int i = 0; i<8; i++) {
            this.chessboard[i][1] = new Pawn(Color.WHITE);
            this.chessboard[i][6] = new Pawn(Color.BLACK);

            this.chessboard[i][2] = new Filler(Color.NONE);
            this.chessboard[i][3] = new Filler(Color.NONE);
            this.chessboard[i][4] = new Filler(Color.NONE);
            this.chessboard[i][5] = new Filler(Color.NONE);
        }
    }

    // Returns true if move is successful, false if move is invalid
    public boolean makeMove() {
        return true;
    }

    // Checks if either king is in check
    private boolean updateCheck() {
        return true;
    }

    public Piece[][] getChessboardArray() {
        return chessboard;
    }

    public void setChessboardArray(Piece[][] newBoard) {
        this.chessboard = newBoard;
    }
}
