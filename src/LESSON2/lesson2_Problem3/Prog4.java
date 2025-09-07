package lesson2_Problem3;

import java.util.Arrays;

public class Prog4 {
public static void main(String[] args){
    String[] arrayDup = {"horse", "dog","cat","horse","dog"};
    String[] newArray = new String[arrayDup.length];
    int count =0;
    boolean found = false;
    for(int i = 0; i < arrayDup.length; i++) {
        // System.out.println(arrayDup[i] + " ");
        for (int j = 0; j < count; j++) {
            if (arrayDup[i].equals(newArray[j])) {
                found = true;
            }
        }
        if (!found) {
            newArray[count++] = arrayDup[i];
        }
    }
    System.out.println( Arrays.toString(Arrays.copyOf(newArray, count)));
}
}
