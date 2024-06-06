#include<bits/stdc++.h>

using namespace std;

int main() {
    int n;
    cout<<"Enter the number of processors : "<<endl;
    cin>>n;

    vector<vector<int>> prior(n, vector<int> (8, 0));
    int burst = 0;

    for(int i=0; i<n; i++) {
        cout<<"Enter Arrival, Burst time and priority of P"<<i+1<<" Processor : ";
        cin>>prior[i][0]>>prior[i][3]>>prior[i][1];
        burst += prior[i][3];
        prior[i][7] = prior[i][3];
        prior[i][2] = i;
    }


    sort(prior.begin(), prior.end());

    int processed = 0, smallest = 0;
    int arrival = prior[0][0];

    for(int time = arrival; processed != n; time++) {

        int mini = INT_MIN;

        for(int i=0; i<n; i++) {
            if(prior[i][0] <= time) {
                if(prior[i][1] > mini && prior[i][3] > 0) {
                    mini = prior[i][1];
                    smallest = i;
                }
            }
        }

        prior[smallest][3]--;

        if(prior[smallest][3] == 0) {
            processed++;
            int complete = time + 1;
            prior[smallest][4] = complete;
            prior[smallest][5] = complete - prior[smallest][0];
            prior[smallest][6] = prior[smallest][5] - prior[smallest][7];
        }

        if(time > burst) {
            cout<<"Please Enter Valid arrival and burst time"<<endl;
            break;
        }
    }

    cout<<"Process"<<"\t"<<"Arrival Time"<<"\t"<<"Burst Time"<<"  Priority "<<"Completion Time"<<"\t"<<"Turn Around Time"<<"\t"<<"Waiting Time"<<endl;
    double avg = 0, tt = 0;
    for(int i=0; i<n; i++) {
        cout<<"P"<<prior[i][2]+1<<"\t\t"<<prior[i][0]<<"\t\t"<<prior[i][7]<<"\t\t"<<prior[i][1]<<"\t\t"<<prior[i][4]<<"\t\t"<<prior[i][5]<<"\t\t"<<prior[i][6]<<endl;
        avg = avg + prior[i][5];
        tt = tt + prior[i][6];
    }
    cout<<"\n\nAverage waiting time ="<<avg/n<<endl;
    cout<<"  Average Turnaround time ="<<tt/n<<endl;


}
