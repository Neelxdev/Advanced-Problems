public class reverseNumber2 {
    public static int reversedNo(int num){
       String NewNum = Integer.toString(num);
       StringBuilder sb = new StringBuilder(NewNum);
       int n = NewNum.length();
       for(int i = 0; i<NewNum.length()/2; i++){
           int front = i;
           int back = n-i-1;
           char frontChars = sb.charAt(front);
           char backchars = sb.charAt(back);
           sb.setCharAt(front, backchars);
           sb.setCharAt(back, frontChars);
        }
        num = Integer.parseInt(sb.toString());
        return num;
    }
    public static void main(String[] args) {
        int num = 123456789;
        System.out.println("REVERSED INTEGER-->"+reversedNo(num));
    }
}
