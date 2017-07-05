package noocsharp.piece;

import noocsharp.Chessboard;
import noocsharp.utilities.Color;
import noocsharp.utilities.Tuple;

import java.util.ArrayList;

/**
 * Created by nihal on 6/30/2017.
 */
public class Piece {

    public boolean hasMoved;
    public Color color;

    public Piece(Color color) {
        this.hasMoved = false;
        this.color = color;

    }
}
