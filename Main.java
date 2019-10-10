import java.util.Random;

public class Main {

    public static void main(String[] args) {
        final int SIZE = 10000;
        final int MAXelem = 1000;

        int [] arr = (createRandomIntArray(SIZE, MAXelem));

        IntArray arrayBubble =  new IntArray(arr);
        IntArray arraySelect =  new IntArray(arr);
        IntArray arrayInsert =  new IntArray(arr);

        long startTime = System.currentTimeMillis();
        arrayBubble.intArrayBubbleSort();
        long endTime = System.currentTimeMillis();
        long time = endTime - startTime;
        System.out.println("Сортировка пузырьком заняла " + time );


        long startTime1 = System.currentTimeMillis();
        arraySelect.intArraySelectSort();
        long endTime1 = System.currentTimeMillis();
        long time1 = endTime1 - startTime1;
        System.out.println("Сортировка выбором заняла " + time1 );

        long startTime2 = System.currentTimeMillis();
        arrayInsert.intArrayInsertSort();
        long endTime2 = System.currentTimeMillis();
        long time2 = endTime2 - startTime2;
        System.out.println("Сортировка вставкой заняла " + time2 );

        }

    public static int[] createRandomIntArray(int size, int maxElem){
        int[] array = new int[size];
        Random rand = new Random();
        for (int i = 0; i < size; i++) {
            array[i] = rand.nextInt(maxElem);

        }

        return array;
    }

    public static void printIntArray(int[]arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");

        }
    }


}


