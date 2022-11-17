public class Palindrome {
    public Deque<Character> wordToDeque(String word){
        LinkedListDeque result = new LinkedListDeque();
        int i;
        int length=word.length();
        for (i=0; i<length ;i++){
            result.addLast(word.charAt(i));
        }return result;
    }


    public boolean isPalindrome(String word){
        if (word==null || word.length()==1){
            return true;
        }else{
        Deque dequeword = wordToDeque(word);
        while (dequeword.size()>1) {
            if (dequeword.removeFirst() != dequeword.removeLast())
                return false;
        }return true;
    }}

    public boolean isPalindrome(String word, CharacterComparator cc){
        if (word==null || word.length()==1){
            return true;
        }else{
            Deque<Character> dequeword = wordToDeque(word);
            while (dequeword.size()>1) {
                char x = dequeword.removeFirst();
                char y= dequeword.removeLast();
                if (!(cc.equalChars(x, y)))
                    return false;
            }return true;
        }}






}
