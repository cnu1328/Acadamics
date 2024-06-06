
#include<bits/stdc++.h>

using namespace std;


int main() {
    int n;
    cout<<"Enter number of processors : "<<endl;
    cin>>n;

    cout<<"Enter the processors : "<<endl;
    vector<int> arr(n);
    for(int i=0; i<n; i++) {
        cin>>arr[i];
    }
    int head;
    cout<<"Enter staring head : "<<endl;
    cin>>head;

    sort(arr.begin(), arr.end());
    int rightStart = -1;

    for(int i=0; i<n; i++) {
        if(head >= arr[i]) {
            rightStart = i;
        }
    }

    int rightThm = abs(head - arr[n-1]) + arr[n-1] - arr[0] + arr[rightStart] - arr[0];

    vector<int> order(arr.begin() + rightStart + 1, arr.end());
//    order.push_back(0);
    for(int i=0; i<=rightStart; i++) {
        order.push_back(arr[i]);
    }

    cout<<"Right Travel to the head pointer is : "<<rightThm<<endl;
    cout<<"Sequence : ";
    for(int i=0; i<order.size(); i++) {
        cout<<order[i]<<" ";
    }
    cout<<endl;
}
