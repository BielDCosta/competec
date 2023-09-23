import java.io.IOException;
import java.util.Scanner;
/**
 * IMPORTANT: 
 *      O nome da classe deve ser "Main" para que a sua solução execute
 *      Class name must be "Main" for your solution to execute
 *      El nombre de la clase debe ser "Main" para que su solución ejecutar
 */
public class exercicios {
 
    public static void main(String[] args) throws IOException {
        Scanner sc1 = new Scanner(System.in);
        int x = sc1.nextInt();
        int y = sc1.nextInt();
        for(int j=0; j<=y;j++){
            for(int i=0;i<=x;i++){
                if(j==x)
                System.out.println(j);
                else
                System.out.println(j+" ");
            }
  
        }
       
 
    }
 
}