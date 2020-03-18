package ChessGame;

import ChessGame.ChessPieces.ChessPieces;

public class ConsoleOutput {

    public static void printChessGameNotice() {
        System.out.println("체스 게임을 시작합니다.");
        System.out.println("> 게임 시작 : start");
        System.out.println("> 게임 종료 : end");
        System.out.println("> 게임 이동 : move source위치 target위치 - 예. move b2 b3");
    }

    public static void printChessBoard(ChessPieces chessPieces) {
        System.out.println(chessPieces.toString());
    }

    public static void printSamePositionErrorMessage() {
        System.out.println("같은 위치로 이동할 수 없습니다.");
    }

    public static void printNotYourTurnErrorMessage() {
        System.out.println("당신 차례가 아닙니다.");
    }
}
