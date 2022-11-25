public class Main {
    public boolean isPalindrome(int x) {
        if(x < 0){
            return false;
        }
        String origin = Integer.toString(x);
        StringBuilder ans = new StringBuilder();

        while(x != 0){
            ans.append(x % 10);
            x = x / 10;
        }
        return origin.equals(ans.toString());
    }
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }
}