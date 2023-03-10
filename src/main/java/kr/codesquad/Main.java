package kr.codesquad;

import java.io.IOException;

public class Main {
    static OutputView outputView = new OutputView();
    static InputView inputView = new InputView();
    public static void main(String[] args) throws IOException {
        int countOfUser = getCountOfUser();
        int heightOfLadder = getHeightOfLadder();
        Ladder ladder = new Ladder(countOfUser, heightOfLadder);
        StringBuilder sb = ladder.makeLadder();
        outputView.printLadder(sb);
    }
    public static int getCountOfUser() {
        outputView.inputPeople();
        return Integer.parseInt(inputView.getInput());
    }
    public static int getHeightOfLadder() {
        outputView.inputLadder();
        return Integer.parseInt(inputView.getInput());
    }
}
