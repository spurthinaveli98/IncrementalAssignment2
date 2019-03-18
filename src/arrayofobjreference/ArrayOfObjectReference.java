package arrayofobjreference;

public class ArrayOfObjectReference {
         ArrayOfObjectReference(String name) {
             System.out.println(name);
        }
        public static void main(String args[]) {
             ArrayOfObjectReference[] arrayOfObjectReferences = new ArrayOfObjectReference[3];

            //Doesn't  print any message as only references are created.
         }
}
