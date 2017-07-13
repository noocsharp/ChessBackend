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
        Rook rook = null;
        ArrayList<Piece> localPieces = board.pieces;

        board.removePiece(new Tuple<>(0, 1));
        for (Piece p : board.pieces) {
            if (p.pos.x == 0 && p.pos.y == 0) {
                rook = (Rook) p;
            }
        }

        System.out.println(rook.getInfluence(board.pieces, 8, 8));
    }
}
