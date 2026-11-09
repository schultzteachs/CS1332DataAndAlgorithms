public class Main {
    public static void main(String[] args) {
        int count = 0;
        helper(count);
        System.out.print(count);
        //Java is a pass by value langauge and therfore the value is passed, changed, and discarded in the helper method. The value of count in the main method remains unchanged.
    }
    public static void helper(int count) {
        count++;
    }
}
