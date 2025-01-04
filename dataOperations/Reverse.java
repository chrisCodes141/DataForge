import java.util.Random;

public class Reverse {
    public static void main(String[] args) {
        final int ARRAY_SIZE = 6;
        int a[] = new int[ARRAY_SIZE];
        int temp = 0;
        int x = 0;
        Random random = new Random();

        while(ARRAY_SIZE > x){
            a[x] = random.nextInt(50);
            x++;
        }
        System.out.println("Array before reverse");

        for (int i = 0; i < ARRAY_SIZE; i++){
            System.out.println("a["+i+"]"+" : "+ a[i]);
        }
	
	//swaps first with last, 2nd with 2nd to last, ....
        for(int i = 0; i < ARRAY_SIZE/2; i++ ){
            temp = a[i];
            a[i] = a[ARRAY_SIZE - 1 - i];
            a[ARRAY_SIZE - 1 -i] = temp;
        }

        System.out.println("Array after reverse");

        for (int i = 0; i < ARRAY_SIZE; i++){
            System.out.println("a["+i+"]"+" : "+ a[i]);
        }
    }
}
