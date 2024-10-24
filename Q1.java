//Q1 Pascal's Triangle.
import java.util.ArrayList;
import java.util.List;

public class Q1 {
    static List<List<Integer>> pascalsTriangle(int rows){
        List<List<Integer>> ans=new ArrayList<List<Integer>>();
        for(int i=0;i<rows;i++){
            List<Integer> row = new ArrayList<Integer>();
            List<Integer> prev = null;
            if(i>0){
                prev=ans.get(i-1);
            }
            for(int j=0;j<=i;j++){
                if(j==0 || j==i){
                    row.add(1);
                }
                else{
                    row.add(prev.get(j-1)+prev.get(j));
                }
            }
            ans.add(row);
        }
        return ans;
    }
    public static void main(String[] args) {
        List<List<Integer>> res = pascalsTriangle(5);
        for(int i=0;i<res.size();i++){
            for(int j=0;j<res.get(i).size();j++){
                System.out.print(res.get(i).get(j));
            }
            System.out.println("");
        }
    }
} 