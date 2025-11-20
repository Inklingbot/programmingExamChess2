package chess;

import java.util.Collection;

public abstract class PieceMoveCalculator {


    public static PieceMoveCalculator create(ChessPiece piece) {
        return switch(piece.getPieceType()) {
            case KING -> new KingMoveCalculator();
            case PAWN -> new PawnMoveCalculator();
            case BISHOP -> new BishopMoveCalculator();
            case QUEEN -> new QueenMoveCalculator();
            case ROOK -> new RookMoveCalculator();
            case KNIGHT -> new KnightMoveCalculator();
        };
    }

    abstract Collection<ChessMove> pieceMoves(ChessBoard board, ChessPiece piece, ChessPosition position);


}
