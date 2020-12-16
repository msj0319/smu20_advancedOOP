import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        final String validData = "12가 1234\n123가 1234\n";
        final String invalidData = "1가 1234\n1234가 1234\n123가 123\n123가 12345\n12가 12345\n12r 1234\n";
        final String quit = "quit";
        LicenseNumber licenseNumber = new LicenseNumber();
        //Scanner sc = new Scanner(System.in);
        Scanner sc = new Scanner(validData + invalidData + quit);  // 문자열에서 입력 받기

        System.out.println("자동차 번호를 입력하세요: ");
        String s = sc.nextLine();
        while (!s.toUpperCase().equals("QUIT")) {
            System.out.printf("s = %s\n", s);
            boolean id = licenseNumber.verify(s);
            if (id) {
                System.out.printf("\"%s\"는 적합한 자동차 번호입니다.\n", s);
            }
            else {
                System.out.printf("\"%s\"는 부적합한 자동차 번호입니다.\n", s);
                for (int i = 0; i < licenseNumber.getErrorPos() + 1; i++) {
                    System.out.print(" ");
                }
                System.out.println("^");
            }
            System.out.println("\n자동차 번호를 입력하세요: ");
            s = sc.nextLine();
        }
    }
}
