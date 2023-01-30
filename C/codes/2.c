// Stack - push, pop, traverse. Using linked list

#include <stdio.h>
#include <stdlib.h>  

void push();
void pop();
void show();

#define SIZE 4 

int top = -1;
// int arr[SIZE];

struct node{  
	int val;  
	struct node *next;  
};  
struct node *head;  
  
int main(){
	int choice;
    while (1){
        printf("\nPerform operations on the stack:");
        printf("\n1.Push the element\n2.Pop the element\n3.Show\n4.End");
        printf("\n\nEnter the choice: ");
        scanf("%d", &choice);

        switch (choice){
        case 1:
            push();
            break;
        case 2:
            pop();
            break;
        case 3:
            show();
            break;
        case 4:
        //    exit(0);
			break;
        default:
            printf("\nInvalid choice!!");
        }
	}
}



void push(){
    int val;
    struct node *ptr = (struct node*)malloc(sizeof(struct node));   
    if(ptr == NULL){

//	if (top == SIZE -1) {
		printf("\n Overflow!");
	}
	else{
		printf("\nEnter the element to be added:");
		scanf("%d", &val);
	//	top = top + 1;
	//	arr[top] = x;
		if(head==NULL)  {         
            ptr->val = val;  
            ptr -> next = NULL;  
            head=ptr;  
        }   
        else{  
            ptr->val = val;  
            ptr->next = head;  
            head=ptr;     
        }
	}
}


void pop(){

	int item;  
    struct node *ptr;  
    if (head == NULL){
	//if (top == -1){
		printf("\n Underflow");
	}
	else{
		item = head->val;  
        ptr = head;  
        head = head->next;  
        free(ptr);
		printf("Item popped");
	//	printf("\n Popped element: %d ", arr[top]);
	//	top = top -1;
	}
}


void show(){
	int i;  
    struct node *ptr;  
    ptr=head; 

    if(ptr == NULL){
//	if (top == -1){
        printf("\nUnderflow!!");
    }
    
	else{
        printf("\nElements present in the stack: \n");
		while(ptr!=NULL){
		  printf("%d\n",ptr->val);  
		  ptr = ptr->next;  
        }
       // for (int i = top; i >= 0; --i)
         //   printf("%d\n", arr[i]);
    }
}
