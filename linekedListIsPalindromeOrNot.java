class ListNode{
    int data;
    ListNode next;
    ListNode(){}
    ListNode(int val){this.data = val;}
    ListNode(int val, ListNode next){this.data = val; this.next = next;}
}
public class linekedListIsPalindromeOrNot {

    // FINDING THE MIDDLE TERM(HARE-TURTALE METHOD)
    public static ListNode middleTerm(ListNode head){
        ListNode fast = head;
        ListNode slow = head;
        while(fast != null && fast.next != null){ //LINE TO BE REMEMBERED
            fast = fast.next.next;
            slow = slow.next;
        }
        return slow;
    }

    // REVERSING SECOND HALF
    public static ListNode reverse(ListNode head){
        ListNode prev = null;
        ListNode curr = head;
        while(curr != null){     //LINE TO BE REMEMBERED
            ListNode last = curr.next;
            prev = curr.next;
            
            prev = curr;
            curr = last;
        }
        return prev;
    }

    public static boolean isPalindrome(ListNode head){

        ListNode middle = middleTerm(head);
        ListNode secHalf = reverse(middle.next);
        ListNode firstHalf = head;
        
        while(secHalf != null){
            if(firstHalf.data == secHalf.data){
                return true;
            }

            firstHalf = firstHalf.next;
            secHalf = secHalf.next;
        }
        return false;
    }
    public static void printList(ListNode head){
        if(head == null){
            return ;
        }
        ListNode curr = head;
        while(curr != null){
            System.out.print(curr.data);
            if(curr.next != null){
                System.out.print(" -> ");
            }
            curr = curr.next;
        }
        System.out.println();

    }
    public static ListNode createList(int[] nums){
        ListNode dummy = new ListNode(0);
        ListNode curr = dummy;
        for(int num : nums){
            curr.next = new ListNode(num);
            curr = curr.next;
        }
        return dummy.next;
    }
    public static void main(String[] args) {
        int[] nums = {1,2,2,1};
        ListNode list = createList(nums);
        printList(list);
        System.out.println(isPalindrome(list));
    }
    
}
