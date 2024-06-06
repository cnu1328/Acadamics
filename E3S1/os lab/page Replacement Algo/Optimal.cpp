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
    string str = " [";

    for(int i=0; i<frame; i++) {

        if(frames[i] != -1)
            str += to_string(frames[i]) + " ";

         else break;
    }
    str.pop_back();
    str += "] ";
    cout<<str;
}

int isAvail(vector<int> &pages, int index, int val) {
    for(int i = index; i < pages.size(); i++) {
        if(pages[i] == val) {
            return i;
        }
    }

    return -1;
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
    int count = 0;

    for(int i = 0; i < n; i++) {

        if(count < frame) {
            frames[count] = pages[count];
            print(frames, frame);
            count++;
        }
        else {

            if(isPresent(frames, pages[i])) {
                cout<<" [Hit] ";
                continue;
            }


            int optimal = INT_MIN, val;

            for(int j=0; j<frame; j++) {

                int index = isAvail(pages, i+1, frames[j]);

                if(index == -1) {
                    val = frames[j];
                    break;
                }

                else if(index > optimal) {
                    optimal = index;
                    val = frames[j];
                }
            }

            auto index = find(frames.begin(), frames.end(), val);

            frames[index - frames.begin()] = pages[i];
            print(frames, frame);
        }
    }

    cout<<endl;
}
