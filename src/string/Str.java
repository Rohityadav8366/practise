package string;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Str {

    public static int findMinCostToPangram(String text, int[] costs) {
        // Set of all alphabet letters
        Set<Character> alphabetSet = new HashSet<>();
        for (char ch = 'a'; ch <= 'z'; ch++) {
            alphabetSet.add(ch);
        }

        // Set of letters present in the text
        Set<Character> textSet = new HashSet<>();
        for (char ch : text.toCharArray()) {
            textSet.add(Character.toLowerCase(ch));
        }

        // Find missing letters
        alphabetSet.removeAll(textSet);

        // Calculate the total cost of missing letters
        int totalCost = 0;
        for (char missingLetter : alphabetSet) {
            int index = missingLetter - 'a';
            totalCost += costs[index];
        }

        return totalCost;
    }
    public static void main(String[] args) {


//        String name = "rohit";
//        String name1 = "rohit";
//        String name2 = new String("rohit");
//        if(name==name1){
//            System.out.println("both are same");
//            System.out.println("rohit yadav mai ");
//        }
//        if(name1.equals(name2))
//        {
//            System.out.println("this is for value comparition");
//            System.out.println(" value both are same");
//        }
//        else {
//            System.out.println("both are not same");
//            System.out.println("sdgoycsdoacvsdaarohit yadav m,aio ");
//
//        }

    Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Text");
    String text=sc.nextLine();
        System.out.println("Enter the NUmber of arr");
    int n=sc.nextInt();
        System.out.println("Enter the element of array");
    int[] cost=new int[n];
    for(int i=0;i<n;i++)
    {
        cost[i]=sc.nextInt();
    }
        System.out.println("The cost of missing letter: ");
        System.out.println(findMinCostToPangram(text,cost));
    }
}
