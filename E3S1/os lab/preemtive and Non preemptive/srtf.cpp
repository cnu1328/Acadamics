#include<bits/stdc++.h>

using namespace std;

int main() {
    int n;
    cout<<"Enter the number of processors : "<<endl;
    cin>>n;

    vector<vector<int>> srtf(n, vector<int> (7, 0));
    int burst = 0;

    for(int i=0; i<n; i++) {
        cout<<"Enter Arrival and Burst time of P"<<i+1<<" : ";
        cin>>srtf[i][0]>>srtf[i][1];
        burst += srtf[i][1];
        srtf[i][6] = srtf[i][1];
        srtf[i][2] = i;
    }


    sort(srtf.begin(), srtf.end());

    int processed = 0, smallest = 0;
    int arrival = srtf[0][0];

    for(int time = arrival; processed != n; time++) {

        int mini = INT_MAX;

        for(int i=0; i<n; i++) {
            if(srtf[i][0] <= time) {
                if(srtf[i][1] < mini && srtf[i][1] > 0) {
                    mini = srtf[i][1];
                    smallest = i;

                }
            }
        }

        srtf[smallest][1]--;

        if(srtf[smallest][1] == 0) {
            processed++;
            int complete = time + 1;
            srtf[smallest][3] = complete;
            srtf[smallest][4] = complete - srtf[smallest][0];
            srtf[smallest][5] = srtf[smallest][4] - srtf[smallest][6];
        }

        if(time > burst) {
            cout<<"Please Enter Valid arrival and burst time"<<endl;
            break;
        }
    }

    cout<<"Process"<<"\t"<<"Arrival Time"<<"\t"<<"Burst Time"<<"Completion Time"<<"\t"<<"Turn Around Time"<<"\t"<<"Waiting Time"<<endl;
    double avg = 0, tt = 0;
    for(int i=0; i<n; i++) {
        cout<<"P"<<srtf[i][2]+1<<"\t\t"<<srtf[i][0]<<"\t\t"<<srtf[i][6]<<"\t\t"<<srtf[i][3]<<"\t\t"<<srtf[i][4]<<"\t\t"<<srtf[i][5]<<endl;
        avg = avg + srtf[i][4];
        tt = tt + srtf[i][5];
    }
    cout<<"\n\nAverage waiting time ="<<avg/n<<endl;
    cout<<"  Average Turnaround time ="<<tt/n<<endl;


}
