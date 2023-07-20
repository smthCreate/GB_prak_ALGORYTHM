package org.example;

public class proba {
    public static void main(String[] args) {
        Integer[] mul = new Integer[]{1,2,3,4,6,5};
        sort(mul);
        for (int i = 0; i < mul.length; i++) {
            System.out.println(mul[i]);;
        }
    }
    public static void sort(Integer[] array){
        for (int i = array.length/2-1; i >=0 ; i--) {
            heapify(array, array.length,i);
        }
    }

    private static void heapify(Integer[] array, int heapSize, int rootIndex) {
        int largest = rootIndex;
        int leftChild = 2*rootIndex+1;
        int rightChild = 2*rootIndex+2;

        if (leftChild<heapSize && array[leftChild]>array[largest])
            largest=leftChild;
        if (rightChild<heapSize && array[rightChild]>array[largest])
            largest=rightChild;
        if (largest!=rootIndex){
            int temp = array[rootIndex];
            array[rootIndex] = array[largest];
            array[largest]=temp;

            heapify(array,heapSize,largest);
        }
    }
}
