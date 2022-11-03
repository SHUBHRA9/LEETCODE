class Solution {
    public String sortSentence(String s) {
        String str[] = s.split(" ");
        String res[] = new String[str.length];

    for(String x : str){
        int index = (x.charAt(x.length()-1)-'0');
        //storing string without the digit
        res[index-1] = x.substring(0, x.length()-1);  
    }
    String st = "";
    for(int i=0; i<res.length-1; i++){
        st += res[i];    //sorting the string according to the digit
        st += " ";
    }
    st += res[res.length-1];   
    return st; 
    }
}