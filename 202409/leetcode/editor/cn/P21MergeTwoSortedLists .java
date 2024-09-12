////将两个升序链表合并为一个新的 升序 链表并返回。新链表是通过拼接给定的两个链表的所有节点组成的。
////
////
////
//// 示例 1：
////
////
////输入：l1 = [1,2,4], l2 = [1,3,4]
////输出：[1,1,2,3,4,4]
////
////
//// 示例 2：
////
////
////输入：l1 = [], l2 = []
////输出：[]
////
////
//// 示例 3：
////
////
////输入：l1 = [], l2 = [0]
////输出：[0]
////
////
////
////
//// 提示：
////
////
//// 两个链表的节点数目范围是 [0, 50]
//// -100 <= Node.val <= 100
//// l1 和 l2 均按 非递减顺序 排列
////
////
//// Related Topics 递归 链表 👍 3591 👎 0
//
//package leetcode.editor.cn;
//
//import java.util.ArrayList;
//import java.util.List;
//
////java:合并两个有序链表
//class P21MergeTwoSortedLists{
//    public static void main(String[] args){
//        Solution solution = new P21MergeTwoSortedLists().new Solution();
//    }
//    //leetcode submit region begin(Prohibit modification and deletion)
///**
// * Definition for singly-linked list.
// * public class ListNode {
// *     int val;
// *     ListNode next;
// *     ListNode() {}
// *     ListNode(int val) { this.val = val; }
// *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
// * }
// */
//class Solution {
//    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
//        List<Integer> integerList1 = new ArrayList<>();
//        List<Integer> integerList2 = new ArrayList<>();
//        while (list1 != null){
//            integerList1.add(list1.val);
//            list1 = list1.next;
//        }
//        while (list2 != null){
//            integerList2.add(list2.val);
//            list2 = list2.next;
//        }
//        integerList1.addAll(integerList2);
//        integerList1.sort(Integer::compareTo);
//        if (integerList1 == null || integerList1.isEmpty()){
//            return null;
//        }
//        ListNode head = new ListNode(0);
//        ListNode temp = head;
//        for (int i = 0; i < integerList1.size(); i++) {
//            temp.next = new ListNode(integerList1.get(i));
//            temp = temp.next;
//        }
//        return head.next;
//    }
//}
////leetcode submit region end(Prohibit modification and deletion)
//
//}