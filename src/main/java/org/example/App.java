package org.example;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Collctions collect = new Collctions();
        PractArrayList  arr = new PractArrayList();
        Sets ab  = new Sets();
        TreeMapDmo d = new TreeMapDmo();


        System.out.println( "Project Running perfect! " );

        collect.AddValue();
        System.out.println(collect.values);

        arr.Array();
        System.out.println(arr.arrayList);
        arr.arrayList.add(1,"Munyaradzi");
        System.out.println("Updated List");
        System.out.println(arr.arrayList);

        ab.AddNum();
        ab.num.add(300);
        System.out.println(ab.num);

        d.MapSet();
        System.out.println(d);

    }
}
