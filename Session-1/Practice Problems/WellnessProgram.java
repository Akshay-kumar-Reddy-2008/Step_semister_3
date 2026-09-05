public class WellnessProgram {
    public static void main(String[] args) {
        // Sample data for 5 people (for a fast demo)
        double[] heights = {1.75, 1.60, 1.82, 1.65, 1.90}; 
        double[] weights = {70.0, 90.0, 75.0, 45.0, 115.0};
        
        printWellnessReport(heights, weights);
    }

    public static String getBmiStatus(double bmi) {
        if (bmi < 18.5) return "Underweight";
        if (bmi <= 24.9) return "Normal";
        if (bmi <= 29.9) return "Overweight";
        return "Obese";
    }

    public static void printWellnessReport(double[] heights, double[] weights) {
        System.out.println("Person | Height (m) | Weight (kg) | BMI   | Status");
        System.out.println("------------------------------------------------------");
        for (int i = 0; i < heights.length; i++) {
            double bmi = weights[i] / (heights[i] * heights[i]);
            String status = getBmiStatus(bmi);
            System.out.printf("Person %d | %.2f m   | %.1f kg   | %.2f | %s%n", 
                              (i + 1), heights[i], weights[i], bmi, status);
        }
    }
}