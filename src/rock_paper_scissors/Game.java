package rock_paper_scissors;

import java.util.Random;

public class Game {
    private User user;
    private StartWindow startWindow;
    private GameWindow gameWindow;
    private int computerScore;

    public void start() {
        startWindow = new StartWindow(this);
        computerScore = 0;
    }

    public void setName(String name) {
        user = new User(name);
        System.out.println(name + " received by start window");
        // kill the start window and display the game window
        startWindow.dispose();
        gameWindow = new GameWindow(this);
    }

    // 0 R, 1 S, 2 P
    public void play(int selection) {
        String [] options = {"Rock", "Scissors", "Paper"};
        // Set computer selection
        Random rand = new Random();
        int computerSelection = rand.nextInt(3);
        switch (computerSelection) {
            case 0:
                if(selection == 1) {
                    computerScore++;
                }
                else if(selection == 2) {
                    user.setScore(user.getScore() + 1);
                }
                break;
            case 1:
                if(selection == 2) {
                    computerScore++;
                }
                else if(selection == 0) {
                    user.setScore(user.getScore() + 1);
                }
                break;
            case 2:
                if(selection == 0) {
                    computerScore++;
                }
                else if(selection == 1) {
                    user.setScore(user.getScore() + 1);
                }
                break;
        }

        System.out.println(computerSelection + " computer score is " + computerScore);
        gameWindow.setScore("Score: User " + user.getScore() + " - Computer " + computerScore );
        gameWindow.setStatus("Computer plays " + options[computerSelection]);

        checkWinner();
    }

    public void checkWinner() {
        if (computerScore == 10) {
            gameWindow.setStatus("COMPUTER WINS!");
            gameWindow.winnerFound();
        }
        else if (user.getScore() == 10) {
            gameWindow.setStatus(user.getName() + " WINS!");
            gameWindow.winnerFound();
        }
    }
}
