// In this code, we define a custom comparator function customSortDescending, which subtracts b from a to sort the elements in descending order. 
//The Array sort method is then used with this custom comparator to sort the array in place.This approach has a time complexity of O(n * log(n))

function customSortDescending(a, b) {
  return b - a;
}

const array = [10, 3, 8, 1, 6, 2, 7, 4, 5, 9];
array.sort(customSortDescending);

console.log("Sorted array in descending order: " + array);
