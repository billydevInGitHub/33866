package billydev.groovy_33866exp002_c_collection

class Groovy33866exp002_b_01_CollectionMethodNotSupportedByArray {
    static void main(String[] args) {

        int[] intArray= [8,4,5,6]
//        intArray.sort()
//        intArray.unique()     will throw exception



        //as comparsion, collection support these methods
        println([8,4,5,6].sort())
        println([8,4,5,6,5,5,5,6].unique())
    }
}
