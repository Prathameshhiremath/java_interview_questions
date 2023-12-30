# In Python, lists are a common data structure, and they come with several built-in methods that you can use to manipulate and work with lists. Here's a list of some commonly used list methods in Python:

# 1. **append(x):** Adds an item `x` to the end of the list.


mylist = [1, 2, 3]
mylist.append(4)


# 2. **extend(iterable):** Extends the list by appending elements from the iterable.

#    ```python
mylist = [1, 2, 3]
mylist.extend([4, 5, 6])


# 3. **insert(i, x):** Inserts an item `x` at a specified position `i`.

mylist = [1, 2, 3]
mylist.insert(1, 4)  # Inserts 4 at index 1


# 4. **remove(x):** Removes the first occurrence of item `x` from the list.


mylist = [1, 2, 3, 2]
mylist.remove(2)  # Removes the first 2


# 5. **pop([i]):** Removes and returns the item at index `i`. If `i` is not provided, it removes and returns the last item.


mylist = [1, 2, 3]
popped_item = mylist.pop(1)  # Removes and returns the item at index 1


# 6. **index(x[, start[, end]]):** Returns the index of the first occurrence of item `x` in the list. You can specify optional `start` and `end` indices for the search.


mylist = [1, 2, 3, 2]
index = mylist.index(2)  # Returns 1, the index of the first 2


# 7. **count(x):** Returns the number of occurrences of item `x` in the list.


mylist = [1, 2, 3, 2]
count = mylist.count(2)  # Returns 2, as there are two occurrences of 2


# 8. **sort(key=None, reverse=False):** Sorts the list in ascending order by default. You can use the `key` function to customize the sort order, and `reverse=True` to sort in descending order.

mylist = [3, 1, 2]
mylist.sort()  # Sorts the list in ascending order


# 9. **reverse():** Reverses the elements of the list in-place.


mylist = [1, 2, 3]
mylist.reverse()  # Reverses the list to [3, 2, 1]


# 10. **copy():** Returns a shallow copy of the list.


mylist = [1, 2, 3]
newlist = mylist.copy()  # Creates a new list with the same elements


