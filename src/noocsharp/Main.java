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
        Knight knight = null;
        ArrayList<Piece> localPieces = board.pieces;

        for (Piece p : board.pieces) {
            if (p.pos.x == 1 && p.pos.y == 0) {
                knight = (Knight) p;
            }
        }
        System.out.println(knight.getInfluence(board.pieces, 8, 8));
    }
}
