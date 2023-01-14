package Beginner.Questions;

public class VowelandConsonants {
    public static void main(String[] args) {
        System.out.println("Enter the chars in capital");
        char alpha='E';
        switch (alpha){
            case 'A':
                System.out.println("vowel A");
                break;
                case 'E':
                    System.out.println("vowel E");
                    break;
            case 'I':
                System.out.println("vowel I");
                break;
            case 'O':
                System.out.println("vowel O");
                break;
            case 'U':
                System.out.println("vowel U");
                break;
            default:
                System.out.println("Consonants");
                break;


        }
    }
}
