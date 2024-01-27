public class test4 {
    public static void main(String[] args) {
        ShuiXianHua();
    }

    public static void ShuiXianHua() {
        StringBuilder output = new StringBuilder();
        for (int n = 100; n < 1000; n++) {
            int x = n % 10;
            int y = n / 10 % 10;
            int z = n / 10 / 10 % 10;

            if (x * x * x + y * y * y + z * z * z == n) {
                output.append(n).append(" ");
            }
        }
        System.out.println(output.toString().trim());
    }
}




