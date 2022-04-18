
import java.util.ArrayList;
import java.util.Scanner;

    public class MergeSort_2059614 {
        // Asking user for the input
        ArrayList getInput(ArrayList<Integer> al) {
            System.out.println("Welcome to   Mergesort:");
            System.out.println("#==========================================================#");
            Scanner sc = new Scanner(System.in);
            System.out.print("What is the size of your Array? ");
            int first= sc.nextInt();
            System.out.println();
            System.out.println("Input Space");
            System.out.println("#=========================================================#");
            for (int i = 0; i < first; i++) {
                System.out.print("Enter "  + "integer of array"+" in position " + (i +1) +":");
                int aal = sc.nextInt();
                al.add(aal);
            }
            return al;
        }
        // Getting the result
        void getOutput(ArrayList<Integer> al) {
            int second = al.size();
            for (int i = 0; i < second; ++i)
                System.out.print(al.get(i) + " ");
            System.out.println();
        }
        //Merging and Sorting numbers
        void merge(ArrayList<Integer> al, int beg, int mid, int end) {

            int leftSide = mid - beg + 1;
            int rightSide = end - mid;


            ArrayList array1 = new ArrayList(leftSide);
            ArrayList array2 = new ArrayList(rightSide);
            int L[] = new int[leftSide];
            int R[] = new int[rightSide];


            for (int i = 0; i < leftSide; ++i) {
                L[i] = al.get(beg + i);
            }
            for (int j = 0; j < rightSide; ++j) {
                R[j] = al.get(mid + 1 + j);
            }


            int i = 0, j = 0;


            int k = beg;

            while (i < leftSide && j < rightSide) {
                if (L[i] <= R[j]) {
                    al.set(k, L[i]);
                    i++;
                } else {
                    al.set(k, R[j]);
                    j++;
                }
                k++;
            }


            while (i < leftSide) {
                al.set(k, L[i]);
                i++;
                k++;
            }


            while (j < rightSide) {
                al.set(k, R[j]);
                j++;
                k++;
            }
        }

        // Separation of Left and Right Side
        void sort(ArrayList<Integer> al, int beg, int end) {
            if (beg < end) {

                int m = beg + (end - beg) / 2;


                sort(al, beg, m);
                sort(al, m + 1, end);


                merge(al, beg, m, end);
            }
        }


        //Finalising

        public static void main(String args[]) {
            MergeSort_2059614  last = new  MergeSort_2059614 ();
            ArrayList al = new ArrayList();
            al = last.getInput(al);
            System.out.println(" ");
            System.out.println("Output Space");
            System.out.println("#============================================#");
            System.out.println("Given Array");
            last.getOutput(al);

            MergeSort_2059614  ob = new  MergeSort_2059614 ();
            ob.sort(al, 0, al.size() - 1);

            System.out.println("\nSorted array");
            last.getOutput(al);
            System.out.println(" ");
            System.out.println("Thank you for using this program. \nGood Bye!");


        }
    }



