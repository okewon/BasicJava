package d_array;

public class StringMethod {

	public static void main(String[] args) {
		 String str = new String("Hello"); //1번
	      System.out.println(str);
	      
	      char[] c1 = {'H','e','l','l','o'}; //2번
	      String str2 = new String(c1);
	      System.out.println(c1 + "\t" +str2);
	      
	      StringBuffer sb = new StringBuffer("Hello"); //3번
	      String str3 = new String(sb);
	      System.out.println(sb + "\t" + str3);
	      
	      String str4 = "Hello"; //4번
	      String str5 = "0123456";
	      char c2 = str4.charAt(1);
	      char c3 = str5.charAt(1);
	      System.out.println(str4 + "\t" + str5 + "\t" + c2 + "\t" + c3);
	      
	      int i1 = "aaa".compareTo("aaa"); // 5번
	      int i2 = "aaa".compareTo("bbb");
	      int i3 = "bbb".compareTo("aaa");
	      System.out.println(i1 + "\t" + i2 + "\t" + i3);
	      
	      String str6 = "Hello"; // 6번
	      String str7 = str6.concat(" World");
	      System.out.println(str6 + "\t" + str7);
	      
	      String str8 = "abcdefg"; // 7번
	      boolean b1 = str8.contains("bc");
	      System.out.println(str8 + "\t" + b1);
	      
	      String str9 = "file.txt"; // 8번
	      boolean b2 = str9.endsWith("txt");
	      System.out.println(str9 + "\t"+ b2);
	      
	      String str10 = "Hello"; // 9번
	      boolean b3 = str10.equals("Hello");
	      boolean b4 = str10.equals("hello");
	      System.out.println(str10 + "\t" + b3 + "\t" + b4);
	      
	      String str11 = "Hello"; // 10번
	      boolean b5 = str11.equalsIgnoreCase("HELLO");
	      boolean b6 = str11.equalsIgnoreCase("hello");
	      System.out.println(str11 + "\t" + b5 + "\t" + b6);
	      
	      String str12 = "Hello"; // 11번
	      int idx1 = str12.indexOf('o');
	      int idx2 = str12.indexOf('k');
	      System.out.println(str12 + "\t" + idx1 + "\t" + idx2);
	      
	      String str13 = "Hello"; // 12번
	      int idx3 = str13.indexOf('e', 0);
	      int idx4 = str13.indexOf('e', 2);
	      System.out.println(str13 + "\t" + idx3 + "\t" + idx4);
	      
	      String str14 = "ABCDEFG"; // 13번
	      int idx5 = str14.indexOf("CD");
	      System.out.println(str14 + "\t" + idx5);
	      
	      String str15 = new String("abc"); // 14번
	      String str16 = new String("abc");
	      boolean b7 = (str15 == str16);
	      boolean b8 = str15.equals(str16);
	      boolean b9 = (str15.intern() == str16.intern());
	      System.out.println(str15 + "\t" + str16 + "\t" + b7 + "\t" + b8 + "\t" + b9);
	      
	      String str17 = "java.lang.Object"; // 15번
	      int idx6 = str17.lastIndexOf('.');
	      int idx7 = str17.indexOf("java");
	      System.out.println(str17 + "\t" + idx6 + "\t" + idx7);
	      
	      String str18 = "Hello"; // 16번
	      int length1 = str18.length();
	      System.out.println(str18 + "\t" + length1);
	      
	      String str19 = "Hellollo"; // 17번
	      String str20 = str19.replace("ll", "LL");
	      System.out.println(str19 + "\t" + str20);
	      
	      String str21 = "AABBAABB"; // 18번
	      String str22 = str21.replaceAll("BB", "bb");
	      System.out.println(str21 + "\t" + str22);
	      
	      String str23 = "AABBAABB"; // 19번
	      String str24 = str23.replaceFirst("BB", "bb");
	      System.out.println(str23 + "\t" + str24);
	      
	      String str25 = "dog,cat,bear"; // 20번
	      String[] str26 = str25.split(",");
	      System.out.println(str25 + "\t" + str26);
	      
	      String str27 = "dog,cat,bear"; // 21번
	      String[] str28 = str27.split(",", 2);
	      System.out.println(str27 + "\t" + str28);
	      
	      String str29 = "java.lang.Object"; // 22번
	      boolean b10 = str29.startsWith("java");
	      boolean b11 = str29.startsWith("lang");
	      System.out.println(str29 + "\t" + b10 + "\t" + b11);
	      
	      String str30 = "java.lang.Object"; // 23번
	      String str31 = str30.substring(10);
	      String str32 = str30.substring(5, 9);
	      System.out.println(str30 + "\t" + str31 + "\t" + str32);
	      
	      String str33 = "Hello"; // 24번
	      String str34 = str33.toLowerCase();
	      System.out.println(str33 + "\t" + str34);
	      
	      String str35 = "Hello"; // 25번
	      String str36 = str35.toString();
	      System.out.println(str35 + "\t" + str36);
	      
	      String str37 = "Hello"; // 26번
	      String str38 = str37.toUpperCase();
	      System.out.println(str37 + "\t" + str38);
	      
	      String str39 = "    Hello World   "; // 27번
	      String str40 = str39.trim();
	      System.out.println(str39 + "\t" + str40);
	      
	      String str41 = String.valueOf(true); // 28번
	      String str42 = String.valueOf('a');
	      String str43 = String.valueOf(100);
	      String str44 = String.valueOf(100L);
	      String str45 = String.valueOf(10f);
	      String str46 = String.valueOf(10.0);
	      java.util.Date dd = new java.util.Date();
	      String str47 = String.valueOf(dd);
	      System.out.println(str41 + "\t" + str42 + "\t" + str43 + "\t" + str44 + "\t" + str45 + "\t" + str46 + "\t" + dd + "\t" + str47);

	}

}
