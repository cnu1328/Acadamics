#include<bits/stdc++.h>

using namespace std;

void diff(vector<pair<int, int>> &distance, vector<int> arr, int head) {
    int n = arr.size();

    for(int i=0; i<n; i++) {
        distance[i].first = abs(arr[i] - head);
    }
}

int mini(vector<pair<int, int>> &distance) {

    int index = -1;
    int minimum = INT_MAX;

    int n = distance.size();

    for(int i=0; i<n; i++) {
        if(!distance[i].second && distance[i].first< minimum) {
            minimum = distance[i].first;
            index = i;
        }
    }

    return index;
}

void ssft(vector<int> arr, int head, int n) {
    if(n == 0)
        return;

    vector<pair<int, int>> distance(n, {0, 0});

    int thm = 0;
    vector<int> order;

    for(int i=0; i<n; i++) {
        order.push_back(head);

        diff(distance, arr, head);
        int index = mini(distance);
        distance[index].second = 1;
        thm += distance[index].first;

        head = arr[index];
    }

    order.push_back(head);

    cout<<"Total Head Moment : "<<thm<<endl;

    cout<<"The order of the Scheduling : ";

    for(int i=0; i<n; i++) {
        cout<<order[i]<<" ";
    }
}

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


    ssft(arr, head, n);
}
