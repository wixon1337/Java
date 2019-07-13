import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(amazonCheckmate("a3","e4")));
    }

    public static int[] amazonCheckmate(String king, String amazon) {
        char[][] board = new char[8][8];
        int[] result = new int[4];
        int ki = 8-Integer.parseInt(king.substring(1));
        int kj = king.charAt(0) - 97;
        int ai = 8-Integer.parseInt(amazon.substring(1));
        int aj = amazon.charAt(0) - 97;
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                if (ki-1 <= i && ki+1 >= i && kj-1 <= j && kj+1 >= j) {
                    board[i][j] = ' ';
                } else if (i == ai || j == aj) {
                    board[i][j] = '+';
                } else if (Math.abs(ai-i) == Math.abs(aj-j)) {
                    board[i][j] = '+';
                } else if (Math.abs(Math.abs(ai-i)-Math.abs(aj-j)) == 1 && Math.abs(ai-i)<3 && Math.abs(aj-j)<3) {
                    board[i][j] = '+';
                } else {
                    board[i][j] = '0';
                }
            }
        }

        board[ki][kj] = 'k';
        board[ai][aj] = 'a';

        boolean aProtected = true;
        if (((ki-1 >= 0 && (board[ki-1][kj] != 'a' )) || ki == 0)
                && ((ki+1 < board.length && (board[ki+1][kj] !='a' )) || ki == board.length-1)
                && ((kj-1 >= 0 && (board[ki][kj-1] != 'a' )) || kj == 0)
                && ((kj+1 < board[ki].length && (board[ki][kj+1] != 'a')) || kj == board[ki].length-1)
                && ((ki-1 >= 0 && kj-1 >= 0 && board[ki-1][kj-1] != 'a') || ki == 0 || kj == 0)
                && ((ki-1 >= 0 && kj+1 < board[ki].length && board[ki-1][kj+1] != 'a') || ki == 0 || kj == board[ki].length-1)
                && ((ki+1 < board.length && kj-1 >= 0 && board[ki+1][kj-1] != 'a') || ki == board.length-1 || kj == 0)
                && ((ki+1 < board.length && kj+1 < board[ki].length && board[ki+1][kj+1] != 'a') || ki == board.length-1 || kj == board.length-1)
        ) {
            aProtected = false;
        }


        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                if (board[i][j] == '+' && aProtected) {
                    if (((i-1 >= 0 && (board[i-1][j] != '0' )) || i == 0)
                            && ((i+1 < board.length && (board[i+1][j] !='0' )) || i == board.length-1)
                            && ((j-1 >= 0 && (board[i][j-1] != '0' )) || j == 0)
                            && ((j+1 < board[i].length && (board[i][j+1] != '0')) || j == board[i].length-1)
                            && ((i-1 >= 0 && j-1 >= 0 && board[i-1][j-1] != '0') || i == 0 || j == 0)
                            && ((i-1 >= 0 && j+1 < board[i].length && board[i-1][j+1] != '0') || i == 0 || j == board[i].length-1)
                            && ((i+1 < board.length && j-1 >= 0 && board[i+1][j-1] != '0') || i == board.length-1 || j == 0)
                            && ((i+1 < board.length && j+1 < board[i].length && board[i+1][j+1] != '0') || i == board.length-1 || j == board.length-1)
                    ) {
                        board[i][j] = 'x';
                    }
                } else if (board[i][j] == '+') {
                    if (((i-1 >= 0 && (board[i-1][j] != '0' && board[i-1][j] != 'a')) || i == 0)
                            && ((i+1 < board.length && (board[i+1][j] !='0' && board[i+1][j] !='a')) || i == board.length-1)
                            && ((j-1 >= 0 && (board[i][j-1] != '0' && board[i][j-1] != 'a' )) || j == 0)
                            && ((j+1 < board[i].length && (board[i][j+1] != '0' && board[i][j+1] != 'a')) || j == board[i].length-1)
                            && ((i-1 >= 0 && j-1 >= 0 && board[i-1][j-1] != '0' && board[i-1][j-1] != 'a') || i == 0 || j == 0)
                            && ((i-1 >= 0 && j+1 < board[i].length && board[i-1][j+1] != '0' && board[i-1][j+1] != 'a') || i == 0 || j == board[i].length-1)
                            && ((i+1 < board.length && j-1 >= 0 && board[i+1][j-1] != '0' && board[i+1][j-1] != 'a') || i == board.length-1 || j == 0)
                            && ((i+1 < board.length && j+1 < board[i].length && board[i+1][j+1] != '0' && board[i+1][j+1] != 'a') || i == board.length-1 || j == board.length-1)
                    ) {
                        board[i][j] = 'x';
                    }
                } else if (board[i][j] == 'a') {
                    if (ki == ai && kj < aj) {
                        for (int k = kj-2; k >= 0; k--) {
                            board[ki][k] = '0';
                        }
                    } else if (ki == ai && kj > aj) {
                        for (int k = kj+2; k < board[i].length; k++) {
                            board[ki][k] = '0';
                        }
                    } else if (ki < ai && kj == aj) {
                        for (int k = ki-2; k >= 0; k--) {
                            board[k][kj] = '0';
                        }
                    } else if (ki > ai && kj == aj) {
                        for (int k = ki+2; k < board.length; k++) {
                            board[k][kj] = '0';
                        }
                    } else if (Math.abs(ki-ai) == Math.abs(kj-aj)) {
                        if (ki < ai && kj < aj) {
                            int l = kj - 2;
                            for (int k = ki-2; k >= 0; k--) {
                                if (l < 0) {
                                    break;
                                }
                                board[k][l] = '0';
                                l--;
                            }
                        } else if (ki < ai && kj > aj) {
                            int l = kj + 2;
                            for (int k = ki-2; k >= 0; k--) {
                                if (l >= board[i].length) {
                                    break;
                                }
                                board[k][l] = '0';
                                l++;
                            }
                        } else if (ki > ai && kj > aj) {
                            int l = kj + 2;
                            for (int k = ki+2; k < board.length; k++) {
                                if (l >= board[i].length) {
                                    break;
                                }
                                board[k][l] = '0';
                                l++;
                            }
                        } else if (ki > ai && kj < aj) {
                            int l = kj - 2;
                            for (int k = ki+2; k < board.length; k++) {
                                if (l < 0) {
                                    break;
                                }
                                board[k][l] = '0';
                                l--;
                            }
                        }
                    }
                }
            }
        }

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                if (board[i][j] == '0') {
                    if (((i-1 >= 0 && (board[i-1][j] != '0' )) || i == 0)
                            && ((i+1 < board.length && (board[i+1][j] !='0' )) || i == board.length-1)
                            && ((j-1 >= 0 && (board[i][j-1] != '0' )) || j == 0)
                            && ((j+1 < board[i].length && (board[i][j+1] != '0')) || j == board[i].length-1)
                            && ((i-1 >= 0 && j-1 >= 0 && board[i-1][j-1] != '0') || i == 0 || j == 0)
                            && ((i-1 >= 0 && j+1 < board[i].length && board[i-1][j+1] != '0') || i == 0 || j == board[i].length-1)
                            && ((i+1 < board.length && j-1 >= 0 && board[i+1][j-1] != '0') || i == board.length-1 || j == 0)
                            && ((i+1 < board.length && j+1 < board[i].length && board[i+1][j+1] != '0') || i == board.length-1 || j == board.length-1)
                    ) {
                        board[i][j] = 's';
                    }
                }
            }
        }

        print2d(board);

        int checkmate = 0;
        int check = 0;
        int stale = 0;
        int safe = 0;

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                if (board[i][j] == '+') {
                    check++;
                } else if (board[i][j] == '0') {
                    safe++;
                } else if (board[i][j] == 'x') {
                    checkmate++;
                } else if (board[i][j] == 's') {
                    stale++;
                }
            }
        }

        result[0] = checkmate;
        result[1] = check;
        result[2] = stale;
        result[3] = safe;

        return result;
    }

    public static void print2d(char[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
}
