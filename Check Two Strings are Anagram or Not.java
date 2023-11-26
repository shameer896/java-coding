import java.util.*;
class HelloWorld {
   public static void main(String[] args) {
		
		String s1 = "prep";
		String s2 = "Repp";
		
		boolean ans=true;
		
		if(s1.length()!=s2.length())
		{
		    ans=false;
		}
		else{
		    char[] c1=s1.toCharArray();
		    char[] c2=s2.toCharArray();
		    
		    for(int i=0;i<c1.length;i++){
		        if(c1[i]>='A' && c1[i]<='Z'){
		            c1[i]=(char)(c1[i] + 32);
		        }
		            
		        if(c2[i]>='A' && c2[i]<='Z'){
		            c2[i]=(char)(c2[i] + 32);
		        }
		    }
		    
		    Arrays.sort(c1);
		    Arrays.sort(c2);
		    for(int i=0;i<c1.length;i++){
		        if(c1[i]!=c2[i])
		        {
		            ans=false;
		            break;
		        }
		    }
		}
		
        System.out.print(ans); 
   }
}
