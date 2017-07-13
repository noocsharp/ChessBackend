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
        Bishop bishop = null;
        ArrayList<Piece> localPieces = board.pieces;

        board.removePiece(new Tuple<>(1, 1));
        board.removePiece(new Tuple<>(3, 1));
        for (Piece p : board.pieces) {
            if (p.pos.x == 2 && p.pos.y == 0) {
                bishop = (Bishop) p;
            }
        }

        System.out.println(bishop.getInfluence(board.pieces, 8, 8));
    }
}
