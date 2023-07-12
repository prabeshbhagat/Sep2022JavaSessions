package PavanJava;

public class ReverseVowelsInString {

	public static boolean isVowel(char[] arr, int indx) {
		char ch = arr[indx];
		if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I'
				|| ch == 'O' || ch == 'U') {
			return true;
		}
		return false;
	}

	public static void swap(char ch[], int left, int right) {
		char temp = ch[left];
		ch[left] = ch[right];
		ch[right] = temp;
	}

	public static void main(String[] args) {

		String str = "prabesh is a lovely boy";

		char arr[] = str.toCharArray();
		int left = 0;
		int right = arr.length - 1;

		while (left < right) {
			while (isVowel(arr, left) == false) {
				left++;
			}

			while (isVowel(arr, right) == false) {
				right--;
			}

			swap(arr, left, right);
			left++;
			right--;

		}

		String str1 = "";
		for (char ch : arr) {
			str1 = str1 + ch;
		}
		System.out.println(str1);

	}

}
