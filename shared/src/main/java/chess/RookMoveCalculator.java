package chess;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class RookMoveCalculator extends PieceMoveCalculator {
    @Override
    Collection<ChessMove> pieceMoves(ChessBoard board, ChessPiece piece, ChessPosition position) {
        int row = position.getRow();
        int col = position.getColumn();
        ChessGame.TeamColor color = piece.getTeamColor();
        return rookLogic(board, piece, row, col, color, position);
    }

    public static Collection<ChessMove> rookLogic(ChessBoard board, ChessPiece piece, int row, int col, ChessGame.TeamColor color, ChessPosition position) {
        Collection<ChessMove> moves = new ArrayList<>();

        //Check Up
        int checkRow = row;
        int checkCol = col + 1;

        while(checkRow <= 8 && checkCol <= 8) {
            if (board.getPiece(new ChessPosition(checkRow, checkCol)) == null) {
                moves.add(new ChessMove(position, new ChessPosition(checkRow, checkCol), null));
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

        //Then, check Left
        checkRow = row + 1;
        checkCol = col;

        while(checkRow <= 8 && checkCol > 0) {
            if (board.getPiece(new ChessPosition(checkRow, checkCol)) == null) {
                moves.add(new ChessMove(position, new ChessPosition(checkRow, checkCol), null));
                checkRow++;
            }
            else if (board.getPiece(new ChessPosition(checkRow, checkCol)).getTeamColor() != color) {
                moves.add(new ChessMove(position, new ChessPosition(checkRow, checkCol), null));
                break;
            }
            else {
                break;
            }
        }

        //Then, check Down
        checkRow = row - 1;
        checkCol = col;

        while(checkRow > 0 && checkCol > 0) {
            if (board.getPiece(new ChessPosition(checkRow, checkCol)) == null) {
                moves.add(new ChessMove(position, new ChessPosition(checkRow, checkCol), null));
                checkRow--;
            }
            else if (board.getPiece(new ChessPosition(checkRow, checkCol)).getTeamColor() != color) {
                moves.add(new ChessMove(position, new ChessPosition(checkRow, checkCol), null));
                break;
            }
            else {
                break;
            }
        }

        //Last, check Left
        checkRow = row;
        checkCol = col - 1;

        while(checkRow > 0 && checkCol > 0) {
            if (board.getPiece(new ChessPosition(checkRow, checkCol)) == null) {
                moves.add(new ChessMove(position, new ChessPosition(checkRow, checkCol), null));
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

        return moves;
    }
}
