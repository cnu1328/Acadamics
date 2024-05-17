#include<bits/stdc++.h>

using namespace std;

int main() {
    int n;
    cout<<"Enter the number of processors : "<<endl;
    cin>>n;

    vector<vector<int>> robin(n, vector<int> (7, 0));

    for(int i=0; i<n; i++) {
        cout<<"Enter Arrival and Burst time of P"<<i+1<<" : ";
        cin>>robin[i][0]>>robin[i][1];
        robin[i][6] = robin[i][1];
        robin[i][2] = i;
    }

    sort(robin.begin(), robin.end());

    int quantum;

    cout<<"Enter Time Quantum for this Round Robin Scheduling : ";
    cin>>quantum;


    vector<int> visited(n, 0);
    queue<int> que;

    que.push(0);
    visited[0] = 1;
    int time = robin[0][0];
    int complete, index;

    while(!que.empty()) {
        index = que.front();
        que.pop();
        cout<<"P"<<robin[index][2]+1<<" ";

        if(robin[index][1] >= quantum) {
            robin[index][1] -= quantum;
            time += quantum;
        }

        else {
            time += robin[index][1];
            robin[index][1] = 0;
        }

        for(int i=0; i<n; i++) {
            if(robin[i][0] <= time && visited[i] == 0 && robin[i][1] > 0) {
                que.push(i);
                visited[i] = 1;
            }
        }

        if(robin[index][1] > 0) {
            que.push(index);
        }
        else {
            visited[index] = 0;
        }



        if(robin[index][1] == 0) {
            robin[index][3] = time;
            robin[index][4] = time - robin[index][0];
            robin[index][5] = robin[index][4] - robin[index][6];
        }

    }

    cout<<endl;
    cout<<"Process"<<"\t"<<"Arrival Time"<<"\t"<<"Burst Time"<<"Completion Time"<<"\t"<<"Turn Around Time"<<"\t"<<"Waiting Time"<<endl;
    double avg = 0, tt = 0;
    for(int i=0; i<n; i++) {
        cout<<"P"<<robin[i][2]+1<<"\t\t"<<robin[i][0]<<"\t\t"<<robin[i][6]<<"\t\t"<<robin[i][3]<<"\t\t"<<robin[i][4]<<"\t\t"<<robin[i][5]<<endl;
        avg = avg + robin[i][4];
        tt = tt + robin[i][5];
    }
    cout<<"\n\nAverage waiting time ="<<avg/n<<endl;
    cout<<"  Average Turnaround time ="<<tt/n<<endl;



}
