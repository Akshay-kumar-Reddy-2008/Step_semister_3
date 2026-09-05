import java.util.Random;

public class RockPaperScissors {
    public static void main(String[] args) {
        String[] moves = {"Rock", "Paper", "Scissors"};
        Random random = new Random();
        
        int wins = 0, losses = 0, draws = 0;
        int totalRounds = 5;
        
        System.out.println("--- Rock-Paper-Scissors Arcade ---");
        
        for (int i = 1; i <= totalRounds; i++) {
            String playerMove = moves[random.nextInt(3)]; // Simulating player input for demo
            String computerMove = moves[random.nextInt(3)];
            
            String result = playRound(playerMove, computerMove);
            
            if (result.equals("Player Wins")) wins++;
            else if (result.equals("Computer Wins")) losses++;
            else draws++;
            
            System.out.printf("Round %d | Player: %s, Computer: %s | %s%n", 
                              i, playerMove, computerMove, result);
        }
        
        double winPercentage = ((double) wins / totalRounds) * 100;
        System.out.printf("%nFinal Summary (after %d rounds) | Wins: %d | Losses: %d | Draws: %d | Win %% = %.1f%%%n", 
                          totalRounds, wins, losses, draws, winPercentage);
    }

    public static String playRound(String playerMove, String computerMove) {
        if (playerMove.equals(computerMove)) {
            return "Draw";
        }
        if ((playerMove.equals("Rock") && computerMove.equals("Scissors")) ||
            (playerMove.equals("Paper") && computerMove.equals("Rock")) ||
            (playerMove.equals("Scissors") && computerMove.equals("Paper"))) {
            return "Player Wins";
        }
        return "Computer Wins";
    }
}