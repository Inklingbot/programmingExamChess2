package chess;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class QueenMoveCalculator extends PieceMoveCalculator {
    @Override
    Collection<ChessMove> pieceMoves(ChessBoard board, ChessPiece piece, ChessPosition position) {
        Collection<ChessMove> moves = new ArrayList<>();

        moves.addAll(BishopMoveCalculator.bishopLogic(board, piece, position.getRow(), position.getColumn(),
                board.getPiece(position).getTeamColor(), position));
        moves.addAll(RookMoveCalculator.rookLogic(board, piece, position.getRow(), position.getColumn(),
                board.getPiece(position).getTeamColor(), position));

        return moves;
    }
}
