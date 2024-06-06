#include<bits/stdc++.h>

using namespace std;

int main() {
    cout<<"Enter number of processors  : "<<endl;
    int n;
    cin>>n;

    cout<<"Enter the processors : "<<endl;
    vector<int> arr(n);
    for(int i=0; i<n; i++) {
        cin>>arr[i];
    }

    cout<<"Enter starting Head Moment : "<<endl;
    int head;
    cin>>head;

    sort(arr.begin(), arr.end());
    int rightStart = -1;

    for(int i=0; i<n; i++) {
        if(head > arr[i]) {
            rightStart = i;
        }
    }

    vector<int> rightOrder(arr.begin() + rightStart + 1, arr.end());
    for(int i=rightStart; i>=0; i--) {
        rightOrder.push_back(arr[i]);
    }

    int rightThm = abs(head - arr[n-1]) + abs(arr[n-1] - arr[0]);

    cout<<"Right travel of the head pointer : "<<rightThm<<endl;
    for(int i=0; i<rightOrder.size(); i++) {
        cout<<rightOrder[i]<<" ";
    }
    cout<<endl;

    vector<int> leftOrder;

    for(int i=rightStart; i>=0; i--) {
        leftOrder.push_back(arr[i]);
    }

    for(int i=rightStart + 1; i<n; i++) {
        leftOrder.push_back(arr[i]);
    }

    int leftThm = abs(head - arr[0]) + abs(arr[0] - arr[n-1]);

    cout<<"Left Travel of the Head Pointer : "<<leftThm<<endl;
    for(int i=0; i<leftOrder.size(); i++) {
        cout<<leftOrder[i]<<" ";
    }
    cout<<endl;



}
