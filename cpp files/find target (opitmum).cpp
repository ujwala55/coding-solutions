 //by using hash map  
 //time complexity = O(n)
#include<bits/stdc++.h>
using namespace std;

 vector<int> twoSum(vector<int> nums, int target) {
       unordered_map<int ,int>m;
        for(int i=0;i<nums.size();i++)
        {
            if(m.count(target-nums[i])>0)
                return {m[target-nums[i]],i};
            else
                m[nums[i]]=i;
        }
        return{-1,-1};
    }
    int main()
    {
      int target;
      cin>>target;
      vector<int> nums;
      int x;
      while(cin>>x)
      {
          nums.push_back(x);
      }
     vector<int> res= twoSum(nums,target);
     for(int i=0;i<res.size();i++)
     {
     	cout<<res[i]<<" ";
     }
     return 0;
    } 