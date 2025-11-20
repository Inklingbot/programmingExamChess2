package chess;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class BishopMoveCalculator extends PieceMoveCalculator {
    @Override
    Collection<ChessMove> pieceMoves(ChessBoard board, ChessPiece piece, ChessPosition position) {
        int row = position.getRow();
        int col = position.getColumn();
        ChessGame.TeamColor color = piece.getTeamColor();
        return bishopLogic(board, piece, row, col, color, position);
    }

    public static Collection<ChessMove> bishopLogic(ChessBoard board, ChessPiece piece, int row, int col, ChessGame.TeamColor color, ChessPosition position) {
        Collection<ChessMove> moves = new ArrayList<>();

        //Check Up and Right First
        int checkRow = row + 1;
        int checkCol = col + 1;

        while(checkRow <= 8 && checkCol <= 8) {
            if (board.getPiece(new ChessPosition(checkRow, checkCol)) == null) {
                moves.add(new ChessMove(position, new ChessPosition(checkRow, checkCol), null));
                checkRow++;
                checkCol++;
            }
            else if (board.getPiece(new ChessPosition(checkRow, checkCol)).getTeamColor() != color) {
                moves.add(new ChessMove(position, new ChessPosition(checkRow, checkCol), null));
                break;
            }
            else {
                break;
            }
        }

        //Then, check Up and Left
        checkRow = row + 1;
        checkCol = col - 1;

        while(checkRow <= 8 && checkCol > 0) {
            if (board.getPiece(new ChessPosition(checkRow, checkCol)) == null) {
                moves.add(new ChessMove(position, new ChessPosition(checkRow, checkCol), null));
                checkRow++;
                checkCol--;
            }
            else if (board.getPiece(new ChessPosition(checkRow, checkCol)).getTeamColor() != color) {
                moves.add(new ChessMove(position, new ChessPosition(checkRow, checkCol), null));
                break;
            }
            else {
                break;
            }
        }

        //Then, check Down and Left
        checkRow = row - 1;
        checkCol = col - 1;

        while(checkRow > 0 && checkCol > 0) {
            if (board.getPiece(new ChessPosition(checkRow, checkCol)) == null) {
                moves.add(new ChessMove(position, new ChessPosition(checkRow, checkCol), null));
                checkRow--;
                checkCol--;
            }
            else if (board.getPiece(new ChessPosition(checkRow, checkCol)).getTeamColor() != color) {
                moves.add(new ChessMove(position, new ChessPosition(checkRow, checkCol), null));
                break;
            }
            else {
                break;
            }
        }

        //Last, check Down and Right
        checkRow = row - 1;
        checkCol = col + 1;

        while(checkRow > 0 && checkCol <= 8) {
            if (board.getPiece(new ChessPosition(checkRow, checkCol)) == null) {
                moves.add(new ChessMove(position, new ChessPosition(checkRow, checkCol), null));
                checkRow--;
                checkCol++;
            }
            else if (board.getPiece(new ChessPosition(checkRow, checkCol)).getTeamColor() != color) {
                moves.add(new ChessMove(position, new ChessPosition(checkRow, checkCol), null));
                break;
            }
            else {
                break;
            }
        }

        return moves;
    }
}
