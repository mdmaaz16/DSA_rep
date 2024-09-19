def NumberofElementsInIntersection(self,arr1, arr2, n, m):
        #return: expected length of the intersection array.
        #code here
        unique_elements_set = set()

        for element in arr1:
            unique_elements_set.add(element)

        intersection_array = []

        for element in arr2:
            if element in unique_elements_set:
                intersection_array.append(element)
                unique_elements_set.remove(element)  # Avoid duplicates

        return len(intersection_array)     
                