package arrayofobjects;

public class ArrayOfObjects {
    ArrayOfObjects(String item) {
        System.out.println(item);
    }
    public static void main(String args[]) {
        ArrayOfObjects[] arrayOfObjects=new ArrayOfObjects[3];
        for(int i=0;i<arrayOfObjects.length;i++)
            arrayOfObjects[i]=new ArrayOfObjects("hai"+ i);
    }
}

/*
-:Output:-
hai0
hai1
hai2
 */