//Q4 String Compression.
public class Q4 {
    static int comressString(char[] chars){
        int n=chars.length;
        int i=0;
        int index=0;
        while(index<n){
            char ch=chars[index];
            int count=0;
            while(index<n && chars[index]==ch){
                count++;
                index++;
            }
            chars[i]=ch;
            i++;
            if(count>1){
                String temp=String.valueOf(count);
                for(char c : temp.toCharArray()){
                    chars[i]=c;
                    i++;
                }
            }
        }
        return i;
    }
    public static void main(String[] args) {
        char[] chars = {'a','a','b','b','c','c','c'};
        System.out.println(comressString(chars));
    }
}