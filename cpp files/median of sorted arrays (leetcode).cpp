//Given two sorted arrays nums1 and nums2 of size m and n respectively, return the median of the two sorted arrays.
//time complexity :O(m+n)

#include <bits/stdc++.h>
using namespace std;

double findMedianSortedArrays(vector<int>nums1, vector<int>nums2) 
{
       int len =nums1.size() +nums2.size();
        int p=len-1;
         int temp[len];
        double result;
         int i=0,j=0,k=0;
  //merging two arrays 
    while (i<nums1.size()){
       temp[k] = nums1[i];
       k++;
       i++;
    }
    while (j <nums2.size()){
       temp[k] = nums2[j];
       k++;
       j++;
    } 
    sort(temp,temp+len);
    //finding median for merged array
    if(len%2==1){
        result=temp[p/2];
    }
    else{
        result=(temp[p/2]+temp[p/2+1])/2.00;
    }
    
    return result;
}
        
int main()
{
   vector<int> nums1;
   vector<int> nums2;
   //reading nums1
   int x;
  while(cin>>x)
  {
  	nums1.push_back(x);
  }
  //reading nums2
   int y;
   while(cin>>y)
   {
   	nums2.push_back(y);
   }
 //printing the output
 double ans= findMedianSortedArrays(nums1,nums2);
  cout<<fixed<<setprecision(5)<<ans;
    return 0;
}