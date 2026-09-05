public class TrafficSignalAnalyzer {
    public static void findLongestStreak(String signalLog) {
        if (signalLog == null || signalLog.isEmpty()) {
            System.out.println("Signal log is empty.");
            return;
        }

        char longestChar = signalLog.charAt(0);
        int maxStreak = 1;

        char currentChar = signalLog.charAt(0);
        int currentStreak = 1;

        for (int i = 1; i < signalLog.length(); i++) {
            if (signalLog.charAt(i) == currentChar) {
                currentStreak++;
            } else {
                currentChar = signalLog.charAt(i);
                currentStreak = 1;
            }

            if (currentStreak > maxStreak) {
                maxStreak = currentStreak;
                longestChar = currentChar;
            }
        }

        System.out.println("Longest Streak: '" + longestChar + "' repeated " + maxStreak + " times");
    }

    public static void main(String[] args) {
        findLongestStreak("RRGGGYRR"); // Output: Longest Streak: 'G' repeated 3 times
        findLongestStreak("RRRRYYGG"); // Output: Longest Streak: 'R' repeated 4 times
    }
}