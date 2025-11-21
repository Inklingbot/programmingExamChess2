package chess;

import java.util.*;

public class PawnMoveCalculator extends PieceMoveCalculator {
    @Override
    Collection<ChessMove> pieceMoves(ChessBoard board, ChessPiece piece, ChessPosition position) {
        Set<ChessMove> moves = new HashSet<>(Set.of());
        int row = position.getRow();
        int col = position.getColumn();
        ChessGame.TeamColor color = board.getPiece(position).getTeamColor();

        //Check  1 Up and 2 Right First

        //everything that happens to White
        if (color == ChessGame.TeamColor.WHITE) {
            //First move check
            if (row == 2) {
                ChessPosition checkingPosition = new ChessPosition(row + 1, col);
                if (board.getPiece(checkingPosition) == null) {
                    moves.add(new ChessMove(position, checkingPosition, null));
                    if (board.getPiece(new ChessPosition(row + 2, col)) == null) {
                        moves.add(new ChessMove(position, new ChessPosition(row + 2, col), null));
                    }
                }
            }

            //Check for potential Promote

            if (row + 1 == 8) {
                ChessPosition checkingPosition = new ChessPosition(row + 1, col);
                if (board.getPiece(checkingPosition) == null) {
                    moves.add(new ChessMove(position, checkingPosition, ChessPiece.PieceType.QUEEN));
                    moves.add(new ChessMove(position, checkingPosition, ChessPiece.PieceType.ROOK));
                    moves.add(new ChessMove(position, checkingPosition, ChessPiece.PieceType.BISHOP));
                    moves.add(new ChessMove(position, checkingPosition, ChessPiece.PieceType.KNIGHT));
                }
                checkingPosition = new ChessPosition(row + 1, col + 1);

                if (checkingPosition.getColumn() <= 8 && board.getPiece(checkingPosition) != null) {
                    if (board.getPiece(checkingPosition).getTeamColor() != color) {
                        moves.add(new ChessMove(position, checkingPosition, ChessPiece.PieceType.QUEEN));
                        moves.add(new ChessMove(position, checkingPosition, ChessPiece.PieceType.ROOK));
                        moves.add(new ChessMove(position, checkingPosition, ChessPiece.PieceType.BISHOP));
                        moves.add(new ChessMove(position, checkingPosition, ChessPiece.PieceType.KNIGHT));
                    }
                }
                checkingPosition = new ChessPosition(row + 1, col - 1);
                if (checkingPosition.getColumn() > 0 && board.getPiece(checkingPosition) != null) {
                    if (board.getPiece(checkingPosition).getTeamColor() != color) {
                        moves.add(new ChessMove(position, checkingPosition, ChessPiece.PieceType.QUEEN));
                        moves.add(new ChessMove(position, checkingPosition, ChessPiece.PieceType.ROOK));
                        moves.add(new ChessMove(position, checkingPosition, ChessPiece.PieceType.BISHOP));
                        moves.add(new ChessMove(position, checkingPosition, ChessPiece.PieceType.KNIGHT));
                    }
                }
            }
            else {
                //Check Left and Right
                ChessPosition checkingPosition = new ChessPosition(row + 1, col + 1);
                if (checkingPosition.getColumn() <= 8 && checkingPosition.getRow() <= 8) {
                    if (board.getPiece(checkingPosition) != null) {
                        if (board.getPiece(checkingPosition).getTeamColor() != color) {
                            moves.add(new ChessMove(position, checkingPosition, null));
                        }
                    }
                }

                checkingPosition = new ChessPosition(row + 1, col - 1);
                if (checkingPosition.getColumn() > 0 && checkingPosition.getRow() <= 8) {
                    if (board.getPiece(checkingPosition) != null) {
                        if (board.getPiece(checkingPosition).getTeamColor() != color) {
                            moves.add(new ChessMove(position, checkingPosition, null));
                        }
                    }
                }
                //Check in front
                checkingPosition = new ChessPosition(row + 1, col);
                if (board.getPiece(checkingPosition) == null) {
                        moves.add(new ChessMove(position, checkingPosition, null));

                }
            }


        }


        //everything that happens to Black
        if (color == ChessGame.TeamColor.BLACK) {
            //First move check
            if (row == 7) {
                ChessPosition checkingPosition = new ChessPosition(row - 1, col);
                if (board.getPiece(checkingPosition) == null) {
                    moves.add(new ChessMove(position, checkingPosition, null));
                    if (board.getPiece(new ChessPosition(row - 2, col)) == null) {
                        moves.add(new ChessMove(position, new ChessPosition(row - 2, col), null));
                    }
                }
            }

            //Check for potential Promote

            if (row - 1 == 1) {
                ChessPosition checkingPosition = new ChessPosition(row - 1, col);
                if (board.getPiece(checkingPosition) == null) {
                    moves.add(new ChessMove(position, checkingPosition, ChessPiece.PieceType.QUEEN));
                    moves.add(new ChessMove(position, checkingPosition, ChessPiece.PieceType.ROOK));
                    moves.add(new ChessMove(position, checkingPosition, ChessPiece.PieceType.BISHOP));
                    moves.add(new ChessMove(position, checkingPosition, ChessPiece.PieceType.KNIGHT));
                }
                checkingPosition = new ChessPosition(row - 1, col + 1);

                if (checkingPosition.getColumn() <= 8 && board.getPiece(checkingPosition) != null) {
                    if (board.getPiece(checkingPosition).getTeamColor() != color) {
                        moves.add(new ChessMove(position, checkingPosition, ChessPiece.PieceType.QUEEN));
                        moves.add(new ChessMove(position, checkingPosition, ChessPiece.PieceType.ROOK));
                        moves.add(new ChessMove(position, checkingPosition, ChessPiece.PieceType.BISHOP));
                        moves.add(new ChessMove(position, checkingPosition, ChessPiece.PieceType.KNIGHT));
                    }
                }
                checkingPosition = new ChessPosition(row - 1, col - 1);
                if (checkingPosition.getColumn() > 0 && board.getPiece(checkingPosition) != null) {
                    if (board.getPiece(checkingPosition).getTeamColor() != color) {
                        moves.add(new ChessMove(position, checkingPosition, ChessPiece.PieceType.QUEEN));
                        moves.add(new ChessMove(position, checkingPosition, ChessPiece.PieceType.ROOK));
                        moves.add(new ChessMove(position, checkingPosition, ChessPiece.PieceType.BISHOP));
                        moves.add(new ChessMove(position, checkingPosition, ChessPiece.PieceType.KNIGHT));
                    }
                }
            }
            else {
                //Check Left and Right
                ChessPosition checkingPosition = new ChessPosition(row - 1, col + 1);
                if (checkingPosition.getColumn() <= 8 && checkingPosition.getRow() > 0) {
                    if (board.getPiece(checkingPosition) != null) {
                        if (board.getPiece(checkingPosition).getTeamColor() != color) {
                            moves.add(new ChessMove(position, checkingPosition, null));
                        }
                    }
                }

                checkingPosition = new ChessPosition(row - 1, col - 1);
                if (checkingPosition.getColumn() > 0&& checkingPosition.getRow() > 0) {
                    if (board.getPiece(checkingPosition) != null) {
                        if (board.getPiece(checkingPosition).getTeamColor() != color) {
                            moves.add(new ChessMove(position, checkingPosition, null));
                        }
                    }
                }
                //Check in front
                checkingPosition = new ChessPosition(row - 1, col);
                if (board.getPiece(checkingPosition) == null) {
                    moves.add(new ChessMove(position, checkingPosition, null));

                }
            }


        }

        return moves;
    }
}
