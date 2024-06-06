#include<bits/stdc++.h>

using namespace std;

int main() {
    int n, m;
    cout<<"Enter number of Processors : ";
    cin>>n;
    cout<<"Enter number of Resources : ";
    cin>>m;

    vector<vector<int>> maxi(n, vector<int> (m, 0));
    vector<vector<int>> alloc(n, vector<int> (m, 0));
    vector<vector<int>> need(n, vector<int> (m, 0));
    vector<int> avail(n, 0), work(n, 0);

    cout<<"Enter Maximum Matrix Elements : "<<endl;

    for(int i=0; i<n; i++) {
        for(int j=0; j<m; j++) {
            cin>>maxi[i][j];
        }
    }

    cout<<"Enter Allocation matrix Elements : "<<endl;

    for(int i=0; i<n; i++) {
        for(int j=0; j<m; j++) {
            cin>>alloc[i][j];
        }
    }

    cout<<"Enter Available Resource values : "<<endl;

    for(int i=0; i<m; i++) {
        cin>>avail[i];
        work[i] = avail[i];
    }

    for(int i=0; i<n; i++) {
        for(int j=0; j<m; j++) {
            need[i][j] = maxi[i][j] - alloc[i][j];
        }
    }

    vector<int> sequence;
    vector<bool> finished(n, false);

    int count = 0;
    while (count < n) {
        bool found = false;
        for (int i = 0; i < n; i++) {
            if (finished[i] == false) {
                bool canExecute = true;

                for (int j = 0; j < m; j++) {
                    if (need[i][j] > work[j]) {
                        canExecute = false;
                        break;
                    }
                }
                if (canExecute) {
                    for (int j = 0; j < m; ++j) {
                        work[j] += alloc[i][j];
                    }
                    sequence.push_back(i);
                    finished[i] = true;
                    found = true;
                    count++;
                }
            }
        }

        if (!found) {
            cout << "The given sequence is not safe." << endl;
            break;
        }
    }


    if (count == n) {
        cout << "The given sequence is safe: ";
        for (int i = 0; i < n; ++i) {
            cout << "P" << sequence[i] << "->";
        }
        cout << "Finished" << endl;
    }



}


