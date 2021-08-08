# StringToList
### A java application to convert Array to String and String back to Integer List.

## define an array
```
int [] arr = new int[]{1,2,3,4,5};
```

## convert the integer array to string
```
String str = Arrays.stream(arr).mapToObj(String::valueOf).collect(Collectors.joining(","));
str = "["+str+"]";
```

## convert the string to Integer List using Collectors
```
List<Integer> list = Arrays.stream(str.substring(1,str.length()-1).split(",")).map(Integer::parseInt).toList();
list.forEach(System.out::println);
```

