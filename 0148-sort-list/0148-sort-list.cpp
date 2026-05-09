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

    ListNode* sortList(ListNode* head) {
        if (!head || !head->next) return head;

        ListNode* slow = head;
        ListNode* fast = head->next;  
        while (fast && fast->next) {
            slow = slow->next;
            fast = fast->next->next;
        }

        
        ListNode* mid = slow->next;
        slow->next = NULL;

        
        ListNode* left  = sortList(head);
        ListNode* right = sortList(mid);

        
        return mergeTwoSortedList(left, right);
    }
};