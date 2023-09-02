class Solution{
    public int getCount(Node node, int bud)
    {
        //code here  
        if(node==null||bud==0) return 0;
        Queue<Node> q = new LinkedList<>();
        int cnt=0;
        int cost=1;
        q.add(node);
        while(!q.isEmpty())
        {
            for(int i=0;i<q.size();i++)
            {
                if(bud==0) break;
                Node temp = q.poll();
                if(temp.left==null && temp.right==null && bud>=cost)
                {
                    cnt++;
                    bud-=cost;
                }
                if(temp.left!=null) q.add(temp.left);
                if(temp.right!=null) q.add(temp.right);
                
            }
            cost++;
        }
        return cnt;
        
    }
}
