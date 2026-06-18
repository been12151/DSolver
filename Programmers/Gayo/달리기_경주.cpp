#include <string>
#include <vector>
#include <unordered_map>
#include <utility>

using namespace std;

vector<string> solution(vector<string> players, vector<string> callings) {
    vector<string> answer;
    unordered_map<string, int> curr;
    
    for(int i=0; i<players.size(); i++){
        curr[players[i]] = i;
    }
    
    for(string call : callings){
        int curr_idx = curr[call];
        int prev_idx = curr_idx - 1;
        
        string prev_name = players[prev_idx];
        swap(players[curr_idx], players[prev_idx]);
        
        curr[call] = prev_idx;
        curr[prev_name] = curr_idx;
    }
    
    answer = players;
    return answer;
}