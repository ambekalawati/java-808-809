package streamApi;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import fundamental.MainTest1;
import streamApi.Dish.Type;
/*
 Q1. select vegetarians menu?
 Q2. select all non vegetarians menu?
 Q3. sort menu by calories?
 Q4. group menu by type?
 Q5. select highest calories meal?
 Q6. select lowest calories meal?
 Q7. select highest calories vegetarian meal?
 Q8. select highest calories non vegetarian meal?
 Q9. select first three dishes that have more than 300 calories?
 Q10. find out whether the menu is healthy (all dishes are below 100 calories)?
 Q11. find out whether the menu is not healthy(calories>=100)?
 Q12. find a dish that is vegetarian?
 */

public class StreamPractice {

	public static List<Dish> getMenu() {
		List<Dish> menu = Arrays.asList(new Dish("pork", false, 800, Dish.Type.MEAT),
				new Dish("beef", false, 700, Dish.Type.MEAT), new Dish("chicken", false, 400, Dish.Type.MEAT),
				new Dish("french fries", true, 530, Dish.Type.OTHER), new Dish("rice", true, 350, Dish.Type.OTHER),
				new Dish("season fruit", true, 120, Dish.Type.OTHER), new Dish("pizza", true, 550, Dish.Type.OTHER),
				new Dish("Prawns", false, 300, Dish.Type.FISH), new Dish("salmon", false, 450, Dish.Type.FISH));
		return menu;
	}

	public static void main(String[] args) {
//			Q1. select vegetarians menu?
		/*
		 * getMenu().stream().filter(d -> { return d.isVegetarian();
		 * }).collect(Collectors.toList()).forEach(System.out::println);
		 */
//	Q2. select all non vegetarians menu?
		/*
		 * getMenu().stream().filter(p -> { return p.isVegetarian() == false;
		 * }).collect(Collectors.toList()).forEach(System.out::println);
		 */
//		Q3. sort menu by calories?
		/*
		 * getMenu().stream().sorted(Comparator.comparing(Dish::getCalories)).collect(
		 * Collectors.toList()) .forEach(System.out::println);
		 */
//		Q4. group menu by type?
		/*
		 * Map<Type, List<Dish>> map =
		 * getMenu().stream().collect(Collectors.groupingBy(Dish::getType));
		 * System.out.println(map);
		 */
//		Q5. select highest calories meal?
		/*
		 * Dish dish =
		 * getMenu().stream().max(Comparator.comparing(Dish::getCalories)).get();
		 * System.out.println(dish);
		 */
//		Q6. select lowest calories meal?
		/*
		 * Dish dish1 =
		 * getMenu().stream().min(Comparator.comparing(Dish::getCalories)).get();
		 * System.out.println(dish1);
		 */
//		Q7. select highest calories vegetarian meal?
		/*
		 * Dish VegHighCalorie = getMenu().stream().filter(p -> { return
		 * p.isVegetarian(); }).max(Comparator.comparing(Dish::getCalories)).get();
		 * System.out.println(VegHighCalorie);
		 */
//		 Q8. select highest calories non vegetarian meal?
		/*
		 * Dish NVeghighCalorie = getMenu().stream().filter(p -> { return
		 * p.isVegetarian() == false;
		 * }).max(Comparator.comparing(Dish::getCalories)).get();
		 * System.out.println(NVeghighCalorie);
		 */
//		 Q9. select first three dishes that have more than 300 calories?
		/*
		 * getMenu().stream().filter(p -> { return p.getCalories() > 300;
		 * }).limit(3).collect(Collectors.toList()).forEach(System.out::println);
		 */
//		Q10. find out whether the menu is healthy (all dishes are below 100 calories)?
		/*
		 * List<Dish> collect1 = getMenu().stream().filter(p -> { return p.getCalories()
		 * < 100; }).collect(Collectors.toList()); boolean empty = collect1.isEmpty();
		 * if(empty==true) { System.out.println("no healthy menu"); }else
		 * System.out.println("healthy menu");
		 */
//		Q12. find a dish that is vegetarian?
		/*
		 * getMenu().stream().filter(p -> { return p.isVegetarian();
		 * }).collect(Collectors.toList()).forEach(System.out::println);
		 */
		// getMenu().stream().filter(d -> d.getCalories() >
		// 500).peek(System.out::println).collect(Collectors.toList());//calories >500
		/*
		 * Map<Type, Long> collect = getMenu().stream()
		 * .collect(Collectors.groupingBy(Dish::getType, Collectors.counting()));
		 * collect.forEach((k, v) -> System.out.println(k + " " + v));//Type with Count.
		 */
		/*
		 * String[] s = { "Hello", "World", "Java", "Servelet", "Jsp" }; Stream<String>
		 * stream = Arrays.stream(s);//count of individual words. stream.map(d ->
		 * d.length()).collect(Collectors.toList()).forEach(System.out::println);
		 */
		/*
		 * String[] arr = { "Hello", "World" }; Stream<String> stream3 =
		 * Arrays.stream(arr); Stream<String[]> map = stream3.map(w -> w.split("")); //
		 * *** List<Stream<String>> collect =
		 * map.map(Arrays::stream).distinct().collect(Collectors.toList()); List<String>
		 * collect =
		 * map.flatMap(Arrays::stream).distinct().collect(Collectors.toList());
		 * System.out.println(collect);//No Duplicate Words Found
		 */
		/*
		 * int[] a = { 1, 2, 3, 4, 5 };// Output - 1,4,9,16,25 List<Integer> asList =
		 * Arrays.asList(1, 2, 3, 4, 5); List<Integer> collect = asList.stream().map(i
		 * -> i * i).collect(Collectors.toList()); System.out.println(collect);
		 */
//	Q1- You have two list ,list1 contains 1,2,3 and list2 contains 3,4 ,you should return pair of numbers like (1,3),(1,4)
		/*
		 * List<Integer> asList1 = Arrays.asList(1, 2, 3); List<Integer> asList2 =
		 * Arrays.asList(3, 4); List<int[]> collect = asList1.stream().flatMap(i ->
		 * asList2.stream().map(j -> new int[] { i, j })) .collect(Collectors.toList());
		 * collect.forEach(k -> System.out.print("(" + k[0] + "," + k[1] + ")"));
		 */
//	Q2- Extract those pair whose sum is Divisible by 3.
		/*
		 * List<Integer> asList1 = Arrays.asList(1, 2, 3); List<Integer> asList2 =
		 * Arrays.asList(3, 4); List<int[]> collect = asList1.stream() .flatMap(i ->
		 * asList2.stream().filter(j -> (i + j) % 3 == 0).map(j -> new int[] { i, j }))
		 * .collect(Collectors.toList()); collect.stream().forEach(k ->
		 * System.out.println("(" + k[0] + "," + k[1] + ")"));
		 */
//	Q3- Check All Dishes having calories<1000
		boolean allMatch = getMenu().stream().allMatch(i -> i.getCalories() < 1000);
		System.out.println(allMatch);
//	Q4- Check none of the Dish having calories >=10000
		boolean noneMatch = getMenu().stream().noneMatch(j -> j.getCalories() >= 10000);
		System.out.println(noneMatch);
//	Q5- Any Dish having calories <500
		boolean anyMatch = getMenu().stream().anyMatch(p -> p.getCalories() < 500);
		System.out.println(anyMatch);
//	Q6- Find any Vegetarian Dish?
		Optional<Dish> findAny = getMenu().stream().filter(d -> d.isVegetarian()).findAny();
		System.out.println(findAny);
//		Reduce()-
		/*
		 * Integer reduce = getMenu().stream().map(Dish::getCalories).reduce(0, (a, b)
		 * -> a + b); System.out.println(reduce);
		 */
		Optional<Integer> reduce = getMenu().stream().map(Dish::getCalories).reduce(Integer::min);
		System.out.println(reduce.get());
		int sum = getMenu().stream().mapToInt(Dish::getCalories).sum();
		System.out.println(sum);

	}

}
