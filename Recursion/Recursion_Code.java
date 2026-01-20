package Recursion;

class Recursion{
    void printNumbers(int n) {
        if (n == 0) return ;        // base case
        printNumbers(n - 1);       // smaller problem
        System.out.println(n);     // work
    }
}
public class Recursion_Code {
    public static void main(String[] args) {
        Recursion obj = new Recursion();
        obj.printNumbers(10);
    }
}
