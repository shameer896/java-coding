class Solution{
    public Node removeDuplicates(Node head) {
        Set<Integer> st=new HashSet<>();
        Node current=head,prev=null;
        while(current!=null){
            if(!st.contains(current.data)){
                st.add(current.data);
                if(prev==null){
                    prev=current;
                }
                else{
                    prev.next=current;
                    prev=prev.next;
                }
            }
            current=current.next;
        }
        prev.next=null;
        return head;
    }
}
