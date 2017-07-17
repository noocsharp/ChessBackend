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
        Bishop bishop = null;

        for (Piece p : board.pieces) {
            if (p.pos.x == 4 && p.pos.y == 0) {
                king = (King) p;
            }

            if (p.pos.x == 2 && p.pos.y == 0) {
                bishop = (Bishop) p;
            }
        }

        board.removePiece(new Tuple<Integer, Integer>(4, 1));
        board.makeMove(king.pos, new Tuple<Integer, Integer>(king.pos.x, king.pos.y+1));
        System.out.println(king.getInfluence(board.pieces, 8, 8));
    }
}
