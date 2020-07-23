package LinkedList;

import java.util.PriorityQueue;

public class MergeTwoSortedListsSolution {
	 public class ListNode {
		 int val;
		 ListNode next;
		 ListNode() {}
		 ListNode(int val) { this.val = val; }
		 ListNode(int val, ListNode next) { this.val = val; this.next = next; }
	}
	
	 public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
		 PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
		 while (l1 != null) {
			 pq.offer(l1.val);
			 l1 = l1.next;
		 }
		 while(l2 != null) {
			 pq.offer(l2.val);
			 l2 = l2.next;
		 }
		 
		 ListNode root = new ListNode();
		 ListNode head = root;
		 while(!pq.isEmpty()) {
			 head.next = new ListNode(pq.poll());
			 head = head.next;
		 }
		 return root.next;
	 }
}
