class Solution
{
    // The given root is the root of the Binary Tree
    // Return the root of the generated BST
    Node binaryTreeToBST(Node root)
    {
       ArrayList<Integer> list = new ArrayList<>();
       solve(root, list);
       Collections.sort(list);
       return binaryst(list, 0, list.size()-1);
    }
    
    Node binaryst(ArrayList<Integer> list, int low, int high){
        if(low>high){
            return null;
        }   
        int mid = low + (high - low) / 2;
        Node root = new Node(list.get(mid));
        root.left = binaryst(list, low, mid - 1);
        root.right = binaryst(list, mid + 1, high);
        return root;
    }
    
    void solve(Node root, ArrayList<Integer> list){
        if(root == null){
            return; 
        }
        list.add(root.data);
        solve(root.left, list);
        solve(root.right, list);
    }
}
