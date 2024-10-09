import java.util.Scanner;

public class P2Main{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int score = 0;
        int count = 1;

        System.out.println("Enter first word:");
        String previousWord = scanner.nextLine();
        String currentWord;

        while(score < 50){
            count ++;
            System.out.println("Enter next word:");
            currentWord = scanner.nextLine();
            if(currentWord.compareTo(previousWord) > 0){
                score += 2;
                System.out.println("+2 points: word is alphabetically after; SCORE: " + score);
            }
            else if (currentWord.equals(previousWord)){
                score -= 10;
                System.out.println("-10 points: word is the same as previous; SCORE: " + score);

            }
            else if (currentWord.compareTo(previousWord) < 0){
                score -= 5;
                System.out.println("-5 points: word is alphabetically before; SCORE: " + score);
            }
            
            if (previousWord.substring(previousWord.length()-2).equals(currentWord.substring(0, 2))){
                score += 5;
                System.out.println("+5 points: last two letters of previous match first two letters of current; SCORE: " + score);

            }
            if (currentWord.contains(previousWord.substring(0,1))){

                score += 3;
                System.out.println("+3 points: first letter of previous found in current; SCORE: " + score);

            }
            if (currentWord.length() == previousWord.length()){
                score += 5;
                System.out.println("+5 points: word is same length as previous; SCORE: " + score);

            }

            previousWord = currentWord;
        }
        System.out.println("You win. It took  you " + count + " words. Try again for a lower count.");

        scanner.close();

    }

}