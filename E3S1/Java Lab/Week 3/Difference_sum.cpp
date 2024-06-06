#include<iostream>
#include<bits/stdc++.h>
using namespace std;
int differenceSum(int n,int m);

int main(){
    int n,m;
    cin>>n>>m;
    cout<<differenceSum(n,m);

return 0; 
} 
int differenceSum(int n,int m)
{
    int dsum=0,ndsum=0;
    for(int i=1;i<=m;i++)
    {
        if(i%n==0)
        {
            dsum=dsum+i;
        }
        else{
            ndsum=ndsum+i;
        }

    }
    return ndsum-dsum;
}