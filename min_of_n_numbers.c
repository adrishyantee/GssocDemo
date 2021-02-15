#include <stdio.h>
#include <limits.h>

int main(){
    int n;
    printf("enter the no. of elements\n");
    scanf("%d", &n);
    int arr[n], min = INT_MAX;
    printf("Enter the elements\n");
    for(int i = 0; i < n; i++){
        scanf("%d", &arr[i]);
        if(min > arr[i])min = arr[i];
    }
    printf("The min. of the elements is %d\n", min);
}