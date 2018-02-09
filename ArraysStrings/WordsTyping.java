package ArraysStrings;

public class WordsTyping {
	public int wordsTyping(String[] sentence, int rows, int cols) {
            int total=rows*cols;
            int count=0;
            boolean flag=true;
            while(total>0){
                for(String i:sentence){
                    if(total<=0) {
                    		flag=false;
                        break;
                        }
                   
                    total=total-i.length();
                    if(total%5!=0)
                        total=total-1;
                        
                }
                if(flag)
                count++;
            }
        return count;
    }
	
	public static void main(String[] args) {
		WordsTyping w=new WordsTyping();
		String[] sentence= {"hello", "world"};
		w.wordsTyping(sentence, 2,8);
	}
}
