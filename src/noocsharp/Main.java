package noocsharp;

import noocsharp.piece.*;
import noocsharp.utilities.Color;
import noocsharp.utilities.Tuple;
import noocsharp.utilities.Utilities;

import java.util.ArrayList;


public class Main {

    public static void main(String[] args) {
        Chessboard board = new Chessboard(8, 8);
        King king = null;
        Rook rook = null;
        Knight knight = null;
        ArrayList<Piece> localPieces = board.pieces;

        for (Piece p : board.pieces) {
            if (p.pos.x == 4 && p.pos.y == 0) {
                king = (King) p;
            }

            if (p.pos.x == 6 && p.pos.y == 0) {
                knight = (Knight) p;
            }
        }
        /*
        board.makeMove(king.pos, new Tuple<Integer, Integer>(king.pos.x, king.pos.y+1));
        System.out.println(king.getInfluence(board.pieces, 8, 8));
        System.out.println(board.pieces);
        */
        knight.setPos(new Tuple<Integer, Integer>(3,2));
        System.out.println(knight.getInfluence(board.pieces, 8, 8));
    }
}
