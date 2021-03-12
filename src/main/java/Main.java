import java.util.Random;
public class Main {
    public static void main(String[] args) {
        int computerArray1[] = new int[100];
        Random rand = new Random();

        for(int count1=0; count1 < 100; count1++){  
        computerArray1[count1] = rand.nextInt(100);  
        }
    Numbers(computerArray1,1);  
    }

        public static void Numbers (int Array[], int n) {
            for(int element : Array){
                if(n < element){
                System.out.println(element);
                }
            }
        }

