package chess;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class KnightMoveCalculator extends PieceMoveCalculator {
    @Override
    Collection<ChessMove> pieceMoves(ChessBoard board, ChessPiece piece, ChessPosition position) {
        Collection<ChessMove> moves = new ArrayList<>();
        int row = position.getRow();
        int col = position.getColumn();
        ChessGame.TeamColor color = board.getPiece(position).getTeamColor();

        //Check  1 Up and 2 Right First
        int checkRow = row + 1;
        int checkCol = col + 2;
        if (checkRow <= 8 && checkCol <= 8) {
            if (board.getPiece(new ChessPosition(checkRow, checkCol)) == null) {
                moves.add(new ChessMove(position, new ChessPosition(checkRow, checkCol), null));
            }
            else if (board.getPiece(new ChessPosition(checkRow, checkCol)).getTeamColor() != color) {
                moves.add(new ChessMove(position, new ChessPosition(checkRow, checkCol), null));
            }
        }


        //Check 1 Down 2 Right
        checkRow = row - 1;
        checkCol = col + 2;
        if (checkCol <= 8 && checkRow > 0) {
            if (board.getPiece(new ChessPosition(checkRow, checkCol)) == null) {
                moves.add(new ChessMove(position, new ChessPosition(checkRow, checkCol), null));
            }
            else if (board.getPiece(new ChessPosition(checkRow, checkCol)).getTeamColor() != color) {
                moves.add(new ChessMove(position, new ChessPosition(checkRow, checkCol), null));
            }
        }


        //Check 2 Up 1 Right
        checkRow = row + 2;
        checkCol = col + 1;
        if (checkRow <= 8 && checkCol <=8) {
            if (board.getPiece(new ChessPosition(checkRow, checkCol)) == null) {
                moves.add(new ChessMove(position, new ChessPosition(checkRow, checkCol), null));
            }
            else if (board.getPiece(new ChessPosition(checkRow, checkCol)).getTeamColor() != color) {
                moves.add(new ChessMove(position, new ChessPosition(checkRow, checkCol), null));
            }
        }


        //Check 2 Down 1 Right
        checkRow = row - 2;
        checkCol = col + 1;
        if (checkCol <= 8 && checkRow > 0) {
            if (board.getPiece(new ChessPosition(checkRow, checkCol)) == null) {
                moves.add(new ChessMove(position, new ChessPosition(checkRow, checkCol), null));
            }
            else if (board.getPiece(new ChessPosition(checkRow, checkCol)).getTeamColor() != color) {
                moves.add(new ChessMove(position, new ChessPosition(checkRow, checkCol), null));
            }
        }


        //Check 1 Left and 2 Up
        checkRow = row + 2;
        checkCol = col - 1;
        if (checkRow <=8 && checkCol > 0) {
            if (board.getPiece(new ChessPosition(checkRow, checkCol)) == null) {
                moves.add(new ChessMove(position, new ChessPosition(checkRow, checkCol), null));
            }
            else if (board.getPiece(new ChessPosition(checkRow, checkCol)).getTeamColor() != color) {
                moves.add(new ChessMove(position, new ChessPosition(checkRow, checkCol), null));
            }
        }


        //Check 2 Left and 1 Up
        checkRow = row + 1;
        checkCol = col - 2;
        if (checkRow <= 8 && checkCol > 0) {
            if (board.getPiece(new ChessPosition(checkRow, checkCol)) == null) {
                moves.add(new ChessMove(position, new ChessPosition(checkRow, checkCol), null));
            }
            else if (board.getPiece(new ChessPosition(checkRow, checkCol)).getTeamColor() != color) {
                moves.add(new ChessMove(position, new ChessPosition(checkRow, checkCol), null));
            }
        }


        //Check 2 Left and 1 Down
        checkRow = row - 1;
        checkCol = col - 2;
        if (checkRow > 0 && checkCol > 0) {
            if (board.getPiece(new ChessPosition(checkRow, checkCol)) == null) {
                moves.add(new ChessMove(position, new ChessPosition(checkRow, checkCol), null));
            }
            else if (board.getPiece(new ChessPosition(checkRow, checkCol)).getTeamColor() != color) {
                moves.add(new ChessMove(position, new ChessPosition(checkRow, checkCol), null));
            }
        }


        //Check 1 Left and 2 Down
        checkRow = row - 2;
        checkCol = col - 1;

        if (checkRow > 0 && checkCol > 0) {
            if (board.getPiece(new ChessPosition(checkRow, checkCol)) == null) {
                moves.add(new ChessMove(position, new ChessPosition(checkRow, checkCol), null));
            }
            else if (board.getPiece(new ChessPosition(checkRow, checkCol)).getTeamColor() != color) {
                moves.add(new ChessMove(position, new ChessPosition(checkRow, checkCol), null));
            }
        }


        return moves;
    }
}
