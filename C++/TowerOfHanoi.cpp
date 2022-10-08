#include<iostream>

using namespace std;

void TOH(int, char, char, char);

int main()
{
    int height;
    cout<<"Enter the initial height of tower A: ";
    cin>>height;
    TOH(height, 'A', 'B', 'C');
    return 0;
}

void TOH(int h, char from, char aux, char to)
{
    if (!h) return;
    TOH(h-1, from, to, aux);
    cout<<"Move from "<<from<<" to "<<to<<"."<<endl;
    TOH(h-1, aux, from, to);
}
