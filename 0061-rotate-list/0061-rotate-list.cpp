class Solution {
public:
    ListNode* rotateRight(ListNode* head, int k) {
        if (!head || !head->next || k == 0) return head;

        
        int length = 1;
        ListNode* last = head;
        while (last->next) {
            last = last->next;
            length++;
        }

        
        k = k % length;
        if (k == 0) return head;

        
        last->next = head;

        
        int steps = length - k - 1;
        ListNode* newTail = head;
        while (steps--) {
            newTail = newTail->next;
        }

        
        ListNode* newHead = newTail->next;

        
        newTail->next = nullptr;

        return newHead;
    }
};