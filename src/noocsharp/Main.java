package noocsharp;

import noocsharp.piece.Bishop;
import noocsharp.piece.Filler;
import noocsharp.piece.Pawn;
import noocsharp.piece.Piece;
import noocsharp.utilities.Color;
import noocsharp.utilities.Tuple;
import noocsharp.utilities.Utilities;

import java.util.ArrayList;


public class Main {

    public static void main(String[] args) {
        Chessboard board = new Chessboard(8, 8);
        Piece[][] testBoard = board.getChessboardArray();
        testBoard[4][1] = new Filler(Color.NONE);
        testBoard[7][4] = new Bishop(Color.BLACK);
        board.setChessboardArray(testBoard);
        ArrayList<Tuple<Integer, Integer>> influence = Utilities.getInfluence(board, new Tuple<>(4, 0));
        System.out.println(influence);
    }
}
