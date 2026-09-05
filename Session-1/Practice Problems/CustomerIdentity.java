public class CustomerIdentity {
    public static void main(String[] args) {
        String customerName = "Sunil";
        String reversed = reverseCustomerName(customerName);
        
        System.out.println("Original Name: " + customerName);
        System.out.println("Reversed Name: " + reversed);
    }

    public static String reverseCustomerName(String customerName) {
        char[] characters = customerName.toCharArray();
        char[] reversedChars = new char[characters.length];
        
        int j = 0;
        for (int i = characters.length - 1; i >= 0; i--) {
            reversedChars[j] = characters[i];
            j++;
        }
        
        return new String(reversedChars);
    }
}