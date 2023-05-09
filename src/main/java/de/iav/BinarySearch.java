package de.iav;

import java.util.Arrays;
import java.util.Comparator;

public class BinarySearch {

    public static int searchIndexOfAnArray(int[] givenArray, int elementToFindIndex) {

        // Create an array to store the indices
        Integer[] indices = new Integer[givenArray.length];
        for (int i = 0; i < indices.length; i++) {
            indices[i] = i;
        }

        // Sort the indices array based on the values in the original array
        Arrays.sort(indices, new Comparator<Integer>() {
            public int compare(Integer i1, Integer i2) {
                return Integer.compare(givenArray[i1], givenArray[i2]);
            }
        });



        Arrays.sort(givenArray);
        int lowerBoundry= 0;
        int higherBoundry= givenArray.length-1;
        int resultedIndex=-1;

        while(lowerBoundry<=higherBoundry){
            int middleIndex=(lowerBoundry+higherBoundry)/2;
            if (givenArray[middleIndex]<=elementToFindIndex) {
                lowerBoundry=middleIndex+1;
                if (givenArray[middleIndex]==elementToFindIndex)
                    return indices[middleIndex];
            }
            else higherBoundry=middleIndex-1;
        }
        return resultedIndex;
    }
}
