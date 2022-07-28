package leet.task4;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Solution {
	
	public double findMedianSortedArrays(int[] nums1, int[] nums2) {
		IndexGenerator indexGenerator = new IndexGenerator();
		Set<Element> elements = new TreeSet<Element>();
		Set<Element> elements1 = toSet(nums1, indexGenerator);
		Set<Element> elements2 = toSet(nums2, indexGenerator);
		elements.addAll(elements1);
		elements.addAll(elements2);

		List<Integer> list = elements.stream().map(Element::getVal).toList();

		double result = (list.size() % 2 == 0) ? getWhenEvenSize(list) : getWhenOddSize(list);

		return result;
	}

	private Set<Element> toSet(int[] nums, IndexGenerator indexGenerator) {
		Set<Element> set = new HashSet<>();

		for (int num : nums) {
			int index = indexGenerator.generate();
			Element element = new Element(num, index);
			set.add(element);
		}

		return set;
	}

	private double getWhenEvenSize(List<Integer> list) {
		int size = list.size();
		int half = size / 2;

		int f = list.get(half);
		int s = list.get(half - 1);

		double sum = f + s;

		double result = sum / 2;

		return result;
	}

	private double getWhenOddSize(List<Integer> list) {
		int size = list.size();
		int half = size / 2;

		double result = list.get(half);

		return result;
	}

}
