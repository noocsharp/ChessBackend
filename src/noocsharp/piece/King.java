package noocsharp.piece;

import noocsharp.Chessboard;
import noocsharp.utilities.Color;
import noocsharp.utilities.Tuple;
import noocsharp.utilities.Utilities;

import java.util.ArrayList;
import java.util.HashSet;

/**
 * Created by nihal on 6/30/2017.
 */
public class King extends Piece{
    public King(Color color, Tuple<Integer, Integer> pos) {
        super(color, pos);
    }

    public HashSet<Tuple<Integer, Integer>> getInfluence(ArrayList<Piece> pieces, int width, int height) {
        return new HashSet<>();
    }
}
