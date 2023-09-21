import java.util.Random;
import java.util.Scanner;

public class Main <T>{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите размер массива: ");
        int n = scanner.nextInt();

        Integer[] arr = new Integer[n];
        Double[] brr = new Double[n];
        Character[] chararr = new Character[]{'H', 'e', 'l', 'l', 'o'};
        Print(chararr);



        Fillrand(arr);
        Print(arr);
        Sort(arr);
        Print(arr);
        Fillrand(brr);
        Print(brr);
    }
    static<T> T Sum(T[] arr) {
        T sum = T 0;
        for (int i = 0; i < arr.length; i++) {
            sum+=;
        }
        return sum;
    }

        static void Fillrand (Integer[] arr){
            Random random = new Random(0);
            for (int i = 0; i < arr.length; i++) {
                arr[i] = random.nextInt(100);
            }
        }
    static void Fillrand (Double[] arr){
        Random random = new Random(0);
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextDouble(100);
        }
    }

        static <T> void Print (T[] arr){
            for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i] + "\t");
            }
            System.out.println();
        }

        static <T> void Sort (T[] arr){
            for (int i = 0; i < arr.length; i++) {
                for (int j = 0; j < arr.length; j++) {
                    /*if (arr[j] < arr[i]) {
                        T buffer = arr[i];
                        arr[i] = arr[j];
                        arr[j] = buffer;
                    }*/
                }
            }
        }
    }
