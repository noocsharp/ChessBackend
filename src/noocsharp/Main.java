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
        Pawn pawn = null;
        ArrayList<Piece> localPieces = board.pieces;

        localPieces.add(new Pawn(Color.BLACK, new Tuple<>(0, 2)));
        localPieces.add(new Pawn(Color.BLACK, new Tuple<>(2, 2)));
        for (Piece p : board.pieces) {
            if (p.pos.x == 1 && p.pos.y == 1) {
                pawn = (Pawn) p;
            }
        }

        System.out.println(pawn.getInfluence(localPieces, 8, 8));

    }
}
