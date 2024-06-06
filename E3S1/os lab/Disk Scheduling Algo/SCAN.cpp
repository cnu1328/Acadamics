
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

    sort(arr.begin(), arr.end());

    int rightStart = -1;

    for(int i=0; i<n; i++) {
        if(head > arr[i]) {
            rightStart = i;
        }

        else {
            break;
        }
    }

    vector<int> order(arr.begin() + rightStart + 1, arr.end());
    for(int i=rightStart; i>=0; i--) {
        order.push_back(arr[i]);
    }

    int rightThm = abs(head - 199);

    int index = -1;
    int mini = INT_MAX;

    for(int i=0; i<n; i++) {
        if(arr[i] < mini && arr[i] < head) {
            mini = arr[i];
            index = i;
        }
    }

    if(index != -1) {
        rightThm += 199 - arr[index];
    }

    cout<<"Right Travel of the head pointer : "<<rightThm<<endl;
    cout<<"Sequence Order : ";
    for(int i=0; i<order.size(); i++) {
        cout<<order[i]<<" ";
    }
    cout<<endl;


    vector<int> orderLeft;

    for(int i = rightStart; i >= 0; i--) {
        orderLeft.push_back(arr[i]);
    }

    for(int i=rightStart + 1; i<n; i++) {
        orderLeft.push_back(arr[i]);
    }


    int leftThm = head;

    index = -1;
    int maxi = INT_MIN;

    for(int i=0; i<n; i++) {
        if(arr[i] > maxi && arr[i] > head) {
            index = i;
            maxi = arr[i];
        }
    }

    if(index != -1) {
        leftThm += arr[index];
    }

    cout<<"Left Travel of the head pointer : "<<leftThm<<endl;
    for(int i=0; i<orderLeft.size(); i++) {
        cout<<orderLeft[i]<<" ";
    }
    cout<<endl;


}
