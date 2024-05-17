#include<bits/stdc++.h>

using namespace std;

void getFirstFit(vector<int> processorSize, vector<int> blockSize, vector<int> &allocate, vector<int> &frag) {
    int m = blockSize.size();
    int n = processorSize.size();
    for(int i=0; i<n; i++) {
        int maxi = INT_MIN;
        int index = -1;
        for(int j=0; j<m; j++) {
            int diff = abs(processorSize[i] - blockSize[j]);

            if(diff > maxi && processorSize[i] <= blockSize[j] && blockSize[j] != 0) {
                maxi = diff;
                index = j;
            }

        }

        if(index != -1) {
            allocate[i] = index;
            frag[i] = blockSize[index] - processorSize[i];
            blockSize[index] = 0;
        }
    }
}

int main() {
    int n, p;
    cout<<"Enter the number of Blocks and Processors : ";
//    cin>>n>>p;
    n = 4;

    vector<int> processorSize = {212, 417,112,426};
    vector<int> blockSize = {100, 500, 200, 300, 600};

    vector<int> allocate(processorSize.size(), -1);
    vector<int> frag(n, -1);

    getFirstFit(processorSize, blockSize, allocate, frag);

    cout<<endl<<"Processor Size "<<"       "<<"Block Size "<<" and Fragmentation "<<endl;
    bool flag = false;
    for(int i=0; i<n; i++) {
        cout<<processorSize[i]<<"              "<<allocate[i]<<" --Internal Fragmentation : "<<frag[i]<<endl;
        if(frag[i] == -1) {
            flag = true;
        }
    }

    if(flag) {
        cout<<"External Fragmentation is there"<<endl;
    }
}
