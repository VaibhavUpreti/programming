// Linear Search and Binary Search in C
#include <stdio.h>
int linearSearch();
int binarySearch();
int main() {
    int arr[] = {1,3,5,6,9,10};
	int index,index1;
	printf("By- Vaibhav Upreti \n");
    printf("Enter the number to be searched : ");
    scanf("%d", &index);
	index1 = index;
    int arrSize = sizeof(arr) / sizeof(arr[0]);
    int outputLs = linearSearch(arr, arrSize, index);
    int outputBs = binarySearch(arr, index1 , 0 , arrSize);
    printf("Linear Search Output- \n");
    (outputLs == -1) ? printf("Number not present in array") :
		printf("Number is present at index: %d", outputLs);
    printf("\n");
    printf("\n");
    printf("Binary Search Output- \n");
    (outputBs == -1) ? printf("Number not present in array") : 
		printf("Number is present at index: %d", outputBs);
    return 0;
}
// O(n) - time complexity, O(1) - space complexity
int linearSearch(int arr[], int arrSize, int index) {
    for (int i = 0; i < arrSize; i++){
        if (arr[i] == index)
            return i;
    }
    return -1;
}
// O(log(n)) - time complexity. O(1) - space complexity
int binarySearch(int arr[], int index1, int low, int high) {
    while (low <= high) {
        int mid = low + (high - low) / 2;

    if (arr[mid] == index1)
        return mid;

    if (arr[mid] < index1)
        low = mid + 1;
	
    else
        high = mid - 1;
    }
    return -1;
}
