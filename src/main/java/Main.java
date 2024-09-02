import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
   Scanner sc = new Scanner(System.in);
     System.out.println("Login: ");
     String login = sc.next();
     int senhaAdmin = 12345;
    
    if (login == "admin") {
       System.out.print("Coloque sua senha: ");
       int senha = sc.nextInt();
       if(senha == senhaAdmin) {
         System.out.println("Acesso permitido!");
       } else {
         System.out.println("Acesso negado!");
       }
     } else {
      System.out.println("Login invalido");
     }


  sc.close();
  }
}