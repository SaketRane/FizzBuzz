public class Reduce {
    public static void main(String[] args) {
        int n = 100;
        int counter = 0;
        while(n != 0) {
            counter ++;
            if (n % 2 == 0) {
                n /= 2;
            }
            else {
                n -= 1;
            }
        }
        System.out.println("It takes " + counter + " steps to get to 0 from 100");
        }
    }
