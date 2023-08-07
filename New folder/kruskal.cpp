// Online C++ compiler to run C++ program online
// #include <iostream>
#include<bits/stdc++.h>
using namespace std;
bool compare(vector<int>&a,vector<int>&b)
{
    return a[0]<b[0];
}
int findparent(int x,vector<int>&parent)
{
    if(x!=parent[x])
    {
        parent[x]=findparent(parent[x],parent);
    }
    return  parent[x];
}
void ranksize(int x,int y,vector<int>&parent,vector<int>&rank)
{
    int x_root=findparent(x,parent);
    int y_root=findparent(y,parent);
    if(x_root!=y_root)
    {
        if(rank[x_root]>rank[y_root])
        {
            parent[y_root]=x_root;
        }
        else if(rank[x_root]<rank[y_root])
        {
            parent[y_root]=x_root;
        }
        else{
            rank[x_root]++;
            parent[y_root]=x_root;
        }
    }
}
vector<vector<int>> kruskal(int n,vector<vector<int>>&adj)
{
    vector<int>parent(n);
    vector<int>rank(n,0);
    for(int i=0;i<n;i++)
    {
        parent[i]=i;
    }vector<vector<int>>result; int ans;
    sort(adj.begin(),adj.end(),compare);
    for(int i=0;i<n;i++)
    {
    for( auto it:adj)
    {
        int src= it[1];
        int dest=it[2];
        if(findparent(src,parent)!=findparent(dest,parent))
        {
            // result.push_back(it);
            ans+=it[0];
            ranksize(src,dest,parent,rank);
        }
    }
    }
        return result;
}

int main() {
    // Write C++ code here
    // std::cout << "Hello world!";
  int V = 6;
    vector<vector<int>> edges = {{0, 1, 2}, {0, 2, 1}, {1, 2, 1}, {2, 3, 2}, {3, 4, 1}, {4, 2, 2}};
    vector<vector<int>> adj[V];
    for (auto it : edges) {
        vector<int> tmp(2);
        tmp[0] = it[1];
        tmp[1] = it[2];
        adj[it[0]].push_back(tmp);

        tmp[0] = it[0];
        tmp[1] = it[2];
        adj[it[1]].push_back(tmp);
    }
    vector<vector<int>>ans=kruskal(6,edges);
   for(int i=0;i<edges.size();i++)
   {
       for(int j=0;j<6;j++)
   }

    // Solution obj;
    // int mstWt = obj.spanningTree(V, adj);
    // cout << "The sum of all the edge weights: " << mstWt << endl;
    return 0;
    
    
    
    
    
    
    
}
