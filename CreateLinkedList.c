#include<stdio.h>
#include<stdlib.h>
struct node {
    int data ;
    struct node *next ;

} *head ;
void CreateList(int NodeSize){
    int item,i;
    struct node *temp ;
    head=(struct node*)malloc(sizeof(struct node));
    if(head==NULL){
        printf("Memory is not allocated ");
    }
    printf("Enter the data for node 1: ");
    scanf("%d",&item);
    head->data=item;
    head->next=NULL;

    temp=head;

    for(i=2;i<=NodeSize;i++){

        struct node *newNode ;
            newNode=(struct node*)malloc(sizeof(struct node));
            if(newNode==NULL){
                printf("Memory is not allocated");
            }
            printf("Enter the data for node %d: ",i);
            scanf("%d",&item);
            newNode->data=item;
            newNode->next=NULL;
            temp->next=newNode;
            temp=temp->next;
    }
}


void PushAtBegin(struct node **head_ref,int data){
    struct node *newNode;
    newNode=(struct node*)malloc(sizeof(struct node));
    newNode->data=data;
    newNode->next=*head_ref;
    *head_ref=newNode;

}

void PushAtEnd(struct node **head_ref,int data){
    struct node *newNode,*temp;
    temp=(*head_ref);
    newNode=(struct node *)malloc(sizeof(struct node));
    newNode->data=data;
    newNode->next=NULL;
    while(temp->next!=NULL){
        temp=temp->next;

    }
    temp->next=newNode;

}
void PushAtPosition(struct node **head_ref,int data,int position){
     struct node *newNode,*temp;
     temp=(*head_ref);
     newNode=(struct node*)malloc(sizeof(struct node));
     newNode->data=data;
    
     int i;
     for(i=1;i<=position-1;i++){
     temp=temp->next;
     }
     newNode->next=temp->next;
     temp->next=newNode;
}
void PrintList(struct node *ptr){
    printf("Linked List is: ");
    while(ptr!=NULL){
        printf("%d ",ptr->data);
        ptr=ptr->next;
    }
}
void main(){
    CreateList(4);
   PushAtBegin(&head,10) ;
   PushAtPosition(&head,60,3);
   PushAtEnd(&head,100);
    PrintList(head);


}