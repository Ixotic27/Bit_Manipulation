public class BitManipulation {
    public static void main(String[] args) {
        System.out.println(getIthBit(5, 2));       // Get the 2nd bit of 5
        System.out.println(isEvenOrOdd(5));       // Check if 5 is even or odd
        System.out.println(setIthBit(10, 2));     // Set the 2nd bit of 10
        System.out.println(clearIthBit(10, 1));   // Clear the 1st bit of 10
        System.out.println(updateIthBit(10, 2, 1)); // Update the 2nd bit of 10 to 1
        System.out.println(clearLastIthBits(15, 2)); // Clear last 2 bits of 15
        System.out.println(clearRangeIthBits(10, 2, 4)); // Clear bits from 2 to 4 in 10
    }

    // Get the ith bit (0-based index)
    public static int getIthBit(int n, int i) {
        int bitmask = 1 << i;
        if ((n & bitmask) == 0) return 0;
        else return 1;
    }

    // Check if the number is even or odd
    public static String isEvenOrOdd(int n) {
        int bitmask = 1;
        if ((n & bitmask) == 1) return "Odd no.";
        else return "Even no.";
    }

    // Set the ith bit and return the new number
    public static int setIthBit(int n, int i) {
        int bitmask = 1 << i;
        n = n | bitmask;   // Set the ith bit
        return n;
    }

    // Clear the ith bit and return the new number
    public static int clearIthBit(int n, int i) {
        int bitmask = ~(1 << i);
        n = n & bitmask;   // Clear the ith bit
        return n;
    }

    // Update the ith bit with a new value
    public static int updateIthBit(int n, int i, int newBit) {
        n = clearIthBit(n, i);       // First, clear the existing bit
        // if (newBit == 0) return clearIthBit(n, i);
        // else return setIthBit(n, i);
        int bitmask = newBit << i;   // Shift new bit to the correct position
        return n | bitmask;
    }

    // Clear the last i bits of the number
    public static int clearLastIthBits(int n, int i) {
        int bitmask = (-1 << i); // int bitmask = ~0 << i;
        return n & bitmask;  // Clear last i bits
    }

    // Clear bits from position i to j
    public static int clearRangeIthBits(int n, int i, int j) {
        int a = ~0 << (j + 1);
        int b = (1 << i) - 1;
        int bitmask = a | b;
        return n & bitmask;  // Clear range i to j
    }
}
