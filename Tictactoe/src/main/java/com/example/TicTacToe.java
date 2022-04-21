package com.example;


public class TicTacToe {
	
	public static Evaluation evaluateBoard(String board) {
		//convert all inputs into lowercase
		board = board.toLowerCase();
		//find the length of the input
		int len=board.length();
		//check any high amount of inputs
		if(len != 9) {
            return Evaluation.InvalidInput;
    }
		
    int xCount = 0;
    int oCount = 0;
    //calculate the number of 'x's and 'o's
    for(int i = 0; i < len; i++) {
            if(board.charAt(i) == 'x') {
                    xCount++;
            }
            if(board.charAt(i) == 'o') {
                    oCount++;
            }
    }
    if(Math.abs(xCount - oCount) >= 2) {
            return Evaluation.UnreachableState;
    }
    if(xCount==oCount) {
        return Evaluation.UnreachableState;
}
    if(checkWinner('x', board)) {
            return Evaluation.Xwins;
    }
    else if(checkWinner('o', board)) {
            return Evaluation.Owins;
    }
    else {
            return Evaluation.NoWinner;
    }
}

public static boolean checkWinner(char check, String board) {
    if(board.charAt(0) == check && board.charAt(1) == check && board.charAt(2) == check) {
            return true;
    }
    if(board.charAt(3) == check && board.charAt(4) == check && board.charAt(5) == check) {
            return true;
    }
    if(board.charAt(6) == check && board.charAt(7) == check && board.charAt(8) == check) {
            return true;
    }
    if(board.charAt(0) == check && board.charAt(3) == check && board.charAt(6) == check) {
            return true;
    }
    if(board.charAt(1) == check && board.charAt(4) == check && board.charAt(7) == check) {
            return true;
    }
    if(board.charAt(2) == check && board.charAt(5) == check && board.charAt(8) == check) {
            return true;
    }
    if(board.charAt(0) == check && board.charAt(4) == check && board.charAt(8) == check) {
            return true;
    }
    return board.charAt(2) == check && board.charAt(4) == check && board.charAt(6) == check;
}
	}
