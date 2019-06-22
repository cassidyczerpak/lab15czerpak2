import java.util.*;
class Main{

    public static void main(String args[]) {
        Enumeration cars;
        Vector carNames = new Vector();
        BitSet bs = new BitSet();
        carNames.add("Acqa");
        carNames.add("Audi");
        carNames.add("Hundai");
        carNames.add("BMW");
        carNames.add("Maruthi");
        cars= carNames.elements();
        System.out.println("Enumeration of cars ");
        while (cars.hasMoreElements()) {
            System.out.println(cars.nextElement());
        }

        for(int i=1;i<=5;i++)
        {
            bs.set(i);
        }
        System.out.println("Bitset of flag" );
        System.out.println(bs);

        System.out.println("\nVectors");
        Vector<String> vec = new Vector<String>(2);

        /* Adding elements to a vector*/
        vec.addElement("Apple");
        vec.addElement("Orange");
        vec.addElement("Mango");
        vec.addElement("Fig");

        /* check size and capacityIncrement*/
        System.out.println("Size is: "+vec.size());
        System.out.println("Default capacity increment is: "+vec.capacity());

        System.out.println("\nElements are:");
        Enumeration en = vec.elements();
        while(en.hasMoreElements())
            System.out.println(en.nextElement() + " ");

        Stack stack = new Stack();

// populating stack
        stack .push("Java");
        stack .push("Source");
        stack .push("code");

// removing top object
        System.out.println("Removed object is: "+stack .pop());

// elements after remove
        System.out.println("Elements after remove: "+stack );

        Map mapex=new HashMap();
//Adding elements to map
        mapex.put(1,"Hemanth");
        mapex.put(5,"Anil");
        mapex.put(2,"Shafi");
        mapex.put(6,"Raju");
        mapex.put(7,"Ravi");
//Traversing Map
        Set set=mapex.entrySet();//Converting to Set so that we can traverse
        Iterator itr=set.iterator();
        System.out.println("Map Example");
        while(itr.hasNext()){
//Converting to Map.Entry so that we can get key and value separately
            Map.Entry entry=(Map.Entry)itr.next();
            System.out.println(entry.getKey()+" "+entry.getValue());
        }

        Hashtable<Integer,String> hash=new Hashtable<Integer,String>();

        hash.put(100,"Amit");
        hash.put(102,"Ravi");
        hash.put(101,"Vijay");
        hash.put(103,"Rahul");
        System.out.println("HashTable Example");
        for(Map.Entry m:hash.entrySet()){
            System.out.println(m.getKey()+" "+m.getValue());
        }

    }
}