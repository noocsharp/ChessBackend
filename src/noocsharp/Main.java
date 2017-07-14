package noocsharp;

import noocsharp.piece.*;
import noocsharp.utilities.Color;
import noocsharp.utilities.Tuple;
import noocsharp.utilities.Utilities;

import java.util.ArrayList;


public class Main {

    public static void main(String[] args) {
        Chessboard board = new Chessboard(8, 8);
        Pawn pawn = null;
        Queen queen = null;
        ArrayList<Piece> localPieces = board.pieces;

        board.removePiece(new Tuple<>(1, 1));
        board.removePiece(new Tuple<>(3, 1));
        for (Piece p : board.pieces) {
            if (p.pos.x == 3 && p.pos.y == 0) {
                queen = (Queen) p;
            }
        }

        System.out.println(queen.getInfluence(board.pieces, 8, 8));
    }
}
