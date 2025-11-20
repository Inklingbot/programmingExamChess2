package chess;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class KingMoveCalculator extends PieceMoveCalculator {


    @Override
    Collection<ChessMove> pieceMoves(ChessBoard board, ChessPiece piece, ChessPosition position) {
        Collection<ChessMove> moves = new ArrayList<>();
        int row = position.getRow();
        int col = position.getColumn();
        ChessGame.TeamColor color = board.getPiece(position).getTeamColor();

        //Check Up and Right First
        int checkRow = row + 1;
        int checkCol = col + 1;
            if (checkRow <= 8 && checkCol <= 8) {
                if (board.getPiece(new ChessPosition(checkRow, checkCol)) == null) {
                    moves.add(new ChessMove(position, new ChessPosition(checkRow, checkCol), null));
                }
                else if (board.getPiece(new ChessPosition(checkRow, checkCol)).getTeamColor() != color) {
                    moves.add(new ChessMove(position, new ChessPosition(checkRow, checkCol), null));
                }
            }


            //Check Right
        checkRow = row;
        checkCol = col + 1;
        if (checkCol <= 8) {
            if (board.getPiece(new ChessPosition(checkRow, checkCol)) == null) {
                moves.add(new ChessMove(position, new ChessPosition(checkRow, checkCol), null));
            }
            else if (board.getPiece(new ChessPosition(checkRow, checkCol)).getTeamColor() != color) {
                moves.add(new ChessMove(position, new ChessPosition(checkRow, checkCol), null));
            }
        }


        //Check Up
        checkRow = row + 1;
        checkCol = col;
        if (checkRow <= 8) {
            if (board.getPiece(new ChessPosition(checkRow, checkCol)) == null) {
                moves.add(new ChessMove(position, new ChessPosition(checkRow, checkCol), null));
            }
            else if (board.getPiece(new ChessPosition(checkRow, checkCol)).getTeamColor() != color) {
                moves.add(new ChessMove(position, new ChessPosition(checkRow, checkCol), null));
            }
        }


        //Check Left
        checkRow = row;
        checkCol = col - 1;
        if (checkCol > 0) {
            if (board.getPiece(new ChessPosition(checkRow, checkCol)) == null) {
                moves.add(new ChessMove(position, new ChessPosition(checkRow, checkCol), null));
            }
            else if (board.getPiece(new ChessPosition(checkRow, checkCol)).getTeamColor() != color) {
                moves.add(new ChessMove(position, new ChessPosition(checkRow, checkCol), null));
            }
        }


        //Check Left and Up
        checkRow = row + 1;
        checkCol = col - 1;
        if (checkRow <=8 && checkCol > 0) {
            if (board.getPiece(new ChessPosition(checkRow, checkCol)) == null) {
                moves.add(new ChessMove(position, new ChessPosition(checkRow, checkCol), null));
            }
            else if (board.getPiece(new ChessPosition(checkRow, checkCol)).getTeamColor() != color) {
                moves.add(new ChessMove(position, new ChessPosition(checkRow, checkCol), null));
            }
        }


        //Check Left and Down
        checkRow = row - 1;
        checkCol = col - 1;
        if (checkRow > 0 && checkCol > 0) {
            if (board.getPiece(new ChessPosition(checkRow, checkCol)) == null) {
                moves.add(new ChessMove(position, new ChessPosition(checkRow, checkCol), null));
            }
            else if (board.getPiece(new ChessPosition(checkRow, checkCol)).getTeamColor() != color) {
                moves.add(new ChessMove(position, new ChessPosition(checkRow, checkCol), null));
            }
        }


        //Check Right and Down
        checkRow = row - 1;
        checkCol = col + 1;
        if (checkRow > 0 && checkCol <= 8) {
            if (board.getPiece(new ChessPosition(checkRow, checkCol)) == null) {
                moves.add(new ChessMove(position, new ChessPosition(checkRow, checkCol), null));
            }
            else if (board.getPiece(new ChessPosition(checkRow, checkCol)).getTeamColor() != color) {
                moves.add(new ChessMove(position, new ChessPosition(checkRow, checkCol), null));
            }
        }


        //Check Down
        checkRow = row - 1;
        checkCol = col;

        if (checkRow > 0) {
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
