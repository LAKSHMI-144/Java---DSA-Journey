import java.util.Scanner;

class Namee {
    public static void main(String args[]) {
        String namee;
        Scanner s = new Scanner(System.in);

        System.out.println("may I know your name please?");
        namee = s.nextLine();

        System.out.println("my name is:" + namee);
        System.out.println(args[0]);
        System.out.println(args[1]);
        System.out.println(args[2]);
        System.out.println(args[3]);
        System.out.println(args[4]);
        System.out.println(args[5]);
    }
}
