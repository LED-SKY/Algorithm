package leeCode;

import java.util.LinkedList;

/**
 * @program: Algorithm
 * @description:
 * @author: 邓造坚
 * @create: 2021-07-24 14:27
 * <p>
 * <p>
 * 给你两个 非空 的链表，表示两个非负的整数。它们每位数字都是按照 逆序 的方式存储的，并且每个节点只能存储 一位 数字。
 * <p>
 * 请你将两个数相加，并以相同形式返回一个表示和的链表。
 * <p>
 * 你可以假设除了数字 0 之外，这两个数都不会以 0 开头。
 * <p>
 * 输入：l1 = [2,4,3], l2 = [5,6,4]
 * 输出：[7,0,8]
 * 解释：342 + 465 = 807.
 **/
public class addTwoNumbers {
    public static void main(String[] args) {
        ListNode l1 = new ListNode(2, null);
        ListNode l2 = new ListNode(4, null);
        ListNode l3 = new ListNode(3, null);

        l1.next = l2;
        l2.next = l3;
        ListNode t1 = new ListNode(5, null);
        ListNode t2 = new ListNode(6, null);
        ListNode t3 = new ListNode(4, null);
        t1.next = t2;
        t2.next = t3;
        Solution(l1, t1);

    }

    static class ListNode {
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

    public static ListNode Solution(ListNode l1, ListNode l2) {


        ListNode resultNode = new ListNode();
        ListNode midNode = new ListNode();
        resultNode = midNode;
        int sum = 0;
        int num1 = 0;
        int num2 = 0;
        LinkedList<Integer> list = new LinkedList<>();
        LinkedList<Integer> list2 = new LinkedList<>();
        while (l1 != null) {
            list.push(l1.val);
            l1 = l1.next;
        }

        while (l2 != null) {
            list2.push(l2.val);
            l2 = l2.next;
        }

        for (int i = 0; i < list.size(); i++) {
            num1 += list.get(i);
            num1 = num1 *10;
        }
        num1 = num1/10;

        for (int i = 0; i < list2.size(); i++) {
            num2 += list2.get(i);
            num2 = num2 *10;
        }
        num2 = num2/10;
        sum = num1 + num2;
        
        if (sum == 0){
            return resultNode = new ListNode(0);
        }
        
        while (sum !=0){
            int temp = sum %10;
            System.out.println(temp);
            midNode.next = new ListNode(temp);
            midNode = midNode.next;
            sum = sum/10;
        }
        
        resultNode = resultNode.next;

        return resultNode;
    }
}
