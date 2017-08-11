**This question can be solved by using BackTracking**

    public class ArrangeInPerfectSquare {
    
        public static void main(String[] args) {
    
            int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15 };
    
            System.out.println(isArrangeExists(arr));
        }
    
        **/**
         * @param arr : Take array of numbers
         * @return
         */**
        private static boolean isArrangeExists(int[] arr) {
    
            for (int i = 0; i < arr.length; i++) {
                
                **//We start with every value in array one by one.
                //Also keeping visited array so that if one a value is used.It should not be used again**
                boolean[] visited = new boolean[arr.length];
                
                //Here we will keep all the values that pases our requirement
                List<Integer> pathList = new ArrayList<>();
                
                if (isArrangeExists(arr, i, visited,pathList)) {
                    pathList.add(arr[i]);
                    **//print arrangement**
                    for(int num : pathList){
                        System.out.print(num + " ");
                    }
                    return true;
                }
            }
            
            return false;
        }
    
       
    
        **/**
         * @param arr : Array of numbers
         * @param index : index of the value used from array
         * @param visited : visited node so far
         * @param pathList: contain list of numbers used to arrange as per requirement
         * @return
         */**
        private static boolean isArrangeExists(int[] arr, int index, boolean[] visited,List<Integer> pathList) {
    
            visited[index] = true;
            
    
            //if all node visited that means solution exists
            if (isAllVisited(visited)) {
                return true;
            }
    
            //It will give all the Nodes(array value,array index) that if sum with current Node will be perfect square
            List<Node> adjList = getAdjNodes(arr, index, visited);
            
            for(Node node:adjList){
               
                //again we access next node
                if(!visited[node.index] && isArrangeExists(arr,node.index,visited,pathList)){
                    //add nodes in path list
                    pathList.add(node.value);
                    return true;
                }else{
                    //if no furthur path exists mark it unvisited and now start with another node in adjList
                    visited[node.index] = false;
                }
            }
    
            return false;
        }
    
       
    
        /**
         * @param arr
         * @param index
         * @param visited
         * @return
         */
        private static List<Node> getAdjNodes(int[] arr, int index, boolean[] visited) {
    
            List<Node> adjList = new ArrayList<>();
    
            for (int i = 0; i < arr.length; i++) {
                if (!visited[i] && isPerfectSquare(arr[index] + arr[i])) {
                    adjList.add(new Node(arr[i],i));
                }
            }
    
            return adjList;
        }
    
        /**
         * @param i
         * @return
         */
        private static boolean isPerfectSquare(int num) {
    
            if (num == 1 || num == 4 || num == 9 || num == 16 || num == 25) {
                return true;
            }
            return false;
        }
    
        /**
         * @param visited
         * @return
         */
        private static boolean isAllVisited(boolean[] visited) {
    
            for (boolean bol : visited) {
                if (!bol) {
                    return false;
                }
            }
    
            return true;
        }
        
        public static class Node {
            private Integer value;
            private Integer index;
            public Node(Integer value, Integer index) {
                super();
                this.value = value;
                this.index = index;
            }
            public Integer getValue() {
                return value;
            }
            public Integer getIndex() {
                return index;
            }
            public void setValue(Integer value) {
                this.value = value;
            }
            public void setIndex(Integer index) {
                this.index = index;
            }
            @Override
            public String toString() {
                StringBuilder builder = new StringBuilder();
                builder.append("Node [value=");
                builder.append(value);
                builder.append(", index=");
                builder.append(index);
                builder.append("]");
                return builder.toString();
            }
            
            
            
        }
    
    }

