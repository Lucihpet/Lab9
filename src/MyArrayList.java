import java.util.*;
import java.lang.*;

/**
 * This class implements multiple sort algorithms to be used with ints, chars, and Stings.
 * Bubble sort, Selection sort, and Insertion sorts are implemented here
 * 
 * @author Matthew Blaisdell
 * @version (CSSSKL 143)
 */
 
public class MyArrayList implements Comparable<MyArrayList> {
   
    // instance data
    protected int[] IntList;
    protected Character[] CharList;
    protected String[] StringList;
    
     // constructor will build all 3 arrays here
    public MyArrayList() {
        this.IntList = new int[10];
        this.CharList = new Character[10];
        this.StringList = new String[5];
        
        // fill all 3 arrays with data
        for(int i = 0; i < IntList.length; i++) {
            IntList[i] = (int) (Math.random()*52);
       }
	   
       // Populate char array
       for(int i = 0; i < CharList.length; i++) {
           
          Random random = new Random();
          CharList[i] = (char)(random.nextInt(26) + 'a');
       }
	   
       // Populate String array
       StringList[0] = "joe";
       StringList[1] = "mark";
       StringList[2] = "abbey";
       StringList[3] = "tony";
       StringList[4] = "kevin";    
    }
    
    public int compareTo(MyArrayList other) {
        if (this.IntList[0] < other.IntList[0]) {
            System.out.println("compareTo() is returning -1, array[0] < other[0]");
            return -1;
        } else if (this.IntList[0] > other.IntList[0]) {
            System.out.println("compareTo() is returning 1, array[0] > other[0]");
            return 1;
        } else {
            System.out.println("compareTo() is returning 0, array[0] != other[0] ");
            return 0;
        }
    }

    
    public void intBubbleSort() {
        for (int i = 0; i < IntList.length - 1; i++) {
            for (int j = 0; j < IntList.length - i - 1; j++) {
                if (IntList[j] > IntList[j + 1]) {
                    swapInts(IntList, j);
                }
            }
        }
    }
        
    
    public void CharBubbleSort() {
        for (int i = 0; i < CharList.length - 1; i++) {
            for (int j = 0; j < CharList.length - i - 1; j++) {
                if (CharList[j].compareTo(CharList[j+1]) > 0) {
                    swapChars(CharList, j);
                }
            }
        }
    }
    
    public void stringBubbleSort() {
        for (int i = 0; i < StringList.length - 1; i++) {
            for (int j = 0; j < StringList.length - i - 1; j++) {
                if (StringList[j].compareTo(StringList[j+1]) > 0) {
                    swapStrings(StringList, j);
                }
            }
        }
    }


    public void swapInts(int[] intList, int j) {
        int temp = intList[j];
        intList[j] = intList[j+1];
        intList[j+1] = temp;
    }
    
    public void swapChars(Character[] charList, int j) {
        Character temp = CharList[j];
        CharList[j] = CharList[j+1];
        CharList[j+1] = temp;
    }
    
    public void swapStrings(String[] stringList, int j) { 
        String temp = StringList[j];
        StringList[j] = StringList[j+1];
        StringList[j+1] = temp;
    }
    
    //selection sort for ints
    public void selectionSort() {
        int nextMin;

        for (int i = 0; i < IntList.length - 1; i++) {
            nextMin = i;
            for (int j = i + 1; j < IntList.length; j++) {
                if (IntList[j] < IntList[nextMin])
                    nextMin = j;
            }
            if (nextMin != i)
                swapSelection(IntList, i, nextMin);
        }
    }
    
    //selection sort for Strings
    public void stringSelectionSort() {
        int nextMin;

        for (int i = 0; i < StringList.length - 1; i++) {
            nextMin = i;
            for (int j = i + 1; j < StringList.length; j++) {
                if (StringList[j].compareTo(StringList[nextMin]) < 0)
                    nextMin = j;
            }
            if (nextMin != i)
                swapSelectionStrings(StringList, i, nextMin);
        }
    }
    
    public void swapSelection(int[] intList, int i, int nextMin) { 
        int temp = intList[i];
        intList[i] = intList[nextMin];
        intList[nextMin] = temp;
    }
    
    public void swapSelectionStrings(String[] stringList, int i, int nextMin) {
         String temp = stringList[i];
         stringList[i] = stringList[nextMin];
         stringList[nextMin] = temp;
    }
    
    
    
    public int findSmallest(int[] arr, int begin, int end) {
        //returns the index of the smallest element
        int minIndex = begin;       //hint
        for(int i = begin; i < end ; i++) {
            if(arr[begin - 1] < arr[begin]) {
                minIndex = begin;
            } else 
                minIndex = begin - 1;
        }
        return minIndex;
    }
    
    //Insertion Sort 
    public void insertionSort() {
	
		for(int i = 0; i < IntList.length - 1; i++) {
            //note -1 above since we’re dealing with neighbors (a, a+1)
            int current = IntList[i];
            int hole = i;
            
            while(hole > 0 && IntList[hole - 1] > current ) { //while “out of place”
                  IntList[hole] = IntList[hole - 1];
                  hole--;
            }
            IntList[hole] = current;
        }  
    } 
} 

    

