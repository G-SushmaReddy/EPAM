package org.example;//package org.example;
//
//import java.util.ArrayList;
//import java.util.Collections;
//import java.util.Comparator;
//import java.util.List;
//

import org.example.Student;

////TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
//// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
//public class Main {
//    public static void main(String[] args) {
//        Student2 s1 = new Student2(2,"Sushma");
//        Student2 s2 = new Student2(3,"Sindhu");
//        List<Student2> sl = new ArrayList<>();
//        sl.add(s2);
//        sl.add(s1);
//        Comparator<Student2> comparator = new Comparator<Student2>(){
//            public int compare(Student2 s1,Student2 s2)
//            {
//                if(s1.getId()>s2.getId())
//                {
//                    return 1;
//                }
//                else if(s1.getId()==s2.getId())
//                {
//                    return 0;
//                }
//                else {
//                    return -1;
//                }
//            }
//        };
//        Collections.sort(sl,comparator);
//        for(Student2 s:sl)
//        {
//            System.out.println(s);
//        }
//    }
//}



public class Main {
    public static void main(String[] args) {
        Student e1 = new Student(101,"Sushma");
        Student e2 = new Student(101,"Sushma");
        System.out.println(e1.equals(e2));
        System.out.println(e1==e2);

        String s1 = new String("Manvi");
        String s2 = new String("Manvi");
        System.out.println(s1.equals(s2));
        System.out.println(s1==s2);





    }
}