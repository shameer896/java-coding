class Solution {
    public static Node reverse(Node node, int k) {
        Node prev = null;
        Node curr = node;
        for (int i = 0; i < k && curr != null; i++) {
            Node next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        if (curr != null) {
            node.next = reverse(curr, k);
        } else {
            node.next = null;
        }

        return prev;
    }
}
