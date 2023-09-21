import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите размер массива: ");
        int n = scanner.nextInt();

        int[] arr = new int[n];

        Fillrand(arr);
        Print(arr);
        Sort(arr);
        Print(arr);
    }

        static void Fillrand ( int[] arr){
            Random random = new Random(0);
            for (int i = 0; i < arr.length; i++) {
                arr[i] = random.nextInt(100);
            }
        }

        static void Print ( int[] arr){
            for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i] + "\t");
            }
            System.out.println();
        }

        static void Sort ( int[] arr){
            for (int i = 0; i < arr.length; i++) {
                for (int j = 0; j < arr.length; j++) {
                    if (arr[j] < arr[i]) {
                        int buffer = arr[i];
                        arr[i] = arr[j];
                        arr[j] = buffer;
                    }
                }
            }
        }
    }
