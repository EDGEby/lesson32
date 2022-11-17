package lesson32;

import java.util.*;

public class Main {
    public static void sortProducts(List<Product> products, int choice, boolean revers){
        switch (choice){
            case 1:
                System.out.println("Sort on name");
                Comparator<Product> comparatorName=(o1,o2) -> o1.getName().compareTo(o2.getName());
                break;
            case 2:
                System.out.println("Sort on Rank");
                Comparator<Product>comparator=(o1,o2) -> Integer.compare(o2.getRank(), o1.getRank());
                Collections.sort(products,comparator);
                break;

            case 3:
                if (!revers) {
                    System.out.println("Sort on Price <");
                    Comparator<Product> comparatorPrice = (o1, o2) -> Double.compare(o1.getPrice(), o2.getPrice());
                    Collections.sort(products, comparatorPrice);
                    break;
                }
                else{
                    System.out.println("Sort on Price >");
                    Comparator<Product> comparatorPrice = (o1, o2) -> Double.compare(o1.getPrice(), o2.getPrice());
                    Collections.sort(products, Collections.reverseOrder(comparatorPrice));
                break;
                }
        }

    }

    public static void main(String[] args) {
        // Set<String> set = new HashSet<>();
       /* set.add("Mom");
        set.add("Bila");
        set.add("Daddy");
        set.add("Daddy");
        for (String s:set) {
            System.out.println(s);
        }
        System.out.print("\n remove\n");
        set.remove("Mom");
        for (String s:set) {
            System.out.println(s);
        }

        System.out.println("\ncontains(\"Mom\") -- " + set.contains("Mom"));
        System.out.println("size -- "+set.size());
        set.clear();
        System.out.println("after clear isEmpty? "+set.isEmpty());
*/

        /*String str;
        set.add("Rus");
        set.add("USA");
        set.add("Belarus");
        set.add("Poland");
        Scanner scanner = new Scanner(System.in);
        System.out.println("find  your country: ");
        str=scanner.next();
        System.out.println(set.contains(str));
        */

       /* Set<HeavyBox> heavyBoxSet=new TreeSet<>();
        Random gen=new Random();
        for (int i=1; i<=10;i++){
            heavyBoxSet.add(new HeavyBox(gen.nextInt(20)+1));
        }
        for (HeavyBox box:heavyBoxSet) {
            System.out.println(box);
        }*/


        Product[] productArr = {
                new Product("Fork", 1.25, 5),
                new Product("Spoon", 1.05, 4),
                new Product("Pan", 10.99, 3),
                new Product("Knife", 1.43, 2),
                new Product("Knife", 7.85, 5),
                new Product("Spatula", 2.55, 4),
                new Product("Plate", 3.70, 4)
        };

        List<Product> products = Arrays.asList(productArr);

       sortProducts(products,3,false);
        System.out.println(products);
       sortProducts(products,3,true);
        System.out.println(products);









    }
}
