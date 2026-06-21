def solution(players, callings):
    rank = {name: i for i, name in enumerate(players)}  
    order = players[:]  

    for name in callings:
        idx = rank[name]        
        prev_idx = idx - 1       
        prev_name = order[prev_idx]  

        order[idx], order[prev_idx] = order[prev_idx], order[idx]
        rank[name] = prev_idx
        rank[prev_name] = idx

    return order