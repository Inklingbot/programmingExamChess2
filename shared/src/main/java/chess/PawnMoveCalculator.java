package chess;

import java.util.Collection;
import java.util.List;

public class PawnMoveCalculator extends PieceMoveCalculator {
    @Override
    Collection<ChessMove> pieceMoves(ChessBoard board, ChessPiece piece, ChessPosition position) {
        return List.of();
    }
}
