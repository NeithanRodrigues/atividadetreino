import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
    //Mostrando números pares:

    System.out.println("Digite um número: ");
    int numero = entrada.nextInt();

    System.out.println("Sequência de números pares: ");
    for (int i = 0; i<=numero; i++){
        if (i % 2==1){
            continue;
        }
        System.out.println(i);
    }

    // Calculando dias, meses e anos de idade:

        System.out.println("Quantos dias de vida você já tem? ");
    int dias = entrada.nextInt();
    int ano = dias/365;
    int mes = ano*12;

    System.out.println("Sua idade em anos é: " + ano);
    System.out.println("Sua idade em meses é: " + mes);
    System.out.println("Sua idade em dias é: " + dias);

    //Conversão de Notas:
        
    System.out.println("Digite a nota para conversão: ");
    double nota = entrada.nextInt();
    if (nota>=0 && nota <20){
        System.out.println("Nota: E.");
        System.out.println("Você acertou apenas 20% da prova!:(");
    } else if (nota>=20 && nota <40){
        System.out.println("Nota: D.");
        System.out.println("Você acertou apenasu 40% da prova!:(");
    }else if (nota>=40 && nota < 60){
        System.out.println("Nota: C.");
        System.out.println("Parbéns, você acertou mais de 60% da prova!!!");
    }else if (nota>=60 && nota < 80){
        System.out.println("Nota: B.");
        System.out.println("Parabéns, você acertou mais de 80% da prova!!!");
    }else {
        System.out.println("Nota: A.");
        System.out.println("Excelente!! Você tirou nota máxima!!!");
    }
    entrada.close();
    
    }
}
