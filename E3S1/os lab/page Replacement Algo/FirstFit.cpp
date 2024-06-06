#include<bits/stdc++.h>

using namespace std;

void getFirstFit(vector<int> processorSize, vector<int> blockSize, vector<int> &allocate, vector<int> &frag) {
    int m = blockSize.size();
    int n = processorSize.size();
    for(int i=0; i<n; i++) {

        for(int j=0; j<m; j++) {
            if(processorSize[i] <= blockSize[j]) {
                allocate[i] = j;
                frag[i] = blockSize[j] - processorSize[i];
                blockSize[j] = 0;
                break;
            }

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
    vector<int> frag(4, -1);

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
