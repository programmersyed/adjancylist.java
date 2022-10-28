import java.util.ArrayList;
import java.util.LinkedList;

public class Graph {
    ArrayList<LinkedList<Node>> list;
    Graph(){
        list = new ArrayList<>();
    }
    public void addNode(Node node){
    LinkedList<Node> currentList= new LinkedList<>();
    currentList.add(node);
    list.add(currentList);
    }
    public void addEdge(int src, int dst){
    LinkedList<Node> currentList = list.get(src);
    Node dstNode = list.get(dst).get(0);
    currentList.add(dstNode);
    }
    public boolean checkEdge(int src, int dst){
        LinkedList<Node> currentList = list.get(src);
        Node dstNode = list.get(dst).get(0);
        for (Node node :currentList){
            if (node ==dstNode){
            return true;
            }

        }
         return false;
    }
    public void print(){
for (LinkedList<Node> currentList : list){
    for(Node node :currentList){
        System.out.print(node.data+" -> ");
    }
    System.out.println();
}
    }

}
// Adjacency List = An array/arraylist of linkedlists.

//			          Each LinkedList has a unique node at the head.

//			          All adjacent neighbors to that node are added to that node's linkedlist



//				  runtime complexity to check an Edge: O(v)

//				  space complexity: O(v + e)
