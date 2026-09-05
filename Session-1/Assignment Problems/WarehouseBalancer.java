public class WarehouseBalancer {

    public static void analyzeInventory(int[] sectionA, int[] sectionB) {
        int totalA = 0;
        int totalB = 0;

        for (int val : sectionA) {
            totalA += val;
        }

        for (int val : sectionB) {
            totalB += val;
        }

        String status = (totalA == totalB) ? "Balanced" : "Not Balanced";

        System.out.println(status);
    }

    public static void main(String[] args) {
        int[] sectionA = {10, 20, 30};
        int[] sectionB = {15, 25, 20};

        analyzeInventory(sectionA, sectionB);
    }
}