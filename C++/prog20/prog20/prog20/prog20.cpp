// Online C++ compiler to run C++ program online
#include <iostream>
using namespace::std;

int fibonacci(int n)
{
    if (n == 0)
        return 0;
    else if (n == 1)
        return 1;
    else
        return fibonacci(n - 1) + fibonacci(n - 2);
}
int recseq1(int n)
{
    if (n == 0)
        return -2;
    else
        return 4 * recseq1(n - 1) - 4;
}
int recseq2(int n)
{
    if (n == 0)
        return 2;
    else if (n == 1)
        return -3;
    else
        return 4 * recseq2(n - 1) - 5 * recseq2(n - 2) - 7;
}
int power(int a, int b) {
    if (b == 0) {
        return 1; 
    } else {
        return a * power(a, b - 1); 
    }
}


int main() {
    cout << "A11 = " << recseq1(11) << endl;
    cout << "B9 = " << recseq2(9) << endl;
    
    cout << "First 12 numbers of the 1 sequence:" << endl;
    for (int i = 0; i < 12; i++) {
        cout << "A" << i << " = " << recseq1(i) << endl;
    }

    cout << "First 12 numbers of the 2 sequence:" << endl;
    for (int i = 0; i < 12; i++) {
        cout << "B" << i << " = " << recseq2(i) << endl;
    }
    

    return 0;
}