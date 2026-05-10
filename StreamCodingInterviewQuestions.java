//Filter even numbers from a list using Java 8 streams.

List<Integer> list = List.of(1,2,3,4,2);
list.stream().filter(x->x%2==0).forEach(System.out::println);

//Find the sum of all integers in a list using streams.
int sum = list.stream().mapToInt(Integer::intValue).sum();
System.out.println(sum);

mapToInt ---> converts Stream<Integer> to IntStream

Stream<Integer> does not have sum()
IntStream has numeric operations like:
sum()
average()
max()
min()

//Find the maximum and minimum number in a list.
System.out.println(list.stream().mapToInt(Integer::intValue).max());
System.out.println(list.stream().mapToInt(Integer::intValue).min().orElse(0));

//Sort a list of integers in ascending and descending order.
list.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);
list.stream().sorted(Comparator.naturalOrder()).forEach(System.out::println);

//Remove duplicate integers from a list using streams.
HashSet<Integer> set = new HashSet<>();
list.stream().filter(x->set.add(x)).forEach(System.out::println);

//Count total elements in an integer list using streams.
long count = numbers.stream().count(); // count() returns Long

//Find numbers starting with digit 1 (e.g., 10, 12, 19).
list.stream().map(x->String.valueOf(x)).filter(x->x.startsWith("1")).forEach(System.out::println);

//Partition integers into even and odd using streams.
Map<Boolean,List<Integer>> mapp = list.stream().collect(Collectors.partitioningBy(m->m%2!=0));
System.out.println(mapp.get(true));
System.out.println(mapp.get(false));

//Find average of numbers using Collectors.averagingInt()
Double average = list.stream().collect(Collectors.averagingDouble(n->n));
System.out.println(average);

//Find all numbers greater than a given value.
System.out.println(list.stream().filter(x->x>20).collect(Collectors.toList()));
    
//Check if all numbers are positive using streams.
 System.out.println(list.stream().allMatch(x->x>0)); // For condition based checking use AllMatch(), noneMatch(), anyMatch()

//Find sum of squares of all even numbers.
System.out.println(list.stream().filter(x->x%2==0).map(x->x*x).collect(Collectors.toList()));

//Sort integers based on last digit.
list.stream().sorted(Comparator.comparingInt(n->n%10)).forEach(System.out::println);
     










      
