package de.iav;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class BinarySearchTest {

    @Test
    public void byGiving_3_ToTheMethod_Index_2_WillBeReturned(){
        int[] givenArray = new int[]{5, 7, 3, 1, 9, 0};
        int elementToFind= 3;

        int expectedIndex = 2;
        int resultedIndex=BinarySearch.searchIndexOfAnArray(givenArray, elementToFind);


        Assertions.assertEquals( expectedIndex, resultedIndex );
    }

    @Test
    public void byGiving_11_ToTheMethod_Index_MinusOne_WillBeReturned(){
        int[] givenArray = new int[]{5, 7, 3, 1, 9, 0};
        int elementToFind= 11;

        int expectedIndex = -1;
        int resultedIndex=BinarySearch.searchIndexOfAnArray(givenArray, elementToFind);


        Assertions.assertEquals( expectedIndex, resultedIndex );
    }
}