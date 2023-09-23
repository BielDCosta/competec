import java.io.IOException;
import java.util.Scanner;

public class Teste {
 
    public static void main(String[] args) throws IOException {
        Scanner sc1 = new Scanner(System.in);
        int y[] = new int[5];
        for(int i = 0; i<5; i++){
            int x = sc1.nextInt();
            y[i] = x;

    }
        for(int j = 4; j>=0; j--){
            System.out.println(y[j] + "");
        }
 
}
}