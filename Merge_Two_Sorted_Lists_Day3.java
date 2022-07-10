public class Merge_Two_Sorted_Lists_Day3 {

    public static void main(String[] args) {
        ListNode list1 = new ListNode(1);
        list1.next = new ListNode(2);
        list1.next.next = new ListNode(4);
        ListNode list2 = new ListNode(1);
        list2.next = new ListNode(3);
        list2.next.next = new ListNode(4);
        ListNode mergedList = mergeTwoLists(list1, list2);
        while (mergedList != null) {
            System.out.print(mergedList.val + " ");
            mergedList = mergedList.next;
        }

    }
    
    // Time Complexity: O(m+n)
    // Space Complexity: O(1)
    public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if (list1 == null)
            return list2;
        if (list2 == null)
            return list1;
        ListNode mergedHead = new ListNode(-1), mergedTail = mergedHead;
        while (list1 != null && list2 != null) {
            if (list1.val < list2.val) {
                mergedTail.next = list1;
                mergedTail = mergedTail.next;
                list1 = list1.next;
            } else {
                mergedTail.next = list2;
                mergedTail = mergedTail.next;
                list2 = list2.next;
            }
            // list1 = list1.next;
            // list2 = list2.next;
        }
        if (list1 == null)
            mergedTail.next = list2;
        else
            mergedTail.next = list1;
        return mergedHead.next;
    }

    // Time Complexity: O(m+n)
    // Space Complexity: O(1)
    // public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
    //     if (list1 == null)
    //         return list2;
    //     if (list2 == null)
    //         return list1;
    //     ListNode mergedHead = null, mergedTail = null;
    //     while (list1 != null && list2 != null) {
    //         if (list1.val < list2.val) {
    //             if (mergedHead == null) {
    //                 mergedHead = mergedTail = list1;
    //             } else {
    //                 mergedTail.next = list1;
    //                 mergedTail = mergedTail.next;
    //             }
    //             list1 = list1.next;
    //         } else {
    //             if (mergedHead == null) {
    //                 mergedHead = mergedTail = list2;
    //             } else {
    //                 mergedTail.next = list2;
    //                 mergedTail = mergedTail.next;
    //             }
    //             list2 = list2.next;
    //         }
    //     }
    //     if (list1 == null)
    //         mergedTail.next = list2;
    //     else
    //         mergedTail.next = list1;
    //     return mergedHead;
    // }
}

class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}
