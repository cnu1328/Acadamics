#include<bits/stdc++.h>

using namespace std;


void completion(vector<vector<int>> &fcfs) {
    int n = fcfs.size();
    fcfs[0][3] = fcfs[0][0] + fcfs[0][2];
    fcfs[0][4] = fcfs[0][3] - fcfs[0][0];
    fcfs[0][5] = fcfs[0][4] - fcfs[0][2];

    for(int i=1; i<n; i++) {
        if(fcfs[i][0] <= fcfs[i-1][3]) {
            fcfs[i][3] = fcfs[i-1][3] + fcfs[i][2];
        } else {
            fcfs[i][3] = fcfs[i][0] + fcfs[i][2];
        }

        fcfs[i][4] = fcfs[i][3] - fcfs[i][0];
        fcfs[i][5] = fcfs[i][4] - fcfs[i][2];
    }
}

int main() {
	int n;
	cout<<"Enter the number of processors :  ";
	cin>>n;

	vector<vector<int>> fcfs(n, vector<int> (6, 0));
	cout<<endl<<"Enter arrival and Burst Timings of Processors :  "<<endl<<endl;
	int a,b;

	for(int i=0; i<n; i++) {
		cout<<"Enter Processor P"<<i+1<<" Arrival and Burst timings : ";
		cin>>fcfs[i][0]>>fcfs[i][2];
		fcfs[i][1] = i;

	}

	sort(fcfs.begin(), fcfs.end());

    completion(fcfs);
    double atat = 0;
    double awt = 0;

    cout<<endl<<endl<<"Processors"<<"    Arrival time "<<"    Burst Time"<<"  Completion Time "<<"  Turn Around Time "<<" Wait Time "<<endl;
	for(int i=0; i<n; i++) {
		cout<<"P"<<fcfs[i][1]+1<<"		"<<fcfs[i][0]<<"		"<<fcfs[i][2]<<"  		"<<fcfs[i][3]<<"    		"<<fcfs[i][4]<<" 	    	"<<fcfs[i][5]<<endl;
		atat += fcfs[i][4];
		awt += fcfs[i][5];
	}

    cout<<endl<<"Average Turn Around Time : "<<atat/n<<endl;
	cout<<"Average Wait Time : "<<awt/n<<endl<<endl;

}
