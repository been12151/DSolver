#include <string>
#include <vector>
#include <set>
#include <algorithm>

using namespace std;

vector<int> solution(vector<int> numbers) {
    set<int> del;

    for(int i=0; i<numbers.size()-1; i++){
        for(int j=i+1; j<numbers.size(); j++){
            del.insert(numbers[i]+numbers[j]);
        }
    }
    vector<int> answer(del.begin(), del.end());
    
    return answer;
}