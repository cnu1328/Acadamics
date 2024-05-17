#include<bits/stdc++.h>

using namespace std;

bool isPresent(vector<int> frames, int sr) {
    for(int i=0; i < frames.size(); i++) {
        if(frames[i] == sr)
            return true;
    }

    return false;
}


void print(vector<int> frames, int frame) {
    string str = " [ ";

    for(int i=0; i<frame; i++) {

        if(frames[i] != -1)
            str += to_string(frames[i]) + " ";

         else break;
    }

    str += " ] ";
    cout<<str;
}

int main() {
    cout<<"Enter number of pages  and Frames: ";
    int n = 20, frame = 3;
//    cin>>n>>frame;

    vector<int> pages = {7, 0, 1, 2, 0, 3, 0, 4, 2, 3, 0, 3, 2, 1, 2, 0, 1, 7, 0, 1};

//    for(int i=0; i<n; i++) {
//        int a;
//        cin>>a;
//        pages.push_back(a);
//    }

    vector<int> frames(frame, -1);
    int frameIndex = 0;

    for(int index = 0; index < n; index++) {
        frameIndex = frameIndex%frame;

        if(isPresent(frames, pages[index])) {
            cout<<" [ Hit ] ";
        }

        else {
            frames[frameIndex] = pages[index];
            frameIndex++;
            print(frames,frame);
        }
    }

    cout<<endl;
}
