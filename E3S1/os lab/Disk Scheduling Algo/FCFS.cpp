#include<bits/stdc++.h>

using namespace std;

int main() {

    int n;
    cout<<"Enter number of processors : ";
    cin>>n;

    vector<int> arr(n, 0);

    cout<<"Enter the processors : ";
    for(int i=0; i<n; i++) {
        cin>>arr[i];
    }

    cout<<"Enter Head Position : "<<endl;
    int head;
    cin>>head;

    vector<int> copy(arr.begin(), arr.end());

//    sort(copy.begin(), copy.end());

    int thm = abs(head - copy[0]);

    for(int i=1; i<n; i++) {
        thm += abs(copy[i] - copy[i-1]);
    }

    cout<<"Total Head Moment : "<<thm;

    cout<<"The order of the Scheduling : ";

    for(int i=0; i<n; i++) {
        cout<<arr[i]<<" ";
    }


}
