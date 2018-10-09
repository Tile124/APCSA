public static double question (String[] array1) { 
double length = array1.length; 
double sum = 0; 
int count = 0; 

while (count <= length) { 
sum += (array1[1]).length(); 
count++; 
} 
double returnValue = sum / length; 
return (returnValue); 

} 


public static void main(String[] args) { 

String[] array1 = new String[] {"abcd","a","abcd","abcd"}; 
System.out.println(question(array1)); 
}