/*
Ханойские башни
*/

public class Solution {
    public static void main(String[] args) {
        int numRings = 3;
        moveRing('A', 'B', 'C', numRings);
    }

    public static void moveRing(char a, char b, char c, int numRings) {
        if (numRings > 1) {
            moveRing(a, c, b, numRings - 1);
            System.out.println("from " + a + " to " + b);
            moveRing(c, b, a, numRings - 1);
        } else {
            System.out.println("from " + a + " to " + b);
        }
    }
}