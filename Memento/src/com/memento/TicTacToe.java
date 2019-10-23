package com.memento;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class TicTacToe implements Originator {
    private Scanner in;
    private String[] board;
    private String turn;
    private String winner;
    private boolean setTurn;
    private CareTaker careTaker;

    public TicTacToe() {
        in = new Scanner(System.in);
        board = new String[9];
        turn = "X";
        winner = null;
        setTurn = false;
        careTaker = new CareTaker();
    }

    public void letsPlay() {
        fillEmptyBoard();
        System.out.println("Welcome to two-player Tic Tac Toe");
        System.out.println("--------------------------------");
        printBoard();
        System.out.println("The player with \"X\"- symbol will play first. Enter a slot number to draw X in:");
        boardGame();
    }

    private void boardGame() {
        while (winner == null) {
            int numInput;
            try {
                numInput = in.nextInt();
                if (!(numInput > 0 && numInput <= 9)) {
                    System.out.println("Invalid input; re-enter slot number:");
                    continue;
                }
            } catch (InputMismatchException e) {
                System.out.println("Invalid input; re-enter slot number:");
                continue;
            }
            if (board[numInput - 1].equals(String.valueOf(numInput))) {
                board[numInput - 1] = turn;

                printBoard();
                askForCancel();

                winner = checkWinner();
            } else {
                System.out.println("Slot already taken; re-enter slot number:");
            }

        }
        if (winner.equalsIgnoreCase("dead heat")) {
            System.out.println("It's a dead heat! Thanks for playing.");
        } else {
            System.out.println("Congratulations! " + winner + "'s have won! Thanks for playing.");
        }
    }

    private String checkWinner() {
        for (int a = 0; a < 8; a++) {
            String line = null;
            switch (a) {
                case 0:
                    line = board[0] + board[1] + board[2];
                    break;
                case 1:
                    line = board[3] + board[4] + board[5];
                    break;
                case 2:
                    line = board[6] + board[7] + board[8];
                    break;
                case 3:
                    line = board[0] + board[3] + board[6];
                    break;
                case 4:
                    line = board[1] + board[4] + board[7];
                    break;
                case 5:
                    line = board[2] + board[5] + board[8];
                    break;
                case 6:
                    line = board[0] + board[4] + board[8];
                    break;
                case 7:
                    line = board[2] + board[4] + board[6];
                    break;
            }
            if (line.equals("XXX")) {
                return "X";
            } else if (line.equals("OOO")) {
                return "O";
            }
        }

        for (int a = 0; a < 9; a++) {
            if (Arrays.asList(board).contains(String.valueOf(a + 1))) {
                break;
            } else if (a == 8) return "dead heat";
        }
        save();
        if (setTurn) {
            setTurn = false;
        } else {
            if (turn.equals("X")) {
                turn = "O";
            } else {
                turn = "X";
            }
        }
        System.out.println(turn + "'s turn; enter a slot number to draw " + turn + " in:");
        return null;
    }

    private void askForCancel() {
        String askForCancelingTheMovement = "";
        int count = 0;
        for (int i = 0; i < board.length; i++) {
            if (board[i].equalsIgnoreCase("X")) {
                count += 1;
            }
        }
        if (count <= 1) {

        } else {
            System.out.println();
            while (true) {
                System.out.println("Do you want to cancel your last movement? Input: Y/N");
                try {
                    in.nextLine();
                    askForCancelingTheMovement = in.nextLine();
                    if (!askForCancelingTheMovement.equalsIgnoreCase("Y") && !askForCancelingTheMovement.equalsIgnoreCase("N")) {
                        System.out.println("Invalid input; re-enter your answer:");
                    } else {
                        if (askForCancelingTheMovement.equalsIgnoreCase("Y")) {
                            careTaker.undo();
                            setTurn = true;
                            printBoard();
                            break;
                        } else {
                            break;
                        }
                    }
                } catch (NoSuchElementException e) {
                    System.out.println("Invalid input; re-enter your answer:++");
                }
            }
        }
    }

    private void printBoard() {
        System.out.println("_____________");
        System.out.println("| " + board[0] + " | " + board[1] + " | " + board[2] + " |");
        System.out.println("|-----------|");
        System.out.println("| " + board[3] + " | " + board[4] + " | " + board[5] + " |");
        System.out.println("|-----------|");
        System.out.println("| " + board[6] + " | " + board[7] + " | " + board[8] + " |");
        System.out.println("¯¯¯¯¯¯¯¯¯¯¯¯¯");
    }

    private void fillEmptyBoard() {
        for (int a = 0; a < 9; a++) {
            board[a] = String.valueOf(a + 1);
        }
    }

    public void setBoard(String[] board) {
        this.board = board;
    }

    @Override
    public Memento save() {
        return new GameMemento(this, board, careTaker);
    }
}
