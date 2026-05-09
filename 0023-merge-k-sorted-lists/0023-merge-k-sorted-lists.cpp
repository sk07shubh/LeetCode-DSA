/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     ListNode *next;
 *     ListNode() : val(0), next(nullptr) {}
 *     ListNode(int x) : val(x), next(nullptr) {}
 *     ListNode(int x, ListNode *next) : val(x), next(next) {}
 * };
 */
class Solution {
public:
    ListNode* mergeTwoSortedList(ListNode* L1 , ListNode* L2){
        if(!L1) return L2;
        if(!L2) return L1;
        if(L1->val <= L2->val){
            L1->next = mergeTwoSortedList(L1->next,L2);
            return L1;
        }else{
            L2->next = mergeTwoSortedList(L1,L2->next);
            return L2;
        }
        return NULL;
    }
    ListNode* PartitionAndMerge(int st,int end,vector<ListNode*>&lists){
        if(st>end) return NULL;
        if(st == end) return lists[st];
        
        int mid = st + (end - st)/2;
        ListNode* L1 = PartitionAndMerge(st,mid,lists);
        ListNode* L2 = PartitionAndMerge(mid+1,end,lists);
        
        return mergeTwoSortedList(L1,L2);
        
    }
    ListNode* mergeKLists(vector<ListNode*>& lists) {
        int st = 0;
        int end = lists.size()-1;
        return PartitionAndMerge(st,end,lists);
        
    }
};