import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("1. kelimeyi giriniz: ");
        String firstWord=scanner.nextLine();
        System.out.print("2. kelimeyi giriniz: ");
        String secondWord=scanner.nextLine();

        if(Anagram.isAnagram(firstWord,secondWord)){
            System.out.println("Anagramdir.");
        }else {
            System.out.println("Anagram degildir.");
        }

    }
}