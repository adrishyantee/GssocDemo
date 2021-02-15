#include <iostream>
#include <cstdio>
#include <cmath>
using namespace std;

int main() {
    int x,y;
    int ch;
    cout<< "Enter numbers to perform arithmatic operations:";
    cout<<"Enter x:";
    cin>>x;
    cout<<"Enter y:";
    cin>>y;
    cout<<"Enter operation 1. Add 2. Sub 3. Mul 4. Div";
     cin>>ch;
    switch(ch)
    {
    case 1:
        cout<<"Addition= "<<x+y;
        break;
    case 2:
        cout<<"Subtraction= "<<x-y;
        break;
    case 3:
        cout<<"Multiplication= "<<x*y;
        break;
    case 4:
        cout<<"Division= "<<x/y;
        break;
    default:
        cout << Enter correct option";
         break;
    }
    return 0;
}
