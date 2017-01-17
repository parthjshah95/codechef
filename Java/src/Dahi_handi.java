/**
 * Created by Xorcist on 03-01-2017.
 */

import java.util.*;


public class Dahi_handi {
    static int[] L;
    static int[] W;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();
        int H = input.nextInt();
        L = new int[N];
        W = new int[N];
        for (int i = 0; i < N; i++) {
            int w = input.nextInt();
            int s = input.nextInt();
            int l = s - w;
            int index = insert(l, i);
            updateW(w, index, i);
            System.out.print("L:  ");
            show(L);
            System.out.print("W:  ");
            show(W);
        }
        int count = 0;
        int capacity = L[0] + W[0];
        while (capacity > 0 && count < N) {
            capacity -= W[count];
            capacity = min(capacity, L[count]);
            count++;
        }
        System.out.print(count * H);
    }

    private static int insert(int l, int size) {
        int index = size - 1;
        while (index > -1 && L[index] < l) {
            L[index + 1] = L[index];
            index--;
        }
        index++;
        L[index] = l;
        return index;
    }

    private static int min(int a, int b) {
        if (a > b) {
            return b;
        }
        return a;
    }

    private static void updateW(int w, int index, int size){
        int i = size - 1;
        while(i > -1 && i >= index){
            W[i + 1] = W[i];
            i--;
        }
        i++;
        W[i] = w;
    }

    private static void show(int[] array){
        System.out.print("[");
        for (int x:array){
            System.out.print(x + ", ");
        }
        System.out.println("]");
    }
}
