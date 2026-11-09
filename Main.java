public class Main {

public static void main(String[] args) {
    Container<String> c1 = new Container<String>();

    c1.set("Hello");
    c1.set(c1.get() + " Bird World");
    System.out.println(c1.get());
    } }



// Java is a pass by value language!!!
    /* 
    public static void main(String[] args) {
        int count = 0;
        helper(count);
        System.out.print(count);
        //Java is a pass by value langauge and therfore the value is passed, changed, and discarded in the helper method. The value of count in the main method remains unchanged.
    }
    public static void helper(int count) {
        count++;
    }
    To pass and change by reference, we would do that this way:

    public static void main(String[] args) {
        int count = 0;
        count = helper(count);
        System.out.print(count);
        //the output is now 1 because the value of count is returned from the helper method and assigned to the variable count in the main method.
    }
    public static int helper(int count) {
        count++;
        return count;
    }
        */

