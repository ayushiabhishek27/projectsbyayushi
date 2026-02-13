import java.util.Scanner;

public class CountVowels {

    public static int count(String str){
        int c=0;
        for(char ch:str.toLowerCase().toCharArray())
            if("aeiou".indexOf(ch)!=-1)
                c++;
        return c;
    }

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter text: ");
        String s=sc.nextLine();

        System.out.println("Vowels: "+count(s));
    }
}
