package main;

public class Main {

	public static void main(String[] args) {
// 2 new instance of Bag class		
		Bag<String> bag1 = new Bag<>();
		Bag<String> bag2 = new Bag<>();
// Add objects to each bag (including duplicates)			
			bag1.add("book");
			bag1.add("eraser");
			bag1.add("pen");
			bag1.add("homework");
			bag1.add("folder");
			bag1.add("highlighter");
			bag1.add("homework");
					
			bag2.add("pencil");
			bag2.add("calculator");
			bag2.add("eraser");
			bag2.add("pen");
			bag2.add("notebook");
			bag2.add("pen");
			bag2.add("book");
			bag2.add("highlighter");
// Output size of bags and print contents for each		
			System.out.printf("\nNumber of items in first bag: %d", bag1.size());
			System.out.printf("\nCurrently in first bag: ");
			bag1.printBag();
			System.out.printf("\nNumber of items in second bag: %d", bag2.size());
			System.out.printf("\nCurrently in second bag: ");
			bag2.printBag();
// Test "contains" method for a few elements			
			System.out.printf("\nFirst bag contains homework? %b", bag1.contains("homework"));
			System.out.printf("\nSecond bag contains homework? %b", bag2.contains("homework"));
			System.out.printf("\nFirst bag contains calculator? %b", bag1.contains("calculator"));
			System.out.printf("\nSecond bag contains calculator? %b", bag2.contains("calculator"));		
// New line for readability, then test "count" method for a few elements		
			System.out.println("");
			System.out.printf("\nNumber of homework assignments in the first bag: %d", bag1.count("homework"));
			System.out.printf("\nNumber of books in the second bag: %d", bag2.count("book"));
			System.out.printf("\nNumber of pens between both bags: %d", (bag1.count("pen") + bag2.count("pen")));
			System.out.println("");
// Remove elements from Bag		
			System.out.printf("\nRemoving a homework assignment from first bag...");
			bag1.remove("homework");
			System.out.printf("\nRemoving a folder from first bag...");
			bag1.remove("folder");
			System.out.printf("\nRemoving a notebook from second bag...");
			bag2.remove("notebook");
			System.out.printf("\nRemoving a pen from second bag...");
			bag2.remove("pen");
			System.out.println("");
// Print Bag contents again		
			System.out.printf("\nNow in first bag: ");
			bag1.printBag();
			System.out.printf("\nNow in second bag: ");
			bag2.printBag();
// Test "contains" method for removed element and "count" method for removed element		
			System.out.printf("\nFirst bag contains homework assignment? %b", bag1.contains("homework"));
			System.out.printf("\nNumber of folders in first bag: %d", bag1.count("folder"));
			System.out.printf("\nNumber of notebooks in second bag: %d", bag2.count("notebook"));
			System.out.printf("\nNumber of pens between both bags: %d", (bag1.count("pen") + bag2.count("pen")));
			System.out.println("");
// Merge two bags together using the "merge" method	and print the contents	
			System.out.printf("\nMerging bags...");
			bag1.merge(bag2);
			System.out.printf("\nContents of merged bag: ");
			bag1.printBag();
// Create and print contents of new bag containing only distinct elements using "distinct" method			
			Bag<String> distinctBag = bag1.distinct();
			System.out.printf("\nUnique items in merged bag: ");
			distinctBag.printBag();
	}
}
