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
        ArrayList<Piece> localPieces = board.pieces;

        for (Piece p : board.pieces) {
            if (p.pos.x == 4 && p.pos.y == 0) {
                king = (King) p;
            }
            if (p.pos.x == 0 && p.pos.y == 7) {
                rook = (Rook) p;
            }
        }
        board.removePiece(new Tuple<Integer, Integer>(0, 6));
        board.removePiece(new Tuple<Integer, Integer>(0, 1));

        rook.setPos(new Tuple<Integer, Integer>(4, 5));

        for (int i = 1; i < board.WIDTH; i++) {
            board.removePiece(new Tuple<Integer, Integer>(i, 7));
        }
        /*
        board.makeMove(king.pos, new Tuple<Integer, Integer>(king.pos.x, king.pos.y+1));
        System.out.println(king.getInfluence(board.pieces, 8, 8));
        System.out.println(board.pieces);
        */
        System.out.println(rook.getInfluence(board.pieces, 8, 8));
    }
}
