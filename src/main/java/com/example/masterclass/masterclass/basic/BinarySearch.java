package com.example.masterclass.masterclass.basic;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BinarySearch {
    @Autowired
    private SortAlgorithm sortAlgorithm;

    public BinarySearch(SortAlgorithm sortAlgorithm) {
        this.sortAlgorithm = sortAlgorithm;
    }

    public int binarySearch (int[] numbers, int numberToSearchFor){
        BubbleSort bubbleSort = new BubbleSort();
        int[] sortedNumbers = bubbleSort.sort(numbers);
        System.out.println(sortAlgorithm);
        //implement sort
        //Search the array
        return 3;
    }
}
