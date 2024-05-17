
#include<bits/stdc++.h>

using namespace std;

void completion(vector<vector<int>> &sjf) {
    int n = sjf.size();
    sjf[0][3] = sjf[0][0] + sjf[0][1];
    sjf[0][4] = sjf[0][3] - sjf[0][0];
    sjf[0][5] = sjf[0][4] - sjf[0][1];

    for(int i=1; i<n; i++) {

        int index = i;
        int mini = sjf[i][1];

        for(int j=index+1; j<n; j++) {
            if(sjf[j][0] <= sjf[i-1][3]) {
                if(sjf[j][1] < mini) {
                    mini = sjf[j][1];
                    index = j;
                }
            }
        }

        if(index != i) {
            swap(sjf[index], sjf[i]);
        }

        if(sjf[i][0] <= sjf[i-1][3]) {
            sjf[i][3] = sjf[i-1][3] + sjf[i][1];
        } else {
            sjf[i][3] = sjf[i][0] + sjf[i][1];
        }

        sjf[i][4] = sjf[i][3] - sjf[i][0];
        sjf[i][5] = sjf[i][4] - sjf[i][1];
    }
}

int main() {
	int n;
	cout<<"Enter the number of processors :  ";
	cin>>n;

	vector<vector<int>> sjf(n, vector<int> (6, 0));
	cout<<endl<<"Enter arrival and Burst Timings of Processors :  "<<endl<<endl;
	int a,b;

	for(int i=0; i<n; i++) {
		cout<<"Enter Processor P"<<i+1<<" Arrival and Burst timings : ";
		cin>>sjf[i][0]>>sjf[i][1];
		sjf[i][2] = i;
	}

	sort(sjf.begin(), sjf.end());

    completion(sjf);
    double atat = 0;
    double awt = 0;

    cout<<endl<<endl<<"Processors"<<"    Arrival time "<<"    Burst Time"<<"  Completion Time "<<"  Turn Around Time "<<" Wait Time "<<endl;
	for(int i=0; i<n; i++) {
		cout<<"P"<<sjf[i][2]+1<<"		"<<sjf[i][0]<<"		"<<sjf[i][1]<<"  		"<<sjf[i][3]<<"    		"<<sjf[i][4]<<" 	    	"<<sjf[i][5]<<endl;
		atat += sjf[i][4];
		awt += sjf[i][5];
	}

    cout<<endl<<"Average Turn Around Time : "<<atat/n<<endl;
	cout<<"Average Wait Time : "<<awt/n<<endl<<endl;

}
