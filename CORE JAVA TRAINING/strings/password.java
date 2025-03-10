public class password {
    public static void main(String[] args) {
        String name = "Smita";
        long ph = 9411010751L;
        int yearr = 2005;

        char[] charArray = name.toCharArray();
        char[] pass = new char[4]; // Store only first 4 characters

        // Extract first 4 characters and convert to uppercase using ASCII
        for (int i = 0; i < 4; i++) {
            if (charArray[i] >= 'a' && charArray[i] <= 'z') { // Check if it's lowercase
                pass[i] = (char) (charArray[i] - 32); // Convert to uppercase
            } else {
                pass[i] = charArray[i]; // If already uppercase, keep as is
            }
        }
        int min=9999;
        while(ph>=1000){
            int lst=(int)(ph%1000);
            if(lst>=100 && lst<min){
                min=lst;
            }
            ph=ph/10;}
        int last=0;


        String year = Integer.toString(yearr);
        for(int i=0;i<year.length();i++){
            int dig=year.charAt(i) - '0';
            if(dig%2==0){
                last=dig;
                break;
            }

        }

        // // Print the uppercase password
        // for (char ch : pass) {
        //     System.out.print(ch);
        // }
        // System.out.print(min);
        // System.out.print(last);
        
        String res = new String(pass)+min+last;
        System.out.println(res);
    }
}
