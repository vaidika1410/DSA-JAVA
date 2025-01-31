package LinearSearchAlgo;

public class SearchStringElement {
    public static void main(String[] args) {
       String name = "Gautam";
       char target = 'u';
       
       Boolean found = search(name, target);
       System.out.println(found);
    }

    static boolean search(String str, char target){
        if(str.length() == 0){
            return false;
        }

        for(int i=0; i<str.length(); i++){
            if(str.charAt(i) == target){
                return true;
            }
        }

        return false;
    }

    static boolean search2(String str, char target){
        if(str.length() == 0){
            return false;
        }

        for(char c : str.toCharArray()){
            if(c == target){
                return true;
            }
        }
        return false;
    }
}
