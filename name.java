import java.util.Scanner;

class Name {
    public static void main(String args[]) {
        String name;
        Scanner s = new Scanner(System.in);

        System.out.print("may I know your name please?");
        name = s.nextLine();

        System.out.print("my name is:" + name);
    }
}
