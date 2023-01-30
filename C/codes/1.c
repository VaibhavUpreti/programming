// Linear and Binary Search Algorithms in C

#include <stdio.h>
int linerSearch();
int binarySearch();

int main(){
	int arr[] = {1,3,5,8,9,11,14};

	int arrSize = sizeof(arr)/sizeof(arr[0]);

	int index = 14;
	printf("Binary Search: ");
	// printf("Index is present at: ");
	int answer = binarySearch(arr, index, 0, arrSize);

	(answer == -1) ? printf("number not Present in array"): 
		printf("Present at index: %d", answer);
}

int binarySearch(int arr[], int index, int low, int high){
	while(low<=high){
		int mid = low + (high-low)/2;

	if (arr[mid] == index)
		return mid;

	if (arr[mid] < index)
		low = mid + 1;

	else
		high = mid - 1;
	}
	return -1;
}

