package Application;

import java.util.Scanner;

import Entidades.Banco;

public class App {
    public static void main(String[] args)  {

        Scanner sc = new Scanner(System.in);

        Banco B;

        System.out.println("Insira o nome do Titular: ");
        String name = sc.nextLine();
        System.out.println("Insira o número da conta: ");
        int num = sc.nextInt();

        System.out.println("Deseja inserir um Deposito(y/n)?");
        char cond = sc.next().charAt(0);

        if(cond == 'y'){

        System.out.println("Insira o Deposito Inicial: ");
            float depo = sc.nextFloat();
            B  = new Banco(name,num,depo);

        }
        else
        {
             B  = new Banco(name,num);
        }

        System.out.println(B);

        System.out.println("Insira um valor de deposito: ");
         B.deposito(sc.nextFloat());

         System.out.println("Atualização de dados da conta: "+ B);

         System.out.println("Insira um valor de Saque: ");
         B.saque(sc.nextFloat());

         System.out.println("Atualização de dados da conta: "+ B);

        sc.close();
      
    }
    
}
