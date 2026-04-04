//Question 1: Calculate even or odd number with different methods


public class Que1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // Method 1: Using modulus operator
        if (number % 2 == 0) {
            System.out.println(number + " is even.");
        } else {
            System.out.println(number + " is odd.");
        }

        // Method 2: Using bitwise operator
        if ((number & 1) == 0) {
            System.out.println(number + " is even.");
        } else {
            System.out.println(number + " is odd.");
        }

        // Method 3: Using ternary operator
        String result = (number % 2 == 0) ? "even" : "odd";
        System.out.println(number + " is " + result + ".");
    }
}
